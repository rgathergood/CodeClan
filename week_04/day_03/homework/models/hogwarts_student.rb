require_relative('../db/sql_runner.rb')

class Hogwarts_student

  attr_reader(:first_name, :last_name, :house_id, :age, :id)

  def initialize(options)
    @id = options['id'].to_i
    @first_name = options['first_name']
    @last_name = options['last_name']
    @house_id = options['house_id'].to_i
    @age = options['age'].to_i
  end

  def name()
    return "#{@first_name} #{@last_name}"
  end

  def save()
    sql = "INSERT INTO hogwarts_students
    (
      first_name,
      last_name,
      house_id,
      age
    )
    VALUES
    (
      $1, $2, $3, $4
    )
    RETURNING *"
    values = [@first_name, @last_name, @house_id, @age]
    student_info = SqlRunner.run(sql, values)
    @id = student_info.first()['id'].to_i
  end

  def update()
    sql = "UPDATE hogwarts_students
    SET
    (
      first_name,
      last_name,
      house_id,
      age
      ) =
      (
        $1, $2, $3, $4
      )
      WHERE id = $5"
      values = [@first_name, @last_name, @house_id, @age, @id]
      SqlRunner.run(sql, values)
    end

    def delete()
      sql = "DELETE FROM hogwarts_students
      WHERE id = $1"
      values = [@id]
      SqlRunner.run(sql, values)
    end

    def self.delete_all()
      sql = "DELETE FROM hogwarts_students"
      SqlRunner.run(sql)
    end

    def self.all()
      sql = "SELECT * FROM hogwarts_students"
      students = SqlRunner.run(sql)
      result = students.map {|student| Hogwarts_student.new(student)}
      return result
    end

    def self.find(id)
      sql = "SELECT * FROM hogwarts_students WHERE id = $1"
      values = [id]
      student = SqlRunner.run(sql, values)
      result = Hogwarts_student.new(student.first())
      return result
    end

    def house()
      sql = "SELECT * FROM hogwarts_houses
      WHERE id = $1"
      values = [@house_id]
      house = SqlRunner.run(sql, values).first
      result = Hogwarts_house.new(house)
      return result
    end

  end #end of class

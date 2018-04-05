require('pg')

class BountyList

  attr_accessor(:name, :species, :homeworld, :bounty_value)
  attr_reader(:id)

  def initialize(options)
    @id = options['id'].to_i if options['id']
    @name = options['name']
    @species = options['species']
    @homeworld = options['homeworld']
    @bounty_value = options ['bounty_value'].to_i
  end

  def save()
    db = PG.connect({
      dbname:'space_cowboys',
      host:'localhost'
      })

      sql = "INSERT INTO bounty_list
      (
        name,
        species,
        homeworld,
        bounty_value
      )
      VALUES (
        $1, $2, $3, $4
        )
        RETURNING *;
        "
        values = [@name, @species, @homeworld, @bounty_value]

        db.prepare("save", sql)
        @id = db.exec_prepared("save", values)[0] ['id'].to_i
        db.close()
      end

      def update()
        db = PG.connect({
          dbname:'space_cowboys',
          host: 'localhost'
          })

          sql = "UPDATE bounty_list
          SET (
            name,
            species,
            homeworld,
            bounty_value
            ) =
            (
              $1, $2, $3, $4
            )
            WHERE id = $5
            "
            values = [@name, @species, @homeworld, @bounty_value, @id]
            db.prepare("update", sql)
            db.exec_prepared("update", values)
            db.close()
          end

          def delete()
            db = PG.connect({
              dbname:'space_cowboys',
              host: 'localhost'
              })

              sql = "DELETE FROM bounty_list WHERE id = $1"

              values = [@id]
              db.prepare("delete_one", sql)
              db.exec_prepared("delete_one", values)
              db.close()
            end

            def BountyList.all()
              db = PG.connect({
                dbname:'space_cowboys',
                host: 'localhost'
                })

                sql = "SELECT*FROM bounty_list"
                values = []
                db.prepare("all", sql)
                list_item = db.exec_prepared("all", values)
                db.close()
                return list_item.map{|list_item| BountyList.new(list_item)}
              end

              def BountyList.find_by_id(id)
                db = PG.connect({
                  dbname:'space_cowboys',
                  host: 'localhost'
                  })

                  sql = "SELECT*FROM bounty_list WHERE id = $1"
                  values = [id]
                  db.prepare("find", sql)
                  list_item = db.exec_prepared("find", values)
                  db.close()
                  return list_item.map{|list_item| BountyList.new(list_item)}.first
                end

            end #end of class

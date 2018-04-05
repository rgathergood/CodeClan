public class Bear {
    //@name
    private String name;
    private int age;
    private double weight;

    //def initialize(name)
    //@name = name
    //end

    public Bear(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return this.age;
    }

    public double getWeight() {
        return this.weight;
    }

    public boolean readyToHibernate() {
        if (this.weight > 80.00) {
            return true;
        } else {
            return false;
        }
    }
}

public abstract class Bear {

    public void typicalDay() {
        wakeUp();
        gatherFood();
        eat();
        sleep();
    }

    public void wakeUp() {
        System.out.println("Waking up");
    }

    public abstract void gatherFood();

    public void eat() {
        System.out.println("OM NOM NOM");
    }

    public void sleep() {
        System.out.println("ZZZzzzzzzz...");
    }

    public void roar() {
        System.out.println("ROAR!");
    }
}

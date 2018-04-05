package Human;

import Animal.Dog;
import Animal.Fly.Bird;

public class Trainer {
    private Bird bird;

    public void teach(Dog dog) {
        dog.bark();
    }
}

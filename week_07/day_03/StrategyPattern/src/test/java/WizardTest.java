import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {
    Wizard wizard;
    Broomstick broomstick;

    @Before
    public void before() {
        broomstick = new Broomstick("Nimbus", 10);
        wizard = new Wizard("Toby", broomstick);

    }

    @Test
    public void hasName() {
        assertEquals("Toby", wizard.getName());
    }

    @Test
    public void hasBroomstick() {
        assertEquals(broomstick, wizard.getRide());
    }

    @Test
    public void canFly() {
        assertEquals("mounting broom, running, skipping, flying!", wizard.fly());
    }

    @Test
    public void canFlyMagicCarpet() {
        MagicCarpet carpet = new MagicCarpet("Purple");
        wizard = new Wizard("Tim", carpet);
        assertEquals("Hovering up, straightening out, flying off!", wizard.fly());
    }

    @Test
    public void canSetRide() {
        Dragon dragon = new Dragon("Edwina");
        wizard.setRide(dragon);
        assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());
    }
}
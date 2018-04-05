import Jaeger.Mark2;
import Kaiju.Slattern;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMark2 {
        Mark2 mark2;
        Slattern slattern;

        @Before
        public void before() {
            mark2 = new Mark2("Solar Prophet", 60, 20, 40);
            slattern = new Slattern("Slattern", 70, 30);
        }

        @Test
        public void mark2HasType() {
            assertEquals("Solar Prophet", mark2.getType());
        }

        @Test
        public void mark2HasHealthValue() {
            assertEquals(60, mark2.getHealthValue());
        }

        @Test
        public void mark2HasPunchValue() {
            assertEquals(20, mark2.getPunchValue());
        }

        @Test
        public void mark2HasExplodeValue() {
            assertEquals(40, mark2.getExplodeValue());
        }

        @Test
        public void punchAttack() {
        mark2.punchAttack(slattern);
        assertEquals(50, slattern.getHealthValue());
        }

        @Test
        public void explodeAttack() {
            mark2.explodeAttack(slattern);
            assertEquals(30, slattern.getHealthValue());
        }

        @Test
        public void takeDamageFromKaiju() {
        mark2.takeDamageFromKaiju(10);
        assertEquals(50, mark2.getHealthValue());
        }

    }

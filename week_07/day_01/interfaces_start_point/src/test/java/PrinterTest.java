import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer("Epson", "Stylus");
    }

    @Test
    public void canConnect() {
        assertEquals("connected", printer.connect());
    }

    @Test
    public void canClick() {
        assertEquals("hi", printer.click());
    }

    @Test
    public void canPrint() {
        assertEquals("I am printing Dogs", printer.print("Dogs") );
    }
}

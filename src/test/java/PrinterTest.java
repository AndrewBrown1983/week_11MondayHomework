import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer = new Printer();

    @Test
    public void getPaperCount(){
        assertEquals(1000, printer.getPaperRemaining());
    }

    @Test
    public void printAccepted(){
        printer.print(10, 20);
        assertEquals(800,printer.getPaperRemaining() );
    }
//
    @Test
    public void printFail(){
        printer.print(800, 2);
        assertEquals(1000, printer.getPaperRemaining());
    }
//
    @Test
    public void refillAfterPrint(){
        printer.print(200, 2);
        printer.printerRefill();
        assertEquals(1000, printer.getPaperRemaining() );
    }
//
    @Test
    public void tonerReduces(){
        printer.print(100, 3);
        assertEquals(200, printer.tonerRemaining());
    }
}

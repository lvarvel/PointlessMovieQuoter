package movieQuote;

import org.junit.Test;
import static org.junit.Assert.*;

public class MovieQuoteControllerTest {

    @Test
    public void setUp() {
        MovieQuoteController movieQuoteController = new MovieQuoteController();
        assertEquals("I don't get it! Let's make it a bug!", movieQuoteController.index());
    }
}

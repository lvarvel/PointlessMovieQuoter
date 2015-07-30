package movieQuote;

import org.junit.Test;
import static org.junit.Assert.*;

public class MovieQuoteControllerTest {

    @Test
    public void itShouldRenderTheIndexTemplate() {
        MovieQuoteController movieQuoteController = new MovieQuoteController();
        assertEquals("index", movieQuoteController.index());
    }
}

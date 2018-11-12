import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle = new WaterBottle();

    @Test
    public void initialVolume(){
        assertEquals(100, waterBottle.getStartVolume());
    }

    @Test
    public void takeDrink(){
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void emptyBottle(){
        assertEquals(0, waterBottle.empty());
    }

    @Test
    public void fillBottle(){
        assertEquals(100, waterBottle.fill());
    }
}

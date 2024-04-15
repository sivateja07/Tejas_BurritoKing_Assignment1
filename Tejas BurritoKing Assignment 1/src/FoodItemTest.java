import org.junit.Test;
import static org.junit.Assert.*;

public class FoodItemTest {

    @Test
    public void testCreateFoodItem() {
        FoodItem foodItem = new FoodItem("TestItem", 5.0, 10);
        assertNotNull(foodItem);
    }

    @Test
    public void testGetName() {
        FoodItem foodItem = new FoodItem("TestItem", 5.0, 10);
        assertEquals("TestItem", foodItem.getName());
    }

    @Test
    public void testGetPrice() {
        FoodItem foodItem = new FoodItem("TestItem", 5.0, 10);
        assertEquals(5.0, foodItem.getPrice(), 0.001);
    }

    @Test
    public void testGetQuantityAvailable() {
        FoodItem foodItem = new FoodItem("TestItem", 5.0, 10);
        assertEquals(10, foodItem.getQuantityAvailable());
    }

    @Test
    public void testSetQuantityAvailable() {
        FoodItem foodItem = new FoodItem("TestItem", 5.0, 10);
        foodItem.setQuantityAvailable(15);
        assertEquals(15, foodItem.getQuantityAvailable());
    }
}

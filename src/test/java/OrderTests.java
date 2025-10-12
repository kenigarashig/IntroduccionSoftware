import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.BeanProperty;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.Order;
import com.example.Article;
public class OrderTests {
    private Order order;
    @BeforeEach
    void setUp(){
        List <Article> articulos=new ArrayList<>();
        articulos.add(new Article("Teclado mecánico", 2, 59.99, 10));
        articulos.add(new Article("Ratón inalámbrico", 1, 29.50, 5));
        articulos.add(new Article("Monitor 24 pulgadas", 1, 149.99, 15));
        articulos.add(new Article("Alfombrilla RGB", 3, 19.99, 0.0));
        articulos.add(new Article("Auriculares gaming", 1, 79.99, 20));

        order=new Order("1",articulos);
    }
    @Test
    @DisplayName("getId")
    void testGetId() {
        assertEquals(order.getId(), "1");
    }

    @Test
    @DisplayName("setId")
    void testSetId() {
        order.setId("2");
        assertEquals(order.getId(), "2");
    }

    @Test
    @DisplayName("getArticulos")
    void testGetArticulos() {
        assertEquals(order.getArticulos().size(), 5);
        assertEquals(order.getArticulos().get(0).getName(), "Teclado mecánico");
    }
    @Test
    @DisplayName("set articulos")
    void testSetArticulos(){
        List<Article> nuevosArticulos = new ArrayList<>();
        nuevosArticulos.add(new Article("Monitor", 1, 120.0, 0.15));
        order.setArticulos(nuevosArticulos);
        assertEquals(order.getArticulos().size(), 1);
        assertEquals(order.getArticulos().get(0).getName(), "Monitor");
    }
    @Test 
    @DisplayName("Get gross total")
    void TestGetGrossTotal(){
        assertEquals(order.getGrossTotal(),439.43,0.0001);

    }
    @Test 
    @DisplayName("Get gross total")
    void TestDiscountedTotal(){
        assertEquals(order.getDiscountedTotal(),387.4605,0.00001);

    }
}

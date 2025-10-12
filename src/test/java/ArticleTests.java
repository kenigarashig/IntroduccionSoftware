import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.Article;
public class ArticleTests {
    private Article article;
    private Article article2;
    @BeforeEach
    void setUp(){
        article=new Article("Cebolla",5,15,40);
        article2=new Article("Tomate",7,5,0);
    }  
    @Test
    @DisplayName("getName")
    void testGetName() {
        assertEquals(article.getName(), "Cebolla");
    }

    @Test
    @DisplayName("setName")
    void testSetName() {
        article.setName("Tomate");
        assertEquals(article.getName(), "Tomate");
    }

    @Test
    @DisplayName("getCantidad")
    void testGetCantidad() {
        assertEquals(article.getCantidad(), 5);
    }

    @Test
    @DisplayName("setCantidad")
    void testSetCantidad() {
        article.setCantidad(10);
        assertEquals(article.getCantidad(), 10);
    }

    @Test
    @DisplayName("getPrecio")
    void testGetPrecio() {
        assertEquals(article2.getPrecio(), 5.0);
    }

    @Test
    @DisplayName("setPrecio")
    void testSetPrecio() {
        article2.setPrecio(9.5);
        assertEquals(article2.getPrecio(), 9.5);
    }

    @Test
    @DisplayName("getDescuento")
    void testGetDescuento() {
        assertEquals(article.getDescuento(), 40.0);
    }

    @Test
    @DisplayName("setDescuento")
    void testSetDescuento() {
        article2.setDescuento(15.0);
        assertEquals(article2.getDescuento(), 15.0);
    }

    @Test
    @DisplayName("Get gross amount 1")
    void testGrossAmount1(){
        assertEquals(article.getGrossAmount(), 75);
    }
    @Test
    @DisplayName("Get gross amount 2")
    void testGrossAmount2(){
        article.setCantidad(20);
        assertEquals(article.getGrossAmount(), 300);
    }
    @Test
    @DisplayName("Get gross amount 3")
    void testGrossAmount3(){
        article2.setPrecio(20);
        assertEquals(article2.getGrossAmount(), 140);
    }
}

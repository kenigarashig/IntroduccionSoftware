import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.Calculator;

public class CalculatorTests {
    private Calculator calculator;
    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }
    @Test 
    @DisplayName("TEST TO Check multiplication of two integers normal ")
    void testMultiply(){
        int result = calculator.multiply(4,5);
        assertEquals(result,20);
    }
    @Test 
    @DisplayName("TEST TO Check multiplication of two integers one being 0")
    void testMultiplyZero(){
        int result = calculator.multiply(4,0);
        assertEquals(result,0);
    }
    @Test 
    @DisplayName("TEST TO Check multiplication of two integers with negative numbers")
    void testMultiplyNegatives(){
        int result = calculator.multiply(4,-5);
        assertEquals(result,-20);
    }
    @Test
    @DisplayName("test to check concat normal")
    void testConcat(){
        String result=calculator.concat("hola", " mundo");
        assertEquals(result, "hola mundo");
    }
    @Test
    @DisplayName("test to check concat normal with one null")
    void testConcatNull(){
        String result=calculator.concat("hola", null);
        assertEquals(result, "empty");
    }
    @Test
    @DisplayName("testo of sum with normal numbers")
    void testSum(){
        double result = calculator.sum(20, 20);
        assertEquals(result,40);
    }
    @Test
    @DisplayName("test of sum with negative numbers")
    void testSumNegatives(){
        double result = calculator.sum(20, -20);
        assertEquals(result,0);
    }
    @Test
    @DisplayName("test discount valid")
    void testDiscount(){
        double result=calculator.discount(1500,10);
        assertEquals(result,1350);
    }  
    @Test
    @DisplayName("test discount valid 100%")
    void testDiscountHundred(){
        double result=calculator.discount(1500,100);
        assertEquals(result,0);
    }
    @Test
    @DisplayName("test discount valid 0%")
    void testDiscountZero(){
        double result=calculator.discount(1500,0);
        assertEquals(result,1500);
    }  
    @Test
    @DisplayName("test discount Invalid")
    void testDiscountInvalid(){
        Exception result=assertThrows(IllegalArgumentException.class, ()->calculator.discount(1500,130));
        assertEquals(result.getMessage(),"Percentage must be between 0 and 100");
    }      
    @Test
    @DisplayName("calculate total lista de importes normal")
    void testCalculateTotal(){
        List<Double> lista= List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 23.0, 23.0, 43.0, 43.0, 54.0);
        double result = calculator.calculateTotal(lista);
        assertEquals(result, 207.0);
    }   
    @Test
    @DisplayName("calculate total empty")
    void testCalculateTotalEmpty(){
        List<Double> lista=new ArrayList<>();
        double result = calculator.calculateTotal(lista);
        assertEquals(result, 0.0);
    }  


}

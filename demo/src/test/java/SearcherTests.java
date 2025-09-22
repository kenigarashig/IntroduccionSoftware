import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import test.Searcher;

public class SearcherTests {
    private Searcher searcher;
    @BeforeEach
    void setUp(){
        searcher = new Searcher();
    }
    @Test 
    @DisplayName("test of search word that returns true")
    void testSearchWordTrue(){
        List <String>lista=List.of("pollo","carbon","hola");
        Boolean result = searcher.searchWord("hola",lista);
        assertEquals(result,true);
    }
    @Test 
    @DisplayName("test of search word that returns false")
    void testSearchWordFalse(){
        List <String>lista=List.of("pollo","carbon","hola");
        Boolean result = searcher.searchWord("Hola",lista);
        assertEquals(result,false);
    }
    @Test
    @DisplayName("test of get word by index true")
    void getWordByIndexTrue(){
        List <String> lista=List.of("hola","pablo","hamburguesa","ventilador","agua","celular","cubo");
        String result= searcher.getWordByIndex(lista, 3);
        assertEquals(result, "ventilador");
    }
    @Test
    @DisplayName("test of getWordByIndex False")
    void getWordByIndexFalse(){
        List <String> lista=List.of("hola","pablo","hamburguesa","ventilador","agua","celular","cubo");
        String result= searcher.getWordByIndex(lista, 10);
        assertEquals(result, null);
    }
    @Test
    @DisplayName("test SearchByPrefix True")
    void searchByPrefixTrue(){
        List <String> lista=List.of("hola","pablo","hamburguesa","ventilador","agua","celular","cubo","polo","pollo","potro");
        List <String> result=searcher.searchByPrefix("po", lista);
        List <String> truecase=List.of("polo","pollo","potro");
        assertEquals(result, truecase);
    }
    @Test
    @DisplayName("test SearchByPrefix False")
    void searchByPrefixFalse(){
        List <String> lista=List.of("hola","pablo","hamburguesa","ventilador","agua","celular","cubo","polo","pollo","potro");
        List <String> result= searcher.searchByPrefix("SDFLJLD", lista);
        List<String> falsecase = new ArrayList<>();
        assertEquals(result, falsecase);
    }
    @Test
    @DisplayName("test filter by keyboard true case")
    void filterByKeywordTrue(){
        List<String> lista = List.of(
    "pollo asado",
    "carbón encendido",
    "hola mundo",
    "pollera azul",
    "carbonara",
    "adiós",
    "pollo crudo"
    );
        List <String> result=searcher.filterByKeyword("pollo", lista);
        List <String> truetest=List.of("pollo asado","pollo crudo");
        assertEquals(result,truetest);
    }
    @Test
    @DisplayName("test filter by keyboard false case")
    void filterByKeywordFalse(){
        List<String> lista = List.of(
    "pollo asado",
    "carbón encendido",
    "hola mundo",
    "pollera azul",
    "carbonara",
    "adiós",
    "pollo crudo"
    );
        List <String> result=searcher.filterByKeyword("camionero", lista);
        List <String> falsetest= new ArrayList<>();
        assertEquals(result,falsetest);
    }
    @Test
    @DisplayName("test search exact phrase true case")
    void searchExactPhraseTrue(){
        List<String> lista = List.of(
    "hola mundo",
    "pollo asado",
    "carbon encendido",
    "java programming",
    "unit testing"
    );
        boolean result =searcher.searchExactPhrase("hola mundo", lista);
        assertEquals(result,true);
    }
    @Test
    @DisplayName("test search exact phrase false case")
    void searchExactPhraseFalse(){
        List<String> lista = List.of(
    "hola mundo",
    "pollo asado",
    "carbon encendido",
    "java programming",
    "unit testing"
    );
        boolean result=searcher.searchExactPhrase("unit testing", lista);
        assertEquals(result, true);
        
    }
}

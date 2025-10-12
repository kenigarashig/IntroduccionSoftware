# Proyecto: Sistema de Utilidades y Pedidos

Proyecto en Java con las clases Searcher, Calculator, Article y Order. Incluye pruebas unitarias con JUnit 5.

## Estructura

src/main/java/com/example/  
- Calculator.java  
- Searcher.java  
- model/Article.java  
- model/Order.java  

src/test/java/com/example/  
- CalculatorTestCase.java  
- SearcherTestCase.java  
- ArticleTest.java  
- OrderTest.java  

## Descripción

**Searcher:** métodos para buscar palabras o frases en listas de texto.  
**Calculator:** operaciones matemáticas básicas y manejo de descuentos.  
**Article:** representa un artículo con cantidad, precio y descuento.  
**Order:** representa un pedido con varios artículos y calcula totales.  

## Pruebas

Se usan tests con JUnit 5 para validar funcionamiento correcto e incorrecto:
- Searcher: búsquedas, índices válidos e inválidos.  
- Calculator: operaciones, concatenaciones y descuentos.  
- Article y Order: cálculos brutos y con descuento.  

## Requisitos

- Java 17+  
- JUnit 5  
- Maven o Gradle  
Con Maven:
mvn test

yaml
Copiar código

Con Gradle:
gradle test

shell
Copiar código

## Autor

Ken Igarashi
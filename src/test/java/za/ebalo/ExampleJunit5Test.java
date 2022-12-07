package za.ebalo;

import org.junit.jupiter.api.*;

public class ExampleJunit5Test {

    @BeforeAll
    static void configure()  {
        System.out.println("this is the @BeforeAll");

    }
    @AfterAll
    static void tearDown() {
        System.out.println("this is the @AfterAll");
    }

    @BeforeEach
    void beforeTest() {
        System.out.println("    this is the @BeforeE!ach");
    }

    @AfterEach
    void afterTest() {
        System.out.println("    this is the @After!Each");
    }

    @Test
    void firstTest0() {
        System.out.println("      this is the @Test0");

    }
    @Test
    void firstTest1() {
        System.out.println("     this is the @Test1");

    }
}

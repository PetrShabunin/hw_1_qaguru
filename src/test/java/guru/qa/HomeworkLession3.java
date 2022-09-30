package guru.qa;

import org.junit.jupiter.api.*;


public class HomeworkLession3 {
    @BeforeAll
    static void testFirst(){
        System.out.println("### all test started"); //вызывается перед всеми тестами 1 раз
    }
    @BeforeEach
    void testEach(){
        System.out.println("### test started"); // вызывается перед каждым тестом
    }
    @Test
    void simpleTest(){
        System.out.println("### test ongoing 3");
        Assertions.assertTrue(3 > 2);
    }
    @AfterEach
    void testCompleted(){
        System.out.println("### test completed"); // вызывается после каждого теста
    }
    @AfterAll
    static void TestOut(){
        System.out.println("### test over"); // вызывается после всех тестов
    }
    @Test
    void simpleTest2() {
        System.out.println("### test ongoing 2");
        Assertions.assertTrue(3 > 2);
    }
}

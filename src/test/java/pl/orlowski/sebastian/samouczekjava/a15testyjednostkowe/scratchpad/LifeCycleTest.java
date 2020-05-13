package pl.orlowski.sebastian.samouczekjava.a15testyjednostkowe.scratchpad;

import org.junit.*;

public class LifeCycleTest {

    @AfterClass
    public static void tearDownClass() {
        System.out.println("To pojawi się na końcu programu");
    }

    @After
    public void tearDown() {
        System.out.println("To wyświetli się po test1 i test2");
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("To będzie pierwszy linijka");
    }

    @Before
    public void setUp() {
        System.out.println("To wyświetli się przed test1 i test2");
    }

    @Test
    public void test1() {
        System.out.println("Test1");
    }

    @Test
    public void test2() {
        System.out.println("Test2");
    }
}

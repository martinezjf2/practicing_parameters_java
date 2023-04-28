import static org.junit.Assert.*;

public class PracticeParametersTest {

    private PracticeParameters newObj;

    @org.junit.Before
    public void before() {
        newObj = new PracticeParameters();
    }

    @org.junit.Test
    public void test_one_parameter() {
        assertEquals("should pass the test if Jeffrey is passed down as an argument", "Hello, my name is Jeffrey.", newObj.one_parameter("Jeffrey"));
        assertEquals("should pass the test if Josh is passed down as an argument","Hello, my name is Josh.", newObj.one_parameter("Josh"));
        assertEquals("should pass the test if Karla is passed down as an argument","Hello, my name is Karla.",newObj.one_parameter("Karla"));
    }

    @org.junit.Test
    public void test_two_parameters() {
        assertEquals("should pass if 'Jeffrey' and 'developer' are passed as arguments", "My name is Jeffrey, and I work as a full-time developer.", newObj.two_parameters("Jeffrey", "developer"));
        assertEquals("should pass if 'John' and 'construction worker' are passed as arguments", "My name is John, and I work as a full-time construction worker.", newObj.two_parameters("John", "construction worker"));
        assertEquals("should pass if 'Jay' and 'UX Designer' are passed as arguments", "My name is Jay, and I work as a full-time UX Designer.", newObj.two_parameters("Jay", "UX Designer"));
    }

    @org.junit.Test
    public void test_one_parameter_if_exists(){
        assertEquals("should pass if 'Jay' is passed as an argument(s)", "Welcome, Jay!", newObj.one_parameter_if_exists("Jay"));
        assertEquals("should return 'Welcome, Everyone!' if nothing is passed as an argument(s)", "Welcome, Everyone!", newObj.one_parameter_if_exists(null));
    }

    @org.junit.Test
    public void test_3_parameters_different_types(){
        assertEquals("should pass with 2 string arguments and 1 int argument", "My name is Jeffrey and I graduated from Bellevue in 2023.", newObj.three_parameters_different_data_types("Bellevue", 2023, "Jeffrey"));
        assertEquals("should pass with 2 string arguments and 1 int argument", "My name is Jay Smith and I graduated from Nassau Community College in 2010.", newObj.three_parameters_different_data_types("Nassau Community College", 2010, "Jay Smith"));
        assertEquals("should pass with 2 string arguments and 1 int argument", "My name is Elizabeth and I graduated from UCLA in 2019.", newObj.three_parameters_different_data_types("UCLA", 2019, "Elizabeth"));

    }

}

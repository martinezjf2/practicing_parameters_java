public class PracticeParameters {
    public static String one_parameter(String name) {
        return "Hello, my name is " + name + ".";
//        return null;
    }

    public static String two_parameters(String name, String event) {
        return "My name is " + name + ", and I work as a full-time " + event + ".";
//        return null;
    }

    public static String one_parameter_if_exists(String name ) {
        if (name == null) {
            return "Welcome, Everyone!";
        } else {
            return "Welcome, " + name + "!";
        }
//        return null;
    }

    public static String three_parameters_different_data_types(String school, int year, String name) {
        return "My name is " + name + " and I graduated from " + school + " in "+ year + ".";
    }

}

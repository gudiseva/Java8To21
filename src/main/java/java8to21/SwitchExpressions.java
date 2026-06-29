package java8to21;

public class SwitchExpressions {

    public static void main(String[] args) {

        int a, b, c;
        a = 10;
        b = 20;

        // Java 7
        c = 3;
        System.out.println("--- Java 7 ---");

        switch (c) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
        }
        System.out.println("\n");

        // Java 8
        String cStr = "Add";
        System.out.println("--- Java 8 ---");

        switch (cStr) {
            case "Add":
                System.out.println(a + b);
                break;
            case "Sub":
                System.out.println(a - b);
                break;
            case "Mul":
                System.out.println(a * b);
                break;
        }
        System.out.println("\n");

        // Java enum
        //enum cEnum{Add, Sub, Mul, Div};
        System.out.println("--- Java enum ---");

        switch (cEnum.Mul) {
            case Add:
                System.out.println(a + b);
                break;
            case Sub:
                System.out.println(a - b);
                break;
            case Mul:
                System.out.println(a * b);
                break;
            case Div:
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid Choice");
        }
        System.out.println("\n");


        // Java 12
        System.out.println("--- Java 12 ---");

        // return values from a switch block
        int res;
        res = switch (cEnum.Mul) {
            case Add -> a + b;
            case Sub -> a - b;
            case Mul -> a * b;
            case Div -> a / b;
            default -> -1;
        }; //; is mandatory
        System.out.println("Result = " + res);

        // multiple values in a case block
        String day = "Sagarsoft";
        String result = switch (day) {
            case "Mon", "Tue", "Wed", "Thu", "Fri" -> "Weekdays";
            case "Sat", "Sun" -> "Weekends";
            default -> "Invalid Day!";
        }; //; is mandatory
        System.out.println(result);

        //Object obj = 10;
        //Object obj = "Arvind";
        Object obj = null; //Exception in thread "main" java.lang.NullPointerException
        String rStr = switch (obj) {
            case Integer i -> "Integer Value";
            case String s -> "String Value";
            case null -> "Null Value";
            default -> "Unknown";
        }; //; is mandatory
        System.out.println("Result = " + rStr);

        System.out.println("\n");
    }

    ;

    enum cEnum {Add, Sub, Mul, Div}

}

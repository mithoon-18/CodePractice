package featuresJava;

public class SwitchExpression {
	public static void main(String[] args) {
        String day = "";

        // Switch expression returns a value directly
        String result = switch (day) {
            case "MONDAY", "FRIDAY", "SUNDAY" -> "6am Wake up";
            case "TUESDAY" -> "7am Wake up";
            case "THURSDAY", "SATURDAY" -> "8am Wake up";
            default -> {
                // can even have logic here
                System.out.println("Unknown day, default logic executed");
                yield "Holiday!";
            }
        };

        System.out.println(result);
    }
}

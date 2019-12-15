import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class DependencyManagementExercise {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter Something:");
        String input = scan.nextLine();
        System.out.println();
        System.out.printf("You entered: %s%n", input);

        if (StringUtils.isNumeric(input)) {
            System.out.printf("\"%s\" is a number%n", input);
        } else {
            System.out.printf("\"%s\" is not a number%n", input);
        }

        System.out.printf("Flipped case: \"%s\"%n", StringUtils.swapCase(input));
        System.out.printf("Reversed: \"%s\"%n", StringUtils.reverse(input));

    }
}

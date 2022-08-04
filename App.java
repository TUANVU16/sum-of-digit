import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter your number");
        int value = sc.nextInt();
        int someofDigit = 0;
        while (true) {
            someofDigit = someofDigit + value % 10;
            value = value / 10;
            if (value < 10) {
                break;
            }
        }
        someofDigit = someofDigit + value;
        System.out.print("total some of digit is: " + someofDigit);

    }
}

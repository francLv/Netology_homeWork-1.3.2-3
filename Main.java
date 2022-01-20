// * Сколько дней в году
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        boolean win = true;
        while (win) {
            System.out.println("Введите год и число дней: ");
            int year = scanner.nextInt();
            int days = scanner.nextInt();
            year = leap(year);
            if (days == year) {
                score++;
            } else {
                System.out.println("Неправильно! В этом году " + year + " дней");
                System.out.println("Score: " + score);
                win = false;
            }
        }
    }
    public static int leap(int ye) {
        if (ye % 400 == 0 || ye % 4 == 0 && ye % 100 != 0) {
            ye = 366; // Високосный год
        } else ye = 365; // Обычный год
        return ye;
    }
}











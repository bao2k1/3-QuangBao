package Day3.Bai7;

import java.util.Scanner;

// Lớp chính để thực thi
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter player 1's name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter player 2's name: ");
        String name2 = scanner.nextLine();

        Game game = new Game(name1, name2);
        game.play();

        scanner.close();
    }
}
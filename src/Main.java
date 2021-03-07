import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Database d = new Database();

        System.out.println("You are challenged by a dangerous " +
                d.bulbasaur.getName() + "!\nIt has " + d.bulbasaur.getHP() + "HP\n<------------------------------------------->\n");
        Thread.sleep(3000);

        System.out.println("You summoned a powerful " +
                d.charizard.getName() + "!\nIt has " + d.charizard.getHP() + "HP\n<------------------------------------------->\n");
        Thread.sleep(3000);
        intro();
    }

    public static void intro() throws InterruptedException {
        fight();
    }

    public static void fight() throws InterruptedException {

        Database d = new Database();

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\n1. " + d.spell1.getDescription());
        System.out.println("2. " + d.spell2.getDescription());
        System.out.println("3. " + d.spell3.getDescription());
        System.out.println("4. " + d.spell4.getDescription() + "\n\n");

        System.out.println("Choose your move by pressing the corresponding number");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> d.spell1.dmgSpell(d.charizard, d.bulbasaur, 10, d.charizard.getATK(), d.bulbasaur.getDFS());
            case 2 -> d.spell2.dmgSpell(d.charizard, d.bulbasaur, 5, d.charizard.getATK(), d.bulbasaur.getDFS());
            case 3 -> d.spell3.buffATK(d.charizard, 5);
            case 4 -> d.spell4.buffDFS(d.charizard, 5);
        }

        System.out.println("It is very effective!\n" + "HP: " + d.bulbasaur.getHP());
        Thread.sleep(3000);
        intro();
    }
}

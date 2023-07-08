import java.util.ArrayList;
public class TestPuzzleJava {
    
    public static void main(String[] args) {
        PuzzleJava puzzle = new PuzzleJava();
        ArrayList<Integer> randomRolls = puzzle.getTenRolls();
        System.out.println("-----randomRolls-----\n");
        System.out.println(randomRolls);
        System.out.println("\n-----getRandomLetter-----\n");
        System.out.println(puzzle.getRandomLetter());
        System.out.println("\n-----generatePassword-----\n");
        System.out.println(puzzle.generatePassword());
        System.out.println("\n-----getNewPasswordSet-----\n");
        System.out.println(puzzle.getNewPasswordSet(5));
        System.out.println("\n-----getNewPasswordSet-----\n");
        System.out.println(puzzle.getNewPasswordSet(20));
        System.out.println("\n-----shuffleArray-----\n");
        ArrayList<String> names = new ArrayList<String>();
        names.add("Person 1");
        names.add("Person 2");
        names.add("Person 3");
        names.add("Person 4");
        names.add("Person 5");
        System.out.println(puzzle.shuffleArray(names));
    }
}

import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava{

    public ArrayList<Integer> getTenRolls(){//no parameters
        ArrayList<Integer> randomRolls = new ArrayList<Integer>(); //initialize arraylist
        Random rand = new Random(); //initialize random
        for(int i = 0; i < 10; i++){ //loop 10 times
            randomRolls.add(rand.nextInt(20) + 1); //add random number between 1 and 20 to arraylist
        }
        return randomRolls; //return arraylist
    }

    public char getRandomLetter(){ //no parameters
        Random rand = new Random(); //initialize random
        char randomLetter = (char) (rand.nextInt(26) + 'a'); //generate random letter
        return randomLetter; //return random letter
    }

    public String generatePassword(){ //no parameters
        String password = ""; //initialize password
        for(int i = 0; i < 8; i++){ //loop 8 times
            password += getRandomLetter(); //add random letter to password
        } 
        return password; //return password
    }

    public String getNewPasswordSet(int length){ //takes in an int
        String password = ""; //initialize password
        for(int i = 0; i < length; i++){ //loop length times
            password += getRandomLetter(); //add random letter to password
        } 
        return password; //return password
    }

    public ArrayList<String> shuffleArray(ArrayList<String> array){ //takes in an arraylist
        Random rand = new Random(); //initialize random
        for(int i = 0; i < array.size(); i++){ //loop through arraylist
            int randomIndex = rand.nextInt(array.size()); //generate random index
            String temp = array.get(i); //store element at index i in temp
            array.set(i, array.get(randomIndex)); //set element at index i to element at random index
            array.set(randomIndex, temp); //set element at random index to temp
        }
        return array; //return arraylist
    }
}
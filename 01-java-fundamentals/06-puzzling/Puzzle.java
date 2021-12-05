import java.util.Random;
import java.util.ArrayList;
public class Puzzle{

    public ArrayList<Integer> getTenRolls(){
        Random randMachine = new Random();
        ArrayList <Integer> array = new ArrayList <Integer>();
        for (int i = 1; i <=10; i++){
            
            int randomInteger= randMachine.nextInt(20);
            array.add(randomInteger);
        }
        return array;
    }
    public String getRandomLetter(){
        Random rand = new Random();
        String [] letters={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int randomLetters = rand.nextInt(26);
        return(letters[randomLetters]);
        }

    public String generatePassword(){
            String password = "";
            for(int i = 0; i<=8; i++){
                password = password + getRandomLetter();
            }
            return password;
        }
        
    public ArrayList<String> getNewPassword(int length){
            ArrayList <String> newPassword = new ArrayList <String>();
            for(int i = 0; i<length; i++){
                newPassword.add(generatePassword());
            }
            return newPassword;
        }
        


}
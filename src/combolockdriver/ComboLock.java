/*
 * This is the support code for the ComboLockDriver program
 * this creates all the required constructors to user the Driver 
 * program sucsessfully 
 */
package combolockdriver;
import java.util.Random;
/**
 *
 * @author Jorda
 */
public class ComboLock {
    // declaring all needed global variables 
    int []Combo = new int[3];
    int wrongCounter = 0;
    
    boolean tryAgain = true;
    
    // stores the users inputed combination then askes them about it
    public void Combination(int num1, int num2, int num3, int first, int second, int third){
        Combo[0] = num1;
        Combo[1] = num2;
        Combo[2] = num3;
        
        if(first == Combo[0] && second == Combo[1] && third == Combo[2]){
            System.out.println("That Is The Right Combination");
            System.out.println("Unlocked!");
        }
        else{
            System.out.println("Sorry That is The Wrong Combination");
            System.out.println("Locked!");
        }
    }
    // takes user input then generates 3 random numbers and 
    public void RandomCombo(int num1, int num2, int num3){
        Random Randint = new Random();
        
        int combo1 = Randint.nextInt(3);
        int combo2 = Randint.nextInt(3);
        int combo3 = Randint.nextInt(3);
        
        if(num1 == combo1 && num2 == combo2 && num3 == combo3){
            System.out.println("Unlocked!");
            System.out.println("That Is The Right Code, Congratulations!");
        }
        else{
            while(tryAgain == true){
                wrongCounter += 1;
            
                if(wrongCounter == 3){
                    System.out.println("Sorry you got it incorrect three times, The correct code was " + combo1 + combo2 + combo3);
                    tryAgain = false;
                }
            }
        }
    }
}

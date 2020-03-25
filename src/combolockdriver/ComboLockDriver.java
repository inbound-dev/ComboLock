/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combolockdriver;
import java.util.Scanner;
/**
 *
 * @author Jorda
 */
public class ComboLockDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // some global variables 
        int num1, num2, num3;
        String str1, str2, str3;
        
        // new scanner and new combolock instances 
        Scanner Input = new Scanner(System.in);
        ComboLock combo = new ComboLock();
        
        // asking and storing 3 numbers
        System.out.println("Please Enter 3 Numbers from 1 to 9 and - 's between");
        String userInput = Input.next();
        
        // fixing index out of range of substring with if statement
        if(userInput.length() > 0){
            // checking to make sure the numbers are seperated with dashes
            if(!userInput.contains("-")){
                System.out.println("Sorry that is not what we are looking for please enter a - next time");
                System.exit(0);
            }
         // generating substrings and storing them as int's   
        str1 = userInput.substring(0,userInput.indexOf("-"));
        str2 = userInput.substring(userInput.indexOf("-"),userInput.lastIndexOf("-"));
        str3 = userInput.substring(userInput.lastIndexOf("-"), userInput.length());
        
        num1 = Integer.parseInt(str1);
        num2 = Integer.parseInt(str2);
        num3 = Integer.parseInt(str3);
        
        // getting the previously entered code and comparing it to  the new one
        System.out.println("Please Enter The Combination you set");
        
        System.out.println("what is the first number");
        String strNum1 = Input.next();
        
        System.out.println("Second Number");
        String strNum2 = Input.next();
        
        System.out.println("Third Number");
        String strNum3 = Input.next();
        
        // storing as int's
        int intNum1 = Integer.parseInt(strNum1);
        int intNum2 = Integer.parseInt(strNum2);
        int intNum3 = Integer.parseInt(strNum3);
        
        // sending to Combination 
        combo.Combination(num1, num2, num3, intNum1, intNum2, intNum3);
        
        // guessing the generated combo
        System.out.println("The New Combination consists of generated numbers between 0 and 3");
        System.out.println("What is the first Number?");
        int Guess1 = Input.nextInt();
        
        System.out.println("What is the Second guess");
        int Guess2 = Input.nextInt();
        
        System.out.println("What is the third Number");
        int Guess3 = Input.nextInt();
        
        // sending to RandomCombo to be delt with 
        combo.RandomCombo(Guess1, Guess2, Guess3);
        
    }
        // if the combo is less than 0 exit
        else{
            System.out.println("Please Enter a Valid Combination Next Time");
            System.exit(0);
        }
    }
}

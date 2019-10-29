import java.security.SecureRandom;
import java.util.Scanner;
public class Part3{
    public static void main(String[] arg){
        int numCorrect = 0;
        int numIncorrect = 0;
        int numQuestions = 10;
        System.out.println("*********************************************************************");
        System.out.println("****************WELCOME TO MY MULTIPLICATION PROGRAM!!!!*************");
        System.out.println("*********************************************************************\n");
        while(true){
            for(int i = 0; i < numQuestions; i++){
                numCorrect += (question() == true ? 1 : 0);
                numIncorrect = numQuestions - numCorrect;
            }
            if(numCorrect >= 7.5){
                System.out.println(numCorrect);
                System.out.println("Congratulations, you are ready to go to the next level!");
                System.out.println("\nThanks for using the multiplication programming");
                System.out.println("\n*********************************************************************\n");

            }
            else if(numIncorrect >= 7.5){
                System.out.println(numIncorrect);
                System.out.println("Please ask your teacher for extra help.");
                System.out.println("\nThanks for using the multiplication programming");
                System.out.println("\n*********************************************************************\n");

            }
            else{
                System.out.println("\nThanks for using the multiplication programming");
                System.out.println("\n*********************************************************************\n");
            }
        }
    }


    public static boolean question(){
        Scanner scnr = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        int num1;
        int num2;
        int userNum;

        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;

        System.out.print("How much is " + num1 + " times " + num2 + " ? : ");
        userNum = scnr.nextInt();

        if(userNum != (num1*num2)){
            return false;
        }
        else{
            return true;
        }
    }




    public static void response(String response1, String response2, String response3, String response4) {

        int n = new SecureRandom().nextInt(4) + 1 ;
        switch(n){
            case 1:
                System.out.print(response1);
                break;
            case 2:
                System.out.print(response2);
                break;
            case 3:
                System.out.print(response3);
                break;
            case 4:
                System.out.print(response4);
                break;
            default:
                break;
        }
    }
}
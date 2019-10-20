import java.security.SecureRandom;
import java.util.Scanner;
public class Part4{
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
            }

            numIncorrect = numQuestions - numCorrect;
            if(numCorrect >= 7.5){
                System.out.println("Congratulations, you are ready to go to the next level!");
            }
            else if(numIncorrect >= 7.5){
                System.out.println("Please ask your teacher for extra help.");
            }
            else{
                System.out.println("Thanks for using the multiplication programming");
            }
        }
    }


    public static boolean question(){
        Scanner scnr = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        int num1;
        int num2;
        int userNum;

        num1 = random.nextInt(difficulty()) + 1;
        num2 = random.nextInt(difficulty()) + 1;

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

    public static int difficulty(){
        Scanner scnr = new Scanner(System.in);
        int z = 0;
        System.out.print("Choose difficulty: (1) - (2) - (3) - (4): ");
        z = scnr.nextInt();
        switch(z){
            case 1:
                return 10;
            case 2:
                return 100;
            case 3:
                return 1000;
            case 4:
                return 10000;
            default:
                return 0;
        }
    }
}
import java.security.SecureRandom;
import java.util.Scanner;
public class Part5{
    public static void main(String[] arg){
        int numCorrect = 0;
        int numIncorrect = 0;
        int numQuestions = 10;
        System.out.println("*********************************************************************");
        System.out.println("****************WELCOME TO MY MULTIPLICATION PROGRAM!!!!*************");
        System.out.println("*********************************************************************\n");
        while(true){
            for(int i = 0; i < numQuestions; i++){
                if(difficulty() == 1){
                    mult();
                }
                else if(difficulty() == 2){
                    divide();
                }
                else if(difficulty() == 3){
                    add();
                }
                else if(difficulty() == 4){
                    sub();
                }

            }
            if(numCorrect >= 7.5){
                System.out.println(numCorrect);
                System.out.println("Congratulations, you are ready to go to the next level!");
                System.out.println("\nThanks for using the multiplication programming");
                System.out.println("\n*********************************************************************\n");
                break;
            }
            else if(numIncorrect >= 7.5){
                System.out.println(numIncorrect);
                System.out.println("Please ask your teacher for extra help.");
                System.out.println("\nThanks for using the multiplication programming");
                System.out.println("\n*********************************************************************\n");
                break;
            }
            else{
                System.out.println("\nThanks for using the multiplication programming");
                System.out.println("\n*********************************************************************\n");
                break;
            }
        }
    }


    public static boolean mult(){
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

    public static boolean add(){
        Scanner scnr = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        int num1;
        int num2;
        int userNum;

        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;

        System.out.print("How much is " + num1 + " plus " + num2 + " ? : ");
        userNum = scnr.nextInt();

        if(userNum != (num1+num2)){
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean sub(){
        Scanner scnr = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        int num1;
        int num2;
        int userNum;

        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;

        System.out.print("How much is " + num1 + " minus " + num2 + " ? : ");
        userNum = scnr.nextInt();

        if(userNum != (num1/num2)){
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean divide(){
        Scanner scnr = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        double num1;
        double num2;
        double userNum;

        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;

        System.out.print("How much is " + num1 + " divide by " + num2 + " ? : ");
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
        System.out.print("Choose Arithmetic: (1)multiplication - (2)Division - (3)Add - (4)Subtract: ");
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

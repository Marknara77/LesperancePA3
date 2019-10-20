import java.security.SecureRandom;
import java.util.Scanner;
public class Part2{
    public static void main(String[] arg){
        Scanner scnr = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        int num1;
        int num2;
        int userNum;

        num1 = random.nextInt(10);
        num2 = random.nextInt(10);
        System.out.println("*********************************************************************");
        System.out.println("****************WELCOME TO MY MULTIPLICATION PROGRAM!!!!*************");
        System.out.println("*********************************************************************\n");
        System.out.print("How much is " + num1 + " times " + num2 + " ? : ");
        userNum = scnr.nextInt();

        while(true){
            if(userNum != (num1*num2)){
                response("No. Please try again.\n", "Wrong. Try once more.\n", "Don’t give up!\n", "No. Keep trying.\n");
                System.out.println("*********************************************************************\n");
                System.out.print("How much is " + num1 + " times " + num2 + " ? : ");
                userNum = scnr.nextInt();
            }
            else{
                num1 = random.nextInt(10)+1;
                num2 = random.nextInt(10)+1;
                response("Very good!\n", "Excellent!\n", "Nice work!\n", "Keep up the good work!\n");
                System.out.println("*********************************************************************\n");
                System.out.print("How much is " + num1 + " times " + num2 + " ? : ");
                userNum = scnr.nextInt();
            }
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
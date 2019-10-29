import java.security.SecureRandom;
import java.util.Scanner;
public class Part1{
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
                System.out.println("No, please try again.\n");
                System.out.println("*********************************************************************\n");
                System.out.print("How much is " + num1 + " times " + num2 + " ? : ");
                userNum = scnr.nextInt();
            }
            else{
                num1 = random.nextInt(10)+1;
                num2 = random.nextInt(10)+1;
                System.out.println("Very good!\n");
                System.out.println("*********************************************************************\n");
                System.out.print("How much is " + num1 + " times " + num2 + " ? : ");
                userNum = scnr.nextInt();
            }


        }

    }


}
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner myinput = new Scanner(System.in);
        System.out.println("Please enter a number between 0-9");
        int mynum = myinput.nextInt();
        if (mynum <=9 && mynum>0){
            System.out.println("You entered " + mynum);
        }
        else {
            System.out.println("Not a valid number");
        }
    }
}

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {

        float input;

        Calculations calculations = new Calculations();

        System.out.println("Welcome to Numbers From Numbers.");

        System.out.println("Simply give a number get more numbers! Type below:");

        Scanner scanner = new Scanner(System.in);


        try {
            input = Float.parseFloat(scanner.nextLine());

            calculations.setNumber(input);

            calculations.setText("you entered: ");

            System.out.println(calculations.getText() + calculations.getNumber());

            calculations.setTimesPi((float) (input * 3.14159265359));

            calculations.setTimesPiText("Your number * Pi :");

            System.out.println(calculations.getTimePiText() + calculations.getTimesPi());

            calculations.setSquareroot((float) (sqrt(input)));

            calculations.setSquarerootText("Square root of your number :");

            System.out.println(calculations.getSquarerootText() + calculations.getSquareroot());


        } catch (Exception e) {

            System.out.println("Wrong input format.");
        }


    }





/* ----a more functional approach would be-------:
    public static void main(String[] args) {
        float user;
        System.out.println("Welcome to Numbers From Numbers.");
        System.out.println("Simply give a number get more numbers! Type below:");
        Scanner scanner = new Scanner(System.in);
     while(true){
              try{
                  user = Float.parseFloat(scanner.nextLine());
                 System.out.println(user);
                 break;
                 }catch(Exception e){
                    System.out.println("not an int nor  a float.");
                                    }
               }


    }

*/


}

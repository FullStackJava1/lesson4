import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //  Print the numbers from input till 0.
        /*int userNum = input.nextInt();
        int addition=userNum>0 ? -1 :1; //if number is positive we will add -1 if negative +1
            while (userNum != 0) {
                System.out.println(userNum);
                userNum+=addition;

            }*/
        //0 to number
        /*
        int userNum1 = input.nextInt();
        int addition1=userNum1>0 ? 1 :-1; //if number is positive we will add -1 if negative +1
        int i=0;
        while (i!=userNum1) {
            System.out.println(i);
           i+=addition1;

        }
         */

        /*int facNumber = input.nextInt();
        int resulte=facNumber;
        while(facNumber!=1){
            resulte=resulte*(facNumber-1);
            facNumber--;
        }
        System.out.println(resulte);
        */

        //
        /*The game : player takes a card with value 1 to 10 (so it will be easier).
        He ask to give more cards.
        If he Gets 21 value as sum he win!
                If he takes more than 21 he lose.
        If he have less than 21 he can continue
                We will implement it with do while because first iteration (when the user gets first card should always happen)
        The card will be given by random value from 1 to 10.
        */

       /* int sum=0;
        int keepPlay=1;
        do{
             int card=(int)(Math.random()*10+1);
            System.out.println("the card is : "+card);
            sum+=card;
            System.out.println("sum: "+sum);
            if(sum==21){
                System.out.println("WIN");
            }else if(sum>21){
                System.out.println("the same is biger 21");

            }else {
                System.out.println("want keep play yes enter 1 no =0  ");
                keepPlay = input.nextInt();
            }

        }while (sum<=21 && keepPlay==1);*/

       /* Create a number guessing game where the computer generates a random number between 1 and 10,
            and the user has to guess the number.
                Use a while loop to give the user multiple attempts until they guess correctly.*/

        /*int ranNum=(int)(Math.random()*10+1);
        int guessNumber;
        int countOfGuess=0;
        do {
            System.out.println("Enter Guess Number: ");
            guessNumber = input.nextInt();
            countOfGuess++;
            //System.out.println("the guess num "+guessNumber +" equale "+ranNum);
        }while(ranNum!=guessNumber);
        System.out.println("the guess num "+guessNumber +" equale "+ranNum);
        System.out.println("num of guess: "+countOfGuess);
    */
        //Write a program which will take number from the user and will print all numbers
        //from 1 to that input number and backward till 1.
    /*
        System.out.println("enter nuber");
        int numberf=input.nextInt();
        for (int i=1;i<=numberf;i++){
            System.out.println(i);
        }
        for (int i=(numberf-1);i>=1;i--){
            System.out.println(i);
        }
        // the same solution with one for loop
        for(int i=1;i<numberf*2;i++){
            if(i<numberf){
                System.out.println(i);

            }else {
                System.out.println(numberf-(i%numberf));
            }
        }*/
        //Find if the input number is prime or not and print :
        //1.run with for loop from 2 till the number-1
        //2.to check factor we should check if modulo will be 0
        /*int num=10;
        boolean prime=true;
        for(int i=2;i<num;i++){ //num/2 can work
            if(num%i==0){
                prime=false;
                break;

            }

        }
        System.out.println("the nuber you choos prime?  "+prime);
    */
        /*Class average grade.
                User input grades from 0 to 100 of the students.
                When user finish he input -1
        When user finish we should print the average grade of all students.
*/

        int _Tinput;
        int sum=0;
        int count=0;
        int avg;
    do{
        System.out.println("Enter grade");
        _Tinput=input.nextInt();
        if (_Tinput!=-1) {
            break;
        }
            sum += _Tinput;
            count++;
        System.out.println(sum +" "+count);
    }while(_Tinput!=-1);
    if (count!=0) {
        avg = sum / count;
        System.out.println("avrage is: " + avg);
    }

    }
}
import java.util.InputMismatchException;
import java.util.Scanner;

public class Day9Exceptions {
public static void main(String[] args){
            Scanner read = new Scanner(System.in);

            //Q1---------------------------------------
            try {
                System.out.println("Welcome to Q1, enter two numbers to show their addition, multiply, subtract, divide and remainder.");
                System.out.println("Enter the first number:");
                int number1q1 = read.nextInt();
                System.out.println("Enter the second number:");
                int number2q1 = read.nextInt();
                System.out.println("[" + number1q1 + "+" + number2q1 + "=" + (number1q1 + number2q1) + "]");
                System.out.println("[" + number1q1 + "-" + number2q1 + "=" + (number1q1 - number2q1) + "]");
                System.out.println("[" + number1q1 + "x" + number2q1 + "=" + (number1q1 * number2q1) + "]");
                System.out.println("[" + number1q1 + "/" + number2q1 + "=" + (number1q1 / number2q1) + "]");
                System.out.println("[" + number1q1 + " mod " + number2q1 + "=" + (number1q1 % number2q1) + "]");
            } catch (InputMismatchException e){System.out.println("The input must be in numbers only.");
                read.nextLine();}
              catch (ArithmeticException e){System.out.println("you can't dived by zero!");}
              catch (Exception e){System.out.println(e.getMessage());}

            //Q2---------------------------------------
            try {
                System.out.println("--------------------------------");
                System.out.println("Welcome to Q2, enter a number to show its  multiply table.");
                int numberq2 = read.nextInt();
                for (int i = 1; i <= 10; i++)
                    System.out.println("[" + i + "x" + numberq2 + "= " + (i * numberq2) + "]");
                }
            catch (InputMismatchException e){System.out.println("The input must be in numbers only.");
                read.nextLine();}
            catch (Exception e){System.out.println(e.getMessage());}

    //Q3---------------------------------------
            System.out.println("--------------------------------");
            System.out.println("Welcome to Q3, this is area and perimeter calculator of a circle.");
            System.out.println("please enter the Radius:");
            double radius;
            //calculation
              try{
             radius = read.nextDouble();

             double  perimeter1 = perimeter(radius);
             double area1 = area(radius);
             //printing
             System.out.println("Perimeter is : "+perimeter1);
             System.out.println("Area is : "+area1);
              }
              catch (InputMismatchException e){System.out.println("The input must be in numbers only.");
                     read.nextLine();}
              catch (Exception e){
                    System.out.println(e.getMessage());
                                  }


            //Q4---------------------------------------
            System.out.println("--------------------------------");
            System.out.println("Welcome to Q4, here is a calculator of the average of numbers you write.");
            //loop : to enter the set as user need.
            double numberq4, sumq4=0,choiceq4,average;
            int countq4=0;
            while(true){
            try{
                System.out.println("Enter the "+(countq4+1)+"th. number     Press any other character to finish.");
                numberq4 = read.nextDouble();
                countq4++;
                sumq4+=numberq4;
                 }
                        catch (InputMismatchException e){
                         read.nextLine();
                        if(countq4>0){
                        System.out.println("Done");  break;}
                        System.out.println("You need to enter at least one number");                                }
                        //why no arithemtice exception? because counter always is 1 or above, it is never zero
                        catch(Exception e){System.out.println(e.getMessage());}

                }//end of while

                 //calculation and result:
            average = sumq4/countq4;
            System.out.println("the average of these "+countq4+" numbers is "+average);


            // Q5---------------------------------------
            System.out.println("--------------------------------");
            System.out.println("Welcome to Q5, here is a calculating and guessing game ! enter two numbers and guess their sum!");
            try{
            System.out.println("Enter the first number: ");
            int number1q5 = read.nextInt();
            System.out.println("now the second number: ");
            int number2q5 = read.nextInt();
            System.out.println("now the third number, just guess:)! : ");
            int number3q5 = read.nextInt();
            if(number3q5==(number1q5+number2q5))
                System.out.println("WOW! yes "+number3q5+" is their sum!");
            else   System.out.println("NOPE~ number "+number3q5+" is NOT their sum!");}

            catch (InputMismatchException e){System.out.println("The input must be in numbers only.");
                   read.nextLine();}
            catch (Exception e){
                 System.out.println(e.getMessage());
                                }
            //Q6---------------------------------------
            System.out.println("--------------------------------");
            System.out.println("Welcome to Q6, lets reverse a word!");
            try {
                System.out.println("Enter a word:");
                String wordq6 = read.next();
                //loop to print
                System.out.print("The reverse is ");
                for (int i = wordq6.length() - 1; i >= 0; i--)
                    System.out.print(wordq6.charAt(i));
            }
            catch (InputMismatchException e){System.out.println("The input must be ONE word only.");
                read.nextLine();}
            catch (IndexOutOfBoundsException e){System.out.println("Index too long.");}
            catch (NullPointerException e){System.out.println("Value is not initialized yet.");}
            catch (Exception e){
                System.out.println(e.getMessage());
            }
            //Q7---------------------------------------
            System.out.println("--------------------------------");
            System.out.println("Welcome to Q7, lets see if the number is even or odd");
            try {
                System.out.println("Enter a number:");
                int numberq7 = read.nextInt();
                isEven(numberq7);
            }
            catch (InputMismatchException e){System.out.println("The input must be in numbers only."); read.nextLine();}
            catch(Exception e){System.out.println(e.getMessage());}


            // Q8---------------------------------------
            System.out.println("--------------------------------");
            System.out.println("Welcome to Q8, this is temperature conversion program  (ºC <--> ºF) ");
            int choiceq8=0;
            double temp;
            do {
            try{
                System.out.println("pick from the menu:");
                choiceq8 = 0;
                System.out.println(
                 "1. Fahrenheit ---> Celsius\n" +
                 "2. Celsius ---> Fahrenheit\n" +
                 "3. exit"
                ); //end of menu

                choiceq8 = read.nextInt();
                switch (choiceq8) {
                    case 3:
                        break;
                    case 1:
                        System.out.println("enter the temperature: ");
                        temp = read.nextDouble();
                        FtoC(temp);
                        break;
                    case 2:
                        System.out.println("enter the temperature: ");
                        temp = read.nextDouble();
                       CtoF(temp);
                        break;

                }

            }
            catch (InputMismatchException e){System.out.println("The input must be in numbers only."); read.nextLine();}
            catch(Exception e){System.out.println(e.getMessage());}
            }while(choiceq8!=3);


            //Q9---------------------------------------
            System.out.println("--------------------------------");


            System.out.println("Welcome to Q9, Enter a word/sentence:  ");
            read.nextLine();
            String str = read.nextLine();
            int indexq9=0;
    boolean done = false;
    while (!done) {
try {
        System.out.println("enter number index between 0 to : " + (str.length() - 1));
        indexq9 = read.nextInt();
        done = showChar(indexq9, str);
        } catch(InputMismatchException e){
        System.out.println("!#: use numbers");
        read.nextLine();
    }
        catch(IndexOutOfBoundsException e){
        System.out.println("#!: Index wrong, Try again");
    }
        catch(Exception e){
        System.out.println(e.getMessage());
    }
}
            //Q10---------------------------------------
            System.out.println("--------------------------------");
            System.out.println("Welcome to Q10,here is a program to calculate area and perimeter of a rectangle!");
           boolean doneQ10=false;
            while(!doneQ10) {
            try {
                doneQ10 = Rectangle();
            } catch (InputMismatchException e){System.out.println("The input must be in numbers only."); read.nextLine();}
            catch(Exception e){System.out.println(e.getMessage());}


            }



            //Q11---------------------------------------
            System.out.println("--------------------------------");
            System.out.println("Welcome to Q11,write two numbers to see facts about their relation.");
            try {
                System.out.println("the first number:");
                int num1q11 = read.nextInt();
                System.out.println("the second number:");
                int num2q11 = read.nextInt();
                System.out.println("here is some facts:");
                //facts
                if (num1q11 == num2q11)
                    System.out.println(num1q11 + "==" + num2q11);
                else
                    System.out.println(num1q11 + "!=" + num2q11);
                if (num1q11 <= num2q11)
                    System.out.println(num1q11 + "<=" + num2q11);
                if (num1q11 < num2q11)
                    System.out.println(num1q11 + "<" + num2q11);
                if (num1q11 >= num2q11)
                    System.out.println(num1q11 + ">=" + num2q11);
                if (num1q11 > num2q11)
                    System.out.println(num1q11 + ">" + num2q11);
            } catch (InputMismatchException e){System.out.println("The input must be in numbers only."); read.nextLine();}
            catch(Exception e){System.out.println(e.getMessage());}



    //Q12---------------------------------------
            System.out.println("--------------------------------");
            System.out.println("Welcome to Q12, lets convert the seconds to an HH:MM:SS!");
            try {
                System.out.println("enter seconds:");
                int secondsRead = read.nextInt();
                double hours, min, sec;  //86399 example temp note
                min = (secondsRead / 60) % 60;
                hours = secondsRead / 60 / 60;
                sec = secondsRead % 60;
                //sec = min%60;
                System.out.println(hours + " : " + min + " : " + sec);
            } catch (InputMismatchException e){System.out.println("The input must be in numbers only."); read.nextLine();}
            catch(Exception e){System.out.println(e.getMessage());}

    //Q13---------------------------------------
            System.out.println("--------------------------------");
            System.out.println("Welcome to Q13, enter four numbers please to test them.");
            try {


                System.out.println("enter 1th number:");
                int num1q13 = read.nextInt();
                System.out.println("enter 2th number:");
                int num2q13 = read.nextInt();
                System.out.println("enter 3th number:");
                int num3q13 = read.nextInt();
                System.out.println("enter 4th number:");
                int num4q13 = read.nextInt();
                if (num1q13 == num2q13 && num1q13 == num3q13 && num1q13 == num4q13)
                    System.out.println("****" + num1q13 + "," + num2q13 + "," + num3q13 + "," + num4q13 + " are EQUAL!****");
                else
                    System.out.println("****" + num1q13 + "," + num2q13 + "," + num3q13 + "," + num4q13 + " are NOT equal!****");
            } catch (InputMismatchException e){System.out.println("The input must be in numbers only."); read.nextLine();}
            catch(Exception e){System.out.println(e.getMessage());}




//Q14---------------------------------------
            System.out.println("--------------------------------");
            System.out.println("Welcome to Q14.");
            try {
                numSign(read);
            } catch (InputMismatchException e){System.out.println("The input must be in numbers only."); read.nextLine();}
            catch(Exception e){System.out.println(e.getMessage());}

    //Q15---------------------------------------
            System.out.println("--------------------------------");
            System.out.println("Welcome to Q15.");
            int pos=0,neg=0,zeros=0;
         try{
        do {
                System.out.println("enter a number to count, or press any character to end counting.");
                int numq15 = read.nextInt();
                if(numq15>0)
                    pos++;
                else if(numq15==0) zeros++;
                else{
                    neg++;

                }
            }while(true); }
            catch (InputMismatchException e){System.out.println("results are:"); read.nextLine();}
            catch(Exception e){System.out.println(e.getMessage());}
finally {
             System.out.println("#Positive numbers are: "+pos);
             System.out.println("#Negative numbers are: "+neg);
             System.out.println("#Zeros are: "+zeros);
         }




            // Q16---------------------------------------
            System.out.println("--------------------------------");
            System.out.println("Welcome to Q16, Enter seqence of numbers together.  for example 1234");
            String numberq16 = read.next();
            try{
            for(int i=numberq16.length()-1;i>=0;i--)
                System.out.print(numberq16.charAt(i));}
                 catch(IndexOutOfBoundsException e) {
                     System.out.println("#!: Index wrong.");}


                     //Q17---------------------------------------
                     System.out.println("--------------------------------");
                     System.out.println("Welcome to Q17, this program will show the largest and the smallest number entered");
                     int largest = 0, smallest, choiceq17;
                     try {

                         System.out.print("enter a number:");
                         int numq17 = read.nextInt();
                         smallest = numq17;
                         largest = numq17; //as start defult value
                         while (true) {
                             System.out.print("enter a number:");
                             numq17 = read.nextInt();
                             //calculations:
                             if (numq17 > largest) largest = numq17;
                             if (numq17 < smallest) smallest = numq17;
                             //end of calcu
                             System.out.println("Press (1) to show results, or any other number to continue");
                             choiceq17 = read.nextInt();
                             if (choiceq17 == 1) break;
                         } //end of loop

                         System.out.println("The largest number is: " + largest);
                         System.out.println("The smallest number is: " + smallest);
                     } catch (InputMismatchException ex) {
                         System.out.println("#! Numbers only");
                         read.nextLine();
                     } catch (Exception ex) {
                         System.out.println(ex.getMessage());
                     }


                     //Q18---------------------------------------
                     System.out.println("--------------------------------");
                     System.out.println("Welcome to Q18, this program will show how many (a) letter is in the word/sentence");
                  try{
                      //read.nextLine();
                      countAchar();
                     }
                     catch (IndexOutOfBoundsException e){e.getMessage();}
                     catch(Exception e){
                     e.getMessage();}

                     System.out.println("--------------------------------");

                     System.out.println("WOHO!!!\n****LAB 1 DONE****");



        } //main

 public static void countAchar()throws Exception{
 Scanner read = new Scanner(System.in);
     int countq18 = 0;
     System.out.print("Please enter a word/sentence: ");
     String strq18 = read.nextLine();

     for (int i = 0; i < strq18.length(); i++) {
         if (strq18.charAt(i) == 'a') countq18++;
     }
     if(countq18==0)
     throw new Exception("there is no letter a, in this input.");
     System.out.println("number of a's is: " + countq18);

 }


public static void numSign(Scanner r) throws Exception{

    System.out.println("enter a number:");
    int num1q14 = r.nextInt();
    if (num1q14 > 0) throw new Exception("the number is positive.");
    else if (num1q14 == 0) throw new Exception("the number is zero.");
    else throw new Exception("the number is negative.");


}
        public static boolean showChar(int index,String str) throws IndexOutOfBoundsException{
        boolean done=true;

            if (index >= str.length() || index < 0) {
                      throw new IndexOutOfBoundsException();}

            System.out.println("the character in index(" + index + ") is " + str.charAt(index));
            return done;
        }
        public static void isEven(int num)throws Exception{
            if (num % 2 == 0)
                System.out.println("The number is even.");
            else
            throw new Exception("The number is odd.");
        }

        public static void FtoC(double f) throws Exception{
        //input must be reasonable, not imaginary tempreture. ( limit between -400F to 130F ) by search.
            if(f>130||f<-400) throw new Exception("input temperature is impossible");
            System.out.println("****Temperature in Celsius is " + ((f - 32) / 1.8) + "ºC****");
        }
    public static void CtoF(double c) throws Exception{
        //input must be reasonable, not imaginary tempreture. ( limit between -270C to 60C ) by search.
        if(c>60||c<-270) throw new Exception("input temperature is impossible");
        System.out.println("****Temperature in Fahrenheit is " + ((c * 1.8) + 32) + "ºF****");
    }



        public static double perimeter(double radius)throws InputMismatchException,Exception{
        if(radius<=0)
        throw new Exception("Radius must be in positive number.");
        return  2*3.14*radius;
        }
    public static double area(double radius)throws Exception{
        if(radius<=0)
        throw new Exception("Radius must be in positive number.");
        return 3.14*(radius*radius);
    }


    public static boolean Rectangle()throws Exception{
    Scanner read = new Scanner(System.in);
            System.out.println("Enter the width:");
          double  width = read.nextDouble();
            if(width<=0)
            throw new Exception("width must be over 0, Try again.");

        System.out.println("Enter the height:");
     double   height = read.nextDouble();
        if(height<=0)
         throw new Exception("height must be over 0, Try again.");
        double areaq10 = width*height;
        double perimeterq10 = 2*(width+height);
        System.out.println("The Area is: "+areaq10);
        System.out.println("The perimeter is: "+perimeterq10);
        return true;
    }



    }



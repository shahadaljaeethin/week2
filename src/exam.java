import java.util.*;
public class exam {
public static void main(String[] args){
Scanner r = new Scanner(System.in);
int[] three = new int[3];
    System.out.println("=======================");
    System.out.println("Q1, start.");
System.out.println("Hello, this program to show the largest number among 3.\nplease, enter the first number:");
    three[0] = r.nextInt();
    System.out.println("now the second number:");
    three[1] = r.nextInt();
    System.out.println("now the third number:");
    three[2] = r.nextInt();
    int largest = three[0];
    for(int numebr: three){
    if(numebr>largest) largest=numebr;
    }
    System.out.println("The largest number is "+largest+".");


    System.out.println("=======================");
    System.out.println("Q2, start.");
    System.out.println("Enter a word/sentence.");
    r.nextLine();
    String wordq2 = r.nextLine();
    int lengthq2 = wordq2.length();
    int indexq2;
    while(true) {
        System.out.println("Enter the index to show.\nit must be between 0 to "+(lengthq2-1));
         indexq2 = r.nextInt();
if(indexq2<0||indexq2>=lengthq2) System.out.println("Index error.");
else break;
    } //end while
    System.out.println("The character is "+wordq2.charAt(indexq2));


    System.out.println("=======================");
    System.out.println("Q3, start.");
    System.out.println("this program to show the total of numbers.");
    int sum=0, numq3;
    while(true){
     System.out.println("Enter a number:        (Press 0 to finish)");
    numq3 = r.nextInt();
    if(numq3==0) break;
    sum+=numq3;
    }
    System.out.println("The sum= "+sum);

    System.out.println("=======================");
    System.out.println("Q4, start.");
    int[] original =  {10, -21 , 30, 31, -25};
    for(int num: original){
        if(num>0)
        System.out.println("#"+num+" is positive number.");
        else
        System.out.println("#"+num+" is negative number.");
    }

    System.out.println("=======================");
    System.out.println("Q5, start.");
    String[] words = {"Tuwaiq","Bootcamp","Student","JAVA"};
    int shortest = words[0].length();
    String shortWord = words[0];
    for(int i=0;i<words.length;i++){
        if(words[i].length()<shortest){
            shortest = words[i].length();
            shortWord = words[i];
        }

    }
    System.out.println("The shortest word is "+shortWord);
    System.out.println("=======================");

}//main



}

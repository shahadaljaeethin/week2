import  java.util.*;

public class Lab2 {
    public static void main(String[] args){
    Q(1);
    Scanner r = new Scanner(System.in);
    //find the longest size.
    String[] words = {"cat","dog","red","is","pm"};
    int longestIndex=0;
    for(String w: words){
     if(w.length()>longestIndex) longestIndex = w.length();
    }

    //find words with this size.
    ArrayList<String> longWords = new ArrayList<>();
    for(String w: words){
        if(w.length()==longestIndex){
            longWords.add(w);
        }
    }
        print(""+longWords);
Q(2);
int[] numbers ={1,1,1,3,3,5};
//array of numbers
//counter?




    }



    static void print(String message){
        System.out.println(message);
    }
    static void Q(int question){
        System.out.println("====================");
        System.out.println("Q"+question+":");
    }
}

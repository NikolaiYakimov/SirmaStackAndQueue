package exercise.exc11;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] data=sc.nextLine().split(" ");
        TreeSet<Integer> numbers=new TreeSet<>();

        for(String num:data){
            numbers.add(Integer.parseInt(num));
        }
        int count=Math.min(3,numbers.size());
        Iterator<Integer> iterator=numbers.descendingIterator();
        for(int i=0;i<count;i++){
            System.out.print(iterator.next()+" ");
        }
    }

}

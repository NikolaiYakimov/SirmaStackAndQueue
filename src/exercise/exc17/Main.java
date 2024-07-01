package exercise.exc17;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Set<String> vipGuest=new HashSet<>();
        Set<String> regularGuest= new HashSet<>();
        String input;
        while (!(input=scanner.nextLine()).equalsIgnoreCase("party")){
            if (input.length() == 8) {
                if(Character.isDigit(input.charAt(0)))
                    vipGuest.add(input);
                else
                    regularGuest.add(input);
            }
//            else
//                System.out.println("Not a such person");
        }

        while (!(input=scanner.nextLine()).equalsIgnoreCase("end")){

            vipGuest.remove(input);
            regularGuest.remove(input);
        }

        for(String vips:vipGuest){
            System.out.println(vips);
        }
        for (String regular:regularGuest){
            System.out.println(regular);
        }

    }
}

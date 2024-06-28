package exercise.exc4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,String> phonebook= new HashMap<>();
        loop:while (true) {

            String[] entry=sc.next().split("-");
            if(entry[0].equalsIgnoreCase("stop"))
                break;

            if(entry.length==2){
                String name=entry[0];
                String phone=entry[1];
                phonebook.put(name,phone);

            } else if (entry.length==1) {
                if (entry[0].equalsIgnoreCase("search"))
                    continue ;

                if (phonebook.containsKey(entry[0]))
                        System.out.printf("%s -> %s \n", entry[0], phonebook.get(entry[0]));
                    else
                        System.out.printf("Contact %s not found. \n", entry[0]);
            }
            }
        }
    }

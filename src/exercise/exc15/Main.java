package exercise.exc15;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        LinkedHashMap<String, LinkedHashSet<String>> companies=new LinkedHashMap<>();
        String input;
        while (!(input=scanner.nextLine()).equalsIgnoreCase("end")){
            String[] data=input.split(" -> ");
            String companyName=data[0];
            String id=data[1];

            companies.putIfAbsent(companyName,new LinkedHashSet<>());
            companies.get(companyName).add(id);

        }

        for (var entry:companies.entrySet()){
            System.out.println(entry.getKey());
            for(var id:entry.getValue()){
                System.out.println("-- "+id);
            }
        }


    }
}

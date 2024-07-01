package exercise.exc16;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Set<String> carLot=new LinkedHashSet<>();
        String input;
        while (!(input=scanner.nextLine()).equalsIgnoreCase("End")){
            String[] data=input.split(", ");

            if(data[0].equalsIgnoreCase("in")){
                carLot.add(data[1]);
            } else if (data[0].equalsIgnoreCase("out")) {
                carLot.remove(data[1]);
            }
        }
        if(carLot.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else{
            for(var car:carLot){
                System.out.println(car);
            }
        }
    }

}

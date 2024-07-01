package exercise.exc13;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> parkingDb = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String command = input[0];
            String username = input[1];

            if (command.equalsIgnoreCase("register")) {
                String plateNumber = input[2];
                if (parkingDb.containsKey(username)) {
                    System.out.println("ERROR: already registered with plate number " + parkingDb.get(username) + ".");
                } else {
                    parkingDb.put(username, plateNumber);
                    System.out.println(username + " registered " + plateNumber + " successfully.");
                }
            } else if (command.equalsIgnoreCase("unregister")) {
                if (!parkingDb.containsKey(username)) {
                    System.out.println("ERROR: user " + username + " not found.");
                } else {
                    parkingDb.remove(username);
                    System.out.println(username + " unregistered successfully.");
                }
            }

        }

        for (var carReg:parkingDb.entrySet()){
            String username=carReg.getKey();
            String plateNum=carReg.getValue();
            System.out.println(username+ " => "+plateNum);
        }
    }
}
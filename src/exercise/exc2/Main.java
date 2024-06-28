package exercise.exc2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, ArrayList<Double>> students = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);

            students.putIfAbsent(name, new ArrayList<>());
            students.get(name).add(grade);
        }

        for (var student : students.entrySet()) {
            double averageGrade = student.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0);
            System.out.println(STR."\{student.getKey()} -> \{student.getValue()} (avg: \{averageGrade})");
        }
    }
}

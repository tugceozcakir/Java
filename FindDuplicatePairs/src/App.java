import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        int[] numbers = {12, 13, 9, 18, 4, 7, 10, 8, 8, 14, 16, 14, 12};
        List<Integer> duplicatePairs = findDuplicatePairs(numbers);

        if (duplicatePairs.isEmpty()) {
            System.out.println("No duplicate even numbers found.");
        } else {
            System.out.println("Duplicate even numbers:");
            for (int pair : duplicatePairs) {
                System.out.println(pair);
            }
        }
    }

    public static List<Integer> findDuplicatePairs(int[] numbers) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> duplicatePairs = new ArrayList<>();

        //Create a map to store the counts of each number in the array.
        for (int number : numbers) {
            countMap.put(number, countMap.getOrDefault(number, 0) + 1);
        }

        //Check the entries in the map to find duplicate even numbers.
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int number = entry.getKey();
            int count = entry.getValue();

            //The number should have a count of 2 or more and be an even number.
            if (count >= 2 && number % 2 == 0) {
                duplicatePairs.add(number);
            }
        }
        return duplicatePairs;
    }
}

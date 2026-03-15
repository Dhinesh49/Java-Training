import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k = scanner.nextInt();
        scanner.close();
        
        List<String> substrings = new ArrayList<>();
        
        for (int i = 0; i <= s.length() - k; i++) {
            substrings.add(s.substring(i, i + k));
        }
        
        Collections.sort(substrings);
        
        System.out.println(substrings.get(0) + "\n" + substrings.get(substrings.size() - 1));
    }
}

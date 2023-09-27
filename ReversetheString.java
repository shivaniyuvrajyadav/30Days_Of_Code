public class Solution {
    public String solve(String A) {
         String[] splitedString = A.split("\\s+");
        StringBuilder output = new StringBuilder();
        for (int i = splitedString.length - 1; i >=0 ; i--) {
                output.append(splitedString[i]).append(" ");
        }
        return output.toString().trim();
    }
}

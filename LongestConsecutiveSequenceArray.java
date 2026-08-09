import java.util.HashSet;
public class LongestConsecutiveSequenceArray {
    public static int longestConsecutive(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        // Add All Elements Into HashSet
        for(int num : arr){
            set.add(num);
        }
        int longest = 0;
        // Find Longest Consecutive Sequence
        for(int num : set){
            // Check if it is the Starting Element
            if(!set.contains(num - 1)){
                int CurrentNum = num;
                int count = 1;
                while(set.contains(CurrentNum + 1)){
                    CurrentNum++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 2, 3};
        System.out.println("Longest Consecutive Sequence Length =" + longestConsecutive(arr));
    }
}

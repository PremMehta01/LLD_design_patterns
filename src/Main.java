import java.util.*;

class Main{

    public static void main(String[] args) {

        int[] arr = {100,4,200,1,3,2};

        System.out.println(longestConsecutive(arr));
    }


    public static int longestConsecutive(int[] nums) {
        int result = 0;
        Set<Integer> remainingNums = new HashSet<>();

        for(int num : nums) {
            remainingNums.add(num);
        }

        for(int num : nums) {
            if(!remainingNums.contains(num)) continue;

            int leftMost = getEdgeNumber(num, remainingNums, -1);
            int rightMost = getEdgeNumber(num, remainingNums, 1);

            System.out.println(rightMost);
            System.out.println(leftMost);

            result = Math.max(result, rightMost - leftMost + 1);
        }

        return result;
    }

    private static int getEdgeNumber(int num, Set<Integer> remainingNums, int operation) {

        int edgeNum = num;

        while(remainingNums.contains(edgeNum)) {
            remainingNums.remove(edgeNum);
            edgeNum = edgeNum + operation;
        }

        return edgeNum - operation;
    }
}
package Assignments.leetcode;

import java.util.HashSet;

public class FindMissingAndRepeatedValues2965 {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] output = new int[2];

        int gridLength = grid.length;

        int square =(int)Math.pow(gridLength,2);

        HashSet<Integer> integerHashSet = new HashSet<>();

        for (int[] Int : grid) {
            for (int j = 0; j < gridLength; j++) {
                if (integerHashSet.contains(Int[j])) {
                    output[0] = Int[j];
                } else {
                    integerHashSet.add(Int[j]);
                }
            }
        }

        for(int i = 1;i<=square;i++){
            if(!integerHashSet.contains(i)){
                output[1] = i;
            }
        }

        return output;
    }
}

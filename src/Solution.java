import java.util.HashMap;

public class Solution {
    public int[] minOperations(String boxes) {
        String fullBoxesSting = boxes.replaceAll("0", "");

        int[] fullBoxesIndexesArray = new int[fullBoxesSting.length()];
        int[] result = new int[boxes.length()];
        int index = 0;

        for (int i = 0; i < boxes.length(); i++) {
            char box = boxes.charAt(i);

            if (box != '0') {
                fullBoxesIndexesArray[index] = i;
                index++;
            }
        }
        for (int i = 0; i < boxes.length(); i++) {
            for (int j = 0; j < fullBoxesIndexesArray.length; j++) {
                int index1 = fullBoxesIndexesArray[j];
                result[i] += Math.abs(i - index1);
            }
        }
        return result;
    }
}

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    private static final String FILE_PATH = "./Resources/testData.csv";

    @ParameterizedTest
    @CsvFileSource(resources = FILE_PATH, delimiterString = ";")
    @DisplayName("merge Alternately tests")
    public void minOperations(String boxes, String expectedResultString) {
        Solution solution = new Solution();

        int[] expectedResult = resultArray(expectedResultString);
        int[] actualResult = solution.minOperations(boxes);

        assertArrayEquals(expectedResult, actualResult);
    }

    private  int[] resultArray(String expectedResultString){
        String[] expectedResultStringArray = expectedResultString.split(",");
        int[] expectedResult = new int[expectedResultStringArray.length];

        for (int i = 0; i < expectedResultStringArray.length; i++) {
            expectedResult[i] = Integer.parseInt(expectedResultStringArray[i]);
        }
        return expectedResult;
    }
}
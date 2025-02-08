import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    private static final String FILE_PATH = "./Resources/testData.csv";

    @ParameterizedTest
    @CsvFileSource(resources = FILE_PATH, delimiterString = ";")
    @DisplayName("merge Alternately tests")
    void minOperations(String boxes, String expectedResultString) {

        String[] expectedResultStringArray = expectedResultString.split(",");
        int[] expectedResult = new int[expectedResultStringArray.length];

        for (int i = 0; i < expectedResultStringArray.length; i++) {
            expectedResult[i] = Integer.parseInt(expectedResultStringArray[i]);
        }
        Solution solution = new Solution();

        int[] actualResult = solution.minOperations(boxes);

        boolean result = Arrays.equals(expectedResult, actualResult);

        assertTrue(result);
    }
}
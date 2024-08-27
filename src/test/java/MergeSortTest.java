import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MergeSortTest {

    private final MergeSort mergeSort = new MergeSort();

    @ParameterizedTest
    @MethodSource("generateTestValues01")
    void bubbleSortSuccessfully(int[] incoming, int[] expected) {
        mergeSort.sort(incoming);
        Assertions.assertArrayEquals(expected, incoming);
    }

    public static Stream<Arguments> generateTestValues01() {
        return Stream.of(
                Arguments.of(new int[]{1,3,2,5,4,9,8,7,6}, new int[] {1,2,3,4,5,6,7,8,9}),
                Arguments.of(new int[]{-1,-3,1,5}, new int[] {-3,-1,1,5})
        );
    }

}

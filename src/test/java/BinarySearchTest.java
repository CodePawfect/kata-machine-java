import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class BinarySearchTest {

    private final BinarySearch binarySearch = new BinarySearch();

    @ParameterizedTest
    @MethodSource("generateTestValues01")
    void binarySearchShouldReturnTargetIndex(int target, int expectedIndex) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = binarySearch.binarySearch(arr, target);
        Assertions.assertEquals(expectedIndex, index);
    }

    @ParameterizedTest
    @MethodSource("generateTestValues02")
    void binarySearchShouldReturnInsertionIndex(int target, int expectedIndex) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9};
        int index = binarySearch.binarySearch(arr, target);
        Assertions.assertEquals(expectedIndex, index);
    }

    public static Stream<Arguments> generateTestValues01() {
        return Stream.of(
                Arguments.of(5,4),
                Arguments.of(1,0),
                Arguments.of(2,1),
                Arguments.of(3,2),
                Arguments.of(9,8)
        );
    }

    public static Stream<Arguments> generateTestValues02() {
        return Stream.of(
                Arguments.of(5,-5),
                Arguments.of(10,-9),
                Arguments.of(0,-1)
        );
    }

}



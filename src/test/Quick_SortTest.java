package test;

import main.Array;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Quick_SortTest {
    Array actual, expected;
    @Test

    @DisplayName("Correct work with simple array whose size is an odd number")
    void testQuick_sort_1() {
        int[] arr = {2, 1, 4, 5, 9, 3, 7};
        int[] sorted = {1, 2, 3, 4, 5, 7, 9};
        actual = new Array(arr);
        expected = new Array(sorted);
        actual.quick_sort();
        assertEquals(actual.toString(), expected.toString());
    }

    @Test
    @DisplayName("Correct work with simple array whose size is an even number")
    void testQuick_sort_2(){
        int[] arr = {11, 43, 21, 84, 17, 99};
        int[] sorted = {11, 17, 21, 43, 84, 99};
        actual = new Array(arr);
        actual.quick_sort();
        expected = new Array(sorted);
        assertEquals(actual.toString(), expected.toString());
    }

    @Test
    @DisplayName("Correct work with empty")
    void testQuick_sort_3(){
        actual = new Array();
        actual.quick_sort();
        expected = new Array();
        assertEquals(actual.toString(), expected.toString());
    }
}
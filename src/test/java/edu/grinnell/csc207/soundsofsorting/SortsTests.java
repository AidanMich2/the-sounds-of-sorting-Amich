package edu.grinnell.csc207.soundsofsorting;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.function.Consumer;

import org.junit.jupiter.api.Test;

import edu.grinnell.csc207.soundsofsorting.sorts.Sorts;

public class SortsTests {
    /**
     * @param <T> the carrier type of the array
     * @param arr the array to check
     * @return true iff <code>arr</code> is sorted.
     */
    public static <T extends Comparable<? super T>> boolean sorted(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static Integer[] makeTestArray() {
        return new Integer[] {
            3, 7, 9, 1, 2,
            18, 16, 15, 19, 8,
            14, 12, 5, 13, 4,
            6, 0, 17, 11, 10
        };
    }

    public void testSort(Consumer<Integer[]> func) {
        Integer[] arr = makeTestArray();
        func.accept(arr);
        assertTrue(sorted(arr));
    }

    public static Integer[] makeTestArrayManySame() {
        return new Integer[] {
            3, 3, 9, 1, 2,
            18, 18, 15, 8, 8,
            14, 12, 5, 5, 4,
            6, 6, 17, 10, 10
        };
    }

    public void testSortManySame(Consumer<Integer[]> func) {
        Integer[] arr = makeTestArrayManySame();
        func.accept(arr);
        assertTrue(sorted(arr));
    }

    public static Integer[] makeSimpleTestArray() {
        return new Integer[] {
            3, 7, 9, 1, 2,
            18, 16
        };
    }

    public void testSortSimple(Consumer<Integer[]> func) {
        Integer[] arr = makeSimpleTestArray();
        func.accept(arr);
        assertTrue(sorted(arr));
    }

    public static Integer[] makeSimpleTestArrayManySame() {
        return new Integer[] {
            3, 3, 9, 1, 1,
            16, 16
        };
    }

    public void testSortSimpleManySame(Consumer<Integer[]> func) {
        Integer[] arr = makeSimpleTestArrayManySame();
        func.accept(arr);
        assertTrue(sorted(arr));
    }

    public void testSortEmpty(Consumer<Integer[]> func) {
        Integer[] arr = new Integer[0];
        func.accept(arr);
        assertTrue(sorted(arr));
    }

    @Test
    public void testBubbleSort() {
        testSort(Sorts::bubbleSort);
    }

    @Test
    public void testBubbleSortManySame() {
        testSortManySame(Sorts::bubbleSort);
    }

    @Test
    public void testBubbleSortEmpty() {
        testSortEmpty(Sorts::bubbleSort);
    }
    
    @Test
    public void testInsertionSort() {
        testSort(Sorts::insertionSort);
    }

    @Test
    public void testInsertionSortManySame() {
        testSortManySame(Sorts::insertionSort);
    }

    @Test
    public void testInsertionSortEmpty() {
        testSortEmpty(Sorts::insertionSort);
    }
    
    @Test
    public void testSelectionSort() {
        testSort(Sorts::selectionSort);
    }

    @Test
    public void testSelectionSortManySame() {
        testSortManySame(Sorts::selectionSort);
    }

    @Test
    public void testSelectionSortEmpty() {
        testSortEmpty(Sorts::selectionSort);
    }

    @Test
    public void testMergeSort() {
        testSort(Sorts::mergeSort);
    }

    @Test
    public void testMergeSortManySame() {
        testSortManySame(Sorts::mergeSort);
    }

    @Test
    public void testMergeSortEmpty() {
        testSortEmpty(Sorts::mergeSort);
    }
    
    @Test
    public void testQuickSort() {
        testSort(Sorts::quickSort);
    }

    @Test
    public void testQuickSortManySame() {
        testSortManySame(Sorts::quickSort);
    }

    @Test
    public void testQuickSortEmpty() {
        testSortEmpty(Sorts::quickSort);
    }

    @Test
    public void testBogoSort() {
        testSortSimple(Sorts::bogoSort);
    }

    @Test
    public void testBogoSortManySame() {
        testSortSimpleManySame(Sorts::bogoSort);
    }

    @Test
    public void testBogoSortEmpty() {
        testSortEmpty(Sorts::bogoSort);
    }
}
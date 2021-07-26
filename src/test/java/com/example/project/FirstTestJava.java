package com.example.project;
import com.Alevel.SortClass;
import com.Alevel.StringArray;
import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;
import java.util.Comparator;

class FirstTest {

    int firstNumber = 10;
    int secondNumber = 10;
    SortClass sorts = new SortClass();
    StringArray stringArray = new StringArray(5, 1, 2, 5, 3, 5, 9, 7);
    @Test
    @DisplayName("Array should be sorted by ASC")
    void validateInsertionSortASC() {
        assertThat(sorts.insertionSort(stringArray.myArr, true)).isSorted();
    }
    @Test
    @DisplayName("Array should be sorted by DESC")
    void validateInsertionSortDESC() {
        assertThat(sorts.insertionSort(stringArray.myArr, false)).isSortedAccordingTo(Comparator.reverseOrder());
    }
    @Test
    @DisplayName("Test github actions")
    void validateNumbers() {
        assertThat(firstNumber).isEqualTo(secondNumber);
    }

}
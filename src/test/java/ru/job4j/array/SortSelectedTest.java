package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort985() {
        int[] data = new int[] {9, 8, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {5, 8, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort36951() {
        int[] data = new int[] {3, 6, 9, 5, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 5, 6, 9};
        assertThat(result).containsExactly(expected);
    }
}
package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    public void when2Plus2Plus2Then6() {
        Max max = new Max();
        int expected = 6;
        int result = max.sum(2, 2, 2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when2Plus2Plus4Plus2Then10() {
        Max max = new Max();
        int expected = 10;
        int result = max.sum(2, 2, 4, 2);
        assertThat(result).isEqualTo(expected);
    }
}
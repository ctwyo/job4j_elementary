package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    public void when2And2And3Then3() {
        Max max = new Max();
        int expected = 3;
        int result = max.maxNumber(2, 2, 3);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when2And5And4And3Then5() {
        Max max = new Max();
        int expected = 5;
        int result = max.maxNumber(2, 5, 4, 3);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when2And5And4And5Then5() {
        Max max = new Max();
        int expected = 5;
        int result = max.maxNumber(2, 5, 4, 5);
        assertThat(result).isEqualTo(expected);
    }
}
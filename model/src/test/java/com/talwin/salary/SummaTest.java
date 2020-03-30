package com.talwin.salary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SummaTest {
    Summa summa = new Summa("100","1","2","3","4");


    @Test
    void getSum() {
        Assertions.assertEquals("90.0",summa.getSum());
    }

    @Test
    void getFszn() {
        Assertions.assertEquals("1.0",summa.getFszn());
    }

    @Test
    void getBgs() {
        Assertions.assertEquals("2.0",summa.getBgs());
    }

    @Test
    void getPdn() {
        Assertions.assertEquals("3.0",summa.getPdn());
    }
}

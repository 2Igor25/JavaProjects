package ru.edu;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CustomDigitComparatorTest {
    @Test
    public void CustomDigitComparatorTest() {

        CustomDigitComparator comparator = new CustomDigitComparator();

        Assert.assertEquals(0, comparator.compare(5,3));
        Assert.assertEquals(0, comparator.compare(9,7));


        Assert.assertEquals(0, comparator.compare(2,4));
        Assert.assertEquals(0, comparator.compare(10,12));

        Assert.assertEquals(1, comparator.compare(3,2));
        Assert.assertEquals(-1, comparator.compare(2,3));

    }

    @Test (expected = IllegalArgumentException.class)
    public void CustomDigitComparatorTestException() {
        List<Integer> testList = new ArrayList<>();
        testList.add(null);
        testList.add(null);
        testList.add(1);
        testList.sort(new CustomDigitComparator());
    }
}

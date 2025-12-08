package com.zhilyuk.task1.comparator;

import com.zhilyuk.task1.entity.CustomArray;

import java.util.Comparator;

public class ArraySizeComparator implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray array1, CustomArray array2) {
        return Integer.compare(array1.getSize(), array2.getSize());
    }
}

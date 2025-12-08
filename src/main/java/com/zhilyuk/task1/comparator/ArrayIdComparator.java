package com.zhilyuk.task1.comparator;

import com.zhilyuk.task1.entity.CustomArray;

import java.util.Comparator;

public class ArrayIdComparator implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray array1, CustomArray array2) {
        return Long.compare(array1.getArrayId(), array2.getArrayId());
    }
}

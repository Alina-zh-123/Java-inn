package com.zhilyuk.task1.service;

import com.zhilyuk.task1.entity.CustomArray;

public interface ArraySort {
    void selectionSort(CustomArray array);
    void mergeSort(CustomArray array, int start, int finish);
}

package com.zhilyuk.task1.service.impl;

import com.zhilyuk.task1.entity.CustomArray;
import com.zhilyuk.task1.service.ArraySort;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.zhilyuk.task1.exception.ArrayException;

public class ArraySortImpl implements ArraySort {
    private static final Logger logger = LogManager.getLogger(ArraySortImpl.class);

    @Override
    public void selectionSort(CustomArray array) {
        int min, min_index, temp;
        for (int i = 0; i < array.getSize() - 1; i++) {
            min = array.getElement(i);
            min_index = i;
            for (int j = i + 1; j < array.getSize(); j++) {
                if (array.getElement(j) < min) {
                    min = array.getElement(j);
                    min_index = j;
                }
            }
            temp = array.getElement(i);
            try {
                array.setElement(i, min);
                array.setElement(min_index, temp);
            } catch (ArrayException e) {
                logger.error("Invalid index to set element while swapping", e);
            }
        }
        logger.info("Array sorted by selection sort: {}", array);
    }

    @Override
    public void mergeSort(CustomArray array, int start, int finish) {
        if (finish - start <= 1) return;
        int mid = (start + finish) / 2;
        mergeSort(array, start, mid);
        mergeSort(array, mid, finish);

        int[] l = new int[mid - start];
        int[] r = new int[finish - mid];
        CustomArray left = new CustomArray(l);
        CustomArray right = new CustomArray(r);

        for (int i = 0; i < left.getSize(); i++) {
            try {
                left.setElement(i, array.getElement(start + i));
            } catch (ArrayException e) {
                logger.error("Invalid index to set element", e);
            }
        }
        for (int j = 0; j < right.getSize(); j++) {
            try {
                right.setElement(j, array.getElement(mid + j));
            } catch (ArrayException e) {
                logger.error("Invalid index to set element", e);
            }
        }

        int i = 0, j = 0, k = start;

        while (i < left.getSize() && j < right.getSize()) {
            if (left.getElement(i) <= right.getElement(j)) {
                try {
                    array.setElement(k, left.getElement(i));
                } catch (ArrayException e) {
                    logger.error("Invalid index to set element", e);
                }
                i++;
            } else {
                try {
                    array.setElement(k, right.getElement(j));
                } catch (ArrayException e) {
                    logger.error("Invalid index to set element", e);
                }
                j++;
            }
            k++;
        }

        while (i < left.getSize()) {
            try {
                array.setElement(k, left.getElement(i));
            } catch (ArrayException e) {
                logger.error("Invalid index to set element", e);
            }
            i++;
            k++;
        }

        while (j < right.getSize()) {
            try {
                array.setElement(k, right.getElement(j));
            } catch (ArrayException e) {
                logger.error("Invalid index to set element", e);
            }
            j++;
            k++;
        }
        logger.info("Array sorted by merge sort: {}", array);
    }
}

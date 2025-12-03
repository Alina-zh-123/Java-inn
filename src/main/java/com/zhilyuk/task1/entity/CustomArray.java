package com.zhilyuk.task1.entity;

import com.zhilyuk.task1.exception.ArrayException;
import java.util.Arrays;

public class CustomArray {
    private long arrayId;
    private int[] array;
    final private int size;

    public CustomArray(int[] array) {
        this.array = array.clone();
        this.size = array.length;
    }

    public long getArrayId() {
        return arrayId;
    }

    public int getElement(int index) {
        return array[index];
    }

    public int getSize() {
        return size;
    }

    public void setArrayId(long arrayId) throws ArrayException {
        if (arrayId <= 0) {
            throw new ArrayException("Id must be positive!");
        }
        this.arrayId = arrayId;
    }

    public void setElement(int index, int value) throws ArrayException {
        if (index < 0) {
            throw new ArrayException("Index must be non-negative!");
        }
        array[index] = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomArray)) return false;
        CustomArray other = (CustomArray) o;
        return Arrays.equals(this.array, other.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }
}

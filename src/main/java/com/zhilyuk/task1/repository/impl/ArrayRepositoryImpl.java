package com.zhilyuk.task1.repository.impl;

import com.zhilyuk.task1.entity.CustomArray;
import com.zhilyuk.task1.exception.ArrayException;
import com.zhilyuk.task1.repository.ArrayRepository;
import java.util.ArrayList;
import java.util.Comparator;

public class ArrayRepositoryImpl implements ArrayRepository {
    private final ArrayList<CustomArray> arrays = new ArrayList<>();

    @Override
    public CustomArray findById(Long arrayId) throws ArrayException {
        CustomArray res = null;
        for (CustomArray array : arrays) {
            if (array.getArrayId() == arrayId) {
                res = array;
                break;
            }
        }
        if (res != null) {
            return res;
        } else {
            throw new ArrayException("No array with such id!");
        }
    }

    @Override
    public void deleteByID(long arrayId) throws ArrayException {
        CustomArray res = null;
        for (CustomArray array : arrays) {
            if (array.getArrayId() == arrayId) {
                res = array;
                break;
            }
        }
        if (res != null) {
            arrays.remove(res);
        } else {
            throw new ArrayException("No array with such id!");
        }
    }

    /*
    @Override
    public ArrayList<CustomArray> find(Comparator<CustomArray> comparator) {
        ArrayList<CustomArray> resArray = new ArrayList<>();
        for (CustomArray array : arrays) {



        }
        return resArray;
    }
     */

    @Override
    public void sort(Comparator<CustomArray> comparator) {
        arrays.sort(comparator);
    }

    @Override
    public void add(CustomArray array) {
        arrays.add(array);
    }

    @Override
    public void remove(CustomArray array) {
        arrays.remove(array);
    }
}

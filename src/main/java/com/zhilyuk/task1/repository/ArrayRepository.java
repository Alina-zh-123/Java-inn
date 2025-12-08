package com.zhilyuk.task1.repository;

import com.zhilyuk.task1.entity.CustomArray;
import com.zhilyuk.task1.exception.ArrayException;

import java.util.ArrayList;
import java.util.Comparator;

public interface ArrayRepository {
    public CustomArray findById(Long arrayId) throws ArrayException;
    public void deleteByID(long arrayId) throws ArrayException;
    //public ArrayList<CustomArray> find();
    public void sort(Comparator<CustomArray> comparator);
    public void add(CustomArray array);
    public void remove(CustomArray array);
}

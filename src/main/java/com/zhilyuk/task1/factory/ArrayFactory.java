package com.zhilyuk.task1.factory;

import com.zhilyuk.task1.entity.CustomArray;

public interface ArrayFactory {
    CustomArray createArray(int[] array);
}

package com.zhilyuk.task1.factory.impl;

import com.zhilyuk.task1.entity.CustomArray;
import com.zhilyuk.task1.factory.ArrayFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayFactoryImpl implements ArrayFactory {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public CustomArray createArray(int[] array) {
        CustomArray res = new CustomArray(array);
        logger.info("Created new array: {}", res);
        return res;
    }
}

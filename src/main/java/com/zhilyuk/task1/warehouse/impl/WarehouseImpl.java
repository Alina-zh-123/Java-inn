package com.zhilyuk.task1.warehouse.impl;

import com.zhilyuk.task1.entity.CustomArray;
import com.zhilyuk.task1.entity.CustomArrayData;
import com.zhilyuk.task1.warehouse.Warehouse;
import java.util.HashMap;
import java.util.Map;

public class WarehouseImpl implements Warehouse {
    final Map<Long, CustomArrayData> data = new HashMap<>();

    @Override
    public void putCustomArray(CustomArray array) {
        CustomArrayData arrayData = new CustomArrayData(array);
        data.put(array.getArrayId(), arrayData);
    }
}

package com.zhilyuk.task1.observer.impl;

import com.zhilyuk.task1.entity.CustomArray;
import com.zhilyuk.task1.observer.CustomArrayObserver;
import com.zhilyuk.task1.warehouse.impl.WarehouseImpl;

public class CustomArrayObserverImpl implements CustomArrayObserver {
    @Override
    public void onCustomArrayChange(CustomArray array) {
        WarehouseImpl warehouse = new WarehouseImpl();
        warehouse.putCustomArray(array);
    }
}

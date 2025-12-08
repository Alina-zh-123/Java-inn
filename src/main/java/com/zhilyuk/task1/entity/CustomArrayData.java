package com.zhilyuk.task1.entity;

import com.zhilyuk.task1.service.impl.ArrayCalculationImpl;
import com.zhilyuk.task1.service.impl.ArrayCalculationImpl.*;

public class CustomArrayData {
    private int max;
    private int min;
    private int sum;

    public CustomArrayData(CustomArray array) {
        ArrayCalculationImpl calculation = new ArrayCalculationImpl();

        if (calculation.findMaxInArray(array).isPresent()) {
            this.max = calculation.findMaxInArray(array).getAsInt();
        }
        if (calculation.findMinInArray(array).isPresent()) {
            this.min = calculation.findMinInArray(array).getAsInt();
        }
        if (calculation.findSumArray(array).isPresent()) {
            this.sum = calculation.findSumArray(array).getAsInt();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("max=").append(max)
                .append(", min=").append(min)
                .append(", sum=").append(sum);
        return sb.toString();
    }
}

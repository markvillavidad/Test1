package com.company;

public class MaxandMin {

    public static byte getMaxTemperature(byte[] temperatures) {
        byte t = 0;
        for (int i = 0; i < temperatures.length; i++) {
            if (t < temperatures[i]) {
                t = temperatures[i];
            }
        }

        return t;
    }


}

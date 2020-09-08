package ru.netologi;

public class TransformStrToLong {
    public long[] calculate(String statistics) {
        String[] strArry = statistics.split(",");
        long[] numArr = new long[strArry.length];
        for (int i = 0; i < strArry.length; i++) {
            numArr[i] = Integer.parseInt(strArry[i]);
        }

        return numArr;
    }

}

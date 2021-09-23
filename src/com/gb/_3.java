package com.gb;

public class _3 {
    public static void main(String[] args) {
        float result, a = 20f, b = 34.5f, c = 12.55f, d = 4f;
        result = a*(b+(c/d));
        if (d != 0)
            System.out.println(result);
        else System.err.println("на ноль делить нельзя");

    }

}

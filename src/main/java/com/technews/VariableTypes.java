package com.technews;

import org.aspectj.weaver.ast.Var;

public class VariableTypes {
    public static void main(String[] args) {
        int a = 12;
        double b = 102.23;
        double sum = a + b;
        System.out.println(sum);

        String word = "The dog is ";
        String sentence = word + a;
        System.out.println(sentence);
    }
}

package com.ameed;

public class LanguageApplication {

    public static void main(String[] args) {
        Language java1 = new Language("Java", 100);
        Language java2 = new Language("Java", 100);
        System.out.println(java1 == java2);
        System.out.println(java1.equals(java2));

    }

}

package com.erhan.part_two.methods;

public class NumberUnoMethodWithReturnType {
    public static int numberUno() {

        return 1;
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        int number = numberUno();
        System.out.println(number);
        System.out.println(numberUno());

        int num1 = numberUno() + 5;

        System.out.println(num1);


    }

}

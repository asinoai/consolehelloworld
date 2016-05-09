package aron.sinoai.consolehelloworld;

/**
 */

public class HelloWorldPrinter {

    private int counter;

    public static void print() {

        System.out.println("Hello, World!");

    }

    public void incrementCounterAndPrint() {
        counter++;

        System.out.println(counter);

        print();
    }

}

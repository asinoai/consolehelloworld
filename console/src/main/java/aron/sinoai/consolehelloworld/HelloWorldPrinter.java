package aron.sinoai.consolehelloworld;

/**
 */

public class HelloWorldPrinter implements IHelloPrinter{

    private int counter;

    public HelloWorldPrinter(final int counterStartIndex) {
        counter = counterStartIndex;
    }

    public void print() {
        counter++;
        System.out.println(counter);

        System.out.println("Hello, World!");

    }
}

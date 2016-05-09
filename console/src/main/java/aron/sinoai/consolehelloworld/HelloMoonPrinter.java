package aron.sinoai.consolehelloworld;

/**
 */

public class HelloMoonPrinter implements IHelloPrinter{

    private int counter;

    public HelloMoonPrinter(final int counterStartIndex) {
        counter = counterStartIndex;
    }

    public void print() {
        counter += 2;
        System.out.println(counter);

        System.out.println("Hello, Moon!");

    }
}

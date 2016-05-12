package aron.sinoai.consolehelloworld;

/**
 */

public class HelloWorldPrinter extends AbstractHelloPrinter{

    public HelloWorldPrinter(final int counterStartIndex) {
        super(counterStartIndex, 1);
    }

    public void print() {
        incrementCounter();

        System.out.println("Hello, World!");

    }
}

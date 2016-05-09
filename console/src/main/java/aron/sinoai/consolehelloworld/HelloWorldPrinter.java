package aron.sinoai.consolehelloworld;

/**
 */

public class HelloWorldPrinter extends AbstractHelloPrinter{

    public HelloWorldPrinter(final int counterStartIndex) {
        super(counterStartIndex);
    }

    public void print() {
        incrementCounter();

        System.out.println("Hello, World!");

    }
}

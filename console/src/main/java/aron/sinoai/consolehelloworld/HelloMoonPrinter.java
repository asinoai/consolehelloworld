package aron.sinoai.consolehelloworld;

/**
 */

public class HelloMoonPrinter extends AbstractHelloPrinter{

    public HelloMoonPrinter(final int counterStartIndex) {
        super(counterStartIndex);
    }

    public void print() {
        incrementCounter();

        System.out.println("Hello, Moon!");

    }

    final protected void incrementCounter() {
        System.out.println("Modified!");
        super.incrementCounter();
    }

}

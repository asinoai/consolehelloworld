package aron.sinoai.consolehelloworld;

/**
 */
public abstract class AbstractHelloPrinter implements IHelloPrinter{

    private int counter;

    public AbstractHelloPrinter(final int counterStartIndex) {
        counter = counterStartIndex;
    }

    protected void incrementCounter() {
        counter += 2;
        System.out.println(counter);
    }
}

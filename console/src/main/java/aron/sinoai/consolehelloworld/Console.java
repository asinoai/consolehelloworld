package aron.sinoai.consolehelloworld;

public class Console  {


    public static void main(String[] args) {

        Console console = new Console();
        console.runMain();

    }

    private void runMain() {
        System.out.println("Start!");

        final IHelloPrinter printer = new HelloWorldPrinter(0);
        printer.print();
        printer.print();

        final IHelloPrinter anotherPrinter = new HelloMoonPrinter(1);
        anotherPrinter.print();
        anotherPrinter.print();

        final IHelloPrinter customPrinter = new HelloCustomPrinter();

        customPrinter.print();
        customPrinter.print();
    }

    private class HelloCustomPrinter implements IHelloPrinter {
        @Override
        public void print() {
            System.out.println("Hello, Custom inner!");
        }
    }
}

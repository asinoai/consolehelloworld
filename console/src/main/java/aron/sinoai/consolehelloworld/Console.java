package aron.sinoai.consolehelloworld;

public class Console  {

    public static void main(String[] args) {

        System.out.println("Start!");

        HelloWorldPrinter.print();

        final HelloWorldPrinter printer = new HelloWorldPrinter();

        printer.incrementCounterAndPrint();

        printer.incrementCounterAndPrint();

        final HelloWorldPrinter anotherPrinter = new HelloWorldPrinter();

        anotherPrinter.incrementCounterAndPrint();

        anotherPrinter.incrementCounterAndPrint();

    }
}

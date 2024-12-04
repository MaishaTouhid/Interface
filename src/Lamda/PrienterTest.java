package Lamda;

public class PrienterTest {
    public static void main(String[] args) {
        Printer printer = (message) -> {
            System.out.print("Printing message:");
            System.out.println(message);
        };

        printer.print("Hello, world!");
    }
}

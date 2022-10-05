import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //new HalloJavamitForEach();
        new NumberTester("test.txt");
    }
        private static AbstractCalculator calculatorMenu() {
            Scanner scanner = new Scanner(System.in);

            AbstractCalculator abstractCalculator = null;

            System.out.println("Calculator auswählen");
            System.out.println("1 ... Rational");
            System.out.println("2 ... Vektor");
            System.out.println("3 ... Complex");

            while (true) {
                try {
                    int input = Integer.parseInt(scanner.nextLine());

                    switch (input) {
                        case 1:
                            abstractCalculator = new RationalCalculator();
                            break;
                        case 2:
                            abstractCalculator = new VectorCalculator();
                            break;

                        case 3:
                            abstractCalculator = new ComplexCalculator();
                            break;

                        default:
                            throw new IllegalArgumentException();
                    }
                } catch (Exception e) {
                    System.out.println("Ungültiger EIngabe");
                }
                return abstractCalculator;
            }
        }
        private static String calcOperationMenu() {
            Scanner s = new Scanner(System.in);

            System.out.println("Bitte Rechen Operation eingeben");
            System.out.println("1 ... +");
            System.out.println("2 ... -");
            System.out.println("3 ... *");
            System.out.println("4 ... /");

            while (true) {
                try {
                    String in = s.nextLine();

                    if (Integer.parseInt(in) == 1) {
                        return "+";
                    } else if (Integer.parseInt(in) == 2) {
                        return "-";
                    } else if (Integer.parseInt(in) == 3) {
                        return "*";
                    } else if (Integer.parseInt(in) == 4) {
                        return "/";
                    } else {
                        throw new IllegalArgumentException();
                    }

                } catch (Exception e) {
                    System.out.println("Ungültige eingabe");
                }
            }
        }
    }

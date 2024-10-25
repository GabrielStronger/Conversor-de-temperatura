import java.util.Scanner;

public class ConversorDeTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a entrada do usuário
        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();
        
        System.out.print("Digite a unidade (C/F/K): ");
        char unidade = scanner.next().toUpperCase().charAt(0);

        // Executa a conversão com base na unidade fornecida
        switch (unidade) {
            case 'C':
                System.out.printf("%.2f C = %.2f F%n", temperatura, celsiusToFahrenheit(temperatura));
                System.out.printf("%.2f C = %.2f K%n", temperatura, celsiusToKelvin(temperatura));
                break;
            case 'F':
                System.out.printf("%.2f F = %.2f C%n", temperatura, fahrenheitToCelsius(temperatura));
                System.out.printf("%.2f F = %.2f K%n", temperatura, fahrenheitToKelvin(temperatura));
                break;
            case 'K':
                System.out.printf("%.2f K = %.2f C%n", temperatura, kelvinToCelsius(temperatura));
                System.out.printf("%.2f K = %.2f F%n", temperatura, kelvinToFahrenheit(temperatura));
                break;
            default:
                System.out.println("Unidade inválida. Use C, F ou K.");
        }

        scanner.close();
    }

    // Métodos de conversão
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * 9 / 5) - 459.67;
    }
}

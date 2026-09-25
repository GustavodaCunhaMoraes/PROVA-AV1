public class ConversorTemperatura {
    public static final double KELVIN_OFFSET = 273.15;

    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    static class TesteConversor {
        public static void main(String[] args) {
            double fahrenheit = 325.0;
            System.out.println("325°F equivale a " + fahrenheitParaCelsius(fahrenheit) + "C°");

            double celsius = 40;
            System.out.println("40°C equivale a " + celsiusParaFahrenheit(celsius) + "F°");
        }
    }
}
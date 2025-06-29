package javacore.chapter05.object.exercise;

public class TemperatureConverter {

    static String celsiusUnit = "°C";
    static String farenheitUnit = "°F";
    static String kelvinUnit = "°K";

    public static double celsiusToFahrenheit(double celsiusTemperature){

        return ((celsiusTemperature * 9/5) + 32);
    }

    public static double fahrenheitToCelsius(double fahrenheitTemperature){

        return ((fahrenheitTemperature - 32) / 1.8);
    }

    public static double celsiusToKelvin(double celsiusTemperature){

        return celsiusTemperature + 273.15;
    }


    public static void main(String[] args){

        System.out.println(TemperatureConverter.fahrenheitToCelsius(50) + celsiusUnit) ;
        System.out.println(TemperatureConverter.celsiusToFahrenheit(0) + farenheitUnit);
    }
}

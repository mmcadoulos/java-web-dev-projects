package org.launchcode;

public class Temperature {
    private double fahrenheit;
    public static final double absoluteZeroFahrenheit = -459.67;
    private double recordHighFahrenheit = 134;
    private static final double absoluteHighFahrenheit = 12600;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double aFahrenheit) {

//        double absoluteZeroFahrenheit = -459.67;

        if (aFahrenheit < absoluteZeroFahrenheit) {
            try {
                throw new TemperatureException("Temperature is too low!");
            } catch (TemperatureException e){
                e.printStackTrace();
            }
//            System.out.println("Value is below absolute zero");
        } else if (aFahrenheit > recordHighFahrenheit) {
            if (aFahrenheit > absoluteHighFahrenheit){
                try {
                    throw new TemperatureException("Temperature is higher than the hottest star....too high!");
                } catch (TemperatureException e){
                    e.printStackTrace();
                }
            }
            System.out.println("Temperature beats the record high temperature of " + recordHighFahrenheit + "!!");
            recordHighFahrenheit=aFahrenheit;
            System.out.println("The new record high is " + recordHighFahrenheit + "!");
        }

        fahrenheit = aFahrenheit;
    }
}

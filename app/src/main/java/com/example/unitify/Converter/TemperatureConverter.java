package com.example.unitify.Converter;

public class TemperatureConverter {

    private final double value;
    private double result = 0;
    private final String unit1;
    private final String unit2;

    public TemperatureConverter(double value, String unit1, String unit2) {
        this.value = value;
        this.unit1 = unit1;
        this.unit2 = unit2;
    }

    public double convert() {

        String[] content = {"celsius", "fahrenheit", "kelvin", "rankine"};

        double celsius = 0; // 0
        double fahrenheit = 0; // 1
        double kelvin = 0; // 2
        double rankine = 0; // 3

        switch (unit1) {
            case "celsius":
                celsius = value;
                fahrenheit = (value * 9 / 5) + 32;
                kelvin = value + 273.15;
                rankine = (value + 273.15) * 9 / 5;
                break;
            case "fahrenheit":
                fahrenheit = value;
                celsius = (value - 32) * 5 / 9;
                kelvin = (value + 459.67) * 5 / 9;
                rankine = value + 459.67;
                break;
            case "kelvin":
                kelvin = value;
                celsius = value - 273.15;
                fahrenheit = (value * 9 / 5) - 459.67;
                rankine = value * 1.8;
                break;
            case "rankine":
                rankine = value;
                fahrenheit = value - 459.67;
                celsius = (value / 1.8) - 273.15;
                kelvin = value / 1.8;
                break;
            default:
                break;
        }

        for (int i = 0; i < content.length; i++) {
            if (content[i].equals(unit2.toLowerCase())) {
                if (i == 0)
                    result = celsius;
                if (i == 1)
                    result = fahrenheit;
                if (i == 2)
                    result = kelvin;
                if (i == 3)
                    result = rankine;
                break;
            }
        }

        return result;
    }

}

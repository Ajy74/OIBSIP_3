package com.example.unitify.Converter;

public class SpeedConverter {

    private final double value;
    private double result = 0;
    private final String unit1;
    private final String unit2;

    public SpeedConverter(double value, String unit1, String unit2) {
        this.value = value;
        this.unit1 = unit1;
        this.unit2 = unit2;
    }

    public double convert() {

        String[] content = {"meters_per_second", "kilometers_per_hour", "miles_per_hour", "knots", "feet_per_second"};

        double meters_per_second = 0; // 0
        double kilometers_per_hour = 0; // 1
        double miles_per_hour = 0; // 2
        double knots = 0; // 3
        double feet_per_second = 0; // 4

        switch (unit1) {
            case "meters_per_second":
                meters_per_second = value;
                kilometers_per_hour = value * 3.6;
                miles_per_hour = value * 2.23694;
                knots = value * 1.94384;
                feet_per_second = value * 3.28084;
                break;
            case "kilometers_per_hour":
                meters_per_second = value / 3.6;
                kilometers_per_hour = value;
                miles_per_hour = value / 1.609;
                knots = value / 1.852;
                feet_per_second = value / 1.097;
                break;
            case "miles_per_hour":
                meters_per_second = value / 2.237;
                kilometers_per_hour = value * 1.609;
                miles_per_hour = value;
                knots = value / 1.151;
                feet_per_second = value * 1.467;
                break;
            case "knots":
                meters_per_second = value / 1.944;
                kilometers_per_hour = value * 1.852;
                miles_per_hour = value * 1.151;
                knots = value;
                feet_per_second = value * 1.688;
                break;
            case "feet_per_second":
                meters_per_second = value / 3.281;
                kilometers_per_hour = value * 1.097;
                miles_per_hour = value / 1.467;
                knots = value / 1.688;
                feet_per_second = value;
                break;
            default:
                break;

        }

        for (int i = 0; i < content.length; i++) {
            if (content[i].equals(unit2.toLowerCase())) {
                if (i == 0)
                    result = meters_per_second;
                if (i == 1)
                    result = kilometers_per_hour;
                if (i == 2)
                    result = miles_per_hour;
                if (i == 3)
                    result = knots;
                if (i == 4)
                    result = feet_per_second;
                break;
            }
        }

        return result;
    }

}

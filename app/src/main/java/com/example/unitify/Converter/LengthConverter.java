package com.example.unitify.Converter;

public class LengthConverter {

    private final double value;
    private double result = 0;
    private final String unit1;
    private final String unit2;

    public LengthConverter(double value, String unit1, String unit2) {
        this.value = value;
        this.unit1 = unit1;
        this.unit2 = unit2;
    }


    public double convert() {

        String[] content = {"meters", "feet", "inches", "yards", "kilometers", "miles", "centimeters", "millimeters", "micrometers", "nanometers", "angstroms"};

        double meters = 0; //0
        double feet = 0; //1
        double inches = 0; //2
        double yards = 0; //3
        double kilometers = 0; //4
        double miles = 0; //5
        double centimeters = 0; //6
        double millimeters = 0; //7
        double micrometers = 0; //8
        double nanometers = 0; //9
        double angstroms = 0; //10

        switch (unit1) {
            case "meters":
                meters = value;
                feet = value * 3.28084;
                inches = value * 39.3701;
                yards = value * 1.09361;
                kilometers = value * 0.001;
                miles = value * 0.000621371;
                centimeters = value * 100;
                millimeters = value * 1000;
                micrometers = value * 1e+6;
                nanometers = value * 1e+9;
                angstroms = value * 1e+10;
                break;
            case "feet":
                meters = value * 0.3048;
                feet = value;
                inches = value * 12;
                yards = value * 0.333333;
                kilometers = value * 0.0003048;
                miles = value * 0.000189394;
                centimeters = value * 30.48;
                millimeters = value * 304.8;
                micrometers = value * 304800;
                nanometers = value * 3.048e+8;
                angstroms = value * 3.048e+9;
                break;
            case "inches":
                meters = value * 0.0254;
                feet = value * 0.0833333;
                inches = value;
                yards = value * 0.0277778;
                kilometers = value * 2.54e-5;
                miles = value * 1.5783e-5;
                centimeters = value * 2.54;
                millimeters = value * 25.4;
                micrometers = value * 25400;
                nanometers = value * 2.54e+7;
                angstroms = value * 2.54e+8;
                break;
            case "yards":
                meters = value * 0.9144;
                feet = value * 3;
                inches = value * 36;
                yards = value;
                kilometers = value * 0.0009144;
                miles = value * 0.000568182;
                centimeters = value * 91.44;
                millimeters = value * 914.4;
                micrometers = value * 914400.4;
                nanometers = value * 914400000;
                angstroms = value * 9.144e+10;
                break;
            case "kilometers":
                meters = value * 1000;
                feet = value * 3280.84;
                inches = value * 39370.1;
                yards = value * 1093.61;
                kilometers = value;
                miles = value * 0.621371;
                centimeters = value * 100000;
                millimeters = value * 1000000;
                micrometers = value * 1e+9;
                nanometers = value * 1e+12;
                angstroms = value * 1e+13;
                break;
            case "miles":
                meters = value * 1609.34;
                feet = value * 5280;
                inches = value * 63360;
                yards = value * 1760;
                kilometers = value * 1.60934;
                miles = value;
                centimeters = value * 160934;
                millimeters = value * 1609340;
                micrometers = value * 1609340000;
                nanometers = value * 1609340000000.0;
                angstroms = value * 1.60934e+16;
                break;
            case "centimeters":
                meters = value * 0.01;
                feet = value * 0.0328084;
                inches = value * 0.393701;
                yards = value * 0.0109361;
                kilometers = value * 0.00001;
                miles = value * 0.00000621371;
                centimeters = value;
                millimeters = value * 10;
                micrometers = value * 10000;
                nanometers = value * 10000000;
                angstroms = value * 1e+8;
                break;
            case "millimeters":
                meters = value * 0.001;
                feet = value * 0.00328084;
                inches = value * 0.0393701;
                yards = value * 0.00109361;
                kilometers = value * 1e-6;
                miles = value * 6.2137e-7;
                centimeters = value * 0.1;
                millimeters = value;
                micrometers = value * 1000;
                nanometers = value * 1e+6;
                angstroms = value * 1e+10;
                break;
            case "micrometers":
                meters = value * 0.000001;
                feet = value * 0.00000328084;
                inches = value * 0.0000393701;
                yards = value * 0.00000109361;
                kilometers = value * 0.000000001;
                miles = value * 6.2137e-10;
                centimeters = value * 0.0001;
                millimeters = value * 0.001;
                micrometers = value;
                nanometers = value * 1000;
                angstroms = value * 1e+7;
                break;
            case "nanometers":
                meters = value * 0.000000001;
                feet = value * 0.00000000328084;
                inches = value * 0.0000000393701;
                yards = value * 0.00000000109361;
                kilometers = value * 0.000000000001;
                miles = value * 0.000000000000621371;
                centimeters = value * 0.0000001;
                millimeters = value * 0.000001;
                micrometers = value * 0.001;
                angstroms = value * 10;
                break;
            case "angstroms":
                meters = value * 1e-10;
                feet = value * 3.28084e-10;
                inches = value * 3.93701e-9;
                yards = value * 1.09361e-10;
                kilometers = value * 1e-13;
                miles = value * 6.21371e-14;
                centimeters = value * 1e-8;
                millimeters = value * 1e-7;
                micrometers = value * 0.1;
                nanometers = value * 10;
                angstroms = value;
                break;
            default:
                break;
        }

        for (int i = 0; i < content.length; i++) {
            if (content[i].equals(unit2)) {
                if (i == 0) {
                    result = meters;
                }
                if (i == 1) {
                    result = feet;
                }
                if (i == 2) {
                    result = inches;
                }
                if (i == 3) {
                    result = yards;
                }
                if (i == 4) {
                    result = kilometers;
                }
                if (i == 5) {
                    result = miles;
                }
                if (i == 6) {
                    result = centimeters;
                }
                if (i == 7) {
                    result = millimeters;
                }
                if (i == 8) {
                    result = micrometers;
                }
                if (i == 9) {
                    result = nanometers;
                }
                if (i == 10) {
                    result = angstroms;
                }


            }

        }

        return result;
    }

}

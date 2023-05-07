package com.example.unitify.Converter;

public class MassConverter {

    private final double value;
    private double result=0;
    private final String unit1;
    private final String unit2;

    public MassConverter(double value, String unit1,String unit2) {
        this.value = value;
        this.unit1 = unit1;
        this.unit2 = unit2;
    }

    public double convert() {

        String[] content = {"grams","ounces","pounds","kilograms","metric_tons","short_tons","long_tons","carats"};

        double grams = 0; //0
        double ounces = 0; //1
        double pounds = 0; //2
        double kilograms = 0; //3
        double metric_tons = 0; //4
        double short_tons = 0; //5
        double long_tons = 0; //6
        double carats = 0; //7

        switch (unit1) {
            case "grams":
                grams = value;
                ounces = value * 0.035274;
                pounds = value * 0.00220462;
                kilograms = value * 0.001;
                metric_tons = value * 1e-6;
                short_tons = value * 1.10231e-6;
                long_tons = value * 9.84207e-7;
                carats = value * 5;
                break;
            case "ounces":
                grams = value * 28.3495;
                ounces = value;
                pounds = value * 0.0625;
                kilograms = value * 0.0283495;
                metric_tons = value * 2.835e-5;
                short_tons = value * 3.125e-5;
                long_tons = value * 2.7902e-5;
                carats = value * 141.7476;
                break;
            case "pounds":
                grams = value * 453.592;
                ounces = value * 16;
                pounds = value;
                kilograms = value * 0.453592;
                metric_tons = value * 0.000453592;
                short_tons = value * 0.0005;
                long_tons = value * 0.000446429;
                carats = value * 2267.9619;
                break;
            case "kilograms":
                grams = value * 1000;
                ounces = value * 35.274;
                pounds = value * 2.204;
                metric_tons = value * 0.001;
                short_tons = value * 0.00110231;
                long_tons = value * 0.000984207;
                carats = value * 5000;
                break;

            case "metric_tons":
                grams = value * 1e+6;
                ounces = value * 35273.9619;
                pounds = value * 2204.62262;
                kilograms = value * 1000;
                metric_tons = value;
                short_tons = value * 1.10231;
                long_tons = value * 0.984207;
                carats = value * 5e+6;
                break;
            case "short_tons":
                grams = value * 907184.74;
                ounces = value * 32000;
                pounds = value * 2000;
                kilograms = value * 907.18474;
                metric_tons = value * 0.907185;
                short_tons = value;
                long_tons = value * 0.892857;
                carats = value * 4.53592e+6;
                break;
            case "long_tons":
                grams = value * 1016046.91;
                ounces = value * 35840;
                pounds = value * 2240;
                kilograms = value * 1016.04691;
                metric_tons = value * 1.01604691;
                long_tons = value;
                short_tons = value * 1.12;
                carats = value * 5080234.545;
                break;
            case "carats":
                carats = value;
                grams = value * 0.2;
                ounces = value * 0.00705479;
                pounds = value * 0.000440925;
                kilograms = value * 0.0002;
                metric_tons = value * 2e-7;
                short_tons = value * 2.2046e-7;
                long_tons = value * 1.9684e-7;
                break;
            default:
                break;

        }

        for(int i=0;i<content.length;i++){
            if(content[i]==unit2.toLowerCase()){
                if(i==0)
                    result = grams;
                if(i==1)
                    result = ounces;
                if(i==2)
                    result = pounds;
                if(i==3)
                    result = kilograms;
                if(i==4)
                    result = metric_tons;
                if(i==5)
                    result = short_tons;
                if(i==6)
                    result = long_tons;
                if(i==7)
                    result = carats;
                break;
            }
        }

        return result;
    }

}

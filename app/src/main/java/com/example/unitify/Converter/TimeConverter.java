package com.example.unitify.Converter;

public class TimeConverter {

    private final double value;
    private double result=0;
    private final String unit1;
    private final String unit2;

    public TimeConverter(double value, String unit1,String unit2) {
        this.value = value;
        this.unit1 = unit1;
        this.unit2 = unit2;
    }



    public double convert() {

        String[] content = {"seconds", "minutes", "hours", "days", "weeks", "months", "years"};

        double seconds = 0; // 0
        double minutes = 0; // 1
        double hours = 0; // 2
        double days = 0; // 3
        double weeks = 0; // 4
        double months = 0; // 5
        double years = 0; // 6

        switch (unit1) {
            case "seconds":
                seconds = value;
                minutes = seconds / 60;
                hours = seconds / 3600;
                days = seconds / 86400;
                weeks = seconds / 604800;
                months = seconds / 2628000;
                years = seconds / 31536000;
                break;
            case "minutes":
                seconds = value * 60;
                minutes = value;
                hours = value / 60;
                days = value / 1440;
                weeks = value / 10080;
                months = value / 43800;
                years = value / 525600;
                break;
            case "hours":
                hours = value;
                minutes = hours * 60;
                seconds = hours * 3600;
                days = hours / 24;
                weeks = hours / 168;
                months = hours / 730.001;
                years = hours / 8760;
                break;
            case "days":
                seconds = value * 86400;
                minutes = seconds / 60;
                hours = seconds / 3600;
                days = value;
                weeks = seconds / 604800;
                months = seconds / 2628000;
                years = seconds / 31536000;
                break;
            case "weeks":
                seconds = value * 604800;
                minutes = seconds / 60;
                hours = seconds / 3600;
                days = seconds / 86400;
                weeks = value;
                months = seconds / 2628000;
                years = seconds / 31536000;
                break;
            case "months":
                months = value;
                seconds = months * 2628000;
                minutes = seconds / 60;
                hours = seconds / 3600;
                days = seconds / 86400;
                weeks = seconds / 604800;
                years = months / 12;
                break;
            case "years":
                seconds = value * 31536000;
                minutes = seconds / 60;
                hours = seconds / 3600;
                days = seconds / 86400;
                weeks = seconds / 604800;
                months = seconds / 2628000;
                years = value;
                break;
            default:
                break;
        }


        for (int i = 0; i < content.length; i++) {
            if (content[i].equals(unit2.toLowerCase())) {
                if (i == 0)
                    result = seconds;
                if (i == 1)
                    result = minutes;
                if (i == 2)
                    result = hours;
                if (i == 3)
                    result = days;
                if (i == 4)
                    result = weeks;
                if (i == 5)
                    result = months;
                if (i == 6)
                    result = years;
                break;
            }
        }

        return result;
    }

}

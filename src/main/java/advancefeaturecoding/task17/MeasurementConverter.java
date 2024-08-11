package advancefeaturecoding.task17;

public class MeasurementConverter {

    public static double convert(double value, ConversionType conversionType) {
        return conversionType.convert(value);
    }

    public static void main(String[] args) {

        double metersConvert = 10;
        double yards = MeasurementConverter.convert(metersConvert, ConversionType.METERS_TO_YARDS);
        System.out.println(metersConvert + " meter is " + yards + " yards.");

        double yardsConvert = 10;
        double meters = MeasurementConverter.convert(yardsConvert, ConversionType.YARDS_TO_METERS);
        System.out.println(yardsConvert + " yards is " + meters + " meters.");

        double milesConvert = 5;
        double kilometers = MeasurementConverter.convert(milesConvert, ConversionType.MILES_TO_KILOMETERS);
        System.out.println(milesConvert + " miles is " + kilometers + " kilometers.");

        double kilometersConvert = 5;
        double miles = MeasurementConverter.convert(kilometersConvert, ConversionType.KILOMETERS_TO_MILES);
        System.out.println(kilometersConvert + " kilometers is " + miles + " miles.");

        double inchesConvert = 40;
        double centimeters = MeasurementConverter.convert(inchesConvert, ConversionType.INCHES_TO_CENTIMETERS);
        System.out.println(inchesConvert + " inches is " + centimeters + " centimeters.");

        double centimetersConvert = 40;
        double inches = MeasurementConverter.convert(centimetersConvert, ConversionType.CENTIMETERS_TO_INCHES);
        System.out.println(centimetersConvert + " centimeters is " + inches + " inches.");

    }
}
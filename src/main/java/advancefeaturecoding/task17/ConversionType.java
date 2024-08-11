package advancefeaturecoding.task17;


public enum ConversionType {
    METERS_TO_YARDS(value -> value * 1.09361),
    YARDS_TO_METERS(value -> value / 1.09361),
    CENTIMETERS_TO_INCHES(value -> value / 2.54),
    INCHES_TO_CENTIMETERS(value -> value * 2.54),
    KILOMETERS_TO_MILES(value -> value * 0.621371),
    MILES_TO_KILOMETERS(value -> value / 0.621371);

    private final Converter converter;

    public interface Converter {
        double convert(double value);
    }

    ConversionType(Converter converter) {
        this.converter = converter;
    }

    public double convert(double value) {
        return converter.convert(value);

    }
}
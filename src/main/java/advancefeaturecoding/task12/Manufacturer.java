package advancefeaturecoding.task12;

import java.util.Objects;

public class Manufacturer {
    private String name;
    private int yearOfEstablishment;
    private String country;

    public Manufacturer(String name, int yearOfEstablishment, String country) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Manufacturer name cannot be null or empty.");
        }
        if (yearOfEstablishment < 0) {
            throw new IllegalArgumentException("Year of establishment cannot be negative.");
        }
        if (country == null || country.isEmpty()) {
            throw new IllegalArgumentException("Country cannot be null or empty.");
        }
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getYearOfEstablishment() {
        return yearOfEstablishment;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfEstablishment(int yearOfEstablishment) {
        if (yearOfEstablishment < 0) {
            throw new IllegalArgumentException("The year of establishment cannot be negative.");
        }
        this.yearOfEstablishment = yearOfEstablishment;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Manufacturer that = (Manufacturer) obj;
        return yearOfEstablishment == that.getYearOfEstablishment() &&
                Objects.equals(name, that.name) &&
                Objects.equals(country, that.country);

    }

    public int hashCode() {
        return Objects.hash(name, yearOfEstablishment, country);
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", yearOfEstablishment=" + yearOfEstablishment +
                ", country='" + country + '\'' +
                '}';
    }
}
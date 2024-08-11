package advancefeaturecoding.task8;

public class Main {
    public static void main(String[] args) {

        Parcel parcel1 = new Parcel(100, 100, 100, 20.0f, false);
        Parcel parcel2 = new Parcel(20, 50, 50, 10.0f, false);
        Parcel parcel3 = new Parcel(100, 100, 100, 16.0f, true);
        Parcel parcel4 = new Parcel(100, 100, 110, 14.0f, true);

        ParcelValidator validator = new ParcelValidator();

        validator.validate(parcel1);
        validator.validate(parcel2);
        validator.validate(parcel3);
        validator.validate(parcel4);
    }
}
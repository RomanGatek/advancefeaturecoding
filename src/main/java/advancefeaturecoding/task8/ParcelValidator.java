package advancefeaturecoding.task8;

import java.util.ArrayList;
import java.util.List;

public class ParcelValidator implements Validator {

    @Override
    public boolean validate(Parcel input) {
        List<String> errors = new ArrayList<>();

        if (input.xLength < 30.0 || input.yLength < 30.0 || input.zLength < 30.0) {
            if (input.xLength < 30.0) {
                errors.add("xLength should be at least 30.");
            }

            if (input.yLength < 30.0) {
                errors.add("yLength should be at least 30.");
            }

            if (input.zLength < 30.0) {
                errors.add("zLength should be at least 30.");
            }
        }

        int sumOfDimensions = input.xLength + input.yLength + input.zLength;
        if (sumOfDimensions > 300) {
            errors.add("Sum of dimensions (xLength + yLength + zLength) should not exceed 300.");
        }

        double maxWeight = input.isExpress ? 15.0 : 30.0;
        if (input.weight > maxWeight) {
            errors.add("Weight should not exceed " + maxWeight + " for " + (input.isExpress ? "express" : "non-express") + " parcels.");
        }

        if (errors.isEmpty()) {
            System.out.println("Parcel validation succeeded.");
            return true;
        } else {
            errors.forEach(System.out::println);
            return false;
        }
    }
}
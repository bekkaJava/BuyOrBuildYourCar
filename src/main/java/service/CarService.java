package service;

import car.Car;
import exception.AllPropertiesMustBeChosenException;
import exception.IncorrectMethodException;
import exception.NoSuchModelException;

public class CarService {

    public static int calculateTotalAmountForBuiltCar(Car builtCar) {

        //Validate if all necessary properties are filled for the built car

        if (!isAllPropertiesFill(builtCar)) {
            throw new AllPropertiesMustBeChosenException("All properties must be chosen");
        } else if (isBrandAndModelDeclared(builtCar)) {
            throw new IncorrectMethodException("The method call is incorrect for the given context.");
        }
        // Validate if brand or model is declared for the built car

        int totalAmount = 0;
        if (builtCar.isHasAdaptiveCruiseControl()) {
            totalAmount += 500;
        }
        if (builtCar.isHasHeatedSeats()) {
            totalAmount += 400;
        }
        if (builtCar.isHasBackupCamera()) {
            totalAmount += 350;
        }
        if (builtCar.isHasNavigation()) {
            totalAmount += 200;
        }
        if (builtCar.isHasParkingAss()) {
            totalAmount += 200;
        }

        totalAmount += builtCar.getColor().getPrice() +
                builtCar.getAirbagConfiguration().getPrice() +
                builtCar.getCylinderConfiguration().getPrice() +
                builtCar.getEngineCategory().getPrice() +
                builtCar.getInteriorType().getPrice() +
                builtCar.getNumberOFDoors().getPrice() +
                builtCar.getSpoilerStyle().getPrice() +
                builtCar.getTransmissionType().getPrice() +
                builtCar.getWheel().getPrice() +
                builtCar.getYear().getPrice() +
                builtCar.getCarType().getPrice();

        return totalAmount;
    }


    public static int calculateTotalAmountForCar(Car car) {

        if (!isModelExists(car)) {
            throw new NoSuchModelException("The selected car model does not exist within the brand's available models");
            // Check if the selected car model exists within the brand's available models
        }
        int totalAmount = 0;
        totalAmount += car.getModel().getPrice();

        return totalAmount;
    }

    public static boolean isAllPropertiesFill(Car builtCar) {

        return builtCar.getColor() != null &&
                builtCar.getAirbagConfiguration() != null &&
                builtCar.getCylinderConfiguration() != null &&
                builtCar.getEngineCategory() != null &&
                builtCar.getInteriorType() != null &&
                builtCar.getNumberOFDoors() != null &&
                builtCar.getSpoilerStyle() != null &&
                builtCar.getTransmissionType() != null &&
                builtCar.getWheel() != null &&
                builtCar.getYear() != null &&
                builtCar.getCarType() != null;
    }

    public static boolean isBrandAndModelDeclared(Car builtCar) {

        return (builtCar.getBrand() != null || builtCar.getModel() != null);
    }

    public static boolean isModelExists(Car car) {
        return car.getBrand().getModels().contains(car.getModel());

    }
}




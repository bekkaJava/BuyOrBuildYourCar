package car;

import enumsforcar.*;
import enumsforcarparts.*;
import logger.FileLogger;
import logger.Logger;

import java.time.LocalTime;

public class Car {
    private static final Logger logger = new FileLogger();
    private Brand brand;
    private Model model;
    private CarType carType;
    private Year year;
    private Color color;
    private InteriorType interiorType;
    private TransmissionType transmissionType;
    private CylinderConfiguration cylinderConfiguration;
    private SpoilerStyle spoilerStyle;
    private EngineCategory engineCategory;
    private NumberOFDoors numberOFDoors;
    private Wheel wheel;
    private AirbagConfiguration airbagConfiguration;
    private boolean hasNavigation;
    private boolean hasBackupCamera;
    private boolean hasHeatedSeats;
    private boolean hasAdaptiveCruiseControl;
    private boolean hasParkingAss;

    public Car(Brand brand, Model model) {
        this.brand = brand;
        this.model = model;
    }

    private Car() {
    }

    private Car(CarType carType,
                Year year,
                Color color,
                InteriorType interiorType,
                TransmissionType transmissionType,
                CylinderConfiguration cylinderConfiguration,
                SpoilerStyle spoilerStyle,
                EngineCategory engineCategory,
                NumberOFDoors numberOFDoors,
                Wheel wheel,
                boolean hasNavigation,
                boolean hasBackupCamera,
                boolean hasHeatedSeats,
                int numberOfAirbags,
                AirbagConfiguration airbagConfiguration,
                boolean hasAdaptiveCruiseControl,
                boolean hasParkingAss) {
        this.carType = carType;
        this.year = year;
        this.color = color;
        this.interiorType = interiorType;
        this.transmissionType = transmissionType;
        this.cylinderConfiguration = cylinderConfiguration;
        this.spoilerStyle = spoilerStyle;
        this.engineCategory = engineCategory;
        this.numberOFDoors = numberOFDoors;
        this.wheel = wheel;
        this.hasNavigation = hasNavigation;
        this.hasBackupCamera = hasBackupCamera;
        this.hasHeatedSeats = hasHeatedSeats;
        this.airbagConfiguration = airbagConfiguration;
        this.hasAdaptiveCruiseControl = hasAdaptiveCruiseControl;
        this.hasParkingAss = hasParkingAss;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public InteriorType getInteriorType() {
        return interiorType;
    }

    public void setInteriorType(InteriorType interiorType) {
        this.interiorType = interiorType;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }

    public CylinderConfiguration getCylinderConfiguration() {
        return cylinderConfiguration;
    }

    public void setCylinderConfiguration(CylinderConfiguration cylinderConfiguration) {
        this.cylinderConfiguration = cylinderConfiguration;
    }

    public SpoilerStyle getSpoilerStyle() {
        return spoilerStyle;
    }

    public void setSpoilerStyle(SpoilerStyle spoilerStyle) {
        this.spoilerStyle = spoilerStyle;
    }

    public EngineCategory getEngineCategory() {
        return engineCategory;
    }

    public void setEngineCategory(EngineCategory engineCategory) {
        this.engineCategory = engineCategory;
    }

    public NumberOFDoors getNumberOFDoors() {
        return numberOFDoors;
    }

    public void setNumberOFDoors(NumberOFDoors numberOFDoors) {
        this.numberOFDoors = numberOFDoors;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public boolean isHasNavigation() {
        return hasNavigation;
    }

    public void setHasNavigation(boolean hasNavigation) {
        this.hasNavigation = hasNavigation;
    }

    public boolean isHasBackupCamera() {
        return hasBackupCamera;
    }

    public void setHasBackupCamera(boolean hasBackupCamera) {
        this.hasBackupCamera = hasBackupCamera;
    }

    public boolean isHasHeatedSeats() {
        return hasHeatedSeats;
    }

    public void setHasHeatedSeats(boolean hasHeatedSeats) {
        this.hasHeatedSeats = hasHeatedSeats;
    }

    public AirbagConfiguration getAirbagConfiguration() {
        return airbagConfiguration;
    }

    public void setAirbagConfiguration(AirbagConfiguration airbagConfiguration) {
        this.airbagConfiguration = airbagConfiguration;
    }

    public boolean isHasAdaptiveCruiseControl() {
        return hasAdaptiveCruiseControl;
    }

    public void setHasAdaptiveCruiseControl(boolean hasAdaptiveCruiseControl) {
        this.hasAdaptiveCruiseControl = hasAdaptiveCruiseControl;
    }

    public boolean isHasParkingAss() {
        return hasParkingAss;
    }

    public void setHasParkingAss(boolean hasParkingAss) {
        this.hasParkingAss = hasParkingAss;
    }


    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", brand=" + brand +
                ", carType=" + carType +
                ", year=" + year +
                ", color=" + color +
                ", interiorType=" + interiorType +
                ", transmissionType=" + transmissionType +
                ", cylinderConfiguration=" + cylinderConfiguration +
                ", spoilerStyle=" + spoilerStyle +
                ", engineCategory=" + engineCategory +
                ", numberOFDoors=" + numberOFDoors +
                ", wheel=" + wheel +
                ", hasNavigation=" + hasNavigation +
                ", hasBackupCamera=" + hasBackupCamera +
                ", hasHeatedSeats=" + hasHeatedSeats +
                ", airbagConfiguration=" + airbagConfiguration +
                ", hasAdaptiveCruiseControl=" + hasAdaptiveCruiseControl +
                ", hasParkingAss=" + hasParkingAss +
                '}';
    }

    public static class Builder {

        private Car car = new Car();

        public Builder carType(CarType carType) {
            car.setCarType(carType);
            logger.debug(LocalTime.now().withNano(0) + ": Starting car building");
            logger.debug("adding carType: " + carType);
            return this;
        }

        public Builder year(Year year) {
            car.setYear(year);
            logger.debug("adding year: " + year);
            return this;
        }

        public Builder color(Color color) {
            car.setColor(color);
            logger.debug("adding color: " + color);
            return this;
        }

        public Builder interiorType(InteriorType interiorType) {
            car.setInteriorType(interiorType);
            logger.debug("adding interiorType: " + interiorType);
            return this;
        }

        public Builder transmissionType(TransmissionType transmissionType) {
            car.setTransmissionType(transmissionType);
            logger.debug("adding transmissionType: " + transmissionType);
            return this;
        }

        public Builder cylinderConfiguration(CylinderConfiguration cylinderConfiguration) {
            car.setCylinderConfiguration(cylinderConfiguration);
            logger.debug("adding cylinderConfiguration: " + cylinderConfiguration);
            return this;
        }

        public Builder spoilerStyle(SpoilerStyle spoilerStyle) {
            car.setSpoilerStyle(spoilerStyle);
            logger.debug("adding spoilerStyle: " + spoilerStyle);
            return this;
        }

        public Builder engineCategory(EngineCategory engineCategory) {
            car.setEngineCategory(engineCategory);
            logger.debug("adding engineCategory: " + engineCategory);
            return this;
        }

        public Builder numberOfDoors(NumberOFDoors numberOFDoors) {
            car.setNumberOFDoors(numberOFDoors);
            logger.debug("adding numberOFDoors: " + numberOFDoors);
            return this;
        }

        public Builder wheel(Wheel wheel) {
            car.setWheel(wheel);
            logger.debug("adding wheel: " + wheel);
            return this;
        }

        public Builder hasNavigation(boolean hasNavigation) {
            car.setHasNavigation(hasNavigation);
            logger.debug("adding hasNavigation: " + hasNavigation);
            return this;
        }

        public Builder hasBackupCamera(boolean hasBackupCamera) {
            car.setHasBackupCamera(hasBackupCamera);
            logger.debug("adding hasBackupCamera: " + hasBackupCamera);
            return this;
        }

        public Builder hasHeatedSeats(boolean hasHeatedSeats) {
            car.setHasHeatedSeats(hasHeatedSeats);
            logger.debug("adding hasHeatedSeats: " + hasHeatedSeats);
            return this;
        }

        public Builder airbagConfiguration(AirbagConfiguration airbagConfiguration) {
            car.setAirbagConfiguration(airbagConfiguration);
            logger.debug("adding airbagConfiguration: " + airbagConfiguration);
            return this;
        }

        public Builder hasAdaptiveCruiseControl(boolean hasAdaptiveCruiseControl) {
            car.setHasAdaptiveCruiseControl(hasAdaptiveCruiseControl);
            logger.debug("adding hasAdaptiveCruiseControl: " + hasAdaptiveCruiseControl);
            return this;
        }

        public Builder hasParkingAss(boolean hasParkingAss) {
            car.setHasParkingAss(hasParkingAss);
            logger.debug("adding hasParkingAss: " + hasParkingAss);

            return this;
        }

        public Car build() {
            logger.debug("Build Finished");
            return car;
        }

    }
}

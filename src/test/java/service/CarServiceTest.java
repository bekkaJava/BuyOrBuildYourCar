package service;

import car.Car;
import enumsforcar.CarType;
import enumsforcar.Color;
import enumsforcar.Year;
import enumsforcarparts.*;
import exception.AllPropertiesMustBeChosenException;
import exception.IncorrectMethodException;
import exception.NoSuchModelException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static enumsforcar.Brand.BMW;
import static enumsforcar.Model.FIVE_SERIES;
import static enumsforcar.Model.S_CLASS;
import static org.junit.jupiter.api.Assertions.*;

public class CarServiceTest {

    private static Car normalCarForThrowExceptionAndTrue;
    private static Car normalCarForNotThrowExceptionAndFalse;
    private static Car builtedCarWithAllProps;
    private static Car builtedCarWithNotAllProps;
    private static Car builtedCarWithBrandAndOrModelDeclared;

    @BeforeAll
    static void beforeAll() {
        normalCarForThrowExceptionAndTrue = new Car(BMW, S_CLASS);
        normalCarForNotThrowExceptionAndFalse = new Car(BMW, FIVE_SERIES);
        builtedCarWithAllProps = new Car.Builder()
                .carType(CarType.SPORTS_CAR)
                .transmissionType(TransmissionType.AUTOMATIC)
                .airbagConfiguration(AirbagConfiguration.ALL)
                .color(Color.APRICOT)
                .hasNavigation(false)
                .hasBackupCamera(false)
                .hasParkingAss(false)
                .cylinderConfiguration(CylinderConfiguration.V6)
                .interiorType(InteriorType.CLOTH)
                .spoilerStyle(SpoilerStyle.NONE)
                .wheel(Wheel.ALLOY)
                .year(Year.YEAR_2016)
                .numberOfDoors(NumberOFDoors.FIVE_DOOR)
                .engineCategory(EngineCategory.DIESEL)
                .build();

        builtedCarWithNotAllProps = new Car.Builder()
                .carType(CarType.SPORTS_CAR)
                .transmissionType(TransmissionType.AUTOMATIC)
                .airbagConfiguration(AirbagConfiguration.ALL)
                .hasNavigation(false)
                .hasBackupCamera(false)
                .hasParkingAss(false)
                .cylinderConfiguration(CylinderConfiguration.V6)
                .interiorType(InteriorType.CLOTH)
                .spoilerStyle(SpoilerStyle.NONE)
                .wheel(Wheel.ALLOY)
                .year(Year.YEAR_2016)
                .numberOfDoors(NumberOFDoors.FIVE_DOOR)
                .engineCategory(EngineCategory.DIESEL)
                .build();

        builtedCarWithBrandAndOrModelDeclared = new Car.Builder()
                .carType(CarType.SPORTS_CAR)
                .transmissionType(TransmissionType.AUTOMATIC)
                .airbagConfiguration(AirbagConfiguration.ALL)
                .color(Color.APRICOT)
                .hasNavigation(false)
                .hasBackupCamera(false)
                .hasParkingAss(false)
                .cylinderConfiguration(CylinderConfiguration.V6)
                .interiorType(InteriorType.CLOTH)
                .spoilerStyle(SpoilerStyle.NONE)
                .wheel(Wheel.ALLOY)
                .year(Year.YEAR_2016)
                .numberOfDoors(NumberOFDoors.FIVE_DOOR)
                .engineCategory(EngineCategory.DIESEL)
                .build();
        //builtedCarWithBrandAndOrModelDeclared.setModel(FIVE_SERIES);
        builtedCarWithBrandAndOrModelDeclared.setBrand(BMW);
    }


    @Test
    void shouldThrowNoSuchModelException() {
        assertThrows(NoSuchModelException.class, () ->
                CarService.calculateTotalAmountForCar(normalCarForThrowExceptionAndTrue)
        );
    }

    @Test
    void shouldNoTThrowNoSuchModelException() {
        assertDoesNotThrow(() ->
                CarService.calculateTotalAmountForCar(normalCarForNotThrowExceptionAndFalse)
        );
    }

    @Test
    void ifSsModelExists() {
        assertFalse(CarService.isModelExists(normalCarForThrowExceptionAndTrue));
    }

    @Test
    void ifSsModelNotExists() {
        assertTrue(CarService.isModelExists(normalCarForNotThrowExceptionAndFalse));
    }


    @Test
    void shouldNotThrowAllPropertiesMustBeChosenException() {
        assertDoesNotThrow(() ->
                CarService.isAllPropertiesFill(builtedCarWithAllProps));

    }

    @Test
    void shouldThrowAllPropertiesMustBeChosenException() {
        assertThrows(AllPropertiesMustBeChosenException.class, () ->
                CarService.calculateTotalAmountForBuiltCar(builtedCarWithNotAllProps)
        );
    }

    @Test
    void shouldThrowIncorrectMethodException() {
        assertThrows(IncorrectMethodException.class, () ->
                CarService.calculateTotalAmountForBuiltCar(builtedCarWithBrandAndOrModelDeclared)
        );

    }

    @Test
    void isAllPropertiesFill() {
        assertTrue(CarService.isAllPropertiesFill(builtedCarWithAllProps));

    }

    @Test
    void ifEqual_109300() {
        assertEquals(109300, CarService.calculateTotalAmountForBuiltCar(builtedCarWithAllProps));
    }

}
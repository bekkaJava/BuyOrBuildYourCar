package enumsforcar;


import java.util.List;

import static enumsforcar.Model.*;

public enum Brand {
    TOYOTA(List.of(COROLLA, CAMRY, PRIUS)),
    FORD(List.of(MUSTANG, FOCUS, FUSION)),
    CHEVROLET(List.of(CAMARO, IMPALA, MALIBU)),
    HONDA(List.of(CIVIC, ACCORD)),
    VOLKSWAGEN(List.of(GOLF, JETTA, PASSAT)),
    BMW(List.of(THREE_SERIES, FIVE_SERIES, SEVEN_SERIES)),
    MERCEDES_BENZ(List.of(C_CLASS, E_CLASS, S_CLASS)),
    AUDI(List.of(A3, A4, A6)),
    NISSAN(List.of(MAXIMA)),
    HYUNDAI(List.of(ELANTRA, SONATA, TUCSON)),
    KIA(List.of(FORTE, OPTIMA, SORENTO)),
    SUBARU(List.of(IMPREZA, LEGACY)),
    PORSCHE(List.of(NINE_ONE_ONE, CAYENNE, PANAMERA)),
    FERRARI(List.of(FOUR_EIGHTY_EIGHT_GTB, F8_TRIBUTO)),
    LAMBORGHINI(List.of(AVENTADOR, HURACAN)),
    JAGUAR(List.of(XE, XF)),
    VOLVO(List.of(S60, S90)),
    MAZDA(List.of(MAZDA3, MAZDA6));

    private final List<Model> models;

    Brand(List<Model> models) {
        this.models = models;
    }

    public List<Model> getModels() {
        return models;
    }


    public static void main(String[] args) {


    }
}

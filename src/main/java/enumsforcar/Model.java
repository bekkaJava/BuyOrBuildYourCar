package enumsforcar;

public enum Model {
    COROLLA(25000),
    CAMRY(30000),
    PRIUS(27000),
    RAV4(32000),
    LAND_CRUISER(85000),
    MUSTANG(40000),
    FOCUS(22000),
    FUSION(28000),
    ESCAPE(26000),
    EXPLORER(35000),
    F150(45000),
    EDGE(33000),
    RANGER(28000),
    CAMARO(35000),
    IMPALA(32000),
    MALIBU(28000),
    EQUINOX(29000),
    TRAVERSE(36000),
    SILVERADO(40000),
    SUBURBAN(50000),
    TAHOE(47000),
    CIVIC(24000),
    ACCORD(28000),
    GOLF(23000),
    JETTA(25000),
    PASSAT(27000),
    TIGUAN(30000),
    ATLAS(35000),
    BEETLE(20000),
    TOUAREG(40000),
    ARTEON(35000),
    THREE_SERIES(45000),
    FIVE_SERIES(55000),
    SEVEN_SERIES(75000),
    X3(40000),
    X5(60000),
    X7(80000),
    Z4(55000),
    C_CLASS(35000),
    E_CLASS(45000),
    S_CLASS(65000),
    GLC_CLASS(40000),
    GLE_CLASS(55000),
    GLS_CLASS(70000),
    A_CLASS(30000),
    G_CLASS(80000),
    A3(30000),
    A4(40000),
    A6(50000),
    Q3(35000),
    Q5(45000),
    Q7(60000),
    Q8(70000),
    TT(40000),
    MAXIMA(35000),
    ROGUE(28000),
    MURANO(40000),
    PATHFINDER(35000),
    FRONTIER(30000),
    TITAN(40000),
    ELANTRA(20000),
    SONATA(25000),
    TUCSON(28000),
    ACCENT(18000),
    FORTE(22000),
    OPTIMA(26000),
    SORENTO(32000),
    RIO(17000),
    IMPREZA(22000),
    LEGACY(24000),
    FORESTER(28000),
    WRX(30000),
    BRZ(25000),
    ASCENT(35000),
    NINE_ONE_ONE(150000),
    CAYENNE(75000),
    PANAMERA(100000),
    MACAN(60000),
    BOXSTER(55000),
    CAYMAN(60000),
    TAYCAN(90000),
    FOUR_EIGHTY_EIGHT_GTB(300000),
    F8_TRIBUTO(350000),
    PORTOFINO(250000),
    ROMA(280000),
    AVENTADOR(400000),
    HURACAN(300000),
    URUS(220000),
    DB11(250000),
    VANTAGE(180000),
    DBS_SUPERLEGGERA(300000),
    VALHALLA(350000),
    XE(35000),
    XF(45000),
    F_PACE(50000),
    E_PACE(45000),
    I_PACE(60000),
    F_TYPE(55000),
    RANGE_ROVER(80000),
    RANGE_ROVER_SPORT(70000),
    RANGE_ROVER_EVOQUE(45000),
    DISCOVERY(60000),
    DISCOVERY_SPORT(50000),
    DEFENDER(55000),
    S60(40000),
    S90(50000),
    XC40(35000),
    XC60(45000),
    XC90(60000),
    V60_CROSS_COUNTRY(42000),
    MAZDA3(22000),
    MAZDA6(28000),
    CX3(25000),
    CX5(30000),
    CX9(35000),
    MX5_MIATA(28000);

    private final int price;

    Model(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
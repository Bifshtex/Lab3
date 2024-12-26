public  enum ChipolinoCondition {
    EXPECTATION("Чиполино находится в ожидании"),
    SEARSCHING("Чиполино находится в поисках"),
    ONKNEES("Чиполино встал на колени");
    private String description;

    ChipolinoCondition(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}

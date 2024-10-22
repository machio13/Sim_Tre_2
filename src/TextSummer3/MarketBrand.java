package TextSummer3;

public enum MarketBrand {
    Prime("P"),
    Standard("S"),
    Growth("G"),
    Non("---");

    private String firstChar;

    MarketBrand(String firstChar) {
        this.firstChar = firstChar;
    }

    public String getFirstChar() {
        return firstChar;
    }

    public static MarketBrand fromCode(String code) {
        return switch (code) {
            case "P" -> Prime;
            case "S" -> Standard;
            case "G" -> Growth;
            default -> Non;
        };
    }
}

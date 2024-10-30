package TextSummer_4;

public enum MarketCollect {
    Prime("P"),
    Standard("S"),
    Growth("G"),
    NoName("N");

    MarketCollect(String firstChar) {
        this.firstChar = firstChar;
    }

    private String firstChar;

    public String getFirstChar() {
        return firstChar;
    }

    public static MarketCollect fromCode(String code) {
        return switch (code) {
            case "P" -> Prime;
            case "S" -> Standard;
            case "G" -> Growth;
            default -> NoName;
        };
    }
}

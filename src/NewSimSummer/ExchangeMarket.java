package NewSimSummer;

public enum ExchangeMarket {
    Prime("P"),
    Standard("S"),
    Growth("G"),
    Non("---");

    private String firstChar;

    ExchangeMarket(String firstChar) {
        this.firstChar = firstChar;
    }

    public String getFirstChar() {
        return firstChar;
    }

    public static ExchangeMarket isRename(String market) {
        return switch (market) {
            case "P" -> Prime;
            case "S" -> Standard;
            case "G" -> Growth;
            default -> Non;
        };
    }
}

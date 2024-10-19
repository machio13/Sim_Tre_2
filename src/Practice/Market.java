package Practice;

public enum Market {
    Prime("P"),
    Standard("S"),
    Growth("G"),
    Non("---");

    private String firstName;

    Market(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public static Market fromCode(String code) {
        return switch (code) {
            case "P" -> Prime;
            case "S" -> Standard;
            case "G" -> Growth;
            default -> Non;
        };
    }
}

package enums;

/**
 * Get does not require parameters
 * Call does require parameters
 */
enum Action {
    CALL ("call"),
    GET  ("get");

    private final String action;

    Action(String action) {
        this.action = action;
    }

    public String getAction() {
        return this.action;
    }
}

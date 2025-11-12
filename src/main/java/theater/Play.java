package theater;

/**
 * Represents a play in the theater invoice system.
 * Holds the play's display name and its type (e.g., "tragedy", "comedy").
 */
public class Play {

    private String name;
    private String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}

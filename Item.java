import java.util.UUID;

public class Item {
    private UUID id;
    private String name;

    public Item(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public void show() {
        System.out.println("Name: " + name);
    }

    public String getName() {
        return this.name;
    }

    public UUID getId() {
        return this.id;
    }

}

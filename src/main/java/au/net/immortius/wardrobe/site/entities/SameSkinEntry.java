package au.net.immortius.wardrobe.site.entities;

public class SameSkinEntry {
    private final String itemId;
    private final String name;

    public SameSkinEntry(String itemId, String name) {
        this.itemId = itemId;
        this.name = name;
    }

    public String getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }
}

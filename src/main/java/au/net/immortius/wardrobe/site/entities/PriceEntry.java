package au.net.immortius.wardrobe.site.entities;

/**
 * Trading post price information for an unlock
 */
public class PriceEntry {
    private final Integer itemId; //Actual item, since some items share skins
    private final Integer price;

    public PriceEntry(Integer itemId, Integer price) {
        this.itemId = itemId;
        this.price = price;
    }

    public Integer getItemId() {
        return itemId;
    }

    public Integer getPrice() {
        return price;
    }
}

package au.net.immortius.wardrobe.legacy.filters;

import au.net.immortius.wardrobe.legacy.entities.Item;

import java.util.function.Predicate;

public class OutfitFilter implements Predicate<Item> {
    @Override
    public boolean test(Item data) {
        return data.details != null && "Unlock".equals(data.details.type) && "Outfit".equals(data.details.unlock_type);
    }
}
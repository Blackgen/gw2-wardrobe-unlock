package au.net.immortius.wardrobe.filters;

import au.net.immortius.wardrobe.entities.Item;

import java.util.function.Predicate;

public class GliderFilter implements Predicate<Item> {
    @Override
    public boolean test(Item data) {
        return data.details != null && "Unlock".equals(data.details.type) && "GliderSkin".equals(data.details.unlock_type);
    }
}
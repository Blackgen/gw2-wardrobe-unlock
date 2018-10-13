package au.net.immortius.wardrobe.legacy.filters;

import au.net.immortius.wardrobe.legacy.entities.Skin;

import java.util.function.Predicate;

public class SkinDataFilter implements Predicate<Skin> {
    @Override
    public boolean test(Skin skin) {
        return !(skin.type.equals("Armor") && skin.details.weight_class.equals("Clothing"));
    }
}
package kiwiapollo.tmcraft.item.misc;

import kiwiapollo.tmcraft.TMCraft;
import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import java.util.List;

public enum SmithingTemplateItems {
    MOVE_UPGRADE_SMITHING_TEMPLATE("move_upgrade_smithing_template", new SmithingTemplateItem(
            Text.translatable("item.tmcraft.move_upgrade_smithing_template.applies_to").formatted(Formatting.BLUE),
            Text.translatable("item.tmcraft.move_upgrade_smithing_template.ingredients").formatted(Formatting.BLUE),
            Text.translatable("item.tmcraft.move_upgrade_smithing_template.title").formatted(Formatting.GRAY),
            Text.translatable("item.tmcraft.move_upgrade_smithing_template.base_slot_description"),
            Text.translatable("item.tmcraft.move_upgrade_smithing_template.additions_slot_description"),
            List.of(
                    Identifier.of(TMCraft.MOD_ID, "item/empty_slot_disc"),
                    Identifier.of(TMCraft.MOD_ID, "item/empty_slot_egg"),
                    Identifier.of(TMCraft.MOD_ID, "item/empty_slot_book")
            ),
            List.of(
                    Identifier.of(Identifier.DEFAULT_NAMESPACE, "item/empty_slot_ingot"),
                    Identifier.of(Identifier.DEFAULT_NAMESPACE, "item/empty_slot_emerald"),
                    Identifier.of(Identifier.DEFAULT_NAMESPACE, "item/empty_slot_diamond")
            )
    ));

    private final Identifier identifier;
    private final SmithingTemplateItem item;

    SmithingTemplateItems(String path, SmithingTemplateItem item) {
        this.identifier = Identifier.of(TMCraft.MOD_ID, path);
        this.item = item;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public SmithingTemplateItem getItem() {
        return item;
    }
}

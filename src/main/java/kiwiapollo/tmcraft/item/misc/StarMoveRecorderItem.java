package kiwiapollo.tmcraft.item.misc;

import com.cobblemon.mod.common.api.moves.Move;
import kiwiapollo.tmcraft.TMCraft;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class StarMoveRecorderItem extends MoveRecorderItem {
    @Override
    protected Item toMoveTeachingItem(Move move) {
        return Registries.ITEM.get(Identifier.of(TMCraft.MOD_ID, String.format("star_%s", move.getName())));
    }
}
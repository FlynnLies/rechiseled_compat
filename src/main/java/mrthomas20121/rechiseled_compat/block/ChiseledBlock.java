package mrthomas20121.rechiseled_compat.block;

import com.supermartijn642.core.TextComponents;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;
import net.minecraft.world.level.BlockGetter;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class ChiseledBlock extends Block {
    public final boolean connecting;

    public ChiseledBlock(boolean connecting, Properties properties) {
        super(properties);
        this.connecting = connecting;
    }

    public void appendHoverText(@Nonnull ItemStack stack, @Nullable BlockGetter world, @Nonnull List<Component> text, @Nonnull TooltipFlag flag) {
        super.appendHoverText(stack, world, text, flag);
        if (this.connecting) {
            text.add(TextComponents.translation("rechiseled.tooltip.connecting").color(ChatFormatting.GRAY).get());
        }

    }
}

package mrthomas20121.rechiseled_compat.block;

import com.supermartijn642.core.TextComponents;
import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class ChiseledBlock extends Block {
    public final boolean connecting;

    public ChiseledBlock(boolean connecting, Properties properties) {
        super(properties);
        this.connecting = connecting;
    }

    public void appendHoverText(@Nonnull ItemStack stack, @Nullable IBlockReader world, @Nonnull List<ITextComponent> text, @Nonnull ITooltipFlag flag) {
        super.appendHoverText(stack, world, text, flag);
        if (this.connecting) {
            text.add(TextComponents.translation("rechiseled.tooltip.connecting").color(TextFormatting.GRAY).get());
        }

    }
}

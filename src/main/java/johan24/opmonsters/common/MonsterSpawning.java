package johan24.opmonsters.common;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.entity.monster.SkeletonEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Hand;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class MonsterSpawning {

    @SubscribeEvent
    public static void zombieKnights(EntityJoinWorldEvent event) {
        if(!(event.getEntity() instanceof ZombieEntity))
            return;

        ZombieEntity zombie = (ZombieEntity) event.getEntity();

        zombie.setItemStackToSlot(EquipmentSlotType.HEAD, new ItemStack(Items.DIAMOND_HELMET));
        zombie.setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(Items.DIAMOND_CHESTPLATE));
        zombie.setItemStackToSlot(EquipmentSlotType.LEGS, new ItemStack(Items.DIAMOND_LEGGINGS));
        zombie.setItemStackToSlot(EquipmentSlotType.FEET, new ItemStack(Items.DIAMOND_BOOTS));
        zombie.setHeldItem(Hand.MAIN_HAND, new ItemStack(Items.DIAMOND_AXE));
    }

    @SubscribeEvent
    public static void skeletonArchers(EntityJoinWorldEvent event) {
        if(!(event.getEntity() instanceof SkeletonEntity))
            return;

        SkeletonEntity skeleton = (SkeletonEntity) event.getEntity();
        ItemStack bow = new ItemStack(Items.BOW);
        bow.addEnchantment(Enchantments.PUNCH, 2);

        skeleton.setItemStackToSlot(EquipmentSlotType.HEAD, new ItemStack(Items.DIAMOND_HELMET));
        skeleton.setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(Items.DIAMOND_CHESTPLATE));
        skeleton.setItemStackToSlot(EquipmentSlotType.LEGS, new ItemStack(Items.DIAMOND_LEGGINGS));
        skeleton.setItemStackToSlot(EquipmentSlotType.FEET, new ItemStack(Items.DIAMOND_BOOTS));
        skeleton.setHeldItem(Hand.MAIN_HAND, bow);
    }

    @SubscribeEvent
    public static void chargedCreepers(EntityJoinWorldEvent event) {
        if(!(event.getEntity() instanceof CreeperEntity))
            return;

        CreeperEntity creeper = (CreeperEntity) event.getEntity();

        CompoundNBT compound = new CompoundNBT();
        compound.putBoolean("powered", true);

        creeper.readAdditional(compound);
    }
}

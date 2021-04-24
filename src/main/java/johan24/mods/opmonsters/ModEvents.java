package johan24.mods.opmonsters;

import johan24.mods.opmonsters.config.OPMonstersConfig;
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
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = OPMonsters.MODID, bus = Bus.FORGE)
public class ModEvents {
	
	@SubscribeEvent
	public static void zombieKnights(EntityJoinWorldEvent event) {
		if(!event.getWorld().isClientSide()) {
			if(OPMonstersConfig.SERVER.spawnZombieKnights.get()) {
				if(!(event.getEntity() instanceof ZombieEntity))
					return;

				ZombieEntity zombie = (ZombieEntity) event.getEntity();

				zombie.setItemSlot(EquipmentSlotType.HEAD, new ItemStack(Items.DIAMOND_HELMET));
				zombie.setItemSlot(EquipmentSlotType.CHEST, new ItemStack(Items.DIAMOND_CHESTPLATE));
				zombie.setItemSlot(EquipmentSlotType.LEGS, new ItemStack(Items.DIAMOND_LEGGINGS));
				zombie.setItemSlot(EquipmentSlotType.FEET, new ItemStack(Items.DIAMOND_BOOTS));
				zombie.setItemInHand(Hand.MAIN_HAND, new ItemStack(Items.DIAMOND_AXE));
			}
		}
	}
	
	@SubscribeEvent
	public static void skeletonArchers(EntityJoinWorldEvent event) {
		if(!event.getWorld().isClientSide()) {
			if(OPMonstersConfig.SERVER.spawnSkeletonArchers.get()) {
				if(!(event.getEntity() instanceof SkeletonEntity))
					return;

				SkeletonEntity skeleton = (SkeletonEntity) event.getEntity();
				ItemStack bow = new ItemStack(Items.BOW);
				bow.enchant(Enchantments.PUNCH_ARROWS, 2);

				skeleton.setItemSlot(EquipmentSlotType.HEAD, new ItemStack(Items.DIAMOND_HELMET));
				skeleton.setItemSlot(EquipmentSlotType.CHEST, new ItemStack(Items.DIAMOND_CHESTPLATE));
				skeleton.setItemSlot(EquipmentSlotType.LEGS, new ItemStack(Items.DIAMOND_LEGGINGS));
				skeleton.setItemSlot(EquipmentSlotType.FEET, new ItemStack(Items.DIAMOND_BOOTS));
				skeleton.setItemInHand(Hand.MAIN_HAND, bow);
			}
		}
	}
	
	@SubscribeEvent
	public static void chargedCreepers(EntityJoinWorldEvent event) {
		if(!event.getWorld().isClientSide()) {
			if(OPMonstersConfig.SERVER.spawnChargedCreepers.get()) {
				if(!(event.getEntity() instanceof CreeperEntity))
					return;

				CreeperEntity creeper = (CreeperEntity) event.getEntity();
				CompoundNBT compound = new CompoundNBT();
				compound.putBoolean("powered", true);

				creeper.readAdditionalSaveData(compound);
			}
		}
	}
}

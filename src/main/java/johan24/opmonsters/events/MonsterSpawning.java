package johan24.opmonsters.events;

import johan24.opmonsters.config.OPMonstersConfig;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MonsterSpawning {
	
	@SubscribeEvent
	public void zombieKnights(EntityJoinWorldEvent event) {
		if(OPMonstersConfig.spawnZombieKnights) {
			if(!(event.entity instanceof EntityZombie))
				return;
			
			EntityZombie zombie = (EntityZombie) event.entity;
			zombie.setCurrentItemOrArmor(0, new ItemStack(Items.diamond_sword));
			zombie.setCurrentItemOrArmor(1, new ItemStack(Items.diamond_chestplate));
			zombie.setCurrentItemOrArmor(2, new ItemStack(Items.diamond_leggings));
			zombie.setCurrentItemOrArmor(3, new ItemStack(Items.diamond_boots));
			zombie.setCurrentItemOrArmor(4, new ItemStack(Items.diamond_helmet));
		}
	}
	
	@SubscribeEvent
	public void skeletonArchers(EntityJoinWorldEvent event) {
		if(OPMonstersConfig.spawnSkeletonArchers) {
			if(!(event.entity instanceof EntitySkeleton))
				return;
			
			EntitySkeleton skeleton = (EntitySkeleton) event.entity;
			ItemStack bow = new ItemStack(Items.bow);
			bow.addEnchantment(Enchantment.punch, 2);
			
			skeleton.setCurrentItemOrArmor(0, bow);
			skeleton.setCurrentItemOrArmor(1, new ItemStack(Items.diamond_chestplate));
			skeleton.setCurrentItemOrArmor(2, new ItemStack(Items.diamond_leggings));
			skeleton.setCurrentItemOrArmor(3, new ItemStack(Items.diamond_boots));
			skeleton.setCurrentItemOrArmor(4, new ItemStack(Items.diamond_helmet));
		}
	}
	
	@SubscribeEvent
	public void chargedCreepers(EntityJoinWorldEvent event) {
		if(OPMonstersConfig.spawnChargedCreepers) {
			if(!(event.entity instanceof EntityCreeper))
				return;
			
			EntityCreeper creeper = (EntityCreeper) event.entity;
			
			NBTTagCompound compound = new NBTTagCompound();
			compound.setBoolean("powered", true);
			
			creeper.readEntityFromNBT(compound);
		}
	}
}

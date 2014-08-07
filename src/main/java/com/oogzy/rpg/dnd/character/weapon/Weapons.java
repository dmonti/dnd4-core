package com.oogzy.rpg.dnd.character.weapon;

import com.oogzy.rpg.dice.DicePack;

public class Weapons
{
	// Weapon (Name, Proficiency, Damage, Group)

	// One-Handed
	public static final Weapon CLUB = new Weapon("Club", 2, new Damage(DicePack.getD6()), WeaponGroup.MACE);
	public static final Weapon DAGGER = new Weapon("Dagger", 3, new Damage(DicePack.getD4()), WeaponGroup.LIGHT_BLADE);
	public static final Weapon JAVELIN = new Weapon("Javelin", 2, new Damage(DicePack.getD6()), WeaponGroup.SPEAR);
	public static final Weapon SICKLE = new Weapon("Sickle", 2, new Damage(DicePack.getD6()), WeaponGroup.LIGHT_BLADE);
	public static final Weapon MACE = new Weapon("Mace", 2, new Damage(DicePack.getD8()), WeaponGroup.MACE);
	public static final Weapon SPEAR = new Weapon("Spear", 2, new Damage(DicePack.getD8()), WeaponGroup.SPEAR);

	public static final Weapon UNARMED_ATTACK = new Weapon("Unarmed attack", 0, new Damage(DicePack.getD4()), WeaponGroup.UNARMED);
	// TODO - Other weapons...
}
package com.oogzy.rpg.dnd.character.weapon;

import lombok.Getter;

@Getter
public class Weapon
{
	private final String name;

	private final int proficiency;

	private final Damage damage;

	private final WeaponGroup group;

	public Weapon(String name, int proficiency, Damage damage, WeaponGroup group)
	{
		this.name = name;
		this.proficiency = proficiency;
		this.damage = damage;
		this.group = group;
	}
}
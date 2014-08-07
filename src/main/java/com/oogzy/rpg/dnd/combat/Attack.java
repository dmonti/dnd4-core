package com.oogzy.rpg.dnd.combat;

import lombok.Getter;
import lombok.Setter;

import com.oogzy.rpg.Dice;
import com.oogzy.rpg.DicePack;
import com.oogzy.rpg.dnd.character.Character;

@Getter
public class Attack
{
	private final Character source;

	private final Character target;

	private int diceResult;

	@Setter
	private int damage;

	public Attack(Character source, Character target)
	{
		this(source, target, DicePack.getD20());
	}

	public Attack(Character source, Character target, Dice dice)
	{
		this.source = source;
		this.target = target;
		this.diceResult = dice.roll();
	}

	public boolean succeed()
	{
		return (diceResult > 1 && diceResult > target.getArmorClass());
	}
}
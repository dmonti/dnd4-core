package com.oogzy.rpg.dnd.character.weapon;

import lombok.Getter;

import com.oogzy.rpg.Dice;

@Getter
public class Damage
{
	private final Dice dice;

	private final int rolls;

	private final int modifier;

	public Damage(Dice dice)
	{
		this(1, dice, 0);
	}

	public Damage(Dice dice, int modifier)
	{
		this(1, dice, modifier);
	}

	public Damage(int rolls, Dice dice)
	{
		this(rolls, dice, 0);
	}

	public Damage(int rolls, Dice dice, int modifier)
	{
		this.dice = dice;
		this.rolls = rolls;
		this.modifier = modifier;
	}

	public int rollDamage()
	{
		return getDice().roll(getRolls()) + getModifier();
	}
}
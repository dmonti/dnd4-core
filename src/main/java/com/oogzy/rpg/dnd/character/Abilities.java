package com.oogzy.rpg.dnd.character;

import lombok.Data;

@Data
public class Abilities
{
	private int strength = 10;

	private int constitution = 10;

	private int dexterity = 10;

	private int intelligence = 10;

	private int wisdom = 10;

	private int charisma = 10;

	public int getModifier(Ability ability)
	{
		int score = get(ability);
		return getModifier(score);
	}

	private int getModifier(int score)
	{
		return (int) (score / 2 - 5);
	}

	protected int get(Ability ability)
	{
		int value = -1;
		switch (ability)
		{
		case STR:
			value = getStrength();
			break;
		case CON:
			value = getConstitution();
			break;
		case DEX:
			value = getDexterity();
			break;
		case INT:
			value = getIntelligence();
			break;
		case WIS:
			value = getWisdom();
			break;
		case CHA:
			value = getCharisma();
			break;
		}
		return value;
	}

	protected void set(Ability ability, int value)
	{
		switch (ability)
		{
		case STR:
			setStrength(value);
			break;
		case CON:
			setConstitution(value);
			break;
		case DEX:
			setDexterity(value);
			break;
		case INT:
			setIntelligence(value);
			break;
		case WIS:
			setWisdom(value);
			break;
		case CHA:
			setCharisma(value);
			break;
		}
	}
}
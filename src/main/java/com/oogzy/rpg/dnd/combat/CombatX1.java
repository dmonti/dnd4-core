package com.oogzy.rpg.dnd.combat;

import lombok.Getter;
import lombok.NonNull;

import com.oogzy.rpg.dice.Dice;
import com.oogzy.rpg.dnd.character.Character;

@Getter
public class CombatX1
{
	@NonNull
	private final Character char1;

	@NonNull
	private final Character char2;

	private Character turnOf;

	public CombatX1(Character char1, Character char2)
	{
		this.char1 = char1;
		this.char2 = char2;
		this.turnOf = checkInitiative();
	}

	public void attack()
	{
		Character opponent = turnOf.equals(char1) ? char2 : char1;
		Attack attackResult = turnOf.attack(opponent);
		turnOf = opponent;
	}

	private Character checkInitiative()
	{
		Character character = checkInitiative(char1.rollInitiative(), char2.rollInitiative());
		if (character == null)
		{
			character = checkInitiative(char1.getInitiative(), char2.getInitiative());
			if (character == null && new Dice(2).roll() == 1)
				character = char1;
			else
				character = char2;
		}
		return character;
	}

	private Character checkInitiative(int initiative1, int initiative2)
	{
		Character character;
		if (initiative1 == initiative2)
			character = null;
		else if (initiative1 > initiative2)
			character = char1;
		else
			character = char2;
		return character;
	}
}
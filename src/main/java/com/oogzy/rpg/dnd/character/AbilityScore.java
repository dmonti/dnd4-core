package com.oogzy.rpg.dnd.character;

import lombok.Getter;

public class AbilityScore
{
	@Getter
	private Ability ability;

	@Getter
	private int bonus;

	public AbilityScore(Ability ability, int bonus)
	{
		this.ability = ability;
		this.bonus = bonus;
	}
}
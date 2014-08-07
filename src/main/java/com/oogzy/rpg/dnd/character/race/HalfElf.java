package com.oogzy.rpg.dnd.character.race;

import com.oogzy.rpg.dnd.character.Ability;
import com.oogzy.rpg.dnd.character.AbilityScore;

public class HalfElf extends Race
{
	public AbilityScore[] getAbilityScores()
	{
		AbilityScore[] abilityBonus = { new AbilityScore(Ability.CON, +2), new AbilityScore(Ability.CHA, +2) };
		return abilityBonus;
	}
}
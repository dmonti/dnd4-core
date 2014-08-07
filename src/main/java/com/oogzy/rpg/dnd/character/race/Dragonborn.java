package com.oogzy.rpg.dnd.character.race;

import com.oogzy.rpg.dnd.character.Ability;
import com.oogzy.rpg.dnd.character.AbilityScore;

public class Dragonborn extends Race
{
	public AbilityScore[] getAbilityScores()
	{
		AbilityScore[] abilityBonus = { new AbilityScore(Ability.STR, +2), new AbilityScore(Ability.CHA, +2) };
		return abilityBonus;
	}

	// Pag. 34 - healing surge value is equal to one-quarter of your maximum hit points + your Constitution modifier.
	public int getHealingSurge(int maxHitPoints, int constitutionMod)
	{
		return (maxHitPoints / 4) + constitutionMod;
	}
}
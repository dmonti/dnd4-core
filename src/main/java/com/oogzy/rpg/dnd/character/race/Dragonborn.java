package com.oogzy.rpg.dnd.character.race;

import com.oogzy.rpg.dnd.character.Ability;
import com.oogzy.rpg.dnd.character.AbilityScore;
import com.oogzy.rpg.dnd.character.skill.SkillBonus;

public class Dragonborn extends Race
{
	public AbilityScore[] getAbilityScores()
	{
		AbilityScore[] abilityBonus = { new AbilityScore(Ability.STR, +2), new AbilityScore(Ability.CHA, +2) };
		return abilityBonus;
	}

	public SkillBonus[] getSkillBonuses()
	{
		return null;
	}

	// Pag. 34 - healing surge value is equal to one-quarter of your maximum hit points + your Constitution modifier.
	public int getHealingSurge(int maxHitPoints, int constitutionMod)
	{
		return (maxHitPoints / 4) + constitutionMod;
	}
}
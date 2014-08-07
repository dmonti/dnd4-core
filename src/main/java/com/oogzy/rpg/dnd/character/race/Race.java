package com.oogzy.rpg.dnd.character.race;

import com.oogzy.rpg.dnd.character.AbilityScore;
import com.oogzy.rpg.dnd.character.skill.SkillBonus;

public abstract class Race
{
	public abstract AbilityScore[] getAbilityScores();

	public abstract SkillBonus[] getSkillBonuses();
}
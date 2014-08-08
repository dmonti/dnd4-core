package com.oogzy.rpg.dnd.character.skill;

import com.oogzy.rpg.dnd.character.Ability;

import lombok.Data;

@Data
public class Skill
{
	public static final String COMMON = "Common";
	public static final String EXPERT = "Expert";
	public static final String MASTER = "Master";

	private SkillKey skillKey;

	private Ability ability;

	private int difficultyClass;

	public Skill(SkillKey skillKey, Ability ability)
	{
		this.skillKey = skillKey;
		this.ability = ability;
	}

	/**
	 * Common abreviation for Dificulty Class.
	 **/
	public int getDC()
	{
		return getDifficultyClass();
	}

	public String getLevelOfKnowledge()
	{
		String levelOfKnowledge;
		if (getDifficultyClass() <= 15)
			levelOfKnowledge = COMMON;
		else if (getDifficultyClass() <= 20)
			levelOfKnowledge = EXPERT;
		else
			levelOfKnowledge = MASTER;
		return levelOfKnowledge;
	}
}
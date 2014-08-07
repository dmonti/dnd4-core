package com.oogzy.rpg.dnd.character.skill;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class SkillBonus
{
	@Getter
	private Skill skill;

	@Getter
	private int bonus;
}
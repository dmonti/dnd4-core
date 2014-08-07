package com.oogzy.rpg.dnd.character.skill;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class SkillBonus
{
	@Getter
	private final Skill skill;

	@Getter
	private final int bonus;
}
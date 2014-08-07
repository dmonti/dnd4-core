package com.oogzy.rpg.dnd.character;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class AbilityScore
{
	@Getter
	private Ability ability;

	@Getter
	private int bonus;
}
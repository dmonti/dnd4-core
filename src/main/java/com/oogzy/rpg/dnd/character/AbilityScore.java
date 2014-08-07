package com.oogzy.rpg.dnd.character;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class AbilityScore
{
	@Getter
	private final Ability ability;

	@Getter
	private final int bonus;
}
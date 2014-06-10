package com.oogzy.rpg.dnd.character;

import junit.framework.TestCase;

import org.junit.Test;

import com.oogzy.rpg.dnd.character.race.RaceName;

public class CharacterTest extends TestCase
{
	@Test
	public void testNewChar()
	{
		Character character = new Character(RaceName.HUMAN);
		character.setName("CharTest");

		character.setAbility(Ability.STR, 10);
		character.setAbility(Ability.CON, 10);
		character.setAbility(Ability.DEX, 10);
		character.setAbility(Ability.INT, 10);
		character.setAbility(Ability.WIS, 10);
		character.setAbility(Ability.CHA, 10);
	}

	public void testGetOneHalfOfTheLevel()
	{
		Character character = new Character(RaceName.HUMAN);
		character.getOneHalfOfTheLevel();
	}
}
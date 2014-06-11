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

		int STR = 6;
		character.setAbility(Ability.STR, STR);
		assertEquals(STR, character.getAbility(Ability.STR));
		assertEquals(-2, character.getModifier(Ability.STR));

		int CON = 8;
		character.setAbility(Ability.CON, CON);
		assertEquals(CON, character.getAbility(Ability.CON));
		assertEquals(-1, character.getModifier(Ability.CON));

		int DEX = 12;
		character.setAbility(Ability.DEX, DEX);
		assertEquals(DEX, character.getAbility(Ability.DEX));
		assertEquals(1, character.getModifier(Ability.DEX));

		int INT = 14;
		character.setAbility(Ability.INT, INT);
		assertEquals(INT, character.getAbility(Ability.INT));
		assertEquals(2, character.getModifier(Ability.INT));

		int WIS = 16;
		character.setAbility(Ability.WIS, WIS);
		assertEquals(WIS, character.getAbility(Ability.WIS));
		assertEquals(3, character.getModifier(Ability.WIS));

		int CHA = 18;
		character.setAbility(Ability.CHA, CHA);
		assertEquals(CHA, character.getAbility(Ability.CHA));
		assertEquals(4, character.getModifier(Ability.CHA));
	}

	public void testGetOneHalfOfTheLevel()
	{
		Character character = new Character(RaceName.HUMAN);
		assertEquals(0, character.getOneHalfOfTheLevel());
	}
}
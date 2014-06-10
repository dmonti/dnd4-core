package com.oogzy.rpg.dnd.character;

import junit.framework.TestCase;

import org.junit.Test;

public class AbilitiesTest extends TestCase
{
	private Abilities abilities;

	protected void setUp() throws Exception
	{
		super.setUp();
		abilities = new Abilities();
	}

	@Test
	public void testSetAndGetAbility()
	{
		int newScore = 6;
		abilities.set(Ability.CON, newScore);
		int score = abilities.get(Ability.CON);

		assertEquals(newScore, score);
	}

	@Test
	public void testGetModifier()
	{
		int modifier;

		modifier = abilities.getModifier(Ability.CHA);
		assertEquals(0, modifier);

		abilities.set(Ability.CHA, 1);
		modifier = abilities.getModifier(Ability.CHA);
		assertEquals(-5, modifier);

		abilities.set(Ability.CHA, 7);
		modifier = abilities.getModifier(Ability.CHA);
		assertEquals(-2, modifier);

		abilities.set(Ability.CHA, 15);
		modifier = abilities.getModifier(Ability.CHA);
		assertEquals(2, modifier);

		abilities.set(Ability.CHA, 20);
		modifier = abilities.getModifier(Ability.CHA);
		assertEquals(5, modifier);
	}
}
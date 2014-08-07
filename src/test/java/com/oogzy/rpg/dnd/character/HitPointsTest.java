package com.oogzy.rpg.dnd.character;

import org.junit.Test;

import junit.framework.TestCase;

public class HitPointsTest extends TestCase
{
	@Test
	public void testBasicMethods()
	{
		final int INITIAL_HP = 10;
		HitPoints hp = new HitPoints(INITIAL_HP);
		assertEquals(INITIAL_HP, hp.getHitPoints());
		assertEquals("10/10", hp.toString());

		final int DAMAGE_POINTS = 2;
		hp.takeDamage(DAMAGE_POINTS);
		assertEquals(INITIAL_HP - DAMAGE_POINTS, hp.getHitPoints());
		assertEquals("8/10", hp.toString());

		final int HEAL_POINTS = 999999;
		hp.heal(HEAL_POINTS);
		assertEquals(INITIAL_HP, hp.getHitPoints());
		assertEquals("10/10", hp.toString());

		final int ADD_MAX_POINTS = 1;
		hp.addMaxHitPoints(ADD_MAX_POINTS);
		assertEquals(INITIAL_HP + ADD_MAX_POINTS, hp.getHitPoints());
		assertEquals(INITIAL_HP + ADD_MAX_POINTS, hp.getMaxHitPoints());
		assertEquals("11/11", hp.toString());
	}
}
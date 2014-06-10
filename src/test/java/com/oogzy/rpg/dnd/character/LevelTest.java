package com.oogzy.rpg.dnd.character;

import junit.framework.TestCase;

import org.junit.Test;

public class LevelTest extends TestCase
{
	private Level level;

	protected void setUp() throws Exception
	{
		level = new Level();
	}

	@Test
	public void testGetLevel()
	{
		assertEquals(1, level.value());

		level.addXP(999);
		assertEquals(1, level.value());

		level.addXP(1);
		assertEquals(2, level.value());

		level.addXP(1250);
		assertEquals(3, level.value());

		level.addXP(69000);
		assertEquals(16, level.value());

		level.addXP(14000);
		assertEquals(17, level.value());

		level.addXP(917000);
		assertEquals(30, level.value());
	}
}
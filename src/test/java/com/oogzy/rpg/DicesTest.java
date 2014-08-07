package com.oogzy.rpg;

import org.junit.Test;

import junit.framework.TestCase;

public class DicesTest extends TestCase
{
	private static final int ROLL_TIMES = 1000;

	@Test
	public void testToString()
	{
		Dice dice = new Dice(20);
		assertEquals("D20", dice.toString());
	}

	@Test
	public void testRoll()
	{
		for (int i = 0; i < ROLL_TIMES; i++)
		{
			int score = DicePack.getD20().roll();
			assertTrue(score >= 1 && score <= 20);
		}
	}

	@Test
	public void testRollXTimes()
	{
		for (int i = 0; i < ROLL_TIMES; i++)
		{
			int score = DicePack.getD20().roll(3);
			assertTrue(score >= 3 && score <= 60);
		}
	}
}
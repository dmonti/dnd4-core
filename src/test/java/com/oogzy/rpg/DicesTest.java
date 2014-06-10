package com.oogzy.rpg;

import org.junit.Test;

import junit.framework.TestCase;

public class DicesTest extends TestCase
{
	@Test
	public void testRoll()
	{
		int score = Dices.getD20().roll();
		assertTrue(score >= 1 && score <= 20);
	}

	@Test
	public void testRollXTimes()
	{
		int score = Dices.getD20().roll(3);
		assertTrue(score >= 3 && score <= 60);
	}
}
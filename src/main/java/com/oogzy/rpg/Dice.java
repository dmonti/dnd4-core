package com.oogzy.rpg;

import java.util.Random;

import lombok.Getter;

public class Dice
{
	private static final Random RANDOM = new Random();

	@Getter
	private final int sides;

	public Dice(int sides)
	{
		this.sides = sides;
	}

	public int roll(int timesToRoll)
	{
		int score = 0;
		for (int t = 0; t < timesToRoll; t++)
		{
			score += roll();
		}
		return score;
	}

	public int roll()
	{
		return RANDOM.nextInt(sides) + 1;
	}
}
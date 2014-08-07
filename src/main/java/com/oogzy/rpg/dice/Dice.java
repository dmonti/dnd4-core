package com.oogzy.rpg.dice;

import java.text.MessageFormat;
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

	public DiceResults roll(int timesToRoll)
	{
		int results[] = new int[timesToRoll];
		for (int t = 0; t < timesToRoll; t++)
		{
			results[t] = roll();
		}
		return new DiceResults(this, results);
	}

	public int roll()
	{
		return RANDOM.nextInt(sides) + 1;
	}

	@Override
	public String toString()
	{
		return MessageFormat.format("D{0}", getSides());
	}
}
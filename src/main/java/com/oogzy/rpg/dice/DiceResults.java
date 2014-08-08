package com.oogzy.rpg.dice;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DiceResults
{
	private Dice dice;

	private int[] rolls;

	public int sum()
	{
		int sum = 0;
		for (int value : getRolls())
		{
			sum += value;
		}
		return sum;
	}
}
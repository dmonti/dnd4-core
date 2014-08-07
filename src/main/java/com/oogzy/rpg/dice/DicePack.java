package com.oogzy.rpg.dice;

public class DicePack
{
	private static final Dice D4 = new Dice(4);
	private static final Dice D6 = new Dice(6);
	private static final Dice D8 = new Dice(8);
	private static final Dice D10 = new Dice(10);
	private static final Dice D12 = new Dice(12);
	private static final Dice D20 = new Dice(20);

	public static Dice getD4()
	{
		return D4;
	}

	public static Dice getD6()
	{
		return D6;
	}

	public static Dice getD8()
	{
		return D8;
	}

	public static Dice getD10()
	{
		return D10;
	}

	public static Dice getD12()
	{
		return D12;
	}

	public static Dice getD20()
	{
		return D20;
	}
}
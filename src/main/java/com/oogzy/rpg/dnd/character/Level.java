package com.oogzy.rpg.dnd.character;

import lombok.Getter;

public class Level
{
	@Getter
	private int totalXP;

	public void addXP(int xp)
	{
		this.totalXP += xp;
	}

	private static final int[] XP_LEVELS = new int[30];
	static
	{
		XP_LEVELS[0] = 0;
		XP_LEVELS[1] = 1000;
		XP_LEVELS[2] = 2250;
		XP_LEVELS[3] = 3750;
		XP_LEVELS[4] = 5500;
		XP_LEVELS[5] = 7500;
		XP_LEVELS[6] = 10000;
		XP_LEVELS[7] = 13000;
		XP_LEVELS[8] = 16500;
		XP_LEVELS[9] = 20500;
		XP_LEVELS[10] = 26000;
		XP_LEVELS[11] = 32000;
		XP_LEVELS[12] = 39000;
		XP_LEVELS[13] = 47000;
		XP_LEVELS[14] = 57000;
		XP_LEVELS[15] = 69000;
		XP_LEVELS[16] = 83000;
		XP_LEVELS[17] = 99000;
		XP_LEVELS[18] = 119000;
		XP_LEVELS[19] = 143000;
		XP_LEVELS[20] = 175000;
		XP_LEVELS[21] = 210000;
		XP_LEVELS[22] = 255000;
		XP_LEVELS[23] = 310000;
		XP_LEVELS[24] = 375000;
		XP_LEVELS[25] = 450000;
		XP_LEVELS[26] = 550000;
		XP_LEVELS[27] = 675000;
		XP_LEVELS[28] = 825000;
		XP_LEVELS[29] = 1000000;
	}

	public int current()
	{
		for (int level = 29; level >= 0; level--)
		{
			int xpNeeded = XP_LEVELS[level];
			if (getTotalXP() >= xpNeeded)
				return level + 1;
		}
		throw new RuntimeException("Error calculating player level with amout of " + getTotalXP() + "xp");
	}

	private static final int[] ABILITY_LEVELS = new int[9];
	static
	{
		ABILITY_LEVELS[0] = 1;
		ABILITY_LEVELS[1] = 4;
		ABILITY_LEVELS[2] = 8;
		ABILITY_LEVELS[3] = 11;
		ABILITY_LEVELS[4] = 14;
		ABILITY_LEVELS[5] = 18;
		ABILITY_LEVELS[6] = 21;
		ABILITY_LEVELS[7] = 24;
		ABILITY_LEVELS[8] = 28;
	}

	public boolean abilityScoreAvailable()
	{
		int level = current();
		for (int abilityLevel : ABILITY_LEVELS)
		{
			if (abilityLevel == level)
				return true;
		}
		return false;
	}
}
package com.oogzy.rpg.dnd.character;

import lombok.Data;

@Data
public class Level
{
	private int totalXP;

	private static final Integer[] LEVELS = new Integer[30];
	static
	{
		LEVELS[0] = 0;
		LEVELS[1] = 1000;
		LEVELS[2] = 2250;
		LEVELS[3] = 3750;
		LEVELS[4] = 5500;
		LEVELS[5] = 7500;
		LEVELS[6] = 10000;
		LEVELS[7] = 13000;
		LEVELS[8] = 16500;
		LEVELS[9] = 20500;
		LEVELS[10] = 26000;
		LEVELS[11] = 32000;
		LEVELS[12] = 39000;
		LEVELS[13] = 47000;
		LEVELS[14] = 57000;
		LEVELS[15] = 69000;
		LEVELS[16] = 83000;
		LEVELS[17] = 99000;
		LEVELS[18] = 119000;
		LEVELS[19] = 143000;
		LEVELS[20] = 175000;
		LEVELS[21] = 210000;
		LEVELS[22] = 255000;
		LEVELS[23] = 310000;
		LEVELS[24] = 375000;
		LEVELS[25] = 450000;
		LEVELS[26] = 550000;
		LEVELS[27] = 675000;
		LEVELS[28] = 825000;
		LEVELS[29] = 1000000;
	}

	public void addXP(int xp)
	{
		this.totalXP += xp;
	}

	public int value()
	{
		for (int level = 29; level >= 0; level--)
		{
			int xpNeeded = LEVELS[level];
			if (getTotalXP() >= xpNeeded)
				return level + 1;
		}
		throw new RuntimeException("Error calculating player level with amout of " + getTotalXP() + "xp");
	}
}
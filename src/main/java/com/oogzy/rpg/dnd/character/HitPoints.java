package com.oogzy.rpg.dnd.character;

import lombok.Data;

@Data
public class HitPoints
{
	private int maxHitPoints;

	private int hitPoints;

	public void heal(int hitPoints)
	{
		setHitPoints(getHitPoints() + hitPoints);
		if (getHitPoints() > getMaxHitPoints())
		{
			setHitPoints(getMaxHitPoints());
		}
	}

	public void takeDamage(int damage)
	{
		setHitPoints(getHitPoints() - damage);
	}

	@Override
	public String toString()
	{
		return new StringBuilder(getHitPoints()).append("/").append(getMaxHitPoints()).toString();
	}
}
package com.oogzy.rpg.dnd.character;

import java.text.MessageFormat;

import lombok.Getter;

public class HitPoints
{
	@Getter
	private int maxHitPoints;

	@Getter
	private int hitPoints;

	public HitPoints()
	{
	}

	public HitPoints(int maxHitPoints)
	{
		this();
		setMaxHitPoints(maxHitPoints);
		setHitPoints(maxHitPoints);
	}

	private void setMaxHitPoints(int maxHitPoints)
	{
		this.maxHitPoints = maxHitPoints;
	}

	private void setHitPoints(int hitPoints)
	{
		this.hitPoints = hitPoints;
	}

	public void addMaxHitPoints(int value)
	{
		int newMaxHitPoints = getMaxHitPoints() + value;
		setMaxHitPoints(newMaxHitPoints);
		heal(value);
	}

	public void heal(int value)
	{
		setHitPoints(getHitPoints() + value);
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
		return MessageFormat.format("{0}/{1}", getHitPoints(), getMaxHitPoints());
	}
}
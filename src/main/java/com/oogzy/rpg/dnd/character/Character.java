package com.oogzy.rpg.dnd.character;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.oogzy.rpg.dice.DicePack;
import com.oogzy.rpg.dnd.character.race.Race;
import com.oogzy.rpg.dnd.character.skill.Skill;
import com.oogzy.rpg.dnd.character.weapon.Weapon;
import com.oogzy.rpg.dnd.character.weapon.Weapons;
import com.oogzy.rpg.dnd.combat.Attack;

@Getter
public class Character
{
	@Setter
	private String name;

	private final Race race;

	private final Level level;

	private final Info info;

	private final Abilities abilities;

	private final HitPoints hitPoints;

	private final List<Skill> skills;

	@Setter
	private Weapon weapon;

	public Character(Race race)
	{
		this.race = race;
		this.info = new Info();
		this.level = new Level();
		this.abilities = new Abilities();
		this.hitPoints = new HitPoints(getAbility(Ability.CON));
		this.skills = new ArrayList<Skill>();
	}

	private Level getLevel()
	{
		return this.level;
	}

	private int level()
	{
		return getLevel().current();
	}

	public void addExperience(int xp)
	{
		getLevel().addXP(xp);
	}

	public Weapon getWeapon()
	{
		if (weapon == null)
			return Weapons.UNARMED_ATTACK;
		return weapon;
	}

	public Attack attack(Character target)
	{
		Attack attack = new Attack(this, target);
		if (attack.succeed())
		{
			int damage = rollDamage();
			target.hit(damage);
			attack.setDamage(damage);
		}
		return attack;
	}

	private int rollDamage()
	{
		int damage = getWeapon().getDamage().rollDamage();
		// TODO - Add proficiency bonus;
		return damage;
	}

	private void hit(int damage)
	{
		getHitPoints().takeDamage(damage);
	}

	public int rollAttack()
	{
		final int INSTANT_FAIL = 1;
		int diceResult = DicePack.getD20().roll();
		if (diceResult <= INSTANT_FAIL)
			return INSTANT_FAIL;

		// TODO - Situational attack modifiers (page 279) that apply;
		// TODO - Bonuses and penalties from powers affecting you;
		return diceResult + getBaseAttackBonus();
	}

	public int rollInitiative()
	{
		int d20Value = DicePack.getD20().roll();
		return d20Value + getInitiative();
	}

	public int getInitiative()
	{
		int initiative = getOneHalfOfTheLevel() + getModifier(Ability.DEX);
		// TODO - Add any bonuses or penalties that apply
		return initiative;
	}

	public int getBaseAttackBonus()
	{
		final int BASE_ATTACK = 10;
		int baseAttackBonus = BASE_ATTACK + getOneHalfOfTheLevel();
		if (getWeapon() != null)
		{
			// TODO - Check if character has this weapon proficiency.
			baseAttackBonus += getWeapon().getProficiency();
		}
		return baseAttackBonus;
	}

	public int getBaseDefense()
	{
		final int BASE_DEFENSE = 10;
		return BASE_DEFENSE + getOneHalfOfTheLevel();
	}

	public int getArmorClass()
	{
		int armorClass = getBaseDefense();
		// TODO - Add Shield bonus
		// TODO - Class bonus
		// TODO - Racial bonus

		// if light armor or no armor
		{
			int intModifier = getModifier(Ability.INT);
			int dexModifier = getModifier(Ability.DEX);
			armorClass += Math.max(intModifier, dexModifier);
		}
		// TODO - else add Heavy armor bonus

		return armorClass;
	}

	public int getFortitude()
	{
		int strModifier = getModifier(Ability.STR);
		int conModifier = getModifier(Ability.CON);
		return getBaseDefense() + Math.max(strModifier, conModifier);
	}

	public int getReflex()
	{
		int intModifier = getModifier(Ability.INT);
		int dexModifier = getModifier(Ability.DEX);
		// TODO - Add Shield bonus
		return getBaseDefense() + Math.max(intModifier, dexModifier);
	}

	public int getWill()
	{
		int wisModifier = getModifier(Ability.WIS);
		int chaModifier = getModifier(Ability.CHA);
		return getBaseDefense() + Math.max(wisModifier, chaModifier);
	}

	protected int getOneHalfOfTheLevel()
	{
		return (int) Math.ceil(level() / 2);
	}

	public int getModifier(Ability ability)
	{
		return getAbilities().getModifier(ability);
	}

	public int getAbility(Ability ability)
	{
		return getAbilities().get(ability);
	}

	public void setAbility(Ability ability, int value)
	{
		getAbilities().set(ability, value);
	}
}
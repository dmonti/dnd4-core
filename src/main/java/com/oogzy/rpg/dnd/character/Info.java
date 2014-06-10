package com.oogzy.rpg.dnd.character;

import lombok.Data;

@Data
public class Info
{
	private Class vocationClass;

	private int age;

	private Gender gender;

	private float height;

	private float weight;
}
package models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractWeapon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String prefix;
    private String name;
    private String type;
    private String subType;
    private String level;
    private String rarity;
    private String damage;
    private String element;
    private int statusEffectChance;

}

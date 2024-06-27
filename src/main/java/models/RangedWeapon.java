package models;

import jakarta.persistence.Entity;

@Entity
public class RangedWeapon extends AbstractWeapon {

    private String optic;
    private String barrel;
    private String magazine;
    private String accessory;

}

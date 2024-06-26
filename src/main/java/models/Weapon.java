package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@Entity
public class Weapon {

    @Id
    private int id;
    private String type;
    private String subType;
    private String rarity;
    private String damage;
    private String accuracy;
    private String element;
    private int statusEffectChance;

}

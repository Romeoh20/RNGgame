package data;

import models.AbstractWeapon;
import org.springframework.data.repository.CrudRepository;

public interface WeaponRepository extends CrudRepository<AbstractWeapon,Integer> {
}

package services;

import models.jsonObjects.RangedWeapon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface JsonService {

    public List<RangedWeapon> RangedWeaponsToList() throws IOException;

}

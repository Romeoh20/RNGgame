package com.romeoh20.RNGgame.services;

import com.romeoh20.RNGgame.models.jsonObjects.RangedWeapon;

import java.io.IOException;
import java.util.List;

public interface JsonService {

    public List<RangedWeapon> RangedWeaponsToList() throws IOException;

}

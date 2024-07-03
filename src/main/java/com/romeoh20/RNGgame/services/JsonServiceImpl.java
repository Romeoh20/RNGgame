package com.romeoh20.RNGgame.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.romeoh20.RNGgame.models.jsonObjects.RangedWeapon;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class JsonServiceImpl implements JsonService{

    @Override
    public List<RangedWeapon> RangedWeaponsToList() throws IOException {

        File file = new File("src/main/resources/json/RangedWeapons.json");

        ObjectMapper mapper = new ObjectMapper();

        List<RangedWeapon> dataList = Arrays.asList(mapper.readValue(file,RangedWeapon[].class));

        return dataList;
    }
}

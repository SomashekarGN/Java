package com.xworkz.singleton.util;

import com.xworkz.singleton.dto.ContinentDTO;

public class ContinentUtil {


    private static ContinentDTO continentDTO=new ContinentDTO();;

    public static ContinentDTO getContinent()
    {
        return continentDTO;
    }
}

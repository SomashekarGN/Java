package com.xworkz.singleton;

import com.xworkz.singleton.dto.ContinentDTO;
import com.xworkz.singleton.util.ContinentUtil;

public class ContinentRunner {

    public static void main(String[] args) {

        ContinentDTO dto= ContinentUtil.getContinent();
        dto.setContinentName("Asia");
        dto.setLocation("Southern hemisphere");
        dto.setNoOfCounties(48);
        dto.setAreaInSqKm(44.58);


        System.out.println(dto);

        ContinentDTO dto1= ContinentUtil.getContinent();
        dto1.setContinentName("Australia");
        dto1.setLocation("Northern hemisphere");
        dto1.setNoOfCounties(1);
        dto.setAreaInSqKm(7.692);


        System.out.println(dto1);


    }
}

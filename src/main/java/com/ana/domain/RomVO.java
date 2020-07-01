package com.ana.domain;

import lombok.Data;

@Data
public class RomVO {
   
   private String romNum;
   private String acmNum;
   private String roomName;
   private Integer capacity;
   private String bedType;
   private Integer bedCnt;
   private Integer romSize;
   private Integer price;
   private String romPurl;
   private String romLocaInfo;
}


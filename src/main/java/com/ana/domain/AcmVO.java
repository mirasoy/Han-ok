package com.ana.domain;

import java.util.Date;

import lombok.Data;

@Data
public class AcmVO {
	
	private String acmNum;
	private String acmName;
	private String acmCity;
	private String acmDistr;
	private String acmDetailaddr;
	
	private String repPhone;
	private String bizRegnum;
	private String checkinTime;
	private String checkoutTime;
	private Date acmRegdate;
	
	private Date acmUpdatedate;
	private String subPhone;
	private String acmFax;
	private String acmEmail;
	private String acmDesc;
	
	private String acmPurl;
	private String acmPname;
	private String latitude;
	private String longitude;
	private String acmType;
	
	private String acmActi;
	private String acmStatus;
	private Integer acmOptcode;
	
	private RomVO rom;

}

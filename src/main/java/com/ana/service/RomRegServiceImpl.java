package com.ana.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ana.domain.RomVO;
import com.ana.mapper.RomRegMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class RomRegServiceImpl implements RomRegService{
	@Setter(onMethod_= {@Autowired})
	private RomRegMapper mapper;
	
	
	@Override//뿌려주기
	public List<RomVO> getList(String acmNum) {
		System.out.println("service단에서"+acmNum);
		
		List<RomVO> lists=mapper.getList(acmNum);
		return lists;
	}
	
	
	@Transactional
	@Override
	public int register(RomVO rom) {//등록이를 하자
		rom.setRomPurl("C:\\upload\\room\\");
		rom.setRomPname("room_p_50.jpg");
		
		System.out.println("romReg:"+rom.toString());
		
		
		return mapper.registerRom(rom);//객실추가
	}


	@Override
	public RomVO getRom(String romNum) {
		RomVO vo = mapper.getRom(romNum); 
		return vo;
	}


	@Override
	public boolean remove(String romNum) {//객실 지우기
		return mapper.remove(romNum)==1;
	}


	@Override
	public boolean modify(RomVO rom) {
		
		
		return mapper.modify(rom)==1;
	}

	
	
	
	

	

}

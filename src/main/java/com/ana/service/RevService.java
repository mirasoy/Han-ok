package com.ana.service;

import java.util.List;

import com.ana.domain.RevPostVO;
import com.ana.domain.RevVO;

public interface RevService {
	
	public void register(RevVO post);
	
	public RevVO get(String postNum);
	
	public boolean modify(RevVO post);
	
	public boolean remove(String postNum);
	
	public List<RevPostVO> getList();

}

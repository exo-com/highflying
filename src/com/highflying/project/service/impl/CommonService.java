package com.highflying.project.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.highflying.dto.CommonDto;
import com.highflying.project.dao.ICommonDao;
import com.highflying.project.service.ICommonService;

@Service(value="commonService")
public class CommonService implements ICommonService{
	@Resource(name = "commonDao")
	private ICommonDao commonDao;
	
	@Override
	public CommonDto getCommonDto(){
		return commonDao.getCommonDto();
	}
	
	@Override
	public void setCommonDto(CommonDto cDto){
		commonDao.setCommonDto(cDto);
	}
}

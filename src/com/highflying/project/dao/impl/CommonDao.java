package com.highflying.project.dao.impl;

import org.springframework.stereotype.Repository;

import com.highflying.dto.CommonDto;
import com.highflying.project.common.HighflyJdbcDaoSupport;
import com.highflying.project.dao.ICommonDao;

@Repository
public class CommonDao extends HighflyJdbcDaoSupport implements ICommonDao{
	private CommonDto cDto;
	
	@Override
	public CommonDto getCommonDto(){
		return cDto;
	}
	
	@Override
	public void setCommonDto(CommonDto cDto){
		this.cDto = cDto;
	}
}

package com.highflying.project.dao.impl;

import org.springframework.stereotype.Repository;

import com.highflying.dto.BoardDto;
import com.highflying.project.dao.IBoardDao;
@Repository
public class BoardDao implements IBoardDao{
	private BoardDto bDto;
	@Override
	public BoardDto getBoardDto() {
		// TODO Auto-generated method stub
		return bDto;
	}

	@Override
	public void setBoardDto(BoardDto bDto) {
		// TODO Auto-generated method stub
		this.bDto = bDto;
	}

}

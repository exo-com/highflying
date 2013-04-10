package com.highflying.project.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.highflying.dto.BoardDto;
import com.highflying.project.dao.IBoardDao;
import com.highflying.project.service.IBoardService;

@Service(value = "boardService")
public class BoardService implements IBoardService{
	@Resource(name = "boardDao")
	private IBoardDao boardDao;
	
	@Override
	public BoardDto getBoardDto(){
		return boardDao.getBoardDto();
	}
	
	@Override
	public void setBoardDto(BoardDto bDto){
		boardDao.setBoardDto(bDto);
	}
}

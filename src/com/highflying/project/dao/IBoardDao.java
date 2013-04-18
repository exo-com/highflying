package com.highflying.project.dao;

import java.util.List;

import com.highflying.dto.BoardDto;

public interface IBoardDao {
	BoardDto getBoardDto();
	
	void setBoardDto(BoardDto bDto);
	
	public List<BoardDto> qnaList();
}

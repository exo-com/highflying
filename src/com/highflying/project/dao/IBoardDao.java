package com.highflying.project.dao;

import com.highflying.dto.BoardDto;

public interface IBoardDao {
	BoardDto getBoardDto();
	
	void setBoardDto(BoardDto bDto);
}

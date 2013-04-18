package com.highflying.project.service;

import java.util.List;

import com.highflying.dto.BoardDto;

public interface IBoardService {
	BoardDto getBoardDto();
	
	void setBoardDto(BoardDto bDto);
	
	public List<BoardDto> qnaList();
}

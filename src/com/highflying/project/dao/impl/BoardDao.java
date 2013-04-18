package com.highflying.project.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.highflying.dto.BoardDto;
import com.highflying.project.common.HighflyJdbcDaoSupport;
import com.highflying.project.dao.IBoardDao;
@Repository
public class BoardDao extends HighflyJdbcDaoSupport implements IBoardDao{
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

	@Override
	public List<BoardDto> qnaList() {
		// TODO Auto-generated method stub
		List<BoardDto> result = null;
		try {
			result = (List<BoardDto>)sqlMapClient.queryForList("boardSql.qnaList");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}

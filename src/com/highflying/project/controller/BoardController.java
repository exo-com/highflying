package com.highflying.project.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.highflying.project.service.IBoardService;

@Controller
public class BoardController {
	public ModelAndView mav;
	
	@Resource(name = "boardService")
	public IBoardService boardService;
	
	@RequestMapping(value = "qna_board.do")
	public ModelAndView board2(){
		mav = new ModelAndView();
		mav.addObject("qnaList", boardService.qnaList());
		
		mav.setViewName("./board/board_qna");
		return mav;
	}
}

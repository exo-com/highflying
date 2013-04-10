package com.highflying.project.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.highflying.project.service.ICommonService;

@Controller
public class CommonController {
	public ModelAndView mav;
	
	@Resource(name="commonService")
	public ICommonService commonService;
	
	@RequestMapping("index.do")
	public ModelAndView indexMethod(){
		System.err.println("console === >>> indexMethod");
		mav = new ModelAndView();
		
		mav.setViewName("index");
		
		return mav;
	}
	@RequestMapping("gallery_main.do")
	public ModelAndView galleryMainMethod(){
		System.err.println("console === >>> galleryMainMethod");
		mav = new ModelAndView();
		
		mav.setViewName("./gallery/gallery_main");
		
		return mav;
	}
	@RequestMapping("video_main.do")
	public ModelAndView videoMainMethod(){
		System.err.println("console === >>> videoMainMethod");
		mav = new ModelAndView();
		
		mav.setViewName("./videos/video_main");
		
		return mav;
	}
	@RequestMapping("portfolio_main.do")
	public ModelAndView portfolioMainMethod(){
		System.err.println("console === >>> portfolioMainMethod");
		mav = new ModelAndView();
		
		mav.setViewName("./portfolio/portfolio_main");
		
		return mav;
	}
	@RequestMapping("board_main.do")
	public ModelAndView boardMainMethod(){
		System.err.println("console === >>> boardMainMethod");
		mav = new ModelAndView();
		
		mav.setViewName("./board/board_main");
		
		return mav;
	}
	
	@RequestMapping("detail.do")
	public ModelAndView detailMethod(){
		System.err.println("console === >>> detailMethod");
		mav = new ModelAndView();
		
		mav.setViewName("./gallery/detail");
		
		return mav;
	}
	
	@RequestMapping("modal.do")
	public ModelAndView modalMethod(){
		System.err.println("console === >>> modalMethod");
		mav = new ModelAndView();
		
		mav.setViewName("./common/modal");
		
		return mav;
	}

}

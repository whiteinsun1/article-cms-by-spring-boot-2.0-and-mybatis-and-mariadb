package com.sbs.starter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sbs.starter.dto.Article;
import com.sbs.starter.service.ArticleService;

import groovy.util.logging.Slf4j;
import jline.internal.Log;

@Controller
@Slf4j //이걸 해야 log.info(..)가 가능, 디버깅 용도.
public class ArticleController {
	
	@Autowired
	ArticleService articleService;
	
	@RequestMapping("/article/list")
	public String showList(Model aModel) {
		
		List<Article> list = articleService.getList();
		
		//Log.info("list : " + list);
		aModel.addAttribute("list", list);
		//request.setAttribute("list", list);와 똑같은 표현!
		
		return "article/list";
	}
}

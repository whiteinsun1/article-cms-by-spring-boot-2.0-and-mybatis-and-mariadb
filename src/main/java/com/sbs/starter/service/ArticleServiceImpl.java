package com.sbs.starter.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbs.starter.dao.ArticleDao;
import com.sbs.starter.dto.Article;


@Service
public class ArticleServiceImpl implements ArticleService {
	//이제 가짜 이미지 말고, articleService는 데이터 관련해서는 모두 Dao에게 위임
	@Autowired
	ArticleDao articleDao;
	
	public List<Article> getList() {

		//이건 중간 확인용 가짜 데이터 입니다!!!!
		/*
		 * Article artticle1 = new Article(1, "2019-08-20 12:12:12", "제목1", "내용1");
		 * Article artticle2 = new Article(2, "2019-08-20 12:12:13", "제목2", "내용2");
		 * Article artticle3 = new Article(3, "2019-08-20 12:12:14", "제목3", "내용3");
		 * 
		 * List<Article> list = new ArrayList<>();
		 * 
		 * list.add(artticle3); list.add(artticle2); list.add(artticle1);
		 * 
		 * return list;
		 */
		
		return articleDao.getList();
	}
}

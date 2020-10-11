package com.sbs.starter.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sbs.starter.dto.Article;

@Component //이렇게 해야 Autowired에 의한 연결에 적용됨.
public class ArticleDaoImpl implements ArticleDao {

	public List<Article> getList() {
		
		Article artticle1 = new Article(1, "2019-08-20 12:12:12", "제목111", "내용111");
		Article artticle2 = new Article(2, "2019-08-20 12:12:13", "제목222", "내용222");
		Article artticle3 = new Article(3, "2019-08-20 12:12:14", "제목322", "내용333");

		List<Article> list = new ArrayList<>();

		list.add(artticle3);
		list.add(artticle2);
		list.add(artticle1);

		return list;
	}
}

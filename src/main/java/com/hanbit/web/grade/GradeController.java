package com.hanbit.web.grade;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/grade")
public class GradeController {
	private static final Logger logger = LoggerFactory.getLogger(GradeController.class);

	@RequestMapping("/main")
	public String moveMain(Locale locale,Model model){
		logger.info("GradeController moveMain() locale is {}",locale);
		return "grade/content.tiles";
	}
	@RequestMapping("/count")
	public String moveCount(Locale locale,Model model){
		logger.info("GradeController moveCount() locale is {}",locale);
		return "grade/count.tiles";
	}
	@RequestMapping("/delete")
	public String moveDelete(Locale locale,Model model){
		logger.info("GradeController moveMain() locale is {}",locale);
		return "grade/delete.tiles";
	}
	@RequestMapping("/regist")
	public String moveRegist(Locale locale,Model model){
		logger.info("GradeController moveRegist() locale is {}",locale);
		return "grade/regist.tiles";
	}
	@RequestMapping("/search")
	public String moveSearch(Locale locale,Model model){
		logger.info("GradeController moveSearch() locale is {}",locale);
		return "grade/search.tiles";
	}
	@RequestMapping("/update")
	public String moveUpdate(Locale locale,Model model){
		logger.info("GradeController moveMain() locale is {}",locale);
		return "grade/update.tiles";
	}
	
	
}

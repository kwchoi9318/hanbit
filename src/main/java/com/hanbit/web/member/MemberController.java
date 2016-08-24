package com.hanbit.web.member;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/member")
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	   
	   @RequestMapping("/main")
	   public String goMain(Locale locale, Model model) {
	      logger.info("MemberController goMain() locale is {}.", locale);
	      
	      return "member/content.tiles";
	   }
	   @RequestMapping("/regist")
	   public String goRegist(Locale locale, Model model) {
	      logger.info("MemberController goRegist() locale is {}.", locale);
	      
	      return "member/regist.tiles";
	   }
	   @RequestMapping("/detail")
	   public String moveDetail(Locale locale, Model model) {
	      logger.info("MemberController moveDetail() locale is {}.", locale);
	      
	      return "member/detail.tiles";
	   } 
	   @RequestMapping("/update")
	   public String moveUpdate(Locale locale, Model model) {
	      logger.info("MemberController moveUpdate locale is {}.", locale);
	      
	      return "member/update.tiles";
	   }
	   @RequestMapping("/delete")
	   public String moveDelete(Locale locale, Model model) {
	      logger.info("MemberController moveDelete locale is {}.", locale);
	      
	      return "member/delete.tiles";
	   } 
	   @RequestMapping("/login")
	   public String moveLogin(Locale locale, Model model) {
	      logger.info("MemberController moveLogin locale is {}.", locale);
	      
	      return "member/login.tiles";
	   } 
	   @RequestMapping("/logout")
	   public String moveLogout(Locale locale, Model model) {
	      logger.info("MemberController moveLogout locale is {}.", locale);
	      
	      return "member/logout.tiles";
	   } 
	   @RequestMapping("/list")
	   public String moveList(Locale locale, Model model) {
	      logger.info("MemberController moveList locale is {}.", locale);
	      
	      return "member/list.tiles";
	   } 
	   @RequestMapping("/find_by")
	   public String moveFindBy(Locale locale, Model model) {
	      logger.info("MemberController moveFindBy locale is {}.", locale);
	      
	      return "member/find_by.tiles";
	   } 
	   @RequestMapping("/count")
	   public String moveCount(Locale locale, Model model) {
	      logger.info("MemberController moveCount locale is {}.", locale);
	      
	      return "member/count.tiles";
	   }
	}
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="grade_content">
	
	<h1 id="title">성적 관리</h1>
	<article>
	<ol>
		<li><a href="#" id="a_regist">등록</a></li>
		<li><a href="#" id="a_update">수정</a></li>
		<li><a href="#" id="a_delete">삭제</a></li>
		<li><a href="#" id="a_list">목록 </a></li>
		<li><a href="#" id="a_count">카운트</a></li>
		<li><a href="#" id="a_find">검색 </a></li>
	</ol>
	</div>
	<a href="../index.jsp">
		<img id="img_home" src="../img/home.png" alt="home" style="width: 30px"/>
	</a>
</article>
<script type="text/javascript">
$(function(){
	$('#grade_content').addClass('box');
	$('#img_home').css('width','30px');
	$('#grade_content>article')
	.css('width','300px')
	.css('text-align','left')
	.css('margin','0 auto');
	$('#title').css('font-size','40px');
	$('#a_regist').click(function() {
		location.href = "${context}/grade/regist.do";
	});
	$('#a_update').click(function() {
		location.href ="${context}/grade/update.do";
	});
	$('#a_delete').click(function() {
		location.href = "${context}/grade/delete.do";
	});
	$('#a_list').click(function() {
		location.href = "${context}/grade/list.do";
	});
	$('#a_count').click(function() {
		location.href = "${context}/grade/count.do";
	});
	$('#a_find').click(function() {
		location.href = "${context}/grade/search.do";
	});
});
</script>


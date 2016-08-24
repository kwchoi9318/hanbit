var member = (function(){
	return {
		init : function(){
			$('#regist').click(function(){location.href = app.context()+"/member/regist"});
			$('#detail').click(function(){location.href = app.context()+"/member/detail"});
			$('#update').click(function(){location.href = app.context()+"/member/update"});
			$('#delete').click(function(){location.href = app.context()+"/member/delete"});
			$('#login').click(function(){location.href = app.context()+"/member/login"});
			$('#logout').click(function(){location.href = app.context()+"/member/logout"});
			$('#list').click(function(){location.href = app.context()+"/member/list"});
			$('#find_by').click(function(){location.href = app.context()+"/member/find_by"});
			$('#count').click(function(){location.href = app.context()+"/member/count"});
			$('#member_content_img_home').attr('src',app.img()+'/home.png').css('width','30px');
			$('#member_content_a_home').click(function(){location.href=app.context()+"/"});
			$('#member_content>article').css('width','300px').addClass('center').addClass('text_left');
				$('#member_content>article a').css('font_size','15px').addClass('cursor');	
			$('#member_content>h1').text('MEMBER MGMT');
			$('#member_content_ol>li>a').addClass('remove_underline');
			$('#member_content_ol>li:first>a').text('SIGN UP');
			$('#member_content_ol>li:nth-child(2)>a').text('user detail');
			$('#member_content_ol>li:nth-child(3)>a').text('update user info');
			$('#member_content_ol>li:nth-child(4)>a').text('delete account');
			$('#member_content_ol>li:nth-child(5)>a').text('sign in');
			$('#member_content_ol>li:nth-child(6)>a').text('sign out');
			$('#member_content_ol>li:nth-child(7)>a').text('list all accounts');
			$('#member_content_ol>li:nth-child(8)>a').text('search by');
			$('#member_content_ol>li:nth-child(9)>a').text('user count');
		}
		};
	
})();
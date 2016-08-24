var app = (function(){
	var init = function(context) {
		sessionStorage.setItem('context',context);
		app.move();
	};
	var context = function(){
		return sessionStorage.getItem('context');
	};
	var to_douglas = function() {
		location.href=app.context()+"/douglas.do";
	};
	var move = function(){
		$('#title').click(function(){
			location.href= app.context()+"/";
		});
		$('#a_member').click(function() {
			location.href = app.context()+"/member/main";
		}),
		$('#a_account').click(function() {
			location.href = app.context()+"/account/main";
		}),
		$('#a_grade').click(function() {
			location.href = app.context()+"/grade/main";
		})
	}
	return {
		init : init,
		to_douglas : to_douglas,
		move : move,
		context : context
	};
})();


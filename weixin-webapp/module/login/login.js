mui.init();

document.getElementById('login').addEventListener('tap', function() {
	var usernameInput = document.querySelector('input[name="username"]');
	var passwordInput = document.querySelector('input[name="password"]');

	var usernameValue = usernameInput.value;
	var passwordValue = passwordInput.value;

	if(!usernameValue || !passwordValue) {
		mui.toast("账户或密码未输入");
		return;
	}

	mui.ajax("https://dbjco2q8.api.lncld.net/1.1/login", {
		type: "post",
		data: {
			"username": usernameValue,
			"password": passwordValue
		},
		headers: {
			"X-LC-Id": "dBJCO2Q8V3OU2WraiaQA8j3M-gzGzoHsz",
			"X-LC-Key": "m0DtTvFIupbmBODYec5G7mnO"
		},
		success:function(respon){
			debugger
			mui.toast("登录成功")
		},
		error:function(err){
			debugger
			mui.toast("账户或密码输入错误")
		}
	});

});
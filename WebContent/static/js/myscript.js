var $loginForm = $('#loginForm'),
    $loginButton = $('#loginButton');



function showLoginForm() {
	$loginForm.slideToggle();
	return false;
	
}

//Eventos
(function () {
	$loginForm.slideUp(1);
})();


$loginButton.click(showLoginForm);
var myApp=angular.module("myApp",["ngRoute"]);

myApp.config(function($routeProvider)
{
	alter("Route Provider")
	$routeProvider.when("/",{templateUrl:"/index.html"})
					.when("/login",{templateUrl:"template/Login.html"})
					.when("/register",{templateUrl:"template/Register.html"})
					.when("/UserHome",{templateUrl:"template/AboutUs.html"})
					.when("/UserHome",{templateUrl:"template/ContactUs.html"})
				
});

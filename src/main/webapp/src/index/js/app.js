$(function()
{		
	
});

function signIn(){
	console.log("Hello, I am here")

	$.post("/SMSSC/AppRequestHandler",
	{
		className: "signIn",
	});
	
}
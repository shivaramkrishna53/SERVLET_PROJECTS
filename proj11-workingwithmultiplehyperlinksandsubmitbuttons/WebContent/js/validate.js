function val(frm)
{
	let num1=frm.first.value;
	let num2=frm.second.value;
	let flag=true;
	//empty or not validation
	if(num1==""||num1.length==0)
	{
		alert("first number cannot be empty");
		flag=false;
	}
	if(num2==""||num2.length==0)
	{
		alert("second number cannot be empty");
		flag=false;
	}
	//checking for not a number or not
	if(isNaN(num1))
	{
		alert("first number need to be numeric only");
		flag=false;
	}
	if(isNaN(num2))
	{
		alert("second number need to be numeric only");
		flag=false;
	}
	
	return flag;
}
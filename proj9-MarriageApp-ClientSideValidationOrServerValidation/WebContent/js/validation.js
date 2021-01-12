function validate(frm) {
let name=frm.pname.value;
let age=frm.page.value;
let gender=frm.gender.value;
let flag=true;
let hid;

if(name=="" || name.length==0)
{
	alert("Name cannot be empty");
frm.pname.focus();
flag=false;
}
else
if(name.length<5)
{
alert("Name cannot be less than 5 characters");
frm.pname.focus();
flag=false;
}

if(age=="" || age.length==0)
{
alert("age cannot be empty");
frm.page.focus();
flag=false;
}
else
if(isNaN(age))
{
flag=false;
alert("age cannot be string only numeric is allowed")
}
else
if(age<0 || age>150)
{
alert("Age should be in between 0 and 150");
frm.page.focus();
flag=false;
}
frm.hid.value="true";
return flag;
}
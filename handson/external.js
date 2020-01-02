function validate(){
var empt= document.getElementById("fname").value;
var pasw=document.getElementById("pass").value;
var l=empt.length;
var l1=pasw.length;
var flag=0;
if (empt==""){
flag=1;
alert("Name cannot be empty");
}
else if(l<=2||l>30)
{
flag=1;
alert("Name length should be between 2 to 30 characters");
}
for(var i=0;i<l;i++)
{
if(empt.charAt(i)=="@"||empt.charAt(i)=="$"||empt.charAt(i)=="#"||empt.charAt(i)=="&"||empt.charAt(i)=="%"||empt.charAt(i)=="*")
{
flag=1;
alert("Name cannot contain special characters");
}
}
for(var i=0;i<l;i++)
{
if(empt.charAt(i)=="1"||empt.charAt(i)=="2"||empt.charAt(i)=="3"||empt.charAt(i)=="4"||empt.charAt(i)=="5"||empt.charAt(i)=="6"||empt.charAt(i)=="7"||empt.charAt(i)=="8"||empt.charAt(i)=="9"||empt.charAt(i)=="0")
{
flag=1;
alert("Name cannot have numbers");
}
}
if (pasw=="")
{
flag=1;
alert("Password cannot be empty");
}
if(flag==0)
{
 alert("Details Submitted Successfully");
}
}
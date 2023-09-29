function move()
{
 var x=document.getElementById("x").value;
 var y=document.getElementById("y").value;

 var dom=document.getElementById("img").style;

 dom.left=x+"px";
 dom.top=y+"px";
}

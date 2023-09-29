var dom,x,y,finalx=300,finaly=300;

function init()
{
 dom=document.getElementById("txt").style;
 x=dom.left;
 y=dom.top;
 x=x.match(/\d+/);
 y=y.match(/\d+/);
 moveit(x,y);
}
function moveit(x,y)
{
 if(x!=finalx)
  if(x>finalx) x--;
  else
    if(x<finalx) x++;

 if(y!=finaly)
  if(y>finaly) y--;
  else
    if(y<finaly) y++;

dom.left=x+"px";
dom.top=y+"px";

if((x!=finalx) || (y!=finaly))
{
  
 setTimeout("moveit("+x+","+y+")",1);
}
}

 
tp="first";
function totop(newtp)
{

 dom1=document.getElementById(tp).style;
 dom2=document.getElementById(newtp).style;
 
 dom1.zIndex="0";
 dom2.zIndex="10";
 
 tp=newtp;
 
 
}


var diffX,diffY,theElement;

function grab(evnt)
{
 theElement=evnt.currentTarget;
var posX=parseInt(theElement.style.left);
var posY=parseInt(theElement.style.top);
diffX=evnt.clientX-posX;
diffY=evnt.clientY-posY;

document.addEventListener("mousemove",mover);
document.addEventListener("mouseup",dropper);
}
function mover(evnt)
{
 theElement.style.left=
		(evnt.clientX-diffX)+"px";
 theElement.style.top=
		(evnt.clientY-diffY)+"px";
}

function dropper(evnt)
{

document.removeEventListener("mouseup",dropper);
document.removeEventListener("mousemove",mover);}
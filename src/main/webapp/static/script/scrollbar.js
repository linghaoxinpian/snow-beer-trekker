var scroller  = null;
var scrollbar = null;
var scrollTween = null;
var set_one = [0,1,3,6,10,15,21,28,36,45,55,64,72,79,85,90,94,97,99,100];
var set_two = [0,25,50,70,85,95,97,99,100];
var set_three = [0,10,20,30,40,50,60,70,80,90,100];
var set_four = [0,25,50,70,85,95,100,105,101,97,100,99,100];

window.onload = function () {
	scroller  = new jsScroller(document.getElementById("News"), 500, 180);
	scrollbar = new jsScrollbar (document.getElementById("Scrollbar-Container"), scroller, true, scrollbarEvent);
	scrollTween = new jsScrollerTween (scrollbar, true);
	scrollbar._scrollDist = 10;
}

function swapSteps (w) {
	scrollTween.steps = w;
}

function scrollbarEvent (o, type) {
	if (type == "mousedown") {
		if (o.className == "Scrollbar-Track") o.style.backgroundColor = "";
		else o.style.backgroundColor = "";
	} else {
		if (o.className == "Scrollbar-Track") o.style.backgroundColor = "";
		else o.style.backgroundColor = "";
	}
}

function swapIt(o) {
	o.blur();
	if (o.className == "current") return false;
  
	var list = document.getElementById("Navigation").getElementsByTagName("a");
	for (var i = 0; i < list.length; i++) {
		if (list[i].className == "current") {
			list[i].className = "";
			document.getElementById(list[i].title).y = -scroller._y;
		}
		if (list[i].title == o.title) o.className = "current";
	}
  
	list = document.getElementById("Container").childNodes;
	for (var i = 0; i < list.length; i++) {
		if (list[i].tagName == "DIV") list[i].style.display = "none";
	}
  
	var top = document.getElementById(o.title);
	top.style.display = "block";
	scrollbar.swapContent(top);
	if (top.y) scrollbar.scrollTo(0, top.y);
  
	return false;
}

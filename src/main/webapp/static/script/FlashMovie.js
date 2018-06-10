

function FlashMovie(){	
  this.width=302;
  this.height=217;
  this.textHeight=25;
  this.flashHeight=this.height+this.textHeight;
  this.pics='';
  this.links='';
  this.texts='';

  this.add=function(pic,link,text){
	  if(this.pics!='')this.pics+='|';
	  this.pics+=pic;

	  if(this.links!='')this.links+='|';
	  this.links+=link;

	  if(this.texts!='')this.texts+='|';
	  this.texts+=text;
  }

  this.play = function(){	 
    this.flashHeight=this.height + this.textHeight;
    document.writeln('<object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" codebase="http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,0,0" width="'+ this.width +'" height="'+ this.flashHeight +'">');
	document.writeln('<param name="allowScriptAccess" value="sameDomain">');
	document.writeln('<param name="movie" value="media/flash_focus.swf">');
	document.writeln('<param name="quality" value="high">');
	document.writeln('<param name="bgcolor" value="#ebebeb">');
	document.writeln('<param name="menu" value="false">');
	document.writeln('<param name=wmode value="opaque">');
	document.writeln('<param name="FlashVars" value="pics='+this.pics+'&links='+this.links+'&texts='+this.texts+'&borderwidth='+this.width+'&borderheight='+this.height+'&textheight='+this.textHeight+'">');
	document.writeln('<embed src="media/flash_focus.swf" wmode="opaque" FlashVars="pics='+this.pics+'&links='+this.links+'&texts='+this.texts+'&borderwidth='+this.width+'&borderheight='+this.height+'&textheight='+this.textHeight+'" menu="false"  quality="high" width="'+ this.width +'" height="'+ this.flashHeight +'" allowScriptAccess="sameDomain" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer" />');
	document.writeln('</object>');
  }
}


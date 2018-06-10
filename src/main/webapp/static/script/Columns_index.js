function killerrors() { 
return true; 
} 
window.onerror = killerrors; 



function isShowIndex(tab_id,div_id,who,aId,aHref,num){
   for(var i = 0;i < num;i++){
      document.getElementById("dt"+who+i).style.display="none";
      document.getElementById("sp"+who+i).className="aoff";
   }
   document.getElementById(div_id).style.display="block";
   document.getElementById(tab_id).className="aon";
 document.getElementById(aId).href = aHref;
}




function isShowIndex2(tab2_id,div2_id,who2,aId2,aHref2){
   for(var i = 0;i < 2;i++){
      document.getElementById("dt"+who2+i).style.display="none";
      document.getElementById("sp"+who2+i).className="aoff";
   }
   document.getElementById(div2_id).style.display="block";
   document.getElementById(tab2_id).className="aon";
   //document.getElementById(aId2).href = aHref2;
}

function isShowIndex3(tab3_id,div3_id,who3,aId3,aHref3){
   for(var i = 0;i < 4;i++){
      document.getElementById("dt"+who3+i).style.display="none";
      document.getElementById("sp"+who3+i).className="aoff";
   }
   document.getElementById(div3_id).style.display="block";
   document.getElementById(tab3_id).className="aon";
   document.getElementById(aId3).href = aHref3;
}


function isShowIndex4(tab4_id,div4_id,who4,aId4,aHref4){
   for(var i = 0;i < 4;i++){
      document.getElementById("dt"+who4+i).style.display="none";
      document.getElementById("sp"+who4+i).className="aoff";
   }
   document.getElementById(div4_id).style.display="block";
   document.getElementById(tab4_id).className="aon";
   //document.getElementById(aId2).href = aHref2;
}

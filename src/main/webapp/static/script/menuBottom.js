jQuery(".menu h1").bind("mouseover", function () {
    jQuery(this).attr("class", "aon");
});

jQuery(".menu h1").bind("mouseleave", function () {
    jQuery(this).attr("class", "aoff");
});

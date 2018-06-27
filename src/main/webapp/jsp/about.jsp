<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>雪花纯生中国古建筑摄影大赛安徽分赛区</title>
    <link href="static/css/css_whir.css" rel="stylesheet" type="text/css">
    <script language="javascript" src="static/script/jquery.min.js"></script>

    <!--[if IE 6]>
    <script type="text/javascript" src="static/script/iepng.js"></script>
    <script type="text/javascript">
        EvPNG.fix('img,.topbg,.nav,.aon,.aoff,.bottombox,.notice,.bottombox_sub,.menu,.rightbox'); </script>
    <![endif]-->
</head>

<body>
<div class="mainbox">
    <div class="topbox">
        <%@include file="layout/topLogin.jsp" %>
        <!--左菜单-->
        <div class="menu">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td height="400" valign="top" style="padding-bottom:66px;">
                        <h1 class="aoff"><a href="#">全国活动</a></h1>
                        <h1 class="aoff"><a href="#">安徽选拔</a></h1>
                        <h1 class="aoff"><a href="#">重点地市</a></h1>
                        <h1 class="aoff"><a href="#">基地介绍</a></h1></td>
                </tr>
            </table>
        </div>
        <script src="static/script/menuBottom.js"></script>
        <!--左菜单-->

        <!--右侧内容-->
        <script type="text/javascript" src="static/script/jsScroller1.js"></script>
        <script type="text/javascript" src="static/script/jsScrollbar1.js"></script>
        <script type="text/javascript" src="static/script/jsScrollerTween1.js"></script>
        <script type="text/javascript" src="static/script/scrollbar.js"></script>

        <div class="rightbox">
            <div class="scrlloboxAbout" style="height:350px;">
                <div style="position:absolute; width:1px; z-index:1; ">
                    <div id="Container" style="width:640px; height:340px;">
                        <div id="News" style="width:640px; height:800px;">
                            <div class="Scroller-Container content" style="height:340px;">
                                ${aboutStr}
                            </div>
                        </div>
                    </div>
                    <div id="Scrollbar-Container" style="left:640px;">
                        <div class="Scrollbar-Up"></div>
                        <div class="Scrollbar-Down"></div>
                        <div class="Scrollbar-Track">
                            <div class="Scrollbar-Handle"></div>
                        </div>
                    </div>
                </div>


            </div>
            <div class="pagenr"><a href="#"><img src="static/images/up.png"/></a><a href="#"><img
                    src="static/images/down.png"/></a>
            </div>

        </div>
        <!--右侧内容-->

    </div>

    <%@include file="layout/main.jsp" %>
    <%@include file="layout/bottom.jsp" %>

</div>


</body>
</html>

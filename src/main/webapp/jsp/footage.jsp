<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>雪花纯生中国古建筑摄影大赛安徽分赛区</title>
    <link href="static/css/css_whir.css" rel="stylesheet" type="text/css">
    <script language="javascript" src="static/script/jquery.min.js"></script>
    <script language="javascript" src="static/script/ScrollPic.js"></script>

    <!--[if IE 6]>
    <script type="text/javascript" src="static/script/iepng.js"></script>
    <script type="text/javascript">
        EvPNG.fix('img,.topbg,.nav,.aon,.aoff,.bottombox,.notice,.bottombox_sub,.menu,.rightbox'); </script>
    <![endif]-->
</head>

<body>
<div class="mainbox">
    <div class="topbox">
        <%@include file="layout/topLogin.jsp"%>
        <!--左菜单-->
        <div class="menu">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td height="400" valign="top">
                        <h1 class="aoff"><a href="review">勇闯足迹</a></h1>
                        <h1 class="aoff"><a href="footage">精彩花絮</a></h1>
                        <h1 class="aoff"><a href="video">活动视频</a></h1>
                    </td>
                </tr>
            </table>
        </div>
        <script src="static/script/menuBottom.js"></script>
        <!--左菜单-->

        <!--右侧内容-->
        <div class="rightbox">
            <div class="scrllobox" style="padding-top:78px;">
                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                    <tr valign="top">
                        <td width="399" height="330">
                            <div class="boximg"><img src="static/images/${footages.get(0).photo}" width="363" height="241"/><br/></div>
                        </td>
                        <td class="backcont">
                            ${footages.get(0).content}
                        </td>
                    </tr>
                </table>

                <div class="clear_1"></div>
                <div class="pagenr"><a href="#"><img src="static/images/up.png"/></a><a href="#"><img
                        src="static/images/down.png"/></a></div>

            </div>


        </div>
        <!--右侧内容-->

    </div>

    <%@include file="layout/main.jsp"%>
    <%@include file="layout/bottom.jsp"%>

</div>


</body>
</html>

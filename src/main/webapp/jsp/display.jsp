<%@page contentType="text/html;charset=UTF-8" %>
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
                        <h1 class="aoff"><a href="topNews">头条新闻</a></h1>
                        <h1 class="aoff"><a href="#">赛程安排</a></h1>
                        <h1 class="aoff"><a href="#">勇者风采</a></h1>


                    </td>
                </tr>
            </table>
        </div>
       <script src="../static/script/menuBottom.js"></script>
        <!--左菜单-->

        <!--右侧内容-->
        <div class="rightbox">
            <div class="scrllobox">
                <div class="disbox">
                    <h1 class="newstitle">${news.title}</h1>
                    <div class="newsdate">发布日期：2012年7月15日 阅读次数：12次</div>
                    <div class="newscontent">
                        ${news.content}
                    </div>
                </div>
            </div>
        </div>
        <!--右侧内容-->
    </div>

    <%@include file="layout/main.jsp"%>
    <%@include file="layout/bottom.jsp"%>

</div>


</body>
</html>

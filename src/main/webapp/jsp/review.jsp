<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
        <div class="topbg">会员登录<input name="" type="text" class="text01"/><input name="" type="text"
                                                                                 class="text01"/><input name=""
                                                                                                        type="button"
                                                                                                        value="登录"
                                                                                                        class="btn01"/><a
                href="static/#">忘记密码</a>|<a href="static/login.html">免费注册</a></div>

        <!--左菜单-->
        <div class="menu">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td height="400" valign="top">
                        <h1 class="aoff"><a href="review">勇闯足迹</a></h1>
                        <h1 class="aoff"><a href="footage">精彩花絮</a></h1>
                        <h1 class="aoff"><a href="static/back02.html">活动视频</a></h1>
                    </td>
                </tr>
            </table>
        </div>
        <script type="text/javascript">
            jQuery(".menu h1").bind("mouseover", function () {
                jQuery(this).attr("class", "aon");
            });

            jQuery(".menu h1").bind("mouseleave", function () {
                jQuery(this).attr("class", "aoff");
            });
        </script>
        <!--左菜单-->

        <!--右侧内容-->

        <div class="rightbox">
            <div class="scrllobox" style="padding-top:65px;">
                <div class="yearbox">
                    <ul>
                        <c:forEach var="review" items="${reviews}" varStatus="status">
                            <li id="${review.photo.substring(0,review.photo.lastIndexOf('.'))}" <c:if test="${status.index==0}">class="aon"</c:if> ><a href="#"
                                                                                                   title="<fmt:formatDate value="${review.date}" pattern="yyyy" />"></a>
                            </li>
                        </c:forEach>
                    </ul>
                </div>
                <div class="clear_1"></div>

                <div class="back">
                    <DIV class="blk_29">
                        <a class="LeftBotton" id="LeftArr"></a>
                        <DIV class="Cont" id="ISL_Cont_1">
                            <c:forEach var="review" items="${reviews}">
                                <div class="box">
                                    <h1><span class="year"><fmt:formatDate value="${review.date}"
                                                                           pattern="yyyy"/> 年</span>${review.title}
                                    </h1>
                                    <table width="100%" border="0" cellspacing="5" cellpadding="0">
                                        <tr valign="top">
                                            <td width="280"><img src="static/images/${review.photo}" width="269"
                                                                 height="173"/>
                                            </td>
                                            <td>
                                                    ${review.content}……
                                            </td>
                                        </tr>
                                    </table>
                                </div>
                            </c:forEach>

                        </DIV>
                        <a class="RightBotton" id="RightArr"></a>
                    </DIV>

                    <script language=javascript type=text/javascript>
                        var scrollPic_02 = new ScrollPic();
                        scrollPic_02.scrollContId = "ISL_Cont_1"; //内容容器ID
                        scrollPic_02.arrLeftId = "LeftArr";//左箭头ID
                        scrollPic_02.arrRightId = "RightArr"; //右箭头ID
                        scrollPic_02.frameWidth = 575;//显示框宽度
                        scrollPic_02.pageWidth = 575; //翻页宽度
                        scrollPic_02.speed = 10; //移动速度(单位毫秒，越小越快)
                        scrollPic_02.space = 10; //每次移动像素(单位px，越大越快)
                        scrollPic_02.autoPlay = true; //自动播放
                        scrollPic_02.autoPlayTime = 3; //自动播放间隔时间(秒)
                        scrollPic_02.initialize(); //初始化

                    </script>
                </div>


            </div>


        </div>
        <!--右侧内容-->

    </div>


    <div class="logo"><img src="static/images/man.png"/></div>
    <div class="hill"><img src="static/images/hill_sub.png"/></div>
    <div class="leg"><img src="static/images/leg_sub.png" width="714" height="100%"/></div>
    <div class="leftbtn"><a href="static/#"><img src="static/images/btn02.png" height="144"/></a></div>
    <div class="drink"><img src="static/images/drink.png"/></div>

    <div class="bottombg">
        <div class="bottombox_sub">
            <div class="prize"><a href="static/static/#"></a></div>
        </div>
    </div>


    <!--新闻-->
    <!--新闻-->


    <!--导航-->
    <div class="navboxSub">
        <div class="nav">
            <ul>
                <li class="nav01"><a href="index" class="aoff"></a></li>
                <li class="nav02"><a href="static/about.html" class="aoff"></a></li>
                <li class="nav03"><a href="static/news.html" class="aoff"></a></li>
                <li class="nav04"><a href="review" class="aoff"></a></li>
                <li class="nav05"><a href="static/sales.html" class="aoff"></a></li>
                <li class="nav06"><a href="static/work.html" class="aoff"></a></li>
            </ul>
        </div>
        <script type="text/javascript">
            jQuery(".nav li a").bind("mouseover", function () {
                jQuery(this).attr("class", "aon");
            });

            jQuery(".nav li a").bind("mouseleave", function () {
                jQuery(this).attr("class", "aoff");
            });
        </script>
    </div>

    <!--导航-->


</div>


</body>
</html>

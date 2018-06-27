<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html; charset=UTF-8" %>
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
        <%@include file="layout/topLogin.jsp" %>

        <!--左菜单-->
        <div class="menu">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td height="400" valign="top">
                        <h1 class="aoff"><a href="#">积分兑换</a></h1>
                        <h1 class="aoff"><a href="#">奖品介绍</a></h1>
                        <h1 class="aoff"><a href="#">促销活动</a></h1>
                        <h1 class="aoff"><a href="#">每日抽奖</a></h1>
                    </td>
                </tr>
            </table>
        </div>
        <script src="static/script/menuBottom.js"></script>
        <!--左菜单-->

        <!--右侧内容-->
        <div class="rightbox">
            <div class="scrllobox">
                <div><img src="static/images/t01.gif" width="178" height="49"/></div>
                <div class="sales">
                    <DIV class="blk_29">
                        <a class="LeftBotton" id="LeftArr"></a>
                        <DIV class="Cont" id="ISL_Cont_1">
                            <c:forEach var="sale" items="${sales}" end="4">
                                <DIV class="box"><a href="#"><img src="static/images/${sale.picture}"/><br/>${sale.name}(${sale.total})</a></DIV>
                            </c:forEach>
                        </DIV>
                        <a class="RightBotton" id="RightArr"></a>
                    </DIV>
                    <SCRIPT language=javascript type=text/javascript>

                        var scrollPic_02 = new ScrollPic();
                        scrollPic_02.scrollContId = "ISL_Cont_1"; //内容容器ID
                        scrollPic_02.arrLeftId = "LeftArr";//左箭头ID
                        scrollPic_02.arrRightId = "RightArr"; //右箭头ID
                        scrollPic_02.frameWidth = 610;//显示框宽度
                        scrollPic_02.pageWidth = 154; //翻页宽度
                        scrollPic_02.speed = 10; //移动速度(单位毫秒，越小越快)
                        scrollPic_02.space = 10; //每次移动像素(单位px，越大越快)
                        scrollPic_02.autoPlay = false; //自动播放
                        scrollPic_02.autoPlayTime = 3; //自动播放间隔时间(秒)
                        scrollPic_02.initialize(); //初始化
                    </SCRIPT>
                </div>
                <div class="clear"><img src="static/images/t02.gif"/></div>
                <div class="sales_news">
                    <div id="colee11" style="overflow:hidden;height:95px;">
                        <div id="colee111">
                            <ul>
                                <li><span class="blue">凌晨五点一</span>刻获得了<span class="blue">户外腰包</span>一个</li>
                                <li><span class="blue">哈馆网-苏苏</span>获得了<span class="blue">多功能刀具</span>一个</li>
                                <li><span class="blue">李二哥呢</span>获得了<span class="blue">多功能头巾</span>一个</li>
                                <li><span class="blue">经典语录15</span>获得了<span class="blue">多功能刀具</span>一个</li>
                                <li><span class="blue">凌晨五点一</span>刻获得了<span class="blue">户外腰包</span>一个</li>
                                <li><span class="blue">哈馆网-苏苏</span>获得了<span class="blue">多功能刀具</span>一个</li>
                                <li><span class="blue">李二哥呢</span>获得了<span class="blue">多功能头巾</span>一个</li>
                                <li><span class="blue">经典语录15</span>获得了<span class="blue">多功能刀具</span>一个</li>
                            </ul>
                        </div>
                        <div id="colee211"></div>
                    </div>
                    <script>
                        var speed11 = 60;
                        var colee211 = document.getElementById("colee211");
                        var colee111 = document.getElementById("colee111");
                        var colee11 = document.getElementById("colee11");
                        colee211.innerHTML = colee111.innerHTML; //克隆colee1为colee2
                        function Marquee111() {
//当滚动至colee1与colee2交界时
                            if (colee211.offsetTop - colee11.scrollTop <= 0) {
                                colee11.scrollTop -= colee111.offsetHeight; //colee跳到最顶端
                            } else {
                                colee11.scrollTop++
                            }
                        }

                        var MyMar111 = setInterval(Marquee111, speed11)//设置定时器
                        //鼠标移上时清除定时器达到滚动停止的目的
                        colee11.onmouseover = function () {
                            clearInterval(MyMar111)
                        }
                        //鼠标移开时重设定时器
                        colee11.onmouseout = function () {
                            MyMar111 = setInterval(Marquee111, speed11)
                        }
                    </script>
                </div>
                <div class="clear_1"></div>
                <div class="pagenr"><a href="#"><img src="static/images/up.png"/></a><a href="#"><img
                        src="static/images/down.png"/></a></div>
            </div>
        </div>
        <!--右侧内容-->
    </div>
    <%@include file="layout/main.jsp" %>
    <%@include file="layout/bottom.jsp" %>
</div>


</body>
</html>

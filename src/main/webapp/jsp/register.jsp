<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html; charset=UTF-8" %>
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
    <script>
        function locking() {
            document.all.ly.style.display = "block";
            document.all.ly.style.width = document.body.clientWidth;
            document.all.ly.style.height = document.body.clientHeight;
            document.all.Layer2.style.display = 'block';
            document.all.selectlist.style.display = 'none';
        }

        function Lock_CheckForm(theForm) {
            document.all.ly.style.display = 'none';
            document.all.Layer2.style.display = 'none';
            document.all.selectlist.style.display = 'block';
            return false;
        }
    </script>
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
                        <h1 class="aoff"><a href="#">我要注册</a></h1>
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
            <div class="scrlloboxAbout" style="height:auto;">
                <div style="position:absolute; width:1px; z-index:1; ">
                    <div id="Container" style="width:650px; height:400px;">
                        <div id="News" style="width:650px; height:800px;">
                            <div class="Scroller-Container " style="height:400px;">

                                <div class="workbox01" style="padding:0;">
                                    <div class="title01">雪花勇闯天涯挑战基地在线报名：</div>
                                    <h1>第一步： 勇者报名</h1>
                                    <form:form action="register" method="post" modelAttribute="user" enctype="multipart/form-data">
                                        <table width="100%" border="0" cellspacing="3" cellpadding="0" class="bmtable">
                                            <tr>
                                                <td width="191" align="right" class="lefttitle">请输入您的真实姓名：</td>
                                                <td><label>
                                                    <input type="text" name="name" id="textfield" value="蜘蛛侠" class="text02"/>
                                                </label></td>
                                            </tr>
                                            <tr>
                                                <td align="right" class="lefttitle">身份证：</td>
                                                <td><input type="text" name="idCard" id="textfield2" class="text02"
                                                           style="width:264px;"/></td>
                                            </tr>
                                            <tr>
                                                <td align="right" class="lefttitle">性别：</td>
                                                <td><label>
                                                    <input type="radio" name="sex" id="radio2" checked="true"
                                                           value="1"/>
                                                </label>
                                                    男
                                                    <label>
                                                        <input type="radio" name="sex" id="radio2" value="0"/>
                                                    </label>
                                                    女
                                                </td>
                                            </tr>
                                            <tr>
                                                <td align="right" class="lefttitle">手机：</td>
                                                <td><input type="text" name="phone" id="textfield4" class="text02"
                                                           style="width:264px;"/></td>
                                            </tr>
                                            <tr>
                                                <td align="right" class="lefttitle">Email：</td>
                                                <td><input type="text" name="email" id="textfield5"
                                                           class="text02"/>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td align="right" class="lefttitle">地址：</td>
                                                <td><input type="text" name="adress" id="textfield6" class="text02"
                                                           style="width:90%;"/></td>
                                            </tr>
                                            <tr>
                                                <td align="right" class="lefttitle">所在城市：</td>
                                                <td><input type="text" name="city" id="textfield7" class="text02"
                                                           style="width:100px;"/></td>
                                            </tr>
                                            <tr>
                                                <td align="right" class="lefttitle">获知渠道：</td>
                                                <td>
                                                    <div id="selectlist">
                                                        <select name="knowWay" id="select">
                                                            <option value="网络">网络</option>
                                                            <option value="广播">广播</option>
                                                        </select>
                                                    </div>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td align="right" class="lefttitle">是否参加过历年活动：</td>
                                                <td><label>
                                                    <input type="radio" name="attended" checked id="radio3" value="1"/>
                                                </label>
                                                    是
                                                    <label>
                                                        <input type="radio" name="attended" id="radio3" value="0"/>
                                                    </label>
                                                    否
                                                </td>
                                            </tr>
                                            <tr>
                                                <td align="right" class="lefttitle">是否是户外俱乐部会员：</td>
                                                <td>
                                                    <input type="radio" name="outdoorClubVip" value="1"/>是
                                                    <input type="radio" name="outdoorClubVip" checked="true" value="0"/>否
                                                </td>
                                            </tr>
                                            <tr>
                                                <td align="right" class="lefttitle">上传户外照片：</td>
                                                <td><label>
                                                    <input type="file" name="photoFile" id="fileField"/>
                                                </label><span class="info">(不得大于500K的图片)</span></td>
                                            </tr>

                                            <tr>
                                                <td>&nbsp;</td>
                                                <td style="padding-top:8px;">
                                                    <input name="" type="submit" value="提交申请" class="btn04"
                                                           onclick="locking();"/>
                                                </td>
                                            </tr>
                                        </table>
                                    </form:form>
                                </div>

                            </div>
                        </div>
                    </div>
                    <div id="Scrollbar-Container" style="left:640px; ">
                        <div class="Scrollbar-Up"></div>
                        <div class="Scrollbar-Down"></div>
                        <div class="Scrollbar-Track" style="height:400px;">
                            <div class="Scrollbar-Handle"></div>
                        </div>
                    </div>
                </div>


            </div>

        </div>
        <!--右侧内容-->

    </div>


    <%@include file="layout/main.jsp" %>
    <%@include file="layout/bottom.jsp" %>


    <!--新闻-->
    <!--新闻-->


    <!--导航-->
    <div class="navboxSub">
        <div class="nav">
            <ul>
                <li class="nav01"><a href="index" class="aoff"></a></li>
                <li class="nav02"><a href="about" class="aoff"></a></li>
                <li class="nav03"><a href="news" class="aoff"></a></li>
                <li class="nav04"><a href="review" class="aoff"></a></li>
                <li class="nav05"><a href="sales" class="aoff"></a></li>
                <li class="nav06"><a href="work" class="aoff"></a></li>
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
    <div id="ly" class="windowBg"></div>
    <!--   浮层框架开始   -->
    <div id="Layer2" class="windowBox">
        <div class="close"><a href="#" onclick="Lock_CheckForm(this);"><img src="static/images/close.png"/></a></div>
        <div class="windowCont">
            <h1 class="title02">欢迎参加答题活动，请认真作答，祝君好运！</h1>
            <div class="asklist">问题： 1、华润雪花啤酒（中国）有限公司成立于_________年</div>
            <div class="askchance">
                <input name="" type="radio" value=""/> A. 1992年
                <input name="" type="radio" value=""/> B. 1993年
                <input name="" type="radio" value=""/> C. 1994年
            </div>
            <div class="askbtn"><input name="" type="image" src="static/images/next.gif"/></div>
        </div>
    </div>
    <!--  浮层框架结束-->


</div>


</body>
</html>

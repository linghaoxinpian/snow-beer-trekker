<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>雪花纯生中国古建筑摄影大赛安徽分赛区</title>
    <link href="static/css/css_whir.css" rel="stylesheet" type="text/css">
    <script language="javascript" src="static/script/jquery.min.js"></script>
    <SCRIPT src="static/script/xixi.js" type=text/javascript></SCRIPT>


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
                href="#">忘记密码</a>|<a href="login">免费注册</a></div>

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

            <div class="scrllobox" style="padding-top:60px;">
                <table border="0" cellspacing="0" cellpadding="0" align="center">
                    <tr>
                        <td width="437" align="center" style=" padding-right:20px;">
                            <div class="viedotitle">${videos[0].name}</div>
                            <img src="static/images/${videos[0].src}" width="437" height="339"/></td>
                        <td width="122" valign="middle" class="backright">
                            <div id="container">
                                <DIV class=slide-pic id=slidePic>
                                    <A class="gray" id=prev hideFocus href="javascript:;">前移</A>
                                    <DIV class=pic-container>
                                        <UL>
                                            <LI class=cur><p><a href="#"><img src="static/images/vp1.jpg" width="105"
                                                                              height="57"/></a></p></LI>
                                            <LI><p><a href="#"><img src="static/images/vp1.jpg" width="105"
                                                                    height="57"/></a></p></LI>
                                            <LI><p><a href="#"><img src="static/images/vp1.jpg" width="105"
                                                                    height="57"/></a></p></LI>
                                            <LI><p><a href="#"><img src="static/images/vp1.jpg" width="105"
                                                                    height="57"/></a></p></LI>

                                        </UL>
                                    </DIV>
                                    <A id=next hideFocus href="javascript:;">后移</A>
                                </DIV>

                                <SCRIPT type=text/javascript>
                                    jQuery(function () {
                                        if (!$('#slidePic')[0])
                                            return;
                                        var i = 0, p = $('#slidePic ul'), pList = $('#slidePic ul li'),
                                            len = pList.length;
                                        var elePrev = $('#prev'), eleNext = $('#next');
                                        //var firstClick = false;
                                        var w = 100, num = 3;
                                        p.css('width', w * len);
                                        if (len <= num)
                                            eleNext.addClass('gray');

                                        function prev() {
                                            if (elePrev.hasClass('gray')) {
                                                //alert('已经是第一张了');
                                                return;
                                            }
                                            p.animate({
                                                marginTop: -(--i) * w
                                            }, 500);
                                            if (i < len - num) {
                                                eleNext.removeClass('gray');
                                            }
                                            if (i == 0) {
                                                elePrev.addClass('gray');
                                            }
                                        }

                                        function next() {
                                            if (eleNext.hasClass('gray')) {
                                                //alert('已经是最后一张了');
                                                return;
                                            }
                                            //p.css('margin-left',-(++i) * w);
                                            p.animate({
                                                marginTop: -(++i) * w
                                            }, 500);
                                            if (i != 0) {
                                                elePrev.removeClass('gray');
                                            }
                                            if (i == len - num) {
                                                eleNext.addClass('gray');
                                            }
                                        }

                                        elePrev.bind('click', prev);
                                        eleNext.bind('click', next);
                                        pList.each(function (n, v) {
                                            $(this).click(function () {
                                                if (n - i == 2) {
                                                    next();
                                                }
                                                if (n - i == 0) {
                                                    prev()
                                                }
                                                $('#slidePic ul li.cur').removeClass('cur');
                                                $(this).addClass('cur');
                                                show(n);
                                            }).mouseover(function () {
                                                $(this).addClass('hover');
                                            }).mouseout(function () {
                                                $(this).removeClass('hover');
                                            })
                                        });

                                    });
                                </SCRIPT>
                            </div>
                        </td>
                    </tr>
                </table>
            </div>


        </div>
        <!--右侧内容-->

    </div>


    <div class="logo"><img src="static/images/man.png"/></div>
    <div class="hill"><img src="static/images/hill_sub.png"/></div>
    <div class="leg"><img src="static/images/leg_sub.png" width="714" height="100%"/></div>
    <div class="leftbtn"><a href="#"><img src="static/images/btn02.png" height="144"/></a></div>
    <div class="drink"><img src="static/images/drink.png"/></div>

    <div class="bottombg">
        <div class="bottombox_sub">
            <div class="prize"><a href="#"></a></div>
        </div>
    </div>


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


</div>


</body>
</html>

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
        <%@include file="layout/topLogin.jsp" %>

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

    <%@include file="layout/main.jsp" %>
    <%@include file="layout/bottom.jsp" %>

</div>


</body>
</html>

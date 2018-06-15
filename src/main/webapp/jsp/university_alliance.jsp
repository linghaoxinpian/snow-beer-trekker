<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>雪花纯生中国古建筑摄影大赛安徽分赛区</title>
    <link href="css/css_whir.css" rel="stylesheet" type="text/css">
    <script language="javascript" src="script/jquery.min.js"></script>
    <script language="javascript" src="script/ScrollPic.js"></script>

    <!--[if IE 6]>
    <script type="text/javascript" src="script/iepng.js"></script>
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
                        <h1 class="aoff"><a href="university_alliance">高校社团联盟</a></h1>
                        <h1 class="aoff"><a href="#">合作俱乐部</a></h1>
                        <h1 class="aoff"><a href="#">合作媒体</a></h1>
                    </td>
                </tr>
            </table>
        </div>
        <script src="../static/script/menuBottom.js"></script>
        <!--左菜单-->

        <!--右侧内容-->

        <div class="rightbox">
            <div class="scrllobox" style="padding:30px 66px 0 66px;">
                <div class="workbox01">
                    <h1>高校社团活动申请合作入口:</h1>
                    <table width="100%" border="0" cellspacing="3" cellpadding="0">
                        <tr>
                            <td width="191" align="right" class="lefttitle">社团名称：</td>
                            <td colspan="3"><label>
                                <input type="text" name="textfield" id="textfield" class="text02"/>
                            </label></td>
                        </tr>
                        <tr>
                            <td align="right" class="lefttitle">推荐社团名称：</td>
                            <td colspan="3"><input type="text" name="textfield2" id="textfield2" class="text02"
                                                   style="width:264px;"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="lefttitle">所属学校：</td>
                            <td colspan="3"><input type="text" name="textfield3" id="textfield3" class="text02"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="lefttitle">社团负责人：</td>
                            <td colspan="3"><input type="text" name="textfield4" id="textfield4" class="text02"
                                                   style="width:264px;"/>
                                可填无
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="lefttitle">社团负责人联系方式：</td>
                            <td colspan="3"><input type="text" name="textfield5" id="textfield5" class="text02"/>
                                通讯地址、手机、QQ
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="lefttitle">社团负责人账号：</td>
                            <td colspan="3"><input type="text" name="textfield6" id="textfield6" class="text02"
                                                   style="width:284px;"/>
                                登陆勇闯天涯官网的账号，可填无
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="lefttitle">社团现有成员数量：</td>
                            <td width="155"><input type="text" name="textfield7" id="textfield7" class="text02"
                                                   style="width:100px;"/></td>
                            <td width="79" align="center">社团网站：</td>
                            <td width="265"><input type="text" name="textfield13" id="textfield13" class="text02"
                                                   style="width:160px;"/>
                                可填无
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="lefttitle">社团微博地址：</td>
                            <td colspan="3"><input type="text" name="textfield8" id="textfield8" class="text02"/>
                                可填无
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="lefttitle">社团曾参加的活动/奖励：</td>
                            <td colspan="3"><input type="text" name="textfield9" id="textfield9" class="text02"
                                                   style="width:264px;"/>
                                可填无
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="lefttitle">社团所属部门、指导教师姓名：</td>
                            <td colspan="3"><input type="text" name="textfield10" id="textfield10" class="text02"/>
                                若是，请填写户外俱乐部名称
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="lefttitle">指导教师联系方式：</td>
                            <td colspan="3"><input type="text" name="textfield11" id="textfield11" class="text02"
                                                   style="width:264px;"/>
                                可填无
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="lefttitle">学校经常有哪些活动：</td>
                            <td colspan="3"><input type="text" name="textfield12" id="textfield12" class="text02"/>
                                可填无
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="lefttitle">目前您是：</td>
                            <td colspan="3"><label>
                                <input type="radio" name="radio" id="radio" value="radio"/>
                            </label>社会人士 <label>
                                <input type="radio" name="radio" id="radio" value="radio"/>
                            </label> 大学生
                            </td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                            <td colspan="3" style="padding-top:8px;"><input name="" type="image"
                                                                            src="images/btn03.gif"/></td>
                        </tr>
                    </table>


                </div>


            </div>


        </div>
        <!--右侧内容-->

    </div>


    <%@include file="layout/main.jsp" %>
    <%@include file="layout/bottom.jsp" %>

</div>


</body>
</html>

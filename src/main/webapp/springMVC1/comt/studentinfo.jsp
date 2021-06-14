<%--<%@ page language="java" contentType="text/html; charset=UTF-8"--%>
<%--         pageEncoding="UTF-8"%>--%>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <meta charset="UTF-8">--%>
<%--    <title>Insert title here</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--学 号：${studentid}<br/>--%>
<%--姓 名：${name}<br/>--%>
<%--性 别：${sex}<br/>--%>
<%--年 龄：${age}<br/>--%>
<%--籍 贯：${hometown}<br/>--%>
<%--电 话：${tel}--%>
<%--</body>--%>


<%--实验八--%>
<%--<%@ page language="java" contentType="text/html; charset=UTF-8"--%>
<%--         pageEncoding="UTF-8" %>--%>
<%--<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">--%>
<%--<html>--%>
<%--<head>--%>
<%--    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">--%>
<%--    <title>学生信息</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--学&nbsp;&nbsp;号：${sno}<br/>--%>
<%--姓&nbsp;&nbsp;名：${sname}<br/>--%>
<%--年&nbsp;&nbsp;龄：${age}<br/>--%>
<%--籍&nbsp;&nbsp;贯：${where}<br/>--%>
<%--身高体重：${tw}<br/>--%>
<%--身份证号${inumber}<br/>--%>
<%--</body>--%>
<%--</html>--%>

<%--<%@ page language="java" contentType="text/html; charset=UTF-8"--%>
<%--         pageEncoding="UTF-8" %>--%>
<%--<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">--%>
<%--<html>--%>
<%--<head>--%>
<%--    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">--%>
<%--    <title>学生信息</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--学&nbsp;&nbsp;号：${student.sno}<br/>--%>
<%--姓&nbsp;&nbsp;名：${student.sname}<br/>--%>
<%--年&nbsp;&nbsp;龄：${student.age}<br/>--%>
<%--籍&nbsp;&nbsp;贯：${student.where}<br/>--%>
<%--身高体重：${student.tw}<br/>--%>
<%--身份证号${student.inumber}<br/>--%>
<%--</body>--%>
<%--</html>--%>

<%--<%@ page language="java" contentType="text/html; charset=UTF-8"--%>
<%--         pageEncoding="UTF-8" %>--%>
<%--<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">--%>
<%--<html>--%>
<%--<head>--%>
<%--    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">--%>
<%--    <title>学生信息</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--学&nbsp;&nbsp;号：${student.sno}<br/>--%>
<%--姓&nbsp;&nbsp;名：${student.sname}<br/>--%>
<%--年&nbsp;&nbsp;龄：${student.age}<br/>--%>
<%--籍&nbsp;&nbsp;贯：${student.where}<br/>--%>
<%--身高体重：${student.tw}<br/>--%>
<%--身份证号${student.idCard.id}<br/>--%>
<%--</body>--%>
<%--</html>--%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>选课信息</title>
</head>
<body>
<center>选课信息</center>
<table align="center" width="500" border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse"
       bordercolor="#0099FF">
    <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>课程列表</td>
    </tr>
    <tr>
        <td>${teachercourse.tno}</td>
        <td>${teachercourse.tname}</td>
        <td>
            <c:forEach items="${teachercourse.courseList}" var="tname">
                ${tname}<br/>
            </c:forEach>
        </td>
</table>
</body>
</html>


<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>修改课程信息</title>
</head>
<body>
<form id="form1" name="form1" method="post" action="courseupdate">
    <table align="center" width="500" border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse"
           bordercolor="#0099FF">
        <tr>
            <td width="116" height="30" align="right" valign="middle">课程号：</td>
            <td width="378" align="left" valign="middle">
                <input type="text" name="cno" readonly="readonly" id="cno" value="${course.cno}"/></td>
        </tr>
        <tr>
            <td width="116" height="30" align="right" valign="middle">课程名称：</td>
            <td width="378" align="left" valign="middle">
                <input type="text" name="cname" id="cname" value="${course.cname}"/></td>
        </tr>
        <tr>
            <td width="116" height="30" align="right" valign="middle">课程时长：</td>
            <td width="378" align="left" valign="middle">
                <input type="text" name="period" id="period" value="${course.period}"/></td>
        </tr>

        <tr>
            <td height="30" align="right" valign="middle">&nbsp;</td>
            <td align="left" valign="middle"><input type="submit" name="button" id="button" value="提交"/>
                <input type="reset" name="button2" id="button2" value="重置"/></td>
        </tr>
    </table>
</form>
</body>
</html>




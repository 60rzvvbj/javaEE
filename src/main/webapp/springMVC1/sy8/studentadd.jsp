<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>添加课程信息</title>
</head>
<body>
<div style="text-align: center;">
    <form id="form1" name="form1" method="post" action="studentadd">
        <table width="500" height="95" border="0" cellpadding="0" cellspacing="1"
               style="background-color: #3A8ECD; color: #000;">
            <tr>
                <td height="30" colspan="2" align="center" valign="middle" bgcolor="#FFFFFF">学生信息</td>
            </tr>
            <tr>
                <td width="114" height="30" align="right" valign="middle" bgcolor="#FFFFFF">学号</td>
                <td width="227" height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                    <input name="sno" type="text" size="10"/></td>
            </tr>
            <tr>
                <td height="30" align="right" valign="middle" bgcolor="#FFFFFF">姓名</td>
                <td height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                    <input type="text" name="sname"/></td>
            </tr>
            <tr>
                <td height="30" align="right" valign="middle" bgcolor="#FFFFFF">年龄</td>
                <td height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                    <input name="age" type="text" value="0" size="10"/></td>
            </tr>
            <tr>
                <td height="30" align="right" valign="middle" bgcolor="#FFFFFF">籍贯</td>
                <td height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                    <input type="text" name="where"/></td>
            </tr>
            <tr>
                <td height="30" align="right" valign="middle" bgcolor="#FFFFFF">身高体重</td>
                <td height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                    <input type="text" name="tw"/></td>
            </tr>
            <tr>
                <td height="30" align="right" valign="middle" bgcolor="#FFFFFF">身份证号</td>
                <td height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                    <input name="idCard.id" type="text" size="10"/></td>
            </tr>
            <tr>
                <td height="30" colspan="2" align="center" valign="middle" bgcolor="#FFFFFF"><input type="submit"
                                                                                                    name="button"
                                                                                                    id="button"
                                                                                                    value="提交"/>&nbsp;&nbsp;
                    <input type="reset" name="button2" id="button2" value="重置"/></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>


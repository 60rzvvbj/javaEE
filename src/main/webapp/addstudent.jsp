<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户登录</title>
    <style>
        table, tr, td {
            border: 0px;
        }

        input {
            border: 1px solid pink;
            outline: none;
        }
    </style>
</head>
<body>
<center>
    <form id="form1" name="form1" method="post" action="studentLogin">
        <table width="344" height="95" cellpadding="0" cellspacing="0">
            <tr>
                <td height="30" colspan="2" align="center" valign="middle">学生信息登记</td>
            </tr>
            <tr>
                <td width="114" height="30" align="right" valign="middle">学号：</td>
                <td width="227" height="20" align="left" valign="middle">
                    <input type="text" name="studentid"/>
                </td>
            </tr>
            <tr>
                <td height="30" align="right" valign="middle">姓名：</td>
                <td height="20" align="left" valign="middle">
                    <input type="text" name="name"/>
                </td>
            </tr>
            <tr>
                <td width="114" height="30" align="right" valign="middle">性别：</td>
                <td width="227" height="20" align="left" valign="middle">
                    <input type="radio" value="男" name="sex"/>男&nbsp;&nbsp;&nbsp;&nbsp;
                    <input type="radio" value="女" name="sex"/>女
                </td>
            </tr>
            <tr>
                <td width="114" height="30" align="right" valign="middle">年龄：</td>
                <td width="227" height="20" align="left" valign="middle">
                    <input type="text" name="age"/>
                </td>
            </tr>
            <tr>
                <td width="114" height="30" align="right" valign="middle">籍贯：</td>
                <td width="227" height="20" align="left" valign="middle">
                    <input type="text" name="hometown"/>
                </td>
            </tr>
            <tr>
                <td width="114" height="30" align="right" valign="middle">电话：</td>
                <td width="227" height="20" align="left" valign="middle">
                    <input type="text" name="tel"/>
                </td>
            </tr>
            <tr>
                <td height="30" colspan="2" align="center" valign="middle"><input type="submit"
                                                                                                    name="button"
                                                                                                    id="button"
                                                                                                    value="提交"/>&nbsp;&nbsp;
                    <input type="reset" name="button2" id="button2" value="重置"/></td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>

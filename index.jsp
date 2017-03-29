<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>邮件发送</title>
</head>
<body>
	<form action="mydeal.jsp" method="post" onSubmit="return checkform(forml)">
		收件人：<input name="to" type="text" id="to" title="发件人" size="60">
		发件人：<input name="from" type="password" id="from" title="发件人信箱密码" size="60">
		主&nbsp;&nbsp;题：<input name="subject" type="text" id="subject" title="邮件主题" size="60">
		内&nbsp;&nbsp;容：
		<textarea rows="59" cols="7" name="content" class="wenbenkuang" id="content" title="邮件内容"></textarea>
		<input name="Submit" type="submit" class="btn_bg" value="发送">
		<input name="Submit2" type="reset" class="btn_bg" value="重置">
		<input name="Submit3" type="button" class="btn_bg" onClick="window.close();" value="关闭">
	</form>
</body>
</html>
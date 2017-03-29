<%@page contentType="text/html; charset=GBK" language="java" errorPage=""%>
<%@page import="java.util.*"%>
<%@page import="javax.mail.*"%>
<%@page import="javax.mail.internet.*"%>
<%@page import="javax.activation.*"%>
<%
try{
	request.setCharacterEncoding("GBk");
	String from=request.getParameter("from");
	String to=request.getParameter("to");
	String subject=request.getParameter("subject");
	String messageText=request.getParameter("content");
	String password=request.getParameter("password");
	//如果是在Internet上发送电子邮件，使用这段代码自动生成SMTP的主机名称
	//int n = from.indexOf('@')
	//int m = from.length();
	//String mailserver="smtp."+from.substring(n+1,m);
	//String mailserver="smtp."+from.substring(n+1,m);
	String mailserver="localhost";  //在局域网中发送电子邮件使用这句代码SMTP服务器
	//建立邮件会话
	Properties pro=new Properties();
	pro.put("mail.smtp.host", mailserver);
	pro.put("mail.smtp.auth", "true");
	Session sess=Session.getInstance(pro);
	sess.setDebug(true);
	//新建一个消息对象
	MimeMessage message=new MimeMessage(sess);
	//设置发件人
	InternetAddress from_mail=new InternetAddress(to);
	message.setFrom(from_mail);
	//设置发件人
	InternetAddress to_mail=new InternetAddress(from);
	message.setRecipient(Message.RecipientType.TO,to_mail);
	//设置主题
	message.setSubject(subject);
	//设置内容
	message.setText(messageText);
	//设置发送时间
	message.setSentDate(new Date());
	//发送邮件
	message.saveChanges();           //保证报头域会话内容保持一致
	
}catch(Exception e){
	
}
%>
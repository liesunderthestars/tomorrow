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
	//�������Internet�Ϸ��͵����ʼ���ʹ����δ����Զ�����SMTP����������
	//int n = from.indexOf('@')
	//int m = from.length();
	//String mailserver="smtp."+from.substring(n+1,m);
	//String mailserver="smtp."+from.substring(n+1,m);
	String mailserver="localhost";  //�ھ������з��͵����ʼ�ʹ��������SMTP������
	//�����ʼ��Ự
	Properties pro=new Properties();
	pro.put("mail.smtp.host", mailserver);
	pro.put("mail.smtp.auth", "true");
	Session sess=Session.getInstance(pro);
	sess.setDebug(true);
	//�½�һ����Ϣ����
	MimeMessage message=new MimeMessage(sess);
	//���÷�����
	InternetAddress from_mail=new InternetAddress(to);
	message.setFrom(from_mail);
	//���÷�����
	InternetAddress to_mail=new InternetAddress(from);
	message.setRecipient(Message.RecipientType.TO,to_mail);
	//��������
	message.setSubject(subject);
	//��������
	message.setText(messageText);
	//���÷���ʱ��
	message.setSentDate(new Date());
	//�����ʼ�
	message.saveChanges();           //��֤��ͷ��Ự���ݱ���һ��
	
}catch(Exception e){
	
}
%>
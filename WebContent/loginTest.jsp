<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LoginTest</title>
</head>
<body>

	<s:form action="LoginTestAction">
		<center>
			<p>
				ユーザーID：
				<s:textfield label="ID" name="id" />
			</p>
			<p>
				パスワード：
				<s:password label="パスワード" name="password" />
			</p>
			<font color="#ff0000"> <s:property value="message" />
			</font> <br>
			<s:submit value="ログイン" />
		</center>
	</s:form>
</body>
</html>
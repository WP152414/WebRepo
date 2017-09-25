<%@page import="java.text.SimpleDateFormat, java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>숫자 합 계산</title>
</head>
<body>
<form>
<input type="number" name="num" required>
<button type="submit">계산</button>
</form>
<%
	String Num = request.getParameter("num");
	//if (Num==null) return;
	int sum=0;
	if (Num!=null){
	int num = Integer.parseInt(Num);
	for (int i=1; i<=num; i++) {
		sum+=i;
	} 
%>
<h1>1 ~ <%=num %>까지의 합은 <%=sum %>입니다. </h1>
<%
	}
	//현재 일시 구하기
	SimpleDateFormat sdf = new SimpleDateFormat("yyy/MM/dd hh:mm:ss a");
%>
현재 시각은 <%= sdf.format(new Date())%>

</body>
</html>
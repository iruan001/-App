<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="updatedept.do" method="post">
		部门编号：<input type="text" value="${d.deptno }" name="deptno"><br />
		部门名称：<input type="text" value="${d.dname }" name="dname"><br />
		部门地址：<input type="text" value="${d.loc }" name="loc"><br />
		<input type="submit" value="修改" />
	</form>
</body>
</html>
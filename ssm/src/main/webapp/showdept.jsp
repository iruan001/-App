<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="mytag" uri="xiaomaomao" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center><h1>部门信息表</h1></center>
	<center><a href="adddept.jsp">添加部门信息</a></center>
	<table align="center" border="1" cellpadding="0" cellspacing="0">
		<tr height="30">
			<th>部门编号</th>
			<th>部门名称</th>
			<th>部门地址</th>
			<th colspan="2">操作</th>
		</tr>
		<c:forEach items="${list }" var="d">
			<tr height="30">
				<td>${d.deptno }</td>
				<td>${d.dname }</td>
				<td>${d.loc }</td>
				<td><a href="deletedept.do?deptno=${d.deptno }">删除</a></td>
				<td><a href="preupdatedept.do?deptno=${d.deptno }">修改</a></td>	
			</tr>
		</c:forEach>
		<%-- <tr>
			<td colspan="5">
				<c:if test="${page.isFirstPage==true }">
					首页上一页
				</c:if>
				<c:if test="${page.isFirstPage!=true }">
					<a href= "showdept.do?pagenow=${page.firstPage }">首页</a>
					<a href="showdept.do?pagenow=${page.prePage }">上一页</a>
				</c:if>
				<c:if test="${page.isLastPage==true }">
					下一页尾页
				</c:if>
				<c:if test="${page.isLastPage!=true }">
					<a href="showdept.do?pagenow=${page.nextPage }">下一页</a>
					<a href="showdept.do?pagenow=${page.lastPage }">尾页</a>
				</c:if>
			</td>
		</tr> --%>
		<tr height="30">
			<td colspan="5">
				<mytag:page pagenow="${pagenow }" url="showdept.do?" pagesize="${pagesize }" count="${count }"/>
			</td>
		</tr> 
	</table>
</body>
</html>
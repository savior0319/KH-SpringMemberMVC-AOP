<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>전체회원</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>전화번호</th>
			</tr>
		</thead>
		<tbody>   
			<c:forEach var="item" items="${list}">
			<tr>
				<td>${item.userId}</td>
				<td>${item.userName}</td>
				<td>${item.phone}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>   

</body>
</html>
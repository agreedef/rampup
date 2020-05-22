<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jstl/sql"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>rampup</title>
</head>
<body>
   <table id="bList" width="800" border="3" bordercolor="lightgray">
            <tr heigh="30">
                <td>순서</td>
                <td>내용</td>
                <td>이미지</td>
                <td>날짜</td>
            </tr>
            
            <c:forEach items="${list}" var = "list">
            	<tr>
                	<td><c:out value="${list.post_id}" /></td>
                	<td><c:out value="${list.contents}" /></td>
                	<td><img src="<c:out value="${list.contents_url}" />" width="100" height="100"></td>
                	<td><fmt:formatDate value="${list.date_time}" pattern="yyyy-MM-dd"/></td>
            	</tr>
            </c:forEach>
        </table>
</body>
</html>

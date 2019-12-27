<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet"
	href="node_modules/bootstrap/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="css/main.css">
<title>home</title>
</head>
<body>
	<jsp:include page="navigator.jsp"></jsp:include>
	<div class="container mt-5">
	
		<h2 class="text-center text-info"><%=session.isNew() ? "" : "welcome back-reader" %></h2>
		<div class="card mb-2">
			<div class="card-header">
				<h4 class="card-title font-weight-bold">
					<c:out value="${post.title }"></c:out>
				</h4>
				<span class="small">Tác giả: <c:out value="${post.author }"></c:out>
				</span> <span class="float-right"><fmt:formatDate
						pattern="yyyy-MM-dd" value="${post.postTime }" /></span>
			</div>
			<div class="card-body">
				<h5 class="card-text font-weight-bold">
					<c:out value="${post.topic }"></c:out>
				</h5>
				${post.content}
			</div>
			<p class="text-right mb-0 text-info p-2"><c:out value="${post.isRelease  ? 'Đã xuất bản' : 'Nháp'}"></c:out> </p>
			
			<c:if test="${isLogedIn}">
				<div>
					<a class=" m-2 text-danger d-inline"
						href="PostServlet?action=delete&id=${post.id}">Delete</a> <a
						class="float-right m-2 d-inline"
						href="PostServlet?action=edit&id=${post.id}">Edit</a>
				</div>
			</c:if>

		</div>
	</div>


	<script src="node_modules/jquery/dist/jquery.min.js"></script>
	<script src="node_modules/popper.js/dist/popper.min.js"></script>
	<script src="node_modules/bootstrap/dist/js/bootstrap.min.js"></script>
</body>
</html>
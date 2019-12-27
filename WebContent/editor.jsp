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
<script src="https://cdn.tiny.cloud/1/no-api-key/tinymce/5/tinymce.min.js" ></script>
  <script>tinymce.init({selector:'textarea'});</script>
<title>Editor</title>
</head>
<body>
	<jsp:include page="navigator.jsp"></jsp:include>
	<div class="container mt-3 mb-3">
		<div class="card p-2">
			<form accept-charset="utf-8" action="PostServlet" method="POST">
				<input  name="action" value="${sessionScope.isEdit ? 'update' : 'insert'}" hidden/>
				<input  name="id" value="${sessionScope.isEdit ? post.id : ''}" hidden/>
				<div class="form-group">
					<label for="title">Tiêu đề</label> <input type="text"
						class="form-control" name="title" id="title"
						placeholder="Tiêu đề " value="${post.title}">
				</div>
				<div class="form-group">
					<label for="topic">Chủ đề: </label> <input type="text" name="topic"
						id="topic" class="form-control" placeholder="Tóm tắt nội dung "
						value="${post.topic}">
				</div>

				<div class="form-group">
					<label for="content">Nội dung </label>
					<textarea class="form-control" name="content" id="content"
						rows="15"><c:out value='${post.content}'></c:out></textarea>
				</div> 
				<div class="form-check">
					<label class="form-check-label"> <input type="checkbox"
						class="form-check-input" name="isRelease" id="isRelease"
						value="released" ${post.isRelease ? 'checked' : ''} > Đã xuất bản
					</label>
				</div>

				<button type="submit" class="btn btn-success">Submit</button>

			</form>
		</div>
	</div>

	<script src="node_modules/jquery/dist/jquery.min.js"></script>
	<script src="node_modules/popper.js/dist/popper.min.js"></script>
	<script src="node_modules/bootstrap/dist/js/bootstrap.min.js"></script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<nav class="navbar navbar-expand-md navbar-dark bg-dark" id="sideNav">

	<a class="navbar-brand" href="#"> <span class="d-none d-md-block">
			<img class="img-fluid img-profile rounded-circle mx-auto mb-2"	
			src="img/profile.jpg" alt="profile picture">
	</span> <span class="d-block d-md-none">Se00534x</span>
	</a>
	<button class="navbar-toggler d-lg-none" type="button"
		data-toggle="collapse" data-target="#collapsibleNavId"
		aria-controls="collapsibleNavId" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="collapsibleNavId">
		<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
			<li class="nav-item active"><a class="nav-link"
				href="PostServlet?action=listReleased">BÀI VIẾT ĐÃ XUÂT BẢN</a></li>
			<li class="nav-item active"><a class="nav-link"
				href="PostServlet?action=listAllPost">TẤT CẢ BÀI VIẾT </a></li>

			<c:choose>
				<c:when test="${sessionScope.isLogedIn}">
					<li class="nav-item active"><a class="nav-link"
						href="PostServlet?action=new">BÀI VIÊT MỚI </a></li>
					<li class="nav-item active"><a class="nav-link"
						href="LogInOutServlet?action=dologout">LOG OUT </a></li>
				</c:when>
				<c:otherwise>
					<li class="nav-item active"><a class="nav-link"
						href="login.jsp">LOG IN</a></li>
				</c:otherwise>
			</c:choose>

		</ul>
	</div>
</nav>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file="../inc/top.jsp"%>

<article class="simpleForm">
<div class="form-container">
	<form action="<c:url value='/mypage/pwd'/>" method="post">
	<input type="hidden" name="type" id="type" value="${sessionScope.type}" disabled>
		<div class="container-fluid">
			<div class="row h-100 align-items-center justify-content-center"
				style="min-height: 100vh;">
				<div class="col-12 col-sm-8 col-md-6 col-lg-5 col-xl-4">
					<div class="bg-secondary rounded p-4 p-sm-5 my-4 mx-3">
						<div
							class="d-flex align-items-center justify-content-between mb-3">
								<h3>
									<i class="fa fa-user-edit me-2"></i>비밀번호 수정
								</h3>
							</a>
						</div>
						
						<div class="form-floating mb-4">
							<input type="Password" name="memPwd" id="pwd" class="form-control" id="floatingPassword" placeholder="Password"> 
							<label for="floatingPassword">비밀번호</label>
						</div>
						<div class="form-floating mb-4">
							<input type="Password" name="mempwd2" id="pwd2" class="form-control" id="floatingPassword" placeholder="Password"> 
							<label for="floatingPassword">비밀번호확인</label>
						</div> 
			
						
						<button type="submit" class="btn btn-primary py-3 w-100 mb-4">수정</button>
						<p class="text-center mb-0">
							Would you like to go back? <a href="<c:url value='/'/>">click</a>
						</p>
					</div>
				</div>
			</div>
		</div>
		
	</form>
</div>
</article>
<%@include file="../inc/bottom.jsp"%>
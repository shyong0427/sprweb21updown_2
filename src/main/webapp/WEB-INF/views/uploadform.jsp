<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>* 업로드 정보 *</h2>
<form:form enctype="multipart/form-data" modelAttribute="uploadfile">
업로드할 파일 선택 : <br>
<input type="file" name="file"><br>
<form:errors path="file" cssStyle="color:red"/>
<p/>
<input type="submit" value="전송">
</form:form>
</body>
</html>
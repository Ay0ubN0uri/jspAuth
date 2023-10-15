<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:if test="${empty current_user}">
    <c:set var="status" value="danger" scope="session"/>
    <c:set var="message" value="Login First!!" scope="session"/>
    <c:redirect url="auth.jsp"></c:redirect>
</c:if>

<%--<c:if test="${not empty current_user}">
    <c:redirect url="welcome.jsp"></c:redirect>
</c:if>--%>
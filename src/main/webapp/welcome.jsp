<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.a00n.entities.Client"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="checkLogin.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
        <link rel="icon" href="https://tailwindui.com/img/logos/mark.svg?color=indigo&shade=500" type="image/x-icon">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@sira-ui/tailwind/dist/css/styles.css" />
        <script src="https://cdn.tailwindcss.com?plugins=forms,typography,aspect-ratio,line-clamp"></script>
    </head>
    <body>
        <div class="flex flex-col w-full h-screen">
            <%@include file="includes/navbar.jsp" %>
            <section class="flex flex-col my-auto">
                <div class="flex mb-10 flex-col justify-center w-full">
                    <%@include file="includes/message.jsp" %>
                    <div class="sm:mx-auto sm:w-full sm:max-w-sm">
                        <h2 class="mt-4 text-center text-2xl font-bold leading-9 tracking-tight text-gray-900">
                            <%!Client c ;%>
                            <%
         
                            if (session != null) {
                                 c = (Client) session.getAttribute("current_user");
                            }
                            else{
                                response.sendRedirect("auth.jsp");
                            }
                            %>
                            Welcome Back : <%= c.getNom() + " " + c.getPrenom()%>
                        </h2>
                    </div>
                </div>

            </section>
        </div>
    </body>
</html>

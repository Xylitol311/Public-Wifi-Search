<%@ page import="com.example.publicwifisearch.service.BookmarkGroupService" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="content-type" content="text/html;charset=UTF-8">

    <link rel="stylesheet" type="text/css" href="/css/form.css">
    <link rel="stylesheet" type="text/css" href="/css/buttons.css">

    <title>Delete bookmark group </title>
</head>
<body>
<%
    BookmarkGroupService service = new BookmarkGroupService();
    long id = Long.parseLong(request.getParameter("id"));
    service.deleteBookmarkGroup(id);
    response.sendRedirect("bookmark-group.jsp");
%>
</body>
</html>
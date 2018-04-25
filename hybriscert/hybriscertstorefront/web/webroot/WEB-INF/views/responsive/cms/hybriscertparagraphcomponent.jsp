<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: rbadea
  Date: 25/02/2018
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<spring:theme code="text.homepage.hybriscertparagraph"
              text="This text comes from the Paragraph Component you just created:"/>${textAttribute}
</br>
Value from controller: ${paragraphValue}

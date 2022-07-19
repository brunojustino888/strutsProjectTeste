<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<html:html xhtml="true" lang="true">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>Calculadora</title>

<script src="<%=request.getContextPath()%>/js/Script1.js"></script>

</head>

<body>
	<div style="margin: 0 auto; display: block; width: 200px">
	<html:errors/>
		<html:form action="/calcula">

			Campo A:
			<html:text property="campoA" size="40" maxlength="50"/>
			<br />
			<br /> 
			Campo B: 
			<html:text property="campoB" size="40" maxlength="50"/>
			<br />
			<br />

<!-- 			<input type="hidden" id="operacaoHidden"  /> -->
			
			<input type="hidden" id="operacaoHidden" name="operacaoHidden" />

			<input onclick="javascript:calcula('+');" type="button" value="Somar" />
			<input onclick="javascript:calcula('-');" type="button"	value="Subtrair" /> 
			
			<br />	<br />	
			
			<% if(request.getAttribute("total")!=null) { %> <h1> O resultado é <%=request.getAttribute("total") %></h1> <% } %>
			
			<bean:write name="calculadoraForm" property="message" />
				
		</html:form>
	</div>


</body>

</html:html>
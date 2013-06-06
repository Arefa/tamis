<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ attribute name="name" required="true" rtexprvalue="true"
			  description="名称对应的属性"%>
<%@ attribute name="label" required="true" rtexprvalue="true"
			  description="提交之后如果有字段有误，将在字段后打印红色提示文字"%>

<spring:bind path="${name}">
	<c:set var="cssGroup" value="control-group ${status.error ? 'error' : '' }"/>
	<div class="${cssGroup}">
		<label class="control-label">${label}</label>
		<div class="controls">
			<form:input path="${name}"/>
			<span class="help-inline">${status.errorMessage}</span>
		</div>
	</div>
</spring:bind>
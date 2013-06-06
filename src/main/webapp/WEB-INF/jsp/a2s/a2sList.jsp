<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="datatables" uri="http://github.com/dandelion/datatables"%>
   
<html lang="zh-CN">

<jsp:include page="../fragments/headTag.jsp"/>

<body>
	<div class="container">
		<jsp:include page="../fragments/bodyHeader.jsp"/>
		<h2>附件2</h2>
		<datatables:table id="a2s" data="${selections}" cdn="true" row="attachment2" theme="bootstrap2" labels="/resources/js/datatables.labels.zh-CN.json"
						  cssClass="table table-striped" paginate="true" info="false" appear="fadein,1500" export="pdf">
			<datatables:column title="序号" property="id"/>
			<datatables:column title="课程编号" display="html">
				<spring:url value="/a2s/{id}.html" var="a2Url">
					<spring:param name="id" value="${attachment2.id}"/>
				</spring:url>
				<a href="${fn:escapeXml(a2Url)}"><c:out value="${attachment2.courseId}"/></a>
			</datatables:column>
			<datatables:column title="课程编号" display="pdf">
				<c:out value="${attachment2.courseId}"/>
			</datatables:column>
			<datatables:column title="课程名称" property="courseName" cssStyle="width:200px;"/>
			<datatables:column title="开课学院" property="courseCollege"/>
			<datatables:export type="pdf" cssClass="btn btn-small"/>
		</datatables:table>
		
		<jsp:include page="../fragments/footer.jsp"/>
		
	</div>
</body>
</html>
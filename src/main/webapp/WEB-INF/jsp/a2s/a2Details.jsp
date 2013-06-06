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
		<h2>重庆大学助教课程申报信息</h2>
		<table class="table table-striped" style="width:800px;">
			<tr>
				<th style="width:150px;">课程编号</th>
				<td style="width:150px;"><c:out value="${attachment2.courseId}"/></td>
				<th style="width:150px;">课程名称</th>
				<td style="width:450px;"><c:out value="${attachment2.courseName}"/></td>
			</tr>
			<tr>
				<th style="width:150px;">通识/大类/专业/素质</th>
				<td style="width:100px;"><c:out value="${attachment2.courseType1}"/></td>
				<th style="width:150px;">必修/选修</th>
				<td style="width:100px;"><c:out value="${attachment2.courseType2}"/></td>
				<th style="width:150px;">课程学分</th>
				<td style="width:100px;"><c:out value="${attachment2.courseCredit}"/></td>
			</tr>
			<tr>
				<th>理论学时</th>
				<td><c:out value="${attachment2.theoryPeriod}"/></td>
				<th>实验学时</th>
				<td><c:out value="${attachment2.experimentPeriod}"/></td>
				<th>上机学时</th>
				<td><c:out value="${attachment2.machinePeriod}"/></td>
			</tr>
			<tr>
				<th>教学班总数</th>
				<td><c:out value="${attachment2.totalNumberClasses}"/></td>
				<th>学生总人数</th>
				<td><c:out value="${attachment2.totalNumberStudents}"/></td>
				<th>授课年级专业（范围）</th>
				<td><c:out value="${attachment2.studentInfo}"/></td>
			</tr>
			<tr>
				<th>听课次数</th>
				<td><c:out value="${attachment2.nbrOfAttendLecture}"/></td>
				<th>批改作业次数</th>
				<td><c:out value="${attachment2.nbrOfChkHomework}"/></td>
				<th>辅导/答疑次数</th>
				<td><c:out value="${attachment2.nbrOfCoach}"/></td>
				<th>习题课次数</th>
				<td><c:out value="${attachment2.nbrOfExercise}"/></td>
				<th>期中（单元）测验次数</th>
				<td><c:out value="${attachment2.nbrOfExam}"/></td>
			</tr>
			<tr>
				<th>指导实验/批改报告次数</th>
				<td><c:out value="${attachment2.nbrOfReport}"/></td>
				<th>课程讨论/研讨次数</th>
				<td><c:out value="${attachment2.nbrOfDiscuss}"/></td>
				<th>课程论文次数</th>
				<td><c:out value="${attachment2.nbrOfThesis}"/></td>
				<th>课外阅读次数</th>
				<td><c:out value="${attachment2.nbrOfReading}"/></td>
			</tr>
			<tr>
				<th>其他环节</th>
				<td><c:out value="${attachment2.otherStuff}"/></td>
			</tr>
			<tr>
				<th>课程考核方式</th>
				<td><c:out value="${attachment2.assessmentMethod}"/></td>
				<th>课程平时成绩（考核）占总成绩比例</th>
				<td><c:out value="${attachment2.usualPercent}"/></td>
			</tr>
			<tr>
				<th>申请助教数</th>
				<td><c:out value="${attachment2.nbrOfTa}"/></td>
			</tr>
			<tr>
				<th>申请配备助教理由</th>
				<td><c:out value="${attachment2.applicationReason}"/></td>
			</tr>
			<tr>
				<th>拟对助教管理和保证助教工作质量采取那些具体措施</th>
				<td><c:out value="${attachment2.implementationMeasure}"/></td>
			</tr>
		</table>
		<jsp:include page="../fragments/footer.jsp"/>
	</div>
</body>
</html>
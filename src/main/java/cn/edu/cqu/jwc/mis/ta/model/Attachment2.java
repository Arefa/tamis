package cn.edu.cqu.jwc.mis.ta.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "attachment2")
public class Attachment2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "course_id")
	@NotEmpty
	private String courseId;
	
	@Column(name = "course_name")
	@NotEmpty
	private String courseName;
	
	@Column(name = "course_college")
	@NotEmpty
	private String courseCollege;
	
	@Column(name = "course_type1")
	@NotEmpty
	private String courseType1;
	
	@Column(name = "course_type2")
	@NotEmpty
	private String courseType2;
	
	@Column(name = "course_credit")
	@NotEmpty
	private Float courseCredit;
	
	@Column(name = "theory_period")
	@NotEmpty
	private Integer theoryPeriod;
	
	@Column(name = "experiment_period")
	@NotEmpty
	private Integer experimentPeriod;
	
	@Column(name = "machine_period")
	@NotEmpty
	private Integer machinePeriod;
	
	@Column(name = "total_number_classes")
	@NotEmpty
	private Integer totalNumberClasses;
	
	@Column(name = "total_number_students")
	@NotEmpty
	private Integer totalNumberStudents;
	
	@Column(name = "student_info")
	@NotEmpty
	private String studentInfo;
	
	@Column(name = "academic_year")
	@NotEmpty
	private String academicYear;
	
	@Column(name = "term")
	@NotEmpty
	private String term;
	
	@Column(name = "submit_date")
	@NotEmpty
	private Date submitDate;
	
	@Column(name = "nbr_of_attend_lecture")
	@NotEmpty
	private Integer nbrOfAttendLecture;
	
	@Column(name = "nbr_of_chk_homework")
	@NotEmpty
	private Integer nbrOfChkHomework;
	
	@Column(name = "nbr_of_coach")
	@NotEmpty
	private Integer nbrOfCoach;
	
	@Column(name = "nbr_of_exercise")
	@NotEmpty
	private Integer nbrOfExercise;
	
	@Column(name = "nbr_of_exam")
	@NotEmpty
	private Integer nbrOfExam;
	
	@Column(name = "nbr_of_report")
	@NotEmpty
	private Integer nbrOfReport;
	
	@Column(name = "nbr_of_discuss")
	@NotEmpty
	private Integer nbrOfDiscuss;

	@Column(name = "nbr_of_thesis")
	@NotEmpty
	private Integer nbrOfThesis;
	
	@Column(name = "nbr_of_reading")
	@NotEmpty
	private Integer nbrOfReading;
	
	@Column(name = "other_stuff")
	@NotEmpty
	private String otherStuff;
	
	@Column(name = "assessment_method")
	@NotEmpty
	private String assessmentMethod;
	
	@Column(name = "usual_percent")
	@NotEmpty
	private String usualPercent;
	
	@Column(name = "nbr_of_ta")
	@NotEmpty
	private Integer nbrOfTa;
	
	@Column(name = "application_reason")
	@NotEmpty
	private String applicationReason;
	
	@Column(name = "implementation_measure")
	@NotEmpty
	private String implementationMeasure;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseCollege() {
		return courseCollege;
	}

	public void setCourseCollege(String courseCollege) {
		this.courseCollege = courseCollege;
	}

	public String getCourseType1() {
		return courseType1;
	}

	public void setCourseType1(String courseType1) {
		this.courseType1 = courseType1;
	}

	public String getCourseType2() {
		return courseType2;
	}

	public void setCourseType2(String courseType2) {
		this.courseType2 = courseType2;
	}

	public Float getCourseCredit() {
		return courseCredit;
	}

	public void setCourseCredit(Float courseCredit) {
		this.courseCredit = courseCredit;
	}

	public Integer getTheoryPeriod() {
		return theoryPeriod;
	}

	public void setTheoryPeriod(Integer theoryPeriod) {
		this.theoryPeriod = theoryPeriod;
	}

	public Integer getExperimentPeriod() {
		return experimentPeriod;
	}

	public void setExperimentPeriod(Integer experimentPeriod) {
		this.experimentPeriod = experimentPeriod;
	}

	public Integer getMachinePeriod() {
		return machinePeriod;
	}

	public void setMachinePeriod(Integer machinePeriod) {
		this.machinePeriod = machinePeriod;
	}

	public Integer getTotalNumberClasses() {
		return totalNumberClasses;
	}

	public void setTotalNumberClasses(Integer totalNumberClasses) {
		this.totalNumberClasses = totalNumberClasses;
	}

	public Integer getTotalNumberStudents() {
		return totalNumberStudents;
	}

	public void setTotalNumberStudents(Integer totalNumberStudents) {
		this.totalNumberStudents = totalNumberStudents;
	}

	public String getStudentInfo() {
		return studentInfo;
	}

	public void setStudentInfo(String studentInfo) {
		this.studentInfo = studentInfo;
	}

	public String getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public Date getSubmitDate() {
		return submitDate;
	}

	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}

	public Integer getNbrOfAttendLecture() {
		return nbrOfAttendLecture;
	}

	public void setNbrOfAttendLecture(Integer nbrOfAttendLecture) {
		this.nbrOfAttendLecture = nbrOfAttendLecture;
	}

	public Integer getNbrOfChkHomework() {
		return nbrOfChkHomework;
	}

	public void setNbrOfChkHomework(Integer nbrOfChkHomework) {
		this.nbrOfChkHomework = nbrOfChkHomework;
	}

	public Integer getNbrOfCoach() {
		return nbrOfCoach;
	}

	public void setNbrOfCoach(Integer nbrOfCoach) {
		this.nbrOfCoach = nbrOfCoach;
	}

	public Integer getNbrOfExercise() {
		return nbrOfExercise;
	}

	public void setNbrOfExercise(Integer nbrOfExercise) {
		this.nbrOfExercise = nbrOfExercise;
	}

	public Integer getNbrOfExam() {
		return nbrOfExam;
	}

	public void setNbrOfExam(Integer nbrOfExam) {
		this.nbrOfExam = nbrOfExam;
	}

	public Integer getNbrOfReport() {
		return nbrOfReport;
	}

	public void setNbrOfReport(Integer nbrOfReport) {
		this.nbrOfReport = nbrOfReport;
	}

	public Integer getNbrOfDiscuss() {
		return nbrOfDiscuss;
	}

	public void setNbrOfDiscuss(Integer nbrOfDiscuss) {
		this.nbrOfDiscuss = nbrOfDiscuss;
	}

	public Integer getNbrOfThesis() {
		return nbrOfThesis;
	}

	public void setNbrOfThesis(Integer nbrOfThesis) {
		this.nbrOfThesis = nbrOfThesis;
	}

	public Integer getNbrOfReading() {
		return nbrOfReading;
	}

	public void setNbrOfReading(Integer nbrOfReading) {
		this.nbrOfReading = nbrOfReading;
	}

	public String getOtherStuff() {
		return otherStuff;
	}

	public void setOtherStuff(String otherStuff) {
		this.otherStuff = otherStuff;
	}

	public String getAssessmentMethod() {
		return assessmentMethod;
	}

	public void setAssessmentMethod(String assessmentMethod) {
		this.assessmentMethod = assessmentMethod;
	}

	public String getUsualPercent() {
		return usualPercent;
	}

	public void setUsualPercent(String usualPercent) {
		this.usualPercent = usualPercent;
	}

	public Integer getNbrOfTa() {
		return nbrOfTa;
	}

	public void setNbrOfTa(Integer nbrOfTa) {
		this.nbrOfTa = nbrOfTa;
	}

	public String getApplicationReason() {
		return applicationReason;
	}

	public void setApplicationReason(String applicationReason) {
		this.applicationReason = applicationReason;
	}

	public String getImplementationMeasure() {
		return implementationMeasure;
	}

	public void setImplementationMeasure(String implementationMeasure) {
		this.implementationMeasure = implementationMeasure;
	}
	
	
}

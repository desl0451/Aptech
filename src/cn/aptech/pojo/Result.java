package cn.aptech.pojo;

public class Result {
	
	private int id; //编号
	private String studentno;//学号
	private int subjectid; //科目id
	private int studentresult;//成绩
	private int gradeid;//年级id
	private int typeid;//类型编号
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentno() {
		return studentno;
	}
	public void setStudentno(String studentno) {
		this.studentno = studentno;
	}
	public int getSubjectid() {
		return subjectid;
	}
	public void setSubjectid(int subjectid) {
		this.subjectid = subjectid;
	}
	public int getStudentresult() {
		return studentresult;
	}
	public void setStudentresult(int studentresult) {
		this.studentresult = studentresult;
	}
	public int getGradeid() {
		return gradeid;
	}
	public void setGradeid(int gradeid) {
		this.gradeid = gradeid;
	}
	public int getTypeid() {
		return typeid;
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
}

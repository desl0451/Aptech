package cn.aptech.pojo;

import java.util.Date;

public class User {
	private Integer id;// 主键id
	private String cardno;//学员学号
	private String username;// 用户名
	private String password;// 密码
	private Date borndate;//学员年龄
	private String sex;//
	private String email;// 开发者邮箱
	private String userinfo; // 个人简介
	private Date creationdate;// 创建时间
	private Date modifydate;// 更新时间
	private String pic;//学员照片
	private Date admissionDate;//入学日期
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the cardno
	 */
	public String getCardno() {
		return cardno;
	}
	/**
	 * @param cardno the cardno to set
	 */
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the borndate
	 */
	public Date getBorndate() {
		return borndate;
	}
	/**
	 * @param borndate the borndate to set
	 */
	public void setBorndate(Date borndate) {
		this.borndate = borndate;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the userinfo
	 */
	public String getUserinfo() {
		return userinfo;
	}
	/**
	 * @param userinfo the userinfo to set
	 */
	public void setUserinfo(String userinfo) {
		this.userinfo = userinfo;
	}
	/**
	 * @return the creationdate
	 */
	public Date getCreationdate() {
		return creationdate;
	}
	/**
	 * @param creationdate the creationdate to set
	 */
	public void setCreationdate(Date creationdate) {
		this.creationdate = creationdate;
	}
	/**
	 * @return the modifydate
	 */
	public Date getModifydate() {
		return modifydate;
	}
	/**
	 * @param modifydate the modifydate to set
	 */
	public void setModifydate(Date modifydate) {
		this.modifydate = modifydate;
	}
	/**
	 * @return the pic
	 */
	public String getPic() {
		return pic;
	}
	/**
	 * @param pic the pic to set
	 */
	public void setPic(String pic) {
		this.pic = pic;
	}
	/**
	 * @return the admissionDate
	 */
	public Date getAdmissionDate() {
		return admissionDate;
	}
	/**
	 * @param admissionDate the admissionDate to set
	 */
	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}
	
	

}

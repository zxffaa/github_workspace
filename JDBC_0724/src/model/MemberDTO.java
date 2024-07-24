package model;

public class MemberDTO {
	private int CUSTNO;
	private String CUSTNAME;
	private String PHONE;
	private String GENDER;
	private String JOINDATE;
	private String GRADE;
	private String CITY;
	public int getCUSTNO() {
		return CUSTNO;
	}
	public void setCUSTNO(int cUSTNO) {
		CUSTNO = cUSTNO;
	}
	public String getCUSTNAME() {
		return CUSTNAME;
	}
	public void setCUSTNAME(String cUSTNAME) {
		CUSTNAME = cUSTNAME;
	}
	public String getPHONE() {
		return PHONE;
	}
	public void setPHONE(String pHONE) {
		PHONE = pHONE;
	}
	public String getGENDER() {
		return GENDER;
	}
	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}
	public String getJOINDATE() {
		return JOINDATE;
	}
	public void setJOINDATE(String jOINDATE) {
		JOINDATE = jOINDATE;
	}
	public String getGRADE() {
		return GRADE;
	}
	public void setGRADE(String gRADE) {
		GRADE = gRADE;
	}
	public String getCITY() {
		return CITY;
	}
	public void setCITY(String cITY) {
		CITY = cITY;
	}
}

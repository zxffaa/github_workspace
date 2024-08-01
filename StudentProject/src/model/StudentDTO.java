package model;

public class StudentDTO {
	private String syear;
	private String sclass;
	private String sno;
	private String sname;
	private String birth;
	private String gender;
	private String tel1;
	private String tel2;
	private String tel3;
	private String tname;
	private int kor;
	private int eng;
	private int mat;
	private int add;
	private double avg;
	private double KORAVG;
	private double ENGAVG;
	private double MATAVG;
	
	public double getKORAVG() {
		return KORAVG;
	}
	public void setKORAVG(double kORAVG) {
		KORAVG = kORAVG;
	}
	public double getENGAVG() {
		return ENGAVG;
	}
	public void setENGAVG(double eNGAVG) {
		ENGAVG = eNGAVG;
	}
	public double getMATAVG() {
		return MATAVG;
	}
	public void setMATAVG(double mATAVG) {
		MATAVG = mATAVG;
	}
	public int getAdd() {
		return add;
	}
	public void setAdd(int add) {
		this.add = add;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getSyear() {
		return syear;
	}
	public void setSyear(String syear) {
		this.syear = syear;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTel1() {
		return tel1;
	}
	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}
	public String getTel2() {
		return tel2;
	}
	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}
	public String getTel3() {
		return tel3;
	}
	public void setTel3(String tel3) {
		this.tel3 = tel3;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}

}

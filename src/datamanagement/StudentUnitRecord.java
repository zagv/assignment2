
// This program implements the record of the students
// Author: Anuj Nepal
// Date created : 28/08/2015
package datamanagement;
// student unit record is implementing from Istudentunitrecord
public class StudentUnitRecord implements IStudentUnitRecord {
// sid is private and a integer	
private Integer sid;
// uc is a private and string
	private String uc;
// allocating a1,a2,ex as float 
	private float a1, a2, ex;
// defining Student unit records 
/**
 * StudentUnitRecord function
 * author: vuq
 * **/

	public StudentUnitRecord(Integer id, String code, float asg1, float asg2,
			float exam) {
		this.sid = id;
		this.uc = code;
		this.setAsg1(asg1);
		this.setAsg2(asg2);
		this.setExam(exam);
	}

	public Integer getStudentID() {
		return sid;
	}

	public String getUnitCode() {
		return uc;
	}

	public void setAsg1(float a1) {
		if (a1 < 0 ||
			a1 > UnitManager.UM().getUnit(uc).getAsg1Weight()) {
			throw new RuntimeException("Mark cannot be less than zero or greater than assessment weight");
		}
		this.a1 = a1;
	}

	public float getAsg1() {

		return a1;
	}

	public void setAsg2(float a2) {
		if (a2 < 0 ||
			a2 > UnitManager.UM().getUnit(uc).getAsg2Weight()) {
			throw new RuntimeException("Mark cannot be less than zero or greater than assessment weight");
		}
		this.a2 = a2;

	}

	public float getAsg2() {
		return a2;
	}

	public void setExam(float ex) {
		if (ex < 0 ||
				ex > UnitManager.UM().getUnit(uc).getExamWeight()) {
				throw new RuntimeException("Mark cannot be less than zero or greater than assessment weight");
			}
		this.ex = ex;
	}

	public float getExam() {
		return ex;
	}

	public float getTotal() {
		return a1 + a2 + ex;

	}
}

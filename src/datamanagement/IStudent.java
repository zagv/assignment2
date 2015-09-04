package datamanagement;

/***
 * This is IStudent() class;
 * This class is to contain interface of Students Object
 * @author vuq
 * */
public interface IStudent {
	/***
	 * This is getID() function;
	 * get ID of students
	 * @author vuq
	 * */
    public Integer getID();

    public String getFirstName();
    public void setFirstName(String firstName);

    public String getLastName();
    public void setLastName(String lastName);

    public void addUnitRecord( IStudentUnitRecord record );
    public IStudentUnitRecord getUnitRecord( String unitCode );

    public StudentUnitRecordList getUnitRecords();

}

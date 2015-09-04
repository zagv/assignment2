package datamanagement;
/***
 * This is ListStudentsCTL() function;
 * This class is to list all of the Students of CSU
 * @author vuq
 * */
        public class ListStudentsCTL {
private StudentManager sm;
public ListStudentsCTL() {sm = StudentManager.get();}
            public void listStudents( IStudentLister lister, String unitCode ) {
    lister.clearStudents();
                StudentMap students = sm.getStudentsByUnit( unitCode );
for (Integer id : students.keySet() ) lister.addStudent(students.get(id));}}

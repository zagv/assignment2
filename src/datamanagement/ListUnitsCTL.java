package datamanagement;
/***
 * This is ListStudentsCTL() function;
 * This class is to list all of the Units of CSU
 * @author vuq
 * */
public class ListUnitsCTL {
    private UnitManager um;
public ListUnitsCTL() {
        um = UnitManager.UM();
}
            public void listUnits( IUnitLister lister ) {
lister.clearUnits();UnitMap units = um.getUnits();
        for (String s : units.keySet() )
            lister.addUnit(units.get(s));}}

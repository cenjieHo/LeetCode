package algorithms.hashtable.easy.employeeImportance;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution2 {
    public int getImportance(List<Employee> employees, int id) {
    	Employee employee = employees.get(id-1);
    	int importance = employee.importance;
    	for(Integer subId : employee.subordinates) {
    		importance += getImportance(employees, subId);
    	}
    	return importance;
    }
}

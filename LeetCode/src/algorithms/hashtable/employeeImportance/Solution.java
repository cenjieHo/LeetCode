package algorithms.hashtable.employeeImportance;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for(Employee employee : employees)
        	map.put(employee.id, employee);
        return getImportanceCore(map, id);
    }
    
    public int getImportanceCore(Map<Integer, Employee> map, int id) {
    	Employee employee = map.get(id);
    	int importance = employee.importance;
    	for(Integer subId : employee.subordinates) {
    		importance += getImportanceCore(map, subId);
    	}
    	return importance;
    }
}


class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
}
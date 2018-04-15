package employeesImportance690;

import java.util.List;

/**
 * Created by wb on 2017/11/27.
 */
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        for (Employee e : employees) {
            if (e.id == id) {
                return getTotalImportance(e, employees);
            }
        }
        return 0;
    }

    private int getTotalImportance(Employee e, List<Employee> employees) {
        int res = e.importance;
        if(e.subordinates == null){
            return res;
        }
        for (int id : e.subordinates) {
            for (Employee subE : employees) {
                if (subE.id == id) {
                    res += getTotalImportance(subE, employees);
                }
            }
        }
        return res;
    }

}

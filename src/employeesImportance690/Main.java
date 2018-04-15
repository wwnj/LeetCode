package employeesImportance690;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wb on 2017/11/27.
 */
public class Main {
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.id=1;
        e1.importance=5;
        e1.subordinates=new ArrayList<>();
        e1.subordinates.add(2);
        e1.subordinates.add(3);

        Employee e2 = new Employee();
        e2.id=2;
        e2.importance=3;

        Employee e3 = new Employee();
        e3.id=3;
        e3.importance=3;

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        Solution solution = new Solution();
        System.out.println(solution.getImportance(employees,1));
    }
}

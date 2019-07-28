package domain.mediator;



import java.io.IOException;
import java.util.ArrayList;

import domain.model.Employee;
import domain.model.EmployeesList;


public interface EmployeesPersistence
{
   public EmployeesList getEmployeesByName(String name) throws IOException;
   public void AddEmployee(Employee employee) throws IOException;
   public void RemoveEmployee(Employee employee) throws IOException;
   public void EditEmployee(Employee employee) throws IOException;

  

   
}

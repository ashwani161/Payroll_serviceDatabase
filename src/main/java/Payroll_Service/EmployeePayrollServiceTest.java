package Payroll_Service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class EmployeePayrollServiceTest {
	EmployeePayrollService employeePayrollService;
	List<EmployeePayrollData> employeePayrollList;
	
	@Test
	public void givenEmployeePayrollInDB_WhenRetrived_ShouldMatchEmployeeCount() {
        employeePayrollService = new EmployeePayrollService();
		employeePayrollList = employeePayrollService.readEmployeePayrollData(EmployeePayrollService.IOService.DB_IO);
		Assert.assertEquals(3, employeePayrollList.size());
	}

}

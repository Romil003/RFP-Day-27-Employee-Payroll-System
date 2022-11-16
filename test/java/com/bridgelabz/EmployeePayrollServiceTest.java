package com.bridgelabz;

import org.junit.Test;

import java.util.Arrays;



public class EmployeePayrollServiceTest {

    @Test
    public void givenThreeEmployee_WhenWrittenToFile_ShouldMatchEmployeeEntries(){
        EmployeePayrollData[] arrayOfEmps = {
                new EmployeePayrollData(1,"Rakya",25000),
                new EmployeePayrollData(2,"Nagya",26000),
                new EmployeePayrollData(3,"Reema",28000)
        };
        EmployeePayrollService employeePayrollService;
        employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmps));
        employeePayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
        employeePayrollService.printEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
    }
}

package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.bridgelabz.EmployeePayrollService.IOService.CONSOLE_IO;
import static com.bridgelabz.EmployeePayrollService.IOService.FILE_IO;

public class EmployeePayrollService {

    public enum IOService{
        FILE_IO,CONSOLE_IO,DB_IO,REST_IO
    }

    private List<EmployeePayrollData> employeePayrollList;

    public EmployeePayrollService() {
    }

    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(CONSOLE_IO);
        employeePayrollService.writeEmployeePayrollData(CONSOLE_IO) ;
    }


    public long readEmployeePayrollData(IOService ioService) {
        if (ioService.equals(FILE_IO)){
            this.employeePayrollList = new EmployeePayrollFileIOService().readData();
        }
        return employeePayrollList.size();
    }

    public void writeEmployeePayrollData(IOService ioService) {
        if(ioService.equals(CONSOLE_IO)){
            System.out.println("Writing Employee Payroll Data to Console\n " + employeePayrollList );
        } else if (ioService.equals(FILE_IO)) {
            new EmployeePayrollFileIOService().writeData(employeePayrollList);
        }
    }

    public void printEmployeePayrollData(IOService ioService){
        if (ioService.equals(FILE_IO)){
            new EmployeePayrollFileIOService().printData();
        }
    }

    public long countEntries(IOService ioService) {
        if (ioService.equals(FILE_IO)){
            return new EmployeePayrollFileIOService().countEntries();
        }
        return 0;
    }
}

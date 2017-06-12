package org.sudharsan.simpleservice;

import org.sudharsan.simpleservice.getdepartment.EmpDepartmentRequestType;
import org.sudharsan.simpleservice.getdepartment.EmpDepartmentResponseType;

public class GetDepartmentsServiceImpl implements GetDepartmentsService {

	public EmpDepartmentResponseType getDepartment(EmpDepartmentRequestType parameters) {
		String empId = parameters.getEmpId();
		int empNo = Integer.parseInt(empId);
		EmpDepartmentResponseType emp = new EmpDepartmentResponseType();
		if (empNo % 4 == 0) {
			emp = getResponse("Excelacom","CPQ", parameters);
		} else {
			emp = getResponse("Excelacom","FPT", parameters);
		}
		return emp;
	}

	private EmpDepartmentResponseType getResponse(String companyName, String projName, EmpDepartmentRequestType parameters) {
		EmpDepartmentResponseType emp = new EmpDepartmentResponseType();
		emp.setCompanyName(companyName);
		emp.setDepartmentName(projName);
		emp.setEmpId(parameters.getEmpId());
		return emp;
	}

}

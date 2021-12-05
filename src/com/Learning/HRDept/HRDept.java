package com.Learning.HRDept;

import com.Learning.SuperDept.SuperDept;

public class HRDept extends SuperDept{
	
	public String departmentName() {
		return "HR Department";
	}
	
	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String doActivity() {
		return "team lunch";
	}

}

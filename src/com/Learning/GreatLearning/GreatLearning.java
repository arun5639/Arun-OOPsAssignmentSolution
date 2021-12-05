package com.Learning.GreatLearning;

import com.Learning.AdminDept.AdminDept;
import com.Learning.HRDept.HRDept;
import com.Learning.TechDept.TechDept;

public class GreatLearning {

	public static void main(String[] args) {
		
		AdminDept admin = new AdminDept();
		HRDept hr = new HRDept();
		TechDept tech = new TechDept();
		
		System.out.println("Welcome to "+admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday()+"\n");		
		
		System.out.println("Welcome to "+hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday()+"\n");
		
		System.out.println("Welcome to "+tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());	
		
	}

}

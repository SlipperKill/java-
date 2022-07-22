/**
 * Created on 2018年4月9日 by caiming
 */
package com.demo.composite;

public class FinanceDepartment extends Company {

	public FinanceDepartment(String name) {
		super(name);
	}

	@Override
	public void add(Company c) {

	}

	@Override
	public void remove(Company c) {

	}

	@Override
	public void display(int depth) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < depth; i++) {
			sb.append("-");
		}
		System.out.println(sb.toString() + super.name);
	}

	@Override
	public void lineOfDuty() {
		System.out.println(super.name+" 公司收支财务管理");
	}

}


package com.model.templ.computer;

import com.model.templ.ComputerMakeAbstract;
/**
 * dell电脑
 * @author Administrator
 *
 */
public class DellComputer extends ComputerMakeAbstract{

	@Override
	protected void makeCPU() {
		System.out.println("我是DELL电脑的CPU");
	}

	@Override
	protected void makeHardDisk() {
		System.out.println("我是DELL电脑的硬盘");
		
	}

	@Override
	protected void makeKeyBoard() {
		System.out.println("我是DELL电脑的键盘");
		
	}

}

package com.model.templ.computer;

import com.model.templ.ComputerMakeAbstract;
/**
 * 联想电脑
 * @author Administrator
 *
 */
public class LenovoComputer extends ComputerMakeAbstract{

	@Override
	protected void makeCPU() {
		System.out.println("我是LENOVO电脑的CPU");
	}

	@Override
	protected void makeHardDisk() {
		System.out.println("我是LENOVO电脑的硬盘");
	}

	@Override
	protected void makeKeyBoard() {
		System.out.println("我是LENOVO电脑的键盘");
	}

}

package com.model.templ.computer;

import com.model.templ.ComputerMakeAbstract;
/**
 * �������
 * @author Administrator
 *
 */
public class LenovoComputer extends ComputerMakeAbstract{

	@Override
	protected void makeCPU() {
		System.out.println("����LENOVO���Ե�CPU");
	}

	@Override
	protected void makeHardDisk() {
		System.out.println("����LENOVO���Ե�Ӳ��");
	}

	@Override
	protected void makeKeyBoard() {
		System.out.println("����LENOVO���Եļ���");
	}

}

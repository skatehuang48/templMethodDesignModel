package com.model.templ.computer;

import com.model.templ.ComputerMakeAbstract;
/**
 * dell����
 * @author Administrator
 *
 */
public class DellComputer extends ComputerMakeAbstract{

	@Override
	protected void makeCPU() {
		System.out.println("����DELL���Ե�CPU");
	}

	@Override
	protected void makeHardDisk() {
		System.out.println("����DELL���Ե�Ӳ��");
		
	}

	@Override
	protected void makeKeyBoard() {
		System.out.println("����DELL���Եļ���");
		
	}

}

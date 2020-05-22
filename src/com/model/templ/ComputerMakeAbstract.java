package com.model.templ;

/**
 * 模板方法模式（基于继承的代码服用技术） 制作电脑的抽象类
 * @author Administrator
 *
 */
public abstract class ComputerMakeAbstract {
	//制作cpu
	protected abstract void makeCPU();
	//制作硬盘
	protected abstract void makeHardDisk();
	//制作键盘
	protected abstract void makeKeyBoard();
	//制作摄像头，假设所有的电脑用的都是同一种摄像头 则父类抽象出的基本方法不能由子类重载
	protected final void makeCamera(){
		System.out.println("我是所有电脑通用的摄像头");
	}
	
	//模板方法、定义共用的制作逻辑形成制作电脑的算法框架，此处不允许子类重载修改 座椅得加常量修饰符
	protected final void makeComputer(){
		//算法逻辑通过调用父类的基本方法实现，具体的方法步骤由不同子类重载实现
		makeCPU();
		makeHardDisk();
		makeKeyBoard();
		makeCamera();
	}
}

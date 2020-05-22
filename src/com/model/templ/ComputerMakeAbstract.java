package com.model.templ;

/**
 * ģ�巽��ģʽ�����ڼ̳еĴ�����ü����� �������Եĳ�����
 * @author Administrator
 *
 */
public abstract class ComputerMakeAbstract {
	//����cpu
	protected abstract void makeCPU();
	//����Ӳ��
	protected abstract void makeHardDisk();
	//��������
	protected abstract void makeKeyBoard();
	//��������ͷ���������еĵ����õĶ���ͬһ������ͷ ���������Ļ���������������������
	protected final void makeCamera(){
		System.out.println("�������е���ͨ�õ�����ͷ");
	}
	
	//ģ�巽�������干�õ������߼��γ��������Ե��㷨��ܣ��˴����������������޸� ���εüӳ������η�
	protected final void makeComputer(){
		//�㷨�߼�ͨ�����ø���Ļ�������ʵ�֣�����ķ��������ɲ�ͬ��������ʵ��
		makeCPU();
		makeHardDisk();
		makeKeyBoard();
		makeCamera();
	}
}

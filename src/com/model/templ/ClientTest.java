package com.model.templ;

import com.model.templ.computer.DellComputer;
import com.model.templ.computer.LenovoComputer;

public class ClientTest {
	public static void main(String[] args) {
		ComputerMakeAbstract dell = new DellComputer();
		dell.makeComputer();
		ComputerMakeAbstract lenovo = new LenovoComputer();
		lenovo.makeComputer();
	}
}

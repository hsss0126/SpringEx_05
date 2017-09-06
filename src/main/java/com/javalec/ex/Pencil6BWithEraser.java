package com.javalec.ex;

public class Pencil6BWithEraser extends Pencil6B {

	@Override
	public void use() {
		super.use();
		System.out.println("+ 지우개");
	}

}

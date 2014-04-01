package com.ug.domain;

public class TestClass {

	private int a = 5;
	public int b = 4;
	private Foo aFoo = new Foo();
	public Foo bFoo = new Foo();

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public Foo getaFoo() {
		return aFoo;
	}

	public void setaFoo(Foo aFoo) {
		this.aFoo = aFoo;
	}

	public Foo getbFoo() {
		return bFoo;
	}

	public void setbFoo(Foo bFoo) {
		this.bFoo = bFoo;
	}
}

package com.ug.reflections;

import java.lang.reflect.Field;

import com.ug.domain.Foo;
import com.ug.domain.TestClass;

public class Benchmark {
	public final int iterations = 1000000;
	Foo f = new Foo();
	int a = 5;
	Field fieldA;
	Field fieldB;
	Field fieldaFoo;
	Field fieldbFoo;
	TestClass tC;
	
	public Benchmark(TestClass tC){
		this.tC=tC;
		try {
			fieldA = tC.getClass().getDeclaredField("a");
			fieldA.setAccessible(true);
			fieldB = tC.getClass().getField("b");
			fieldaFoo = tC.getClass().getDeclaredField("aFoo");	
			fieldaFoo.setAccessible(true);
			fieldbFoo = tC.getClass().getDeclaredField("bFoo");
			
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doExercise() {
		for (int i = 0; i < iterations; i++) {
			tC.getA();
			tC.getaFoo();
			a = tC.b;
			f = tC.bFoo;
		}
	}

	public long getDurationOfPubPrimRead() {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < iterations; i++) {
			a = tC.b;
		}
		return System.currentTimeMillis() - startTime;
	}

	public long getDurationOfPubRefRead() {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < iterations; i++) {
			f = tC.bFoo;
		}
		return System.currentTimeMillis() - startTime;

	}

	public long getDurationOfPubPrimWrite() {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < iterations; i++) {
			tC.b = 100;
		}
		return System.currentTimeMillis() - startTime;

	}

	public long getDurationOfPubRefWrite() {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < iterations; i++) {
			f=tC.bFoo;
		}
		return System.currentTimeMillis() - startTime;

	}

	public long getDurationOfPrivPrimRead() {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < iterations; i++) {
			tC.getA();
		}
		return System.currentTimeMillis() - startTime;

	}

	public long getDurationOfPrivRefRead() {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < iterations; i++) {
			tC.getaFoo();
		}
		return System.currentTimeMillis() - startTime;

	}

	public long getDurationOfPrivPrimWrite() {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < iterations; i++) {
			tC.setA(200);
		}
		return System.currentTimeMillis() - startTime;

	}

	public long getDurationOfPrivRefWrite() {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < iterations; i++) {
			tC.setaFoo(f);
		}
		return System.currentTimeMillis() - startTime;

	}
	
	public long getDurationOfPubReflectionsRead() {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < iterations; i++) {
			
			try {
				fieldB.get(tC);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return System.currentTimeMillis() - startTime;
	}
	
	public long getDurationOfPrivReflectionsRead() {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < iterations; i++) {
			try {
				fieldA.get(tC);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return System.currentTimeMillis() - startTime;
	}
	
	public long getDurationOfPubReflectionsWrite() {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < iterations; i++) {
			try {
				fieldB.set(tC, 5);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return System.currentTimeMillis() - startTime;
	}
	
	public long getDurationOfPrivReflectionsWrite() {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < iterations; i++) {
			try {
				fieldA.set(tC, 5);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return System.currentTimeMillis() - startTime;
	}
	
	public long getDurationOfPubReflectionsRefRead(){
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < iterations; i++) {
			try {
				fieldbFoo.get(tC);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return System.currentTimeMillis() - startTime;
	}
	
	public long getDurationOfPrivReflectionsRefRead(){
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < iterations; i++) {
			try {
				fieldaFoo.get(tC);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return System.currentTimeMillis() - startTime;
	}
	
	public long getDurationOfPubReflectionsRefWrite(){
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < iterations; i++) {
			try {
				fieldbFoo.set(tC, f);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return System.currentTimeMillis() - startTime;
	}
	
	public long getDurationOfPrivReflectionsRefWrite(){
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < iterations; i++) {
			try {
				fieldaFoo.set(tC, f);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return System.currentTimeMillis() - startTime;
	}
	
	

}
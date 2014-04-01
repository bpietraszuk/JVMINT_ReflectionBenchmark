package com.ug.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ug.domain.BenchmarkUnit;
import com.ug.domain.TestClass;
import com.ug.reflections.Benchmark;

public class BenchmarkTest {
	public Benchmark benchmark;
	TestClass tC = new TestClass();
	BenchmarkUnit bU;
	public List<BenchmarkUnit> bUnitsList = new ArrayList<>();

	public BenchmarkTest() {
		benchmark = new Benchmark(tC);
		benchmark.doExercise();
	}

	@Test
	public void test() {
		bU = new BenchmarkUnit();
		// System.out.println("Getting value from private field by method: "+benchmark.getDurationOfPrivPrimRead());
		bU.setTypeOfTest("GPPM");
		bU.setTypeOfTestName("Getting value from private field by method");
		bU.setDuration(benchmark.getDurationOfPrivPrimRead());
		bUnitsList.add(bU);

		// System.out.println("Setting value of private field by method: "+benchmark.getDurationOfPrivPrimWrite());
		bU = new BenchmarkUnit();
		bU.setTypeOfTestName("Setting value of private field by method");
		bU.setTypeOfTest("SPPM");
		bU.setDuration(benchmark.getDurationOfPrivPrimWrite());
		bUnitsList.add(bU);

		// System.out.println("Getting value from private referenced object by method: "+benchmark.getDurationOfPrivRefRead());
		bU = new BenchmarkUnit();
		bU.setTypeOfTestName("Getting value from private referenced object by method");
		bU.setTypeOfTest("GPRM");
		bU.setDuration(benchmark.getDurationOfPrivRefRead());
		bUnitsList.add(bU);

		// System.out.println("Setting value of private referenced object by method: "+benchmark.getDurationOfPrivRefWrite());
		bU = new BenchmarkUnit();
		bU.setTypeOfTestName("Setting value of private referenced object by method");
		bU.setTypeOfTest("SPRM");
		bU.setDuration(benchmark.getDurationOfPrivRefWrite());
		bUnitsList.add(bU);

		// System.out.println("Getting value from public field: "+benchmark.getDurationOfPubPrimRead());
		bU = new BenchmarkUnit();
		bU.setTypeOfTestName("Getting value from public field");
		bU.setTypeOfTest("GPUP");
		bU.setDuration(benchmark.getDurationOfPubPrimRead());
		bUnitsList.add(bU);

		// System.out.println("Setting value of public field: "+benchmark.getDurationOfPubPrimWrite());
		bU = new BenchmarkUnit();
		bU.setTypeOfTestName("Setting value of public field");
		bU.setTypeOfTest("SPUP");
		bU.setDuration(benchmark.getDurationOfPubPrimWrite());
		bUnitsList.add(bU);

		// System.out.println("Getting value from public referenced object: "+benchmark.getDurationOfPubRefRead());
		bU = new BenchmarkUnit();
		bU.setTypeOfTestName("Getting value from public referenced object");
		bU.setTypeOfTest("GPUR");
		bU.setDuration(benchmark.getDurationOfPubRefRead());
		bUnitsList.add(bU);

		// System.out.println("Setting value of public referenced object: "+benchmark.getDurationOfPubRefWrite());
		bU = new BenchmarkUnit();
		bU.setTypeOfTestName("Setting value of public referenced object");
		bU.setTypeOfTest("SPUR");
		bU.setDuration(benchmark.getDurationOfPubRefWrite());
		bUnitsList.add(bU);

		// System.out.println("Getting value from public field using reflections: "+benchmark.getDurationOfPubReflectionsRead());
		bU = new BenchmarkUnit();
		bU.setTypeOfTestName("Getting value from public field using reflections");
		bU.setTypeOfTest("GPURF");
		bU.setDuration(benchmark.getDurationOfPubReflectionsRead());
		bUnitsList.add(bU);

		// System.out.println("Getting value from private field using reflections: "+benchmark.getDurationOfPrivReflectionsRead());
		bU = new BenchmarkUnit();
		bU.setTypeOfTestName("Getting value from private field using reflections");
		bU.setTypeOfTest("GPRF");
		bU.setDuration(benchmark.getDurationOfPrivReflectionsRead());
		bUnitsList.add(bU);

		// System.out.println("Setting value of public field using reflections: "+benchmark.getDurationOfPubReflectionsWrite());
		bU = new BenchmarkUnit();
		bU.setTypeOfTestName("Setting value of public field using reflections");
		bU.setTypeOfTest("SPURF");
		bU.setDuration(benchmark.getDurationOfPubReflectionsWrite());
		bUnitsList.add(bU);

		// System.out.println("Setting value of private field using reflections: "+benchmark.getDurationOfPrivReflectionsWrite());
		bU = new BenchmarkUnit();
		bU.setTypeOfTestName("Setting value of private field using reflections");
		bU.setTypeOfTest("SPRF");
		bU.setDuration(benchmark.getDurationOfPrivReflectionsWrite());
		bUnitsList.add(bU);

		// System.out.println("Getting value of public referenced object using reflections: "+benchmark.getDurationOfPubReflectionsRefRead());
		bU = new BenchmarkUnit();
		bU.setTypeOfTestName("Getting value of public referenced object using reflections");
		bU.setTypeOfTest("GPURRF");
		bU.setDuration(benchmark.getDurationOfPubReflectionsRefRead());
		bUnitsList.add(bU);

		// System.out.println("Getting value from private referenced object using reflections: "+benchmark.getDurationOfPrivReflectionsRefRead());
		bU = new BenchmarkUnit();
		bU.setTypeOfTestName("Getting value from private referenced object using reflections");
		bU.setTypeOfTest("GPRRF");
		bU.setDuration(benchmark.getDurationOfPrivReflectionsRefRead());
		bUnitsList.add(bU);

		// System.out.println("Setting value of public referenced object using reflections: "+benchmark.getDurationOfPubReflectionsRefWrite());
		bU = new BenchmarkUnit();
		bU.setTypeOfTestName("Setting value of public referenced object using reflections");
		bU.setTypeOfTest("SPURRF");
		bU.setDuration(benchmark.getDurationOfPubReflectionsRefWrite());
		bUnitsList.add(bU);
		
		// System.out.println("Setting value of private referenced object using reflections: "+benchmark.getDurationOfPrivReflectionsRefWrite());
		bU = new BenchmarkUnit();
		bU.setTypeOfTestName("Setting value of public referenced object using reflections");
		bU.setTypeOfTest("SPRRF");
		bU.setDuration(benchmark.getDurationOfPrivReflectionsRefWrite());
		bUnitsList.add(bU);

	}
}


package com.ug.reflections;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.ug.domain.BenchmarkUnit;
import com.ug.test.BenchmarkTest;
import com.ug.utils.Chart;
import com.ug.utils.FileManager;

public class Test {
	static int iterations = 10000;
	static double GPPM = 0;
	static double SPPM = 0;
	static double GPRM = 0;
	static double SPRM = 0;
	static double GPUP = 0;
	static double SPUP = 0;
	static double GPUR = 0;
	static double SPUR = 0;
	static double GPURF = 0;
	static double GPRF = 0;
	static double SPURF = 0;
	static double SPRF = 0;
	static double GPURRF = 0;
	static double GPRRF = 0;
	static double SPURRF = 0;
	static double SPRRF = 0;
	static FileManager fM = new FileManager();
	public static void main(String[] args) {
		System.out.println("INFO ["+getFormattedDate(new Date(), "yyyy-MM-dd HH:mm:ss")+"]: Rozpoczeto pomiar.");
		long startTime = System.currentTimeMillis();
		BenchmarkTest bT = new BenchmarkTest();

		for (int j = 0; j < iterations; j++) {
			bT.test();
		}

		for (BenchmarkUnit bU : bT.bUnitsList) {
			switch (bU.getTypeOfTest()) {
			case "GPPM":
				GPPM += bU.getDuration();
				break;
			case "SPPM":
				SPPM += bU.getDuration();
				break;
			case "GPRM":
				GPRM += bU.getDuration();
				break;
			case "SPRM":
				SPRM += bU.getDuration();
				break;
			case "GPUP":
				GPUP += bU.getDuration();
				break;
			case "SPUP":
				SPUP += bU.getDuration();
				break;
			case "GPUR":
				GPUR += bU.getDuration();
				break;
			case "SPUR":
				SPUR += bU.getDuration();
				break;
			case "GPURF":
				GPURF += bU.getDuration();
				break;
			case "GPRF":
				GPRF += bU.getDuration();
				break;
			case "SPURF":
				SPURF += bU.getDuration();
				break;
			case "SPRF":
				SPRF += bU.getDuration();
				break;
			case "GPURRF":
				GPURRF += bU.getDuration();
				break;
			case "GPRRF":
				GPRRF += bU.getDuration();
				break;
			case "SPURRF":
				SPURRF += bU.getDuration();
				break;
			case "SPRRF":
				SPRRF += bU.getDuration();
				break;

			}
		}
//		System.out.println(GPPM / iterations);
//		System.out.println(SPPM / iterations);
//		System.out.println(GPRM / iterations);
//		System.out.println(SPRM / iterations);
//		System.out.println(GPUP / iterations);
//		System.out.println(SPUP / iterations);
//		System.out.println(GPUR / iterations);
//		System.out.println(SPUR / iterations);
//		System.out.println(GPURF / iterations);
//		System.out.println(GPRF / iterations);
//		System.out.println(SPURF / iterations);
//		System.out.println(SPRF / iterations);
//		System.out.println(GPURRF / iterations);
//		System.out.println(GPRRF / iterations);
//		System.out.println(SPURRF / iterations);
//		System.out.println(SPRRF / iterations);
		
		GPPM = GPPM / iterations;
		SPPM = SPPM / iterations;
		GPRM = GPRM / iterations;
		SPRM = SPRM / iterations;
		GPUP = GPUP / iterations;
		SPUP = SPUP / iterations;
		GPUR = GPUR / iterations;
		SPUR = SPUR / iterations;
		GPURF = GPURF / iterations;
		GPRF = GPRF / iterations;
		SPURF = SPURF / iterations;
		SPRF = SPRF / iterations;
		GPURRF = GPURRF / iterations;
		GPRRF = GPRRF / iterations;
		SPURRF = SPURRF / iterations;
		SPRRF = SPRRF / iterations;

		long elaspedTime = System.currentTimeMillis() - startTime;
		System.out.println("Pojedynczych uruchomien kazdego testu: "+bT.benchmark.iterations);
		System.out.println("Wszystkich pomiarow: "+iterations);
		System.out.println("Czas (ms): " + elaspedTime);
		
		
		
		
		Chart chartRead = new Chart
				("['Odczyt',"
						+ "'Typ prosty, pole prywatne',{ role: 'annotation' },"
						+ "'Obiekt, pole prywatne',{ role: 'annotation' }, "
						+ "'Typ prosty, pole publiczne',{ role: 'annotation' },"
						+ "'Obiekt, pole publiczne',{ role: 'annotation' },"
						+ "'Typ prosty, pole publiczne, refleksja',{ role: 'annotation' },"
						+ "'Typ prosty, pole prywatne, refleksja',{ role: 'annotation' },"
						+ "'Obiekt, pole publiczne, refleksja',{ role: 'annotation' },"
						+ "'Obiekt, pole prywatne, refleksja',{ role: 'annotation' }],['',"+
						GPPM+","+
						"'"+GPPM+"',"+
						GPRM+","+
						"'"+GPRM+"',"+
						GPUP+","+
						"'"+GPUP+"',"+
						GPUR+","+
						"'"+GPUR+"',"+
						GPURF+","+
						"'"+GPURF+"',"+
						GPRF+","+
						"'"+GPRF+"',"+
						GPURRF+","+
						"'"+GPURRF+"',"+
						GPRRF+","+
						"'"+GPRRF+"' "+
						"]","'Pomiary wydajnosci'","'Usredniony czas dczytu (Iteracje pojedynczego testu: "+bT.benchmark.iterations+", Uruchomien calosci: "+iterations+")'","'ms'","C");
		
		Chart chartWrite = new Chart
				("['Zapis',"
						+ "'Typ prosty, pole prywatne',{ role: 'annotation' },"
						+ "'Obiekt, pole prywatne',{ role: 'annotation' }, "
						+ "'Typ prosty, pole publiczne',{ role: 'annotation' },"
						+ "'Obiekt, pole publiczne',{ role: 'annotation' },"
						+ "'Typ prosty, pole publiczne, refleksja',{ role: 'annotation' },"
						+ "'Typ prosty, pole prywatne, refleksja',{ role: 'annotation' },"
						+ "'Obiekt, pole publiczne, refleksja',{ role: 'annotation' },"
						+ "'Obiekt, pole prywatne, refleksja',{ role: 'annotation' }],['',"+
						SPPM+","+
						"'"+SPPM+"',"+
						SPRM+","+
						"'"+SPRM+"',"+
						SPUP+","+
						"'"+SPUP+"',"+
						SPUR+","+
						"'"+SPUR+"',"+
						SPURF+","+
						"'"+SPURF+"',"+
						SPRF+","+
						"'"+SPRF+"',"+
						SPURRF+","+
						"'"+SPURRF+"',"+
						SPRRF+","+
						"'"+SPRRF+"'"+
						"]","'Pomiary wydajnosci'","'Usredniony czas zapisu (Iteracje pojedynczego testu: "+bT.benchmark.iterations+", Uruchomien calosci: "+iterations+")'","'ms'","C");
		
		Chart chartBar = new Chart
				("['Typ pola','Odczyt',{ role: 'annotation' }, 'Zapis', { role: 'annotation' } ],"
						+ "['Proste, prywatne',"+GPPM+","+"'"+GPPM+"',"+SPPM+",'"+SPPM+"'],"+
						 "['Proste, publiczne',"+GPUP+","+"'"+GPUP+"',"+SPUP+",'"+SPUP+"'],"+
						 "['Obiekt, prywatne',"+GPRM+","+"'"+GPRM+"',"+SPRM+",'"+SPRM+"'],"+
						 "['Obiekt, publiczne',"+GPUR+","+"'"+GPUR+"',"+SPUR+",'"+SPUR+"'],"+
						 "['Proste, prywatne, refleksja',"+GPRF+","+"'"+GPRF+"',"+SPRF+",'"+SPRF+"'],"+
						 "['Proste, publiczne, refleksja',"+GPURF+","+"'"+GPURF+"',"+SPURF+",'"+SPURF+"'],"+
						 "['Obiekt, prywatne, refleksja',"+GPRRF+","+"'"+GPRRF+"',"+SPRRF+",'"+SPRRF+"'],"+
						 "['Obiekt, publiczne, refleksja',"+GPURRF+","+"'"+GPURRF+"',"+SPURRF+",'"+SPURRF+"']"+
						"","'Pomiary wydajnosci'","'Porownanie: Usredniony czas zapisu (Iteracje pojedynczego testu: "+bT.benchmark.iterations+", Uruchomien calosci: "+iterations+")'","'ms'","B");
		
	String filePath = args[0];
	Date d = new Date();
	String readChartFileName="chart_readStats_"+getFormattedDate(d,"yyyyMMdd_HHmmss")+"_"+iterations+"_"+bT.benchmark.iterations+".html";
	String writeChartFileName="chart_writeStats_"+getFormattedDate(d,"yyyyMMdd_HHmmss")+"_"+iterations+"_"+bT.benchmark.iterations+".html";
	String comparisonChartFileName="chart_readWriteStats_"+getFormattedDate(d,"yyyyMMdd_HHmmss")+"_"+iterations+"_"+bT.benchmark.iterations+".html";
	
	fM.saveFile(filePath, readChartFileName, chartRead.getHtmlCode());
	fM.saveFile(filePath, writeChartFileName, chartWrite.getHtmlCode());
	fM.saveFile(filePath, comparisonChartFileName, chartBar.getHtmlCode());
	
	System.out.println("Raporty: ");
	System.out.println(filePath+"/"+readChartFileName);
	System.out.println(filePath+"/"+writeChartFileName);
	System.out.println(filePath+"/"+comparisonChartFileName);
	
	System.out.println("INFO ["+getFormattedDate(new Date(), "yyyy-MM-dd HH:mm:ss")+"]: Zakonczono pomiar.");

	}
	
	public static String getFormattedDate(Date date, String format){
		SimpleDateFormat dt= new SimpleDateFormat(format);
		return dt.format(date);
	}
}

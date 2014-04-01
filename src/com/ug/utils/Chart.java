package com.ug.utils;

public class Chart {
	private static final String htmlChartBegin = "<html><head><script type=\"text/javascript\" src=\"https://www.google.com/jsapi\"></script><script type=\"text/javascript\">google.load(\"visualization\", \"1\", {packages:[\"corechart\"]});google.setOnLoadCallback(drawChart);function drawChart() {var data = google.visualization.arrayToDataTable([";
	private static final String htmlBody_one = " ]); var options = { title: ";
	private static final String htmlBody_two = ",hAxis: {title:";
	private static final String htmlBody_three=", titleTextStyle: {color: 'black'}}, vAxis: {title: ";

	private static final String htmlChartEndColumn = ", titleTextStyle: {color: 'black'}}};var chart = new google.visualization.ColumnChart(document.getElementById('chart_div'));chart.draw(data, options);}</script></head><body><div id=\"chart_div\" style=\"width: 1366px; height: 600px;\"></div></body></html>";
	private static final String htmlChartEndBar = ", titleTextStyle: {color: 'black'}}};var chart = new google.visualization.BarChart(document.getElementById('chart_div'));chart.draw(data, options);}</script></head><body><div id=\"chart_div\" style=\"width: 1366px; height: 600px;\"></div></body></html>";
	
	private String htmlCode = htmlChartBegin;

	public Chart(String values, String title, String titleHAxis,String titleVAxis,String type) {
		if(type.equals("C")){
			htmlCode += values + htmlBody_one + title + htmlBody_two + titleHAxis+htmlBody_three+titleVAxis+htmlChartEndColumn;
		}
		else if(type.equals("B")){
			htmlCode += values + htmlBody_one + title + htmlBody_two + titleHAxis+htmlBody_three+titleVAxis+htmlChartEndBar;
		}
	}

	public String getHtmlCode() {
		return htmlCode;
	}

	public void setHtmlCode(String htmlCode) {
		this.htmlCode = htmlCode;
	}

}

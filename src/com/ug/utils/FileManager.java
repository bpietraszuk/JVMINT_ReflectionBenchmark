package com.ug.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

	public void saveFile(String filePath, String fileName, String content) {
		File file = new File(filePath + "/" + fileName);

		try {

			FileWriter fw = new FileWriter(file);
			fw.write(content);
			fw.close();

		} catch (IOException iox) {
			iox.printStackTrace();
		}
	}
}

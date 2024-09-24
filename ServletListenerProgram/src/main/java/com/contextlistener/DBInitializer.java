package com.contextlistener;

import java.beans.Statement;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.util.StringTokenizer;

public class DBInitializer {
	
	public void createTables(String path) {
		
		try {
			FileInputStream fileInputStream = new FileInputStream(path);
			byte data[]  = new byte[fileInputStream.available()];
			fileInputStream.read(data);
			fileInputStream.close();
			
			StringTokenizer stringTokenizer = new StringTokenizer(new String(data), "/");
			Connection connection= getCon();
			
			
			
			Statement statement = connection.createStatement();
			System.out.println("Creating Tables");
			
			while (stringTokenizer.hasMoreElements()) {
				String nextToken = stringTokenizer.nextToken();
				System.out.println(nextToken);
				if (nextToken.trim().equals("STOP")) {
				break;	
				}
				statement.execute(nextToken);
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Tables Created Successfully");
			e.printStackTrace();
		}
		
	}

}

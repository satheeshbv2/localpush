package com.java11;

public class Files {

	public static void main(String[] args) {

		//writeString() and readString
		var uri="C:\\Users\\Satheesh\\Desktop\\all.txt";
		
		Files.writeString(Path.of(uri),"sfsfaad",StandardOperation.APPEND);
		String data=Files.readString(path.of(uri));
		System.out.println(data);
		
	}

}

package core;

import java.io.IOException;

//import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
	/*	HashMap<Integer,Integer> map = new HashMap<>();
		map.put(1, 100);
		System.out.println(map.get(1));
*/
		
//		System.out.println(new FileManager().getOs());
//		System.out.println(new FileManager().getHome());
//		System.out.println(new FileManager().getSeparator());
		//new FileManager().printHomeTree();
//		new FileManager();
		
		
		//provaConFileManager();
		provaConReader();
		
		
	}
	
	public static void provaConReader() {
		Reader reader = new Reader();
		Studente std = new Studente("Marco",30);
		Studente std2 = null;
		
		try {
			reader.save(std);
			std2 = reader.load();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		
		System.out.println(std2.getNome());
	}
	
	public static void provaConFileManager() {
		FileManager fileManager = new FileManager();
		Studente std = new Studente("Marco",30);
		Studente stdCaricato = null;
		
		try {
			fileManager.saveStudente(std);
			stdCaricato = fileManager.loadStudente();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		//	System.out.println("oh cazzo,errore");
		}
		
		System.out.println(stdCaricato.getNome());
	}

}

package fi.antti.jee.maven.tentti4.batch;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fi.antti.jee.maven.tentti4.bean.Levyt;
import fi.antti.jee.maven.tentti4.dao.LevyDAO;

public class LevyHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		LevyDAO db = (LevyDAO)context.getBean("daoLuokka");
		
		System.out.println("****************************************");
		System.out.println("**LISTATAAN TIETOKANNASSA OLEVAT LEVYT**");
		System.out.println("****************************************");
		
		List<Levyt> levyt = db.haeKaikki();
		for (Levyt l : levyt) {
			System.out.println("Artisti: " + l.getArtisti() +"\nAlbumi: " + l.getAlbumi() + "\nFormaatti: "+ l.getFormaatti() + "\n");
		}

		
		context.close();
		
	}

}

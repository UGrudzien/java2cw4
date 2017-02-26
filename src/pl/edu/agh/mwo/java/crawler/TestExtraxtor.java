package pl.edu.agh.mwo.java.crawler;

import java.io.IOException;

import org.jsoup.nodes.Document;



public class TestExtraxtor {

	protected String[] testExtractor(Document doc) {
		
		String text = doc.body().text();

		String[] sentences = text.split("\\.");
		return sentences;
	}
}



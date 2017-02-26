package pl.edu.agh.mwo.java.crawler;

import java.io.IOException;
import java.net.MalformedURLException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Crawler {

	protected String urlToProcess;
	protected TestExtraxtor testExtraxtor;

	public Crawler(String initUrl) throws MalformedURLException {
		urlToProcess = initUrl;
	}

	public void run() throws IOException {
		Document doc = null;
		doc = Jsoup.connect(urlToProcess).get();
		testExtraxtor = new TestExtraxtor();

		String[] sentences = testExtraxtor.testExtractor(doc);

		for (int i = 0; i < sentences.length; i++) {
			// if (sentences[i].contains("ruch")){
			// System.out.println(sentences[i]);
			// }
			// ////////// ??
			char charToFind = 'p';
			int ilosc = 0;
			for (int j = 0; j < sentences[i].length(); j++) {

				if (sentences[i].charAt(j) == charToFind) {
					ilosc++;

				}
			}
			if (ilosc > 10) {
				System.out.println(sentences[i]);
				System.out.println(ilosc);

			}

		}
	}
}

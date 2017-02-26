package pl.edu.agh.mwo.java.crawler;
import java.io.IOException;
import java.net.MalformedURLException;


public class CrawlerStarter {

	public static void main(String[] args) throws IOException {
		Crawler c = new Crawler("http://www.onet.pl");
		c.run();

	}

}

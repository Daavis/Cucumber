package googleTest;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SearchPageTest extends FunctionalTest {

	@Test
	public void serach() {
		driver.get("http://www.google.pl");
		
		SearchPage searchPage = new SearchPage(driver);
		assertTrue(searchPage.isInitialized());
		searchPage.enterSearch("Dawid");
		searchPage.submit();
		
		assertTrue(searchPage.isInitialized());
		assertTrue(searchPage.confirmationHeader().contains("wikipedia"));
	}
	
	@Test
	public void serachTwo() {
		driver.get("http://www.google.com");
		
		SearchPage searchPage = new SearchPage(driver);
		assertTrue(searchPage.isInitialized());
		searchPage.enterSearch("£ukasz");
		searchPage.submit();
		
		assertTrue(searchPage.isInitialized());
		assertTrue(searchPage.confirmationHeader().contains("wikipedia"));
	}
	
}

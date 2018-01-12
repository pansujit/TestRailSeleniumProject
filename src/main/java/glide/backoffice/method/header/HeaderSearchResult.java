package glide.backoffice.method.header;

import org.openqa.selenium.By;

public class HeaderSearchResult {
	
	
	/**
	 * Locator for the search result headers 
	 */
	public final By divTagSearchResultHeaderSearchResult= By.xpath(".//div[@class='search-resultTitle']/span/span");
	/**
	 * Locator for the first result in each header result
	 */
	public final By divTagResultInHeaderSearchResult=
			By.xpath(".//div[@class='search-resultTitle']/span/../../div[@class='search-resultsWrap']/div[1]");
	
	public final By divTagFirstResultOfHeaderSearchResult(String replacementText) {
		String text=
				".//div[@class='search-resultTitle']/span/span[contains(text(),'xxxx')]/../../../div[@class='search-resultsWrap']/div[1]";
	return By.xpath(text.replace("xxxx", replacementText));
	}
	
}

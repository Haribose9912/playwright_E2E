package TestE2E;

import com.microsoft.playwright.*;

public class LoginTest {

	 public static void main(String[] args) {
	        // Initialize Playwright
	        try (Playwright playwright = Playwright.create()) {
	            
	            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

	            // Create a new page
	            Page page = browser.newPage();
	            
	            page.navigate("https://www.google.com");

	            String title = page.title();
	            System.out.println("Title of the page: " + title);

	            browser.close();
	        }
	    
	 }
}

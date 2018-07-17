package by.htp.vanga.entity;

import org.junit.Test;

import junit.framework.Assert;

public class VangaClientsTest extends VangaBaseTest {

	@Test
	public void testClientExists() {
		Assert.assertNotNull("Client was not initialized", client);

	}
	
	@Test
	public void testClientNaswer() {
				
		Answer expected = new Answer("You will see a sunrise every day");
		
		Answer actual = Client.choosePredictiongetAnswer(1);
		
		Assert.assertEquals(expected, actual);

	}
	
	
}

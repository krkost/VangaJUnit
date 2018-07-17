package by.htp.vanga.entity;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VangaBaseTest {
	
	protected FortuneTeller teller;
	protected Client client;

	@Before
	public void initTellerClient() {
		teller = new FortuneTeller();
		client = new Client();
	}

}

package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Main.Start;


public class CalculateTotalConsumptionEdTest {
	@Test
	public void test() {
		double rast = Start.calculateTotalConsumption(1200, 8);
				 assertTrue(Math.round(rast) == 96);
				 }
			
				 }

package com.gap;

import static org.junit.Assert.*;

import org.junit.Test;

public class PiggyBankTest {

	private PiggyBank piggyBank = new PiggyBank();
	
	@Test
	public void testInsertCoins() {
		piggyBank.insertCoin(50);
		piggyBank.insertCoin(100);
		piggyBank.insertCoin(100);
		piggyBank.insertCoin(200);
		piggyBank.insertCoin(200);
		piggyBank.insertCoin(200);
		piggyBank.insertCoin(500);
		piggyBank.insertCoin(500);
		piggyBank.insertCoin(500);
		piggyBank.insertCoin(500);
		piggyBank.insertCoin(1000);
		piggyBank.insertCoin(1000);
		piggyBank.insertCoin(1000);
		piggyBank.insertCoin(1000);
		piggyBank.insertCoin(1000);
		assertEquals(1, piggyBank.getCoinQuantity(50));
		assertEquals(2, piggyBank.getCoinQuantity(100));
		assertEquals(3, piggyBank.getCoinQuantity(200));
		assertEquals(4, piggyBank.getCoinQuantity(500));
		assertEquals(5, piggyBank.getCoinQuantity(1000));
		assertEquals(15, piggyBank.getCoinsQuantity());
	}
	
	@Test(expected = NullPointerException.class)
	public void testInsertWrongCoins() {
		piggyBank.insertCoin(1);
	}
	
	@Test(expected = NullPointerException.class)
	public void testGettingWrongCoins() {
		piggyBank.getCoinQuantity(1);
	}

}

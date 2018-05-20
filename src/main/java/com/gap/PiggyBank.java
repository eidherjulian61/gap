package com.gap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PiggyBank {

	Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	public PiggyBank() {
		map.put(50, 0);
		map.put(100, 0);
		map.put(200, 0);
		map.put(500, 0);
		map.put(1000, 0);
	}

	public boolean insertCoin(int coin) {
		if (map.get(coin) != null) {
			map.put(coin, map.get(coin) + 1);
			return true;
		}
		throw new NullPointerException("Not allowed coin");
	}

	public int getCoinsQuantity() {
		int quantity = 0;
		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			quantity += map.get(key);
		}
		return quantity;
	}

	public int getCoinQuantity(int coin) {
		if (map.get(coin) != null) {
			return map.get(coin);
		}
		throw new NullPointerException("Not allowed coin");
	}

}

package com.bl.day2.ecommercediscountvalidator;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.*;

public class DealTracker<T extends Promotion> {

	private static final Pattern CODE = Pattern.compile("DealCode: (.+)");
	private static final Pattern DATE = Pattern.compile("ValidTill: (\\d{2}-\\d{2}-\\d{4})");
	private static final Pattern DISCOUNT = Pattern.compile("Discount: (\\d+)%");
	private static final Pattern MIN = Pattern.compile("MinimumPurchase: (\\d+)");

	private Map<String, T> dealMap = new HashMap<>();
	private Set<String> dealCodes = new HashSet<>();

	@SuppressWarnings("unchecked")
	public void readDeal(File file) throws Exception {

		String code = null;
		LocalDate validTill = null;
		int discount = 0;
		int minPurchase = 0;

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {

			String line;
			while ((line = br.readLine()) != null) {

				Matcher m;
				if ((m = CODE.matcher(line)).matches())
					code = m.group(1);
				else if ((m = DATE.matcher(line)).matches())
					validTill = LocalDate.parse(m.group(1), formatter);
				else if ((m = DISCOUNT.matcher(line)).matches())
					discount = Integer.parseInt(m.group(1));
				else if ((m = MIN.matcher(line)).matches())
					minPurchase = Integer.parseInt(m.group(1));
			}
		}

		// Validation
		if (validTill.isBefore(LocalDate.now()))
			return; // expired
		if (dealCodes.contains(code))
			return; // duplicate

		Deal deal = new Deal(code, validTill, discount, minPurchase);
		dealCodes.add(code);
		dealMap.put(code, (T) deal);
	}

	public Map<String, T> getDeals() {
		return dealMap;
	}

	// Sorting by discount
	public List<T> sortByDiscount() {
		List<T> list = new ArrayList<>(dealMap.values());
		list.sort((a, b) -> ((Deal) b).getDiscountPercent() - ((Deal) a).getDiscountPercent());
		return list;
	}
}

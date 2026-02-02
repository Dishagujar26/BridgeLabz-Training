package com.bl.collectors.librarybookstatistics;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LibraryStats {
	public static void main(String[] args) {

		List<Book> books = List.of(new Book("Fiction", 300), new Book("Fiction", 500), new Book("Science", 400));

		// IntSummaryStatistics class has method like getCount( getSum() getMin()
		// getMax() getAverage()), ollectors.summarizingInt() this returns
		// IntSummaryStatistics class object
		Map<String, IntSummaryStatistics> stats = books.stream()
				.collect(Collectors.groupingBy(Book::getGenre, Collectors.summarizingInt(Book::getPages)));

		stats.forEach((genre, s) -> {
			System.out.println(genre + " Total=" + s.getSum() + " Avg=" + s.getAverage() + " Max=" + s.getMax());
		});
	}
}
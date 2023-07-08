package com.functionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

	public static void main(String[] args) {

		System.out.println(getDbConnectionUrl());
		System.out.println(getDbConnectionUrlSupplier.get());
		System.out.println(getDbConnectionUrlList.get().get(0));
	}

	static Supplier<String> getDbConnectionUrlSupplier = () -> "jdbc://localhost:9090/con/db/sql";
	static Supplier<List<String>> getDbConnectionUrlList = () -> List.of("jdbc://localhost:9090/con/db/redis",
			"jdbc://localhost:9090/con/db/mysql");

	public static String getDbConnectionUrl() {
		return "jdbc://localhost:9090/con/db";
	}
}

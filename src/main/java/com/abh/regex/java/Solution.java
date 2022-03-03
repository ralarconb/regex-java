package com.abh.regex.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bufferedReader.readLine().trim());
		List<String> list = new ArrayList<String>();
		IntStream.range(0, N).forEach(NItr -> {
			try {
				String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

				String firstName = firstMultipleInput[0];

				String emailID = firstMultipleInput[1];
				if (emailID.endsWith("@gmail.com")) {
					list.add(firstName);
				}
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string);
		}
		bufferedReader.close();
	}
}

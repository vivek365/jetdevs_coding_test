package com.vivek.jetdevs.service.impl;

import org.springframework.stereotype.Service;

import com.vivek.jetdevs.service.BracketService;

@Service
public class BracketServiceImpl implements BracketService {

	@Override
	public String removeInvalidBrackets(String in) {

		char[] ar = in.toCharArray();
		int left = 0;
		int f = 0;
		Integer[] faults = new Integer[in.length()];
		
		// using this loop we have identified the index of wrong closing brackets and count of wrong opening brackets
		for (int i = 0; i < ar.length; i++) {
			String c = ar[i] + "";
			if (c.equals("(")) {
				left++;
			} else if (c.equals(")")) {
				left--;
			}
			if (left < 0) {
				faults[f] = i;
				f++;
				left++;
			}
		}
		int removed = 0;
		// using this loop we have removed the wrong closing brackets.
		for (int i = 0; i < faults.length; i++) {
			if (faults[i] != null) {
				int c = faults[i] - removed;
				if (c < in.length()) {
					in = in.substring(0, c) + in.substring(c + 1);
					removed++;

				}
			}
		}
		// using this loop we have removed the wrong opening brackets.
		for (int i = 0; i < left; i++) {
			int l = in.lastIndexOf("(");
			in = in.substring(0, l) + in.substring(l + 1);
		}
		return in;
	}
}

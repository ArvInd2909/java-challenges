package com.java.test;

import java.util.ArrayList;
import java.util.HashSet;

public class Permutation {

	    private static HashSet<String> permutations = null;

	    public Permutation() {
	        permutations = new HashSet<String>();
	    }

	  
	    public HashSet<String> permute(String string) {
	        permute("", string);
	        return permutations;
	    }

	    private void permute(String prefix, String string) {
	        int n = string.length();

	        if (n == 0)
	            permutations.add(prefix);
	        else
	            for (int k = 0; k < n; k++)
	                permute(prefix + string.charAt(k), string.substring(0, k) + string.substring(k + 1, n));
	    }
	}



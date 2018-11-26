package com.gmail.t.bisyk;

public class Main {
	public static void main(String[] args) {

		FindFild ff = new FindFild();
		Filds fld = new Filds();
		ff.fildSrlz(Filds.class);

		System.out.println(ff.outDeSrlz(fld));
	}
}
package com.gmail.t.bisyk;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class FindFild {
	private ArrayList<Field> listFild = new ArrayList<Field>();

	public FindFild() {
	}

	public void fildSrlz(Class<?> cls) {
		Field[] fld = cls.getDeclaredFields();
		for (Field f : fld) {
			if (f.isAnnotationPresent(Save.class)) {
				listFild.add(f);
			}
		}
	}

	public String outDeSrlz(Filds fld) {
		StringBuilder out = new StringBuilder();
		listFild.forEach(a -> {
			try {
				a.setAccessible(true);
				out.append(a.getName() + " - " + a.getType().getSimpleName() + " - " +a.get(fld)+"\n");
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		});
		return out.toString();
	}
}

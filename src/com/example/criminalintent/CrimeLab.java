package com.example.criminalintent;

import java.util.ArrayList;
import java.util.UUID;

import android.content.Context;

public class CrimeLab {

	private static CrimeLab crimeLab;
	private Context appContext;

	private ArrayList<Crime> crimes;
	
	private CrimeLab(Context context) {
		appContext = context;
		crimes = new ArrayList<Crime>();
		
		for(int i=0; i<100; i++) {
			Crime c = new Crime();
			c.setTitle("Crime #" + i);
			c.setSolved(i % 2 == 0);
			crimes.add(c);
		}
	}
	
	public static CrimeLab get(Context c) {
		if (crimeLab == null) {
			crimeLab = new CrimeLab(c.getApplicationContext());
		}
		return crimeLab;
	}
	
	public ArrayList<Crime> getCrimes() {
		return crimes;
	}
	
	public Crime getCrime(UUID uuid) {
		for (Crime c : crimes) {
			if (c.getId().equals(uuid)) {
				return c;
			}
		}
		return null;
	}
}

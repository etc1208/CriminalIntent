package com.example.criminalintent;

import java.util.Date;
import java.util.UUID;

import android.text.format.DateFormat;

public class Crime {

	private UUID id;
	private String title;
	private String date;
	private boolean solved;

	@SuppressWarnings("static-access")
	public Crime() {
		id = UUID.randomUUID();
		date = new DateFormat().format("EEEE,MMMM dd,yyyy", new Date()).toString();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public UUID getId() {
		return id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean isSolved() {
		return solved;
	}

	public void setSolved(boolean solved) {
		this.solved = solved;
	}

}

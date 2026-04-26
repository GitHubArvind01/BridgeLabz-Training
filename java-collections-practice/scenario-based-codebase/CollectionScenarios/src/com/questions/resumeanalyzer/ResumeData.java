package com.questions.resumeanalyzer;

import java.util.*;

public class ResumeData {
	private String email;
	private String phone;
	private List<String> keywordsFind;
	
	public ResumeData(String email, String phone, List<String> keywordsFind) {
		this.email = email;
		this.phone = phone;
		this.keywordsFind = keywordsFind;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<String> getKeywords() {
		return keywordsFind;
	}

	public void setKeywords(List<String> keywords) {
		this.keywordsFind = keywords;
	}

	@Override
	public String toString() {
		return "ResumeData [email=" + email + ", phone=" + phone + ", keywords=" + keywordsFind.toString() + "]";
	}
}

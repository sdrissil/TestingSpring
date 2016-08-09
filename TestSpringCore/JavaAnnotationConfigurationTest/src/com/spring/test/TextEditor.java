package com.spring.test;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {

	private SpellChecker spellChecker;

	// public TextEditor(SpellChecker spellChecker) {
	// System.out.println("Inside TextEditor constructor.");
	// this.spellChecker = spellChecker;
	// }

	//
	// public TextEditor() {
	// System.out.println("Inside TextEditor default constructor.");
	// }

	public void spellCheck() {
		spellChecker.checkSpelling();
	}

	@Autowired
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("inside spell cheker setter");
		this.spellChecker = spellChecker;
	}
}

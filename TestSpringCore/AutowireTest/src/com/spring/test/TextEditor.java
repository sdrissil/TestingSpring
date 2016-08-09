package com.spring.test;

public class TextEditor {

	private SpellChecker spellChecker;

	// public TextEditor(SpellChecker spellChecker) {
	// System.out.println("Inside TextEditor constructor.");
	// this.spellChecker = spellChecker;
	// }
	// //
	// // public TextEditor() {
	// // System.out.println("Inside TextEditor default constructor.");
	// // }

	public void spellCheck() {
		spellChecker.checkSpelling();
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("inside spell cheker setter");
		this.spellChecker = spellChecker;
	}
}

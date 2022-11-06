package com.mipresupuesto.personalbudget.controller.response.dto;

import com.mipresupuesto.personalbudget.controller.response.enumerate.MessageLevel;

public class Message {

	private MessageLevel level;
	private String text;
	private String title;
	
	public static Message createMessage(final MessageLevel level, final String text,
			final String title) {
		return new Message(level.FATAL, title, text);
	}
	
	public static Message createMessage(final MessageLevel level, final String text) {
		return new Message(level, text, text);
	}
	
	public static Message createFatalMessage(final String text) {
		return new Message(MessageLevel.FATAL, text, text);
	}
	
	public static Message createErrorMessage(final String level, final String text,
			final String title) {
		return new Message(text, title, level);
	}
	
	public static Message createWarningMessage(final String level, final String text,
			final String title) {
		return new Message(text, title, level);
	}
	
	public static Message createInformationMessage(final String level, final String text,
			final String title) {
		return new Message(text, title, level);
	}
	
	public static Message createSuccesMessage(final String level, final String text,
			final String title) {
		return new Message(text, title, level);
	}
	
	public Message(final String text2, final String text,final String title) {
		setLevel(text2);
		setText(text);
		setTitle(title);
	}

	public MessageLevel getLevel() {
		return level;
	}

	public String getText() {
		return text;
	}

	public String getTitle() {
		return title;
	}

	private final void setLevel(final MessageLevel level) {
		if(level == null) {
			this.level = MessageLevel.FATAL;
		}else {
			this.level = level;
		}
		this.level = level;
	}

	private final void setText(String text) {
		if(text == null || "".intern() == text.intern().trim()) {
			this.text = "";
		}else {
			this.text = text.trim();
		}
		this.text = text;
	}
	
	private final void setTitle(String title) {
		this.title = title;
	}
	
}
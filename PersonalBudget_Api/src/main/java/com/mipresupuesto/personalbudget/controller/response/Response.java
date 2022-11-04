package com.mipresupuesto.personalbudget.controller.response;

import java.util.ArrayList;

public class Response {
	private List<D> data;
	private List<Message> messages;
	
	public Response{
		super();
	}
	public void addMessage(final Message message) {
		
	}
	public List<Message> getMessages(){
		if(messages == null) {
			this.messages=new ArrayList();
		}
		
	}
	public final List<D> getData(){
		if(data == null)
		{
			this.data = new ArrayList<>();
		}
	}
	public final void setData(List<D> data) {
		if(data == null) {
			this.data = new ArrayList<>();
			
		}
		else {
			this.data = data;
		}
	}
	

}

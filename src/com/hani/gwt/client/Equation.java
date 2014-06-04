package com.hani.gwt.client;




//import myPkg.shared.FieldVerifier;
import com.hani.gwt.shared.FieldVerifier;
import com.hani.gwt.client.SequareAsync;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;


public class Equation implements EntryPoint {
	Double a,b,c;
	TextBox t_a,t_b,t_c;
	Label lbl;
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network "
			+ "connection and try again.";

	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
	private final SequareAsync greetingService = GWT
			.create(Sequare.class);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
/*	final Label errorLabel = new Label();

		// Add the nameField and sendButton to the RootPanel
		// Use RootPanel.get() to get the entire body element
		RootPanel rootPanel = RootPanel.get("nameFieldContainer");
		
		HorizontalPanel horizontalPanel = new HorizontalPanel();
		rootPanel.add(horizontalPanel, 10, 10);
		horizontalPanel.setSize("261px", "74px");
		
		final TextBox a = new TextBox();
		horizontalPanel.add(a);
		a.setWidth("35px");
		
		Label lblX = new Label("X^2+");
		lblX.setStyleName("dialogVPanel");
		horizontalPanel.add(lblX);
		
		final TextBox b = new TextBox();
		horizontalPanel.add(b);
		b.setWidth("35px");
		
		 Label lblNewLabel = new Label("+X+");
		lblNewLabel.setStyleName("dialogVPanel");
		horizontalPanel.add(lblNewLabel);
		
		final TextBox c = new TextBox();
		horizontalPanel.add(c);
		c.setWidth("35px");
		
		Label label = new Label("         ");
		horizontalPanel.add(label);
		
		Button btnNewButton = new Button("=");
		horizontalPanel.add(btnNewButton);
		btnNewButton.setSize("37px", "33px");
		
		Label lblNewLabel_1 = new Label("");
		horizontalPanel.add(lblNewLabel_1);
		
		final Label r = new Label("...");
		horizontalPanel.add(r);
		rootPanel.add(horizontalPanel, 10, 10);
		btnNewButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				final double a1=Double.valueOf( a.getText());
				final double b1=Double.valueOf( b.getText());
				final double c1=Double.valueOf( c.getText());

				greetingService.Seq_eq(a1, b1, c1, new AsyncCallback<String>() {
					
					@Override
					public void onSuccess(String result) {
						// TODO Auto-generated method stub
                      r.setText(result);
					}
					
					@Override
					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub
					
					}
				} 
						
						);	
			}
			
		}); 


*/
t_a=new TextBox();
t_b=new TextBox();
t_c=new TextBox();
lbl=new Label();
RootPanel.get("a_box").add(t_a);
RootPanel.get("b_box").add(t_b);
RootPanel.get("c_box").add(t_c);
RootPanel.get("label").add(lbl);
Button compute_btn=new Button("Compute");
compute_btn.addClickHandler(new ClickHandler() {
	
	@Override
	public void onClick(ClickEvent event) {
		// TODO Auto-generated method stub
		a=Double.parseDouble(t_a.getText());
		b=Double.parseDouble(t_a.getText());
		c=Double.parseDouble(t_c.getText());
		greetingService.equation(a, b, c, new AsyncCallback<String>() {
			
			@Override
			public void onSuccess(String result) {
				// TODO Auto-generated method stub
              lbl.setText(result);
			}
			
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
			
			}
		
	}
);

}});
RootPanel.get("btn").add(compute_btn);
	}
}

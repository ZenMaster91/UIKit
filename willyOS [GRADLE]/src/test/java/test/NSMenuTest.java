package test;

import org.junit.Test;

import AppKit.NSAction;
import AppKit.NSMenu;
import AppKit.NSMenuItem;

public class NSMenuTest {

	@Test
	public void menuItemTest() {
		NSMenuItem menuItem = new NSMenuItem("first item", null);
		System.out.println( menuItem );
	}
	
	@Test
	public void menuTest() {
		NSMenu menu = new NSMenu( "my menu" );
		NSMenuItem menuItem = new NSMenuItem("first item", null);
		menu.add( menuItem );
		for(int i = 0; i < 10; i++) {
			menuItem = new NSMenuItem("new item", null);
			menuItem.add( new NewAction() );
			menu.add( menuItem );
		}
		menu.print();
		menu.execute( 2 );
	}
	
	
	private class NewAction implements NSAction {

		@Override
		public void execute() {
			System.out.println("Executing the newaction...");
		}
		
	}

}

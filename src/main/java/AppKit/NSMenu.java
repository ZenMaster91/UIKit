package AppKit;

import java.util.ArrayList;
import java.util.List;

public class NSMenu {
	
	private String name;
	private List<NSMenuItem> items;
	
	public NSMenu() {
		items = new ArrayList<NSMenuItem>();
		setMenuName( "" );
	}
	
	public NSMenu(String name) {
		items = new ArrayList<NSMenuItem>();
		setMenuName( name );
	}
	
	private void setMenuName(String name) {
		if(name.isEmpty()) {
			this.name = "MENU";
		} else {
			this.name = name;
		}
	}
	
	public String getMenuName() {
		return this.name;
	}
	
	public void add(NSMenuItem menuItem) {
		this.items.add( menuItem );
	}

	public void print() {
		if(items.isEmpty()) {
			System.out.println( "The menu :: " + this.name + " :: is empty" );
		}
		System.out.println( "--- "+this.name.toUpperCase()+" ---" );
		for(NSMenuItem item : items) {
			System.out.println("( " +items.indexOf( item ) + " )  " +item);
		}
	}
	
	public void execute(int option) {
		if(0 <= option && option < items.size()) {
			items.get( option ).execute();
		} else {
			System.out.println( "The selected option is not in the menu." );
		}
	}
}

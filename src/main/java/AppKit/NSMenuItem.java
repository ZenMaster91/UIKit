package AppKit;

public class NSMenuItem implements NSAction {
	
	private String name;
	private NSAction action;
	
	public NSMenuItem(String name, NSAction action) {
		this.name = name;
		this.action = action;
	}
		
	public void add(NSAction action) {
		this.action = action;
	}
	
	public String toString() {
		return this.name;
	}

	@Override
	public void execute() {
		if(this.action!=null) {
			this.action.execute();
		} else {
			throw new IllegalStateException( "This menu item does not have any action attached." );
		}
	}

}

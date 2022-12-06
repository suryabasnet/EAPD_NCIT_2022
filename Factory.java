
public abstract class Factory {
	private static Factory carFactory=null;
	private static Factory truckFactory=null;
	
	public abstract Engine getEngine();
	public abstract Tyre getTyre();
	
	

}

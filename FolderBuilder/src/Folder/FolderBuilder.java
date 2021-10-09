package Folder;

public class FolderBuilder {
	
	public FolderModel buildLeather() {
		FolderModel model = new FolderModel();
		model.addType(new LeatherFolder());
		return model;	
	}
	
	public FolderModel buildPlastic() {
		FolderModel model = new FolderModel();
		model.addType(new PlaticFolder());
		return model;	
	}
}

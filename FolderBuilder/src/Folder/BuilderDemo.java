package Folder;

public class BuilderDemo {
	
	public static void main(String args[]){  
		
		FolderBuilder folderBuilder = new FolderBuilder();
		FolderModel foldermodel = folderBuilder.buildLeather();
		foldermodel.showType();
		System.out.println("\n");
		FolderModel foldermodel1= folderBuilder.buildPlastic();
		foldermodel1.showType();
	}
}

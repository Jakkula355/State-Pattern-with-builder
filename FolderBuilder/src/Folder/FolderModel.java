package Folder;

import java.util.ArrayList;
import java.util.List;

public class FolderModel {
	
	private List<FolderType> type = new ArrayList<FolderType>();
	
	public void addType(FolderType foldertype) {
		type.add(foldertype);
	}
	
	public void getcover() {
		for(FolderType foldertype : type ) {
			foldertype.addcover();
		}
	}
	public void getstate() {
		for(FolderType foldertype : type ) {
			foldertype.addstate();
		}
	}
	public void getsize() {
		for(FolderType foldertype : type ) {
			foldertype.addcolor();
		}
	}
	public void getMaterial() {
		for(FolderType foldertype : type ) {
			foldertype.addmaterial();
		}
	}
	
	public void showType() {
		for(FolderType foldertype : type ) {
			System.out.println("Folder Type:" +foldertype.type());
			System.out.println("Cover State :" +foldertype.addcover());
			System.out.println("Color State :" +foldertype.addcolor());
			System.out.println("Material State :" +foldertype.addmaterial());
			System.out.println("State State :" +foldertype.addstate());
		}
	}

	
}

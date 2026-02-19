package org.example;

import java.util.List;
import java.util.Set;

public class SetDirectory {

    private List<String> fileList;
    private Set<String> folderSet;

    public List<String> getFileList() {
        return fileList;
    }

    public void setFileList(List<String> fileList) {
        this.fileList = fileList;
    }

    public Set<String> getFolderSet() {
        return folderSet;
    }

    public void setFolderSet(Set<String> folderSet) {
        this.folderSet = folderSet;
    }

    public void showContents() {
        System.out.println("Files: " + fileList);
        System.out.println("Folders: " + folderSet);
    }
}

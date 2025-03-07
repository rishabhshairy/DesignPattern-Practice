package com.rshairy.lldQuestions.LinuxFileSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileSystem {
    Directory root;

    public FileSystem() {
        root = new Directory();
    }

    public List<String> ls(String path) {
        // create a temp directory
        Directory temp = root;
        System.out.println(temp.directoryMap);
        List<String> files = new ArrayList<>(); // why string?? -- to store directory name and recurse on structure

        // edge case when path do not have '/' its like /a/b/c
        if (!path.equals("/")) {
            // split directory based on /
            String[] dirs = path.split("/");
            for (int i = 1; i < dirs.length - 1; i++) {
                temp = temp.directoryMap.get(dirs[i]); // find all directories and add to temp
            }
            if (temp.filesMap.containsKey(dirs[dirs.length - 1])) {
                files.add(dirs[dirs.length - 1]);
                return files;
            } else {
                temp = temp.directoryMap.get(dirs[dirs.length - 1]);
            }
        }

        files.addAll(new ArrayList<>(temp.directoryMap.keySet()));
        files.addAll(new ArrayList<>(temp.filesMap.keySet()));
        Collections.sort(files);
        return files;
    }

    public void mkdir(String path) {
        Directory t = root;
        String[] d = path.split("/");
        for (int i = 1; i < d.length; i++) {
            if (!t.directoryMap.containsKey(d[i])) {
                t.directoryMap.put(d[i], new Directory());
            }
            t = t.directoryMap.get(d[i]);
        }

    }
}

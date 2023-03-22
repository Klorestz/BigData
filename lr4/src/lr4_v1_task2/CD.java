package lr4_v1_task2;

import java.util.ArrayList;

public class CD {

    private String name;
    private int year;

    // Внутренний класс для хранения информации о каталогах, подкаталогах и записях
    public class Directory {

        private String name;
        private ArrayList<String> subdirectories;
        private ArrayList<String> tracks;

        public Directory(String name) {
            this.name = name;
            this.subdirectories = new ArrayList<>();
            this.tracks = new ArrayList<>();
        }

        public void addSubdirectory(String subdirectory) {
            subdirectories.add(subdirectory);
        }

        public void addTrack(String track) {
            tracks.add(track);
        }

        public String getName() {
            return name;
        }

        public ArrayList<String> getSubdirectories() {
            return subdirectories;
        }

        public ArrayList<String> getTracks() {
            return tracks;
        }
    }

    private ArrayList<Directory> directories;

    public CD(String name, int year) {
        this.name = name;
        this.year = year;
        this.directories = new ArrayList<>();
    }

    public void addDirectory(Directory directory) {
        directories.add(directory);
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public ArrayList<Directory> getDirectories() {
        return directories;
    }
}

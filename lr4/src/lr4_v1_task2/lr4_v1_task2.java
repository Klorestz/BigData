package lr4_v1_task2;

public class lr4_v1_task2 {
    public static void main(String[] args) {
        CD cd = new CD("My CD", 2022);

        CD.Directory directory1 = cd.new Directory("Rock");
        directory1.addTrack("Track 1");
        directory1.addTrack("Track 2");

        CD.Directory directory2 = cd.new Directory("Pop");
        directory2.addSubdirectory("Ballads");
        directory2.addTrack("Track 3");

        cd.addDirectory(directory1);
        cd.addDirectory(directory2);

        System.out.println("CD name: " + cd.getName() + ", year: " + cd.getYear());

        for (CD.Directory directory : cd.getDirectories()) {
            System.out.println("Directory name: " + directory.getName());

            System.out.println("Subdirectories:");
            for (String subdirectory : directory.getSubdirectories()) {
                System.out.println("- " + subdirectory);
            }

            System.out.println("Tracks:");
            for (String track : directory.getTracks()) {
                System.out.println("- " + track);
            }
        }
    }
}

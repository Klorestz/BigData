package lr3_task1_v3;

import lr3_task11_v3.Day;

import java.util.Objects;

public class TextFile extends File {
    public String content;
    public TextFile(String name){
        super(name);
        this.content = "";
    }

    public void addContent(String content){
        this.content += content;
    }

    public void deleteContent(){
        this.content = "";
    }

    public void currentContent(){
        System.out.println(this.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NameOfFile, content);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        TextFile textFile = (TextFile) obj;
        return Objects.equals(NameOfFile, textFile.NameOfFile) && Objects.equals(content, textFile.content);
    }

    @Override
    public String toString() {
        return "Name of file: " + NameOfFile + ", file contents:" + content;
    }
}

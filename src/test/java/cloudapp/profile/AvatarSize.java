package cloudapp.profile;


import java.nio.file.Path;
import java.nio.file.Paths;

public enum AvatarSize {
    SIZE_256_256("256x256.png"),
    SIZE_500_500("500x500.png"),
    SIZE_512_512("512x512.png");
    private final String fileName;

    AvatarSize(String name) {

        this.fileName = name;
    }

    public String getFileName() {
        return fileName;
    }
    public String absolutePath() {
        Path resourceDirectory = Paths.get("src","test","resources", "pngs");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();
        return absolutePath + "/" + fileName;
    }
}
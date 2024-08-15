import java.util.regex.Pattern;

public class NameItRegexCallItString {
    public static String convertPath(String path, boolean toWin) {
        if (path == null || path.isBlank()) {
            return null;
        }
        String isV = "\\\\C:\\\\|~/?~|~\\\\|///|/\\w+\\\\|\\\\\\w+/|/\\w+/~/";
        boolean isNotValid = Pattern.compile(isV).matcher(path).find();
        if (isNotValid) {
            return null;
        }
        String both = "^\\w+\\.\\w{3}$";
        String wP = "^C:\\\\?User|^C:\\\\|^\\.?\\\\|^\\.\\.\\\\";
        String uP = "^~?/+|^\\w+/|\\.\\./|^\\.";
        boolean bothPattern = Pattern.compile(both).matcher(path).matches();
        boolean windowsPattern = Pattern.compile(wP).matcher(path).find();
        boolean unixPattern = Pattern.compile(uP).matcher(path).find();
        if (bothPattern || (windowsPattern && toWin) || (unixPattern && !toWin)) {
            return path;
        }
        if (!toWin) {
            return toUnix(path);
        } else {
            return toWindows(path);
        }
    }
    private static String toWindows(String str) {
        String newWindowsPath;
        if (str.startsWith("/")) {
            String tempUnixPath = str.replaceFirst("/", "C:\\\\");
            newWindowsPath = tempUnixPath.replaceAll("/", "\\\\");
        } else if (str.startsWith("~")) {
            String tempUnixPath = str.replaceFirst("~", "C:\\\\User");
            newWindowsPath = tempUnixPath.replaceAll("/", "\\\\");
        } else {
            newWindowsPath = str.replaceAll("/", "\\\\\\\\");
        }
        return newWindowsPath;
    }
    private static String toUnix(String str) {
        String newUnixPath;
        if (str.startsWith("C:\\User")) {
            String tempUnixPath = str.replaceFirst("C:\\\\User", "~");
            newUnixPath = tempUnixPath.replaceAll("\\\\", "/");
        } else if (str.startsWith("C:\\")) {
            String tempUnixPath = str.replaceFirst("C:\\\\", "/");
            newUnixPath = tempUnixPath.replaceAll("\\\\", "/");
        } else {
            newUnixPath = str.replaceAll("\\\\", "/");
        }
        return newUnixPath;
    }
}
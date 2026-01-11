public class LogLevels {
    
    public static String message(String logLine) {
        String[] parts = logLine.split(":");
        return parts[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] parts = logLine.split(":");
        String logLevel = parts[0].substring(1, parts[0].length() - 1).toLowerCase();
        return logLevel;
    }

    public static String reformat(String logLine) {
        String msg = message(logLine);
        String lvl = logLevel(logLine);
        return msg + " " + "(" + lvl + ")";
    }
}

class MyRegex {
    private String subPattern = "(\\b)([0-9]|0[1-9][0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\b)";
    String pattern = subPattern + "." + subPattern + "." + subPattern + "." + subPattern;
}
package ua.msp.servlets.ua.msp.servlets.util;

public class HtmlUtil {

    public  static  String htmlWrapper(String inner) {
        return "<html>" + inner + "</html>";
    }

    public  static  String headWrapper(String inner) {
        return "<head>" + inner + "</head>";
    }

    public  static  String bodyWrapper(String inner) {
        return "<body>" + inner + "</body>";
    }

    public  static  String h1Wrapper(String inner) {
        return "<h1>" + inner + "</h1>";
    }

}

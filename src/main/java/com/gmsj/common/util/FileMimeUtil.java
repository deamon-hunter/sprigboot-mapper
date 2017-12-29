package com.gmsj.common.util;

import java.util.HashMap;
import java.util.Map;

public class FileMimeUtil {
	public final static Map<String, String> mimeExt = new HashMap<String, String>();
	static {
		mimeExt.put("html", "text/html");
		mimeExt.put("htm", "text/html");
		mimeExt.put("shtml", "text/html");
		mimeExt.put("css", "text/css");
		mimeExt.put("xml", "text/xml");
		mimeExt.put("gif", "image/gif");
		mimeExt.put("jpeg", "image/jpeg");
		mimeExt.put("jpg", "image/jpeg");
		mimeExt.put("js", "application/x-javascript");
		mimeExt.put("atom", "application/atom+xml");
		mimeExt.put("rss", "application/rss+xml");

		mimeExt.put("mml", "text/mathml");
		mimeExt.put("txt", "text/plain");
		mimeExt.put("jad", "text/vnd.sun.j2me.app-descriptor");
		mimeExt.put("wml", "text/vnd.wap.wml");
		mimeExt.put("htc", "text/x-component");

		mimeExt.put("png", "image/png");
		mimeExt.put("tif", "image/tiff");
		mimeExt.put("tiff", "image/tiff");
		mimeExt.put("wbmp", "image/vnd.wap.wbmp");
		mimeExt.put("ico", "image/x-icon");
		mimeExt.put("jng", "image/x-jng");
		mimeExt.put("bmp", "image/x-ms-bmp");
		mimeExt.put("svg", "image/svg+xml");

		mimeExt.put("jar", "application/java-archive");
		mimeExt.put("war", "application/java-archive");
		mimeExt.put("ear", "application/java-archive");
		mimeExt.put("hqx", "application/mac-binhex40");
		mimeExt.put("doc", "application/msword");
		mimeExt.put("pdf", "application/pdf");
		mimeExt.put("ps", "application/postscript");
		mimeExt.put("eps", "application/postscript");
		mimeExt.put("ai", "application/postscript");
		mimeExt.put("rtf", "application/rtf");
		mimeExt.put("xls", "application/vnd.ms-excel");
		mimeExt.put("ppt", "application/vnd.ms-powerpoint");
		mimeExt.put("wmlc", "application/vnd.wap.wmlc");
		mimeExt.put("kml", "application/vnd.google-earth.kml+xml");
		mimeExt.put("kmz", "application/vnd.google-earth.kmz");
		mimeExt.put("7z", "application/x-7z-compressed");
		mimeExt.put("cco", "application/x-cocoa");
		mimeExt.put("jardif", "application/x-java-archive-diff");
		mimeExt.put("jnlp", "application/x-java-jnlp-file");
		mimeExt.put("run", "application/x-makeself");
		mimeExt.put("pl", "application/x-perl");
		mimeExt.put("pm", "application/x-perl");
		mimeExt.put("prc", "application/x-pilot");
		mimeExt.put("pdb", "application/x-pilot");
		mimeExt.put("rar", "application/x-rar-compressed");
		mimeExt.put("rpm", "application/x-redhat-package-manager");
		mimeExt.put("sea", "application/x-sea");
		mimeExt.put("swf", "application/x-shockwave-flash");
		mimeExt.put("sit", "application/x-stuffit");
		mimeExt.put("tcl", "application/x-tcl");
		mimeExt.put("tk", "application/x-tcl");
		mimeExt.put("der", "application/x-x509-ca-cert");
		mimeExt.put("pem", "application/x-x509-ca-cert");
		mimeExt.put("crt", "application/x-x509-ca-cert");
		mimeExt.put("xpi", "application/x-xpinstall");
		mimeExt.put("xhtml", "application/xhtml+xml");
		mimeExt.put("zip", "application/zip");

		mimeExt.put("bin", "application/octet-stream");
		mimeExt.put("exe", "application/octet-stream");
		mimeExt.put("dll", "application/octet-stream");
		mimeExt.put("deb", "application/octet-stream");
		mimeExt.put("dmg", "application/octet-stream");
		mimeExt.put("eot", "application/octet-stream");
		mimeExt.put("iso", "application/octet-stream");
		mimeExt.put("img", "application/octet-stream");
		mimeExt.put("msi", "application/octet-stream");
		mimeExt.put("msp", "application/octet-stream");
		mimeExt.put("msm", "application/octet-stream");

		mimeExt.put("mid", "audio/midi");
		mimeExt.put("midi", "audio/midi");
		mimeExt.put("kar", "audio/midi");
		mimeExt.put("mp3", "audio/mpeg");
		mimeExt.put("ogg", "audio/ogg");
		mimeExt.put("ra", "audio/x-realaudio");

		mimeExt.put("3gpp", "video/3gpp");
		mimeExt.put("3gp", "video/3gpp");
		mimeExt.put("mpeg", "video/mpeg");
		mimeExt.put("mpg", "video/mpeg");
		mimeExt.put("mov", "video/mp4");
		mimeExt.put("flv", "video/x-flv");
		mimeExt.put("mng", "video/x-mng");
		mimeExt.put("asx", "video/x-ms-asf");
		mimeExt.put("asf", "video/x-ms-asf");
		mimeExt.put("wmv", "video/x-ms-wmv");
		mimeExt.put("avi", "video/x-msvideo");
		
		mimeExt.put("lrc", "text/plain");
	}

	public static String getMime(String ext) {
		return mimeExt.get(ext);
	}
}

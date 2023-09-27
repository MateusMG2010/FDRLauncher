package net.mgstudios.FDRLauncher.extra;

import java.io.InputStream;
import java.net.URL;

public class Resource {
    public static InputStream getResource(String ADDRESS){
        return Resource.class.getClassLoader().getResourceAsStream(ADDRESS);
    }
    public static URL getURL(String ADDRESS){
        return Resource.class.getClassLoader().getResource(ADDRESS);
    }
}
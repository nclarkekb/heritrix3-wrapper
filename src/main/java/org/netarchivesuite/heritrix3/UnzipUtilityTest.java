package org.netarchivesuite.heritrix3;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class UnzipUtilityTest {

    protected static ClassLoader clsLdr = Heritrix3WrapperTest.class.getClassLoader();

    public static final File getTestResourceFile(String fname) {
        URL url = clsLdr.getResource(fname);
        String path = url.getFile();
        path = path.replaceAll("%5b", "[");
        path = path.replaceAll("%5d", "]");
        File file = new File(path);
        return file;
    }

    public static void main(String[] args) {
    	String zipFilePath = "/home/nicl/workspace/heritrix3-wrapper/NetarchiveSuite-heritrix3-bundler-5.0-SNAPSHOT.zip";
    	String destDirectory = "/home/nicl/heritrix-3.2.0-unzip/";
    	UnzipUtility unzip = new UnzipUtility();
    	try {
			unzip.unzip(zipFilePath, destDirectory);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

}

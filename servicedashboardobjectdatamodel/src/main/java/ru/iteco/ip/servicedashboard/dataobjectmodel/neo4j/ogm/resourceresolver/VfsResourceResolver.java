package ru.iteco.ip.servicedashboard.dataobjectmodel.neo4j.ogm.resourceresolver;

/**
 * Created by Scorpio on 30.03.2017.
 */

import org.jboss.vfs.VFS;
import org.jboss.vfs.VirtualFile;
import org.neo4j.ogm.classloader.ResourceResolver;

import java.io.File;
import java.net.URL;

public class VfsResourceResolver implements ResourceResolver {

    @Override
    public File resolve(URL url) throws Exception {
        if ("vfs".equalsIgnoreCase(url.getProtocol())) {
            VirtualFile file = VFS.getChild(url.toURI());
            return file.getPhysicalFile();
        }
        return null;
    }

}

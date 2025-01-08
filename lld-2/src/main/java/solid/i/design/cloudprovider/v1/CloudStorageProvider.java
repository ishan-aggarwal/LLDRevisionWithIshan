package solid.i.design.cloudprovider.v1;

import java.io.File;

public interface CloudStorageProvider {
    public void uploadFile(String name);

    public File getFile(String name);
}

package solid.i.design.cloudprovider.v1;

import java.io.File;
import java.util.*;

public class AWSProvider implements CloudHostingProvider, CloudStorageProvider, CDNProvider {

    Map<String, List<String>> serversMap = new HashMap<>();

    @Override
    public void addServer(String region, String serverId) {
        serversMap.computeIfAbsent(region, k -> new ArrayList<>()).add(serverId);
    }

    @Override
    public List<String> listServers(String region) {
        return serversMap.getOrDefault(region, Collections.emptyList());
    }

    @Override
    public String getCDNAddress() {
        return "xx.xx.xx.xx";
    }

    @Override
    public void uploadFile(String name) {
        System.out.println("Uploading file " + name + " to AWS");
    }

    @Override
    public File getFile(String name) {
        return new File(name);
    }
}

package class3.cloudproviders.adapters;

import class3.cloudproviders.models.Connection;

public interface CloudAdapter {
    Connection createConnection(long userId);
}

package class3.cloudproviders.adapters;

import class3.cloudproviders.libraries.google.GoogleApi;
import class3.cloudproviders.libraries.google.GoogleConnectionResponse;
import class3.cloudproviders.models.Connection;
import class3.cloudproviders.models.ConnectionStatus;

public class GoogleAdapter implements CloudAdapter {
    private GoogleApi googleApi;

    public GoogleAdapter() {
        this.googleApi = new GoogleApi();
    }

    @Override
    public Connection createConnection(long userId) {
        GoogleConnectionResponse googleConnectionResponse = googleApi.createConnection(userId);
        Connection connection = new Connection();
        connection.setUserId(userId);
        connection.setConnectionStatus(ConnectionStatus.valueOf(googleConnectionResponse.getConnectionStatus()));
        connection.setConnectionId(googleConnectionResponse.getConnectionId());
        return connection;
    }
}

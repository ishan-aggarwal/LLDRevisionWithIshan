package class3.cloudproviders.adapters;

import class3.cloudproviders.libraries.aws.AWSApi;
import class3.cloudproviders.libraries.aws.AWSConnectionResponse;
import class3.cloudproviders.models.Connection;
import class3.cloudproviders.models.ConnectionStatus;

public class AWSAdapter implements CloudAdapter {
    private AWSApi awsApi;
    public AWSAdapter() {
        this.awsApi = new AWSApi();
    }

    @Override
    public Connection createConnection(long userId) {
        AWSConnectionResponse awsConnectionResponse = awsApi.createConnection(userId);
        Connection connection = new Connection();
        connection.setConnectionId(awsConnectionResponse.getConnectionId());
        connection.setConnectionStatus(ConnectionStatus.valueOf(awsConnectionResponse.getConnectionStatus()));
        connection.setUserId(userId);
        return connection;
    }
}

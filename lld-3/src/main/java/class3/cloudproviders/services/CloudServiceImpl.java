package class3.cloudproviders.services;

import class3.cloudproviders.adapters.CloudAdapter;
import class3.cloudproviders.exceptions.UserNotFoundException;
import class3.cloudproviders.models.Connection;
import class3.cloudproviders.models.User;
import class3.cloudproviders.repositories.UserRepository;

public class CloudServiceImpl implements CloudService {
    private UserRepository userRepository;
    private CloudAdapter cloudAdapter;

    public CloudServiceImpl(UserRepository userRepository, CloudAdapter cloudAdapter) {
        this.userRepository = userRepository;
        this.cloudAdapter = cloudAdapter;
    }

    @Override
    public Connection createConnection(Long userId) throws UserNotFoundException {
        User user = userRepository.findUserById(userId).orElseThrow(() -> new UserNotFoundException("User not found"));
        return cloudAdapter.createConnection(userId);
    }
}

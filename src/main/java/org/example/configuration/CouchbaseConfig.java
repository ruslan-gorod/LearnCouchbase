package org.example.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@Configuration
@EnableCouchbaseRepositories
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {

    @Value("${couchbase.cluster.bucket}")
    private String bucketName;

    @Value("${couchbase.cluster.username}")
    private String username;

    @Value("${couchbase.cluster.password}")
    private String password;

    @Value("${couchbase.cluster.ip}")
    private String ip;

    @Override
    public String getConnectionString() {
        return "couchbase://" + ip;
    }

    @Override
    public String getUserName() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getBucketName() {
        return bucketName;
    }
}

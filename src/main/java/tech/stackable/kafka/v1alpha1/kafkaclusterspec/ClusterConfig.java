package tech.stackable.kafka.v1alpha1.kafkaclusterspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"authentication","authorization","tls","vectorAggregatorConfigMapName","zookeeperConfigMapName"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ClusterConfig implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Authentication class settings for Kafka like mTLS authentication.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authentication")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Authentication class settings for Kafka like mTLS authentication.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<tech.stackable.kafka.v1alpha1.kafkaclusterspec.clusterconfig.Authentication> authentication = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("[]", java.util.List.class);

    public java.util.List<tech.stackable.kafka.v1alpha1.kafkaclusterspec.clusterconfig.Authentication> getAuthentication() {
        return authentication;
    }

    public void setAuthentication(java.util.List<tech.stackable.kafka.v1alpha1.kafkaclusterspec.clusterconfig.Authentication> authentication) {
        this.authentication = authentication;
    }

    /**
     * Authorization settings for Kafka like OPA.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authorization")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Authorization settings for Kafka like OPA.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.kafka.v1alpha1.kafkaclusterspec.clusterconfig.Authorization authorization = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"opa\":null}", tech.stackable.kafka.v1alpha1.kafkaclusterspec.clusterconfig.Authorization.class);

    public tech.stackable.kafka.v1alpha1.kafkaclusterspec.clusterconfig.Authorization getAuthorization() {
        return authorization;
    }

    public void setAuthorization(tech.stackable.kafka.v1alpha1.kafkaclusterspec.clusterconfig.Authorization authorization) {
        this.authorization = authorization;
    }

    /**
     * TLS encryption settings for Kafka (server, internal).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tls")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TLS encryption settings for Kafka (server, internal).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private tech.stackable.kafka.v1alpha1.kafkaclusterspec.clusterconfig.Tls tls = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"internalSecretClass\":\"tls\",\"serverSecretClass\":\"tls\"}", tech.stackable.kafka.v1alpha1.kafkaclusterspec.clusterconfig.Tls.class);

    public tech.stackable.kafka.v1alpha1.kafkaclusterspec.clusterconfig.Tls getTls() {
        return tls;
    }

    public void setTls(tech.stackable.kafka.v1alpha1.kafkaclusterspec.clusterconfig.Tls tls) {
        this.tls = tls;
    }

    /**
     * Name of the Vector aggregator [discovery ConfigMap](https://docs.stackable.tech/home/nightly/concepts/service_discovery). It must contain the key `ADDRESS` with the address of the Vector aggregator. Follow the [logging tutorial](https://docs.stackable.tech/home/nightly/tutorials/logging-vector-aggregator) to learn how to configure log aggregation with Vector.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vectorAggregatorConfigMapName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the Vector aggregator [discovery ConfigMap](https://docs.stackable.tech/home/nightly/concepts/service_discovery). It must contain the key `ADDRESS` with the address of the Vector aggregator. Follow the [logging tutorial](https://docs.stackable.tech/home/nightly/tutorials/logging-vector-aggregator) to learn how to configure log aggregation with Vector.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private String vectorAggregatorConfigMapName;

    public String getVectorAggregatorConfigMapName() {
        return vectorAggregatorConfigMapName;
    }

    public void setVectorAggregatorConfigMapName(String vectorAggregatorConfigMapName) {
        this.vectorAggregatorConfigMapName = vectorAggregatorConfigMapName;
    }

    /**
     * Kafka requires a ZooKeeper cluster connection to run. Provide the name of the ZooKeeper [discovery ConfigMap](https://docs.stackable.tech/home/nightly/concepts/service_discovery) here. When using the [Stackable operator for Apache ZooKeeper](https://docs.stackable.tech/home/nightly/zookeeper/) to deploy a ZooKeeper cluster, this will simply be the name of your ZookeeperCluster resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("zookeeperConfigMapName")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kafka requires a ZooKeeper cluster connection to run. Provide the name of the ZooKeeper [discovery ConfigMap](https://docs.stackable.tech/home/nightly/concepts/service_discovery) here. When using the [Stackable operator for Apache ZooKeeper](https://docs.stackable.tech/home/nightly/zookeeper/) to deploy a ZooKeeper cluster, this will simply be the name of your ZookeeperCluster resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String zookeeperConfigMapName;

    public String getZookeeperConfigMapName() {
        return zookeeperConfigMapName;
    }

    public void setZookeeperConfigMapName(String zookeeperConfigMapName) {
        this.zookeeperConfigMapName = zookeeperConfigMapName;
    }
}


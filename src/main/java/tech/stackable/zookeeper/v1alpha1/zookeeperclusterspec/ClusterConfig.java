package tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"authentication","listenerClass","tls","vectorAggregatorConfigMapName"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ClusterConfig implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Authentication settings for ZooKeeper like mTLS authentication. Read more in the [authentication usage guide](https://docs.stackable.tech/home/nightly/zookeeper/usage_guide/authentication).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authentication")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Authentication settings for ZooKeeper like mTLS authentication. Read more in the [authentication usage guide](https://docs.stackable.tech/home/nightly/zookeeper/usage_guide/authentication).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.clusterconfig.Authentication> authentication = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("[]", java.util.List.class);

    public java.util.List<tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.clusterconfig.Authentication> getAuthentication() {
        return authentication;
    }

    public void setAuthentication(java.util.List<tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.clusterconfig.Authentication> authentication) {
        this.authentication = authentication;
    }

    public enum ListenerClass {

        @com.fasterxml.jackson.annotation.JsonProperty("cluster-internal")
        CLUSTERINTERNAL("cluster-internal"), @com.fasterxml.jackson.annotation.JsonProperty("external-unstable")
        EXTERNALUNSTABLE("external-unstable");

        java.lang.String value;

        ListenerClass(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * This field controls which type of Service the Operator creates for this ZookeeperCluster:
     *
     *  cluster-internal: Use a ClusterIP service
     *
     *  external-unstable: Use a NodePort service
     *
     * This is a temporary solution with the goal to keep yaml manifests forward compatible. In the future, this setting will control which [ListenerClass](https://docs.stackable.tech/home/nightly/listener-operator/listenerclass.html) will be used to expose the service, and ListenerClass names will stay the same, allowing for a non-breaking change.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("listenerClass")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("This field controls which type of Service the Operator creates for this ZookeeperCluster:\n\n* cluster-internal: Use a ClusterIP service\n\n* external-unstable: Use a NodePort service\n\nThis is a temporary solution with the goal to keep yaml manifests forward compatible. In the future, this setting will control which [ListenerClass](https://docs.stackable.tech/home/nightly/listener-operator/listenerclass.html) will be used to expose the service, and ListenerClass names will stay the same, allowing for a non-breaking change.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private ListenerClass listenerClass = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"cluster-internal\"", ListenerClass.class);

    public ListenerClass getListenerClass() {
        return listenerClass;
    }

    public void setListenerClass(ListenerClass listenerClass) {
        this.listenerClass = listenerClass;
    }

    /**
     * TLS encryption settings for ZooKeeper (server, quorum). Read more in the [encryption usage guide](https://docs.stackable.tech/home/nightly/zookeeper/usage_guide/encryption).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tls")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TLS encryption settings for ZooKeeper (server, quorum). Read more in the [encryption usage guide](https://docs.stackable.tech/home/nightly/zookeeper/usage_guide/encryption).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.clusterconfig.Tls tls = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"quorumSecretClass\":\"tls\",\"serverSecretClass\":\"tls\"}", tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.clusterconfig.Tls.class);

    public tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.clusterconfig.Tls getTls() {
        return tls;
    }

    public void setTls(tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.clusterconfig.Tls tls) {
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
}


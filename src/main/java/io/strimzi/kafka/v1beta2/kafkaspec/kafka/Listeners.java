package io.strimzi.kafka.v1beta2.kafkaspec.kafka;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"authentication","configuration","name","networkPolicyPeers","port","tls","type"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Listeners implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Authentication configuration for this listener.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authentication")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Authentication configuration for this listener.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.Authentication authentication;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.Authentication authentication) {
        this.authentication = authentication;
    }

    /**
     * Additional listener configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Additional listener configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.Configuration configuration;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.Configuration configuration) {
        this.configuration = configuration;
    }

    /**
     * Name of the listener. The name will be used to identify the listener and the related Kubernetes objects. The name has to be unique within given a Kafka cluster. The name can consist of lowercase characters and numbers and be up to 11 characters long.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @io.fabric8.generator.annotation.Pattern("^[a-z0-9]{1,11}$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the listener. The name will be used to identify the listener and the related Kubernetes objects. The name has to be unique within given a Kafka cluster. The name can consist of lowercase characters and numbers and be up to 11 characters long.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * List of peers which should be able to connect to this listener. Peers in this list are combined using a logical OR operation. If this field is empty or missing, all connections will be allowed for this listener. If this field is present and contains at least one item, the listener only allows the traffic which matches at least one item in this list.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("networkPolicyPeers")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of peers which should be able to connect to this listener. Peers in this list are combined using a logical OR operation. If this field is empty or missing, all connections will be allowed for this listener. If this field is present and contains at least one item, the listener only allows the traffic which matches at least one item in this list.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.NetworkPolicyPeers> networkPolicyPeers;

    public java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.NetworkPolicyPeers> getNetworkPolicyPeers() {
        return networkPolicyPeers;
    }

    public void setNetworkPolicyPeers(java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.NetworkPolicyPeers> networkPolicyPeers) {
        this.networkPolicyPeers = networkPolicyPeers;
    }

    /**
     * Port number used by the listener inside Kafka. The port number has to be unique within a given Kafka cluster. Allowed port numbers are 9092 and higher with the exception of ports 9404 and 9999, which are already used for Prometheus and JMX. Depending on the listener type, the port number might not be the same as the port number that connects Kafka clients.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    @io.fabric8.generator.annotation.Required()
    @io.fabric8.generator.annotation.Min(9092.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Port number used by the listener inside Kafka. The port number has to be unique within a given Kafka cluster. Allowed port numbers are 9092 and higher with the exception of ports 9404 and 9999, which are already used for Prometheus and JMX. Depending on the listener type, the port number might not be the same as the port number that connects Kafka clients.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long port;

    public Long getPort() {
        return port;
    }

    public void setPort(Long port) {
        this.port = port;
    }

    /**
     * Enables TLS encryption on the listener. This is a required property.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tls")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enables TLS encryption on the listener. This is a required property.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean tls;

    public Boolean getTls() {
        return tls;
    }

    public void setTls(Boolean tls) {
        this.tls = tls;
    }

    public enum Type {

        @com.fasterxml.jackson.annotation.JsonProperty("internal")
        INTERNAL("internal"),
        @com.fasterxml.jackson.annotation.JsonProperty("route")
        ROUTE("route"),
        @com.fasterxml.jackson.annotation.JsonProperty("loadbalancer")
        LOADBALANCER("loadbalancer"),
        @com.fasterxml.jackson.annotation.JsonProperty("nodeport")
        NODEPORT("nodeport"),
        @com.fasterxml.jackson.annotation.JsonProperty("ingress")
        INGRESS("ingress"),
        @com.fasterxml.jackson.annotation.JsonProperty("cluster-ip")
        CLUSTERIP("cluster-ip");

        java.lang.String value;

        Type(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Type of the listener. Currently the supported types are `internal`, `route`, `loadbalancer`, `nodeport` and `ingress`.
     *
     *  `internal` type exposes Kafka internally only within the Kubernetes cluster.
     *  `route` type uses OpenShift Routes to expose Kafka.
     *  `loadbalancer` type uses LoadBalancer type services to expose Kafka.
     *  `nodeport` type uses NodePort type services to expose Kafka.
     *  `ingress` type uses Kubernetes Nginx Ingress to expose Kafka with TLS passthrough.
     *  `cluster-ip` type uses a per-broker `ClusterIP` service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Type of the listener. Currently the supported types are `internal`, `route`, `loadbalancer`, `nodeport` and `ingress`. \n\n* `internal` type exposes Kafka internally only within the Kubernetes cluster.\n* `route` type uses OpenShift Routes to expose Kafka.\n* `loadbalancer` type uses LoadBalancer type services to expose Kafka.\n* `nodeport` type uses NodePort type services to expose Kafka.\n* `ingress` type uses Kubernetes Nginx Ingress to expose Kafka with TLS passthrough.\n* `cluster-ip` type uses a per-broker `ClusterIP` service.\n")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}


package io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.configuration;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"advertisedHost","advertisedPort","annotations","broker","host","labels","loadBalancerIP","nodePort"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Brokers implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The host name used in the brokers' `advertised.listeners`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("advertisedHost")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The host name used in the brokers' `advertised.listeners`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String advertisedHost;

    public String getAdvertisedHost() {
        return advertisedHost;
    }

    public void setAdvertisedHost(String advertisedHost) {
        this.advertisedHost = advertisedHost;
    }

    /**
     * The port number used in the brokers' `advertised.listeners`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("advertisedPort")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The port number used in the brokers' `advertised.listeners`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long advertisedPort;

    public Long getAdvertisedPort() {
        return advertisedPort;
    }

    public void setAdvertisedPort(Long advertisedPort) {
        this.advertisedPort = advertisedPort;
    }

    /**
     * Annotations that will be added to the `Ingress` or `Service` resource. You can use this field to configure DNS providers such as External DNS. This field can be used only with `loadbalancer`, `nodeport`, or `ingress` type listeners.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("annotations")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Annotations that will be added to the `Ingress` or `Service` resource. You can use this field to configure DNS providers such as External DNS. This field can be used only with `loadbalancer`, `nodeport`, or `ingress` type listeners.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.configuration.brokers.Annotations annotations;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.configuration.brokers.Annotations getAnnotations() {
        return annotations;
    }

    public void setAnnotations(io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.configuration.brokers.Annotations annotations) {
        this.annotations = annotations;
    }

    /**
     * ID of the kafka broker (broker identifier). Broker IDs start from 0 and correspond to the number of broker replicas.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("broker")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ID of the kafka broker (broker identifier). Broker IDs start from 0 and correspond to the number of broker replicas.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long broker;

    public Long getBroker() {
        return broker;
    }

    public void setBroker(Long broker) {
        this.broker = broker;
    }

    /**
     * The broker host. This field will be used in the Ingress resource or in the Route resource to specify the desired hostname. This field can be used only with `route` (optional) or `ingress` (required) type listeners.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The broker host. This field will be used in the Ingress resource or in the Route resource to specify the desired hostname. This field can be used only with `route` (optional) or `ingress` (required) type listeners.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String host;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * Labels that will be added to the `Ingress`, `Route`, or `Service` resource. This field can be used only with `loadbalancer`, `nodeport`, `route`, or `ingress` type listeners.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Labels that will be added to the `Ingress`, `Route`, or `Service` resource. This field can be used only with `loadbalancer`, `nodeport`, `route`, or `ingress` type listeners.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.configuration.brokers.Labels labels;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.configuration.brokers.Labels getLabels() {
        return labels;
    }

    public void setLabels(io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.configuration.brokers.Labels labels) {
        this.labels = labels;
    }

    /**
     * The loadbalancer is requested with the IP address specified in this field. This feature depends on whether the underlying cloud provider supports specifying the `loadBalancerIP` when a load balancer is created. This field is ignored if the cloud provider does not support the feature.This field can be used only with `loadbalancer` type listener.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerIP")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The loadbalancer is requested with the IP address specified in this field. This feature depends on whether the underlying cloud provider supports specifying the `loadBalancerIP` when a load balancer is created. This field is ignored if the cloud provider does not support the feature.This field can be used only with `loadbalancer` type listener.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String loadBalancerIP;

    public String getLoadBalancerIP() {
        return loadBalancerIP;
    }

    public void setLoadBalancerIP(String loadBalancerIP) {
        this.loadBalancerIP = loadBalancerIP;
    }

    /**
     * Node port for the per-broker service. This field can be used only with `nodeport` type listener.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodePort")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Node port for the per-broker service. This field can be used only with `nodeport` type listener.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long nodePort;

    public Long getNodePort() {
        return nodePort;
    }

    public void setNodePort(Long nodePort) {
        this.nodePort = nodePort;
    }
}


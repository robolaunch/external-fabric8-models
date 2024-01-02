package io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.brokercapacity;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"brokers","cpu","inboundNetwork","outboundNetwork"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Overrides implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * List of Kafka brokers (broker identifiers).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("brokers")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of Kafka brokers (broker identifiers).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<Long> brokers;

    public java.util.List<Long> getBrokers() {
        return brokers;
    }

    public void setBrokers(java.util.List<Long> brokers) {
        this.brokers = brokers;
    }

    /**
     * Broker capacity for CPU resource in cores or millicores. For example, 1, 1.500, 1500m. For more information on valid CPU resource units see https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#meaning-of-cpu.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cpu")
    @io.fabric8.generator.annotation.Pattern("^[0-9]+([.][0-9]{0,3}|[m]?)$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Broker capacity for CPU resource in cores or millicores. For example, 1, 1.500, 1500m. For more information on valid CPU resource units see https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#meaning-of-cpu.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String cpu;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * Broker capacity for inbound network throughput in bytes per second. Use an integer value with standard Kubernetes byte units (K, M, G) or their bibyte (power of two) equivalents (Ki, Mi, Gi) per second. For example, 10000KiB/s.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("inboundNetwork")
    @io.fabric8.generator.annotation.Pattern("^[0-9]+([KMG]i?)?B/s$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Broker capacity for inbound network throughput in bytes per second. Use an integer value with standard Kubernetes byte units (K, M, G) or their bibyte (power of two) equivalents (Ki, Mi, Gi) per second. For example, 10000KiB/s.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String inboundNetwork;

    public String getInboundNetwork() {
        return inboundNetwork;
    }

    public void setInboundNetwork(String inboundNetwork) {
        this.inboundNetwork = inboundNetwork;
    }

    /**
     * Broker capacity for outbound network throughput in bytes per second. Use an integer value with standard Kubernetes byte units (K, M, G) or their bibyte (power of two) equivalents (Ki, Mi, Gi) per second. For example, 10000KiB/s.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("outboundNetwork")
    @io.fabric8.generator.annotation.Pattern("^[0-9]+([KMG]i?)?B/s$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Broker capacity for outbound network throughput in bytes per second. Use an integer value with standard Kubernetes byte units (K, M, G) or their bibyte (power of two) equivalents (Ki, Mi, Gi) per second. For example, 10000KiB/s.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String outboundNetwork;

    public String getOutboundNetwork() {
        return outboundNetwork;
    }

    public void setOutboundNetwork(String outboundNetwork) {
        this.outboundNetwork = outboundNetwork;
    }
}


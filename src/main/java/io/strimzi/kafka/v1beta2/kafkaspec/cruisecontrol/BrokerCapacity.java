package io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"cpu","cpuUtilization","disk","inboundNetwork","outboundNetwork","overrides"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class BrokerCapacity implements io.fabric8.kubernetes.api.model.KubernetesResource {

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
     * Broker capacity for CPU resource utilization as a percentage (0 - 100).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuUtilization")
    @io.fabric8.generator.annotation.Max(100.0)
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Broker capacity for CPU resource utilization as a percentage (0 - 100).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long cpuUtilization;

    public Long getCpuUtilization() {
        return cpuUtilization;
    }

    public void setCpuUtilization(Long cpuUtilization) {
        this.cpuUtilization = cpuUtilization;
    }

    /**
     * Broker capacity for disk in bytes. Use a number value with either standard Kubernetes byte units (K, M, G, or T), their bibyte (power of two) equivalents (Ki, Mi, Gi, or Ti), or a byte value with or without E notation. For example, 100000M, 100000Mi, 104857600000, or 1e+11.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disk")
    @io.fabric8.generator.annotation.Pattern("^[0-9]+([.][0-9]*)?([KMGTPE]i?|e[0-9]+)?$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Broker capacity for disk in bytes. Use a number value with either standard Kubernetes byte units (K, M, G, or T), their bibyte (power of two) equivalents (Ki, Mi, Gi, or Ti), or a byte value with or without E notation. For example, 100000M, 100000Mi, 104857600000, or 1e+11.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String disk;

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
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

    /**
     * Overrides for individual brokers. The `overrides` property lets you specify a different capacity configuration for different brokers.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("overrides")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Overrides for individual brokers. The `overrides` property lets you specify a different capacity configuration for different brokers.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.brokercapacity.Overrides> overrides;

    public java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.brokercapacity.Overrides> getOverrides() {
        return overrides;
    }

    public void setOverrides(java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.brokercapacity.Overrides> overrides) {
        this.overrides = overrides;
    }
}


package io.strimzi.kafka.v1beta2;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"clusterId","conditions","kafkaMetadataVersion","kafkaNodePools","kafkaVersion","listeners","observedGeneration","operatorLastSuccessfulVersion"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class KafkaStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Kafka cluster Id.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kafka cluster Id.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String clusterId;

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * List of status conditions.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of status conditions.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.strimzi.kafka.v1beta2.kafkastatus.Conditions> conditions;

    public java.util.List<io.strimzi.kafka.v1beta2.kafkastatus.Conditions> getConditions() {
        return conditions;
    }

    public void setConditions(java.util.List<io.strimzi.kafka.v1beta2.kafkastatus.Conditions> conditions) {
        this.conditions = conditions;
    }

    /**
     * The KRaft metadata.version currently used by the Kafka cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kafkaMetadataVersion")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The KRaft metadata.version currently used by the Kafka cluster.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String kafkaMetadataVersion;

    public String getKafkaMetadataVersion() {
        return kafkaMetadataVersion;
    }

    public void setKafkaMetadataVersion(String kafkaMetadataVersion) {
        this.kafkaMetadataVersion = kafkaMetadataVersion;
    }

    /**
     * List of the KafkaNodePools used by this Kafka cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kafkaNodePools")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of the KafkaNodePools used by this Kafka cluster.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.strimzi.kafka.v1beta2.kafkastatus.KafkaNodePools> kafkaNodePools;

    public java.util.List<io.strimzi.kafka.v1beta2.kafkastatus.KafkaNodePools> getKafkaNodePools() {
        return kafkaNodePools;
    }

    public void setKafkaNodePools(java.util.List<io.strimzi.kafka.v1beta2.kafkastatus.KafkaNodePools> kafkaNodePools) {
        this.kafkaNodePools = kafkaNodePools;
    }

    /**
     * The version of Kafka currently deployed in the cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kafkaVersion")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The version of Kafka currently deployed in the cluster.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String kafkaVersion;

    public String getKafkaVersion() {
        return kafkaVersion;
    }

    public void setKafkaVersion(String kafkaVersion) {
        this.kafkaVersion = kafkaVersion;
    }

    /**
     * Addresses of the internal and external listeners.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("listeners")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Addresses of the internal and external listeners.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.strimzi.kafka.v1beta2.kafkastatus.Listeners> listeners;

    public java.util.List<io.strimzi.kafka.v1beta2.kafkastatus.Listeners> getListeners() {
        return listeners;
    }

    public void setListeners(java.util.List<io.strimzi.kafka.v1beta2.kafkastatus.Listeners> listeners) {
        this.listeners = listeners;
    }

    /**
     * The generation of the CRD that was last reconciled by the operator.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("observedGeneration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The generation of the CRD that was last reconciled by the operator.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long observedGeneration;

    public Long getObservedGeneration() {
        return observedGeneration;
    }

    public void setObservedGeneration(Long observedGeneration) {
        this.observedGeneration = observedGeneration;
    }

    /**
     * The version of the Strimzi Cluster Operator which performed the last successful reconciliation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operatorLastSuccessfulVersion")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The version of the Strimzi Cluster Operator which performed the last successful reconciliation.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String operatorLastSuccessfulVersion;

    public String getOperatorLastSuccessfulVersion() {
        return operatorLastSuccessfulVersion;
    }

    public void setOperatorLastSuccessfulVersion(String operatorLastSuccessfulVersion) {
        this.operatorLastSuccessfulVersion = operatorLastSuccessfulVersion;
    }
}


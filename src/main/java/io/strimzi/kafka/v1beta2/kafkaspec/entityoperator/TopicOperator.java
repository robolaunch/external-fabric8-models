package io.strimzi.kafka.v1beta2.kafkaspec.entityoperator;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"image","jvmOptions","livenessProbe","logging","readinessProbe","reconciliationIntervalSeconds","resources","startupProbe","topicMetadataMaxAttempts","watchedNamespace","zookeeperSessionTimeoutSeconds"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class TopicOperator implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The image to use for the Topic Operator.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The image to use for the Topic Operator.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * JVM Options for pods.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jvmOptions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("JVM Options for pods.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.topicoperator.JvmOptions jvmOptions;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.topicoperator.JvmOptions getJvmOptions() {
        return jvmOptions;
    }

    public void setJvmOptions(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.topicoperator.JvmOptions jvmOptions) {
        this.jvmOptions = jvmOptions;
    }

    /**
     * Pod liveness checking.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("livenessProbe")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Pod liveness checking.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.topicoperator.LivenessProbe livenessProbe;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.topicoperator.LivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.topicoperator.LivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    /**
     * Logging configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logging")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Logging configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.topicoperator.Logging logging;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.topicoperator.Logging getLogging() {
        return logging;
    }

    public void setLogging(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.topicoperator.Logging logging) {
        this.logging = logging;
    }

    /**
     * Pod readiness checking.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readinessProbe")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Pod readiness checking.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.topicoperator.ReadinessProbe readinessProbe;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.topicoperator.ReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.topicoperator.ReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    /**
     * Interval between periodic reconciliations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reconciliationIntervalSeconds")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Interval between periodic reconciliations.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long reconciliationIntervalSeconds;

    public Long getReconciliationIntervalSeconds() {
        return reconciliationIntervalSeconds;
    }

    public void setReconciliationIntervalSeconds(Long reconciliationIntervalSeconds) {
        this.reconciliationIntervalSeconds = reconciliationIntervalSeconds;
    }

    /**
     * CPU and memory resources to reserve.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CPU and memory resources to reserve.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.topicoperator.Resources resources;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.topicoperator.Resources getResources() {
        return resources;
    }

    public void setResources(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.topicoperator.Resources resources) {
        this.resources = resources;
    }

    /**
     * Pod startup checking.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startupProbe")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Pod startup checking.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.topicoperator.StartupProbe startupProbe;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.topicoperator.StartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.topicoperator.StartupProbe startupProbe) {
        this.startupProbe = startupProbe;
    }

    /**
     * The number of attempts at getting topic metadata.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("topicMetadataMaxAttempts")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The number of attempts at getting topic metadata.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long topicMetadataMaxAttempts;

    public Long getTopicMetadataMaxAttempts() {
        return topicMetadataMaxAttempts;
    }

    public void setTopicMetadataMaxAttempts(Long topicMetadataMaxAttempts) {
        this.topicMetadataMaxAttempts = topicMetadataMaxAttempts;
    }

    /**
     * The namespace the Topic Operator should watch.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("watchedNamespace")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The namespace the Topic Operator should watch.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String watchedNamespace;

    public String getWatchedNamespace() {
        return watchedNamespace;
    }

    public void setWatchedNamespace(String watchedNamespace) {
        this.watchedNamespace = watchedNamespace;
    }

    /**
     * Timeout for the ZooKeeper session.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("zookeeperSessionTimeoutSeconds")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Timeout for the ZooKeeper session.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long zookeeperSessionTimeoutSeconds;

    public Long getZookeeperSessionTimeoutSeconds() {
        return zookeeperSessionTimeoutSeconds;
    }

    public void setZookeeperSessionTimeoutSeconds(Long zookeeperSessionTimeoutSeconds) {
        this.zookeeperSessionTimeoutSeconds = zookeeperSessionTimeoutSeconds;
    }
}


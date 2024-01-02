package io.strimzi.kafka.v1beta2.kafkaspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"enableSaramaLogging","groupExcludeRegex","groupRegex","image","livenessProbe","logging","readinessProbe","resources","template","topicExcludeRegex","topicRegex"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class KafkaExporter implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Enable Sarama logging, a Go client library used by the Kafka Exporter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enableSaramaLogging")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable Sarama logging, a Go client library used by the Kafka Exporter.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enableSaramaLogging;

    public Boolean getEnableSaramaLogging() {
        return enableSaramaLogging;
    }

    public void setEnableSaramaLogging(Boolean enableSaramaLogging) {
        this.enableSaramaLogging = enableSaramaLogging;
    }

    /**
     * Regular expression to specify which consumer groups to exclude.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupExcludeRegex")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Regular expression to specify which consumer groups to exclude.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String groupExcludeRegex;

    public String getGroupExcludeRegex() {
        return groupExcludeRegex;
    }

    public void setGroupExcludeRegex(String groupExcludeRegex) {
        this.groupExcludeRegex = groupExcludeRegex;
    }

    /**
     * Regular expression to specify which consumer groups to collect. Default value is `.*`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupRegex")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Regular expression to specify which consumer groups to collect. Default value is `.*`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String groupRegex;

    public String getGroupRegex() {
        return groupRegex;
    }

    public void setGroupRegex(String groupRegex) {
        this.groupRegex = groupRegex;
    }

    /**
     * The container image used for the Kafka Exporter pods. If no image name is explicitly specified, the image name corresponds to the version specified in the Cluster Operator configuration. If an image name is not defined in the Cluster Operator configuration, a default value is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The container image used for the Kafka Exporter pods. If no image name is explicitly specified, the image name corresponds to the version specified in the Cluster Operator configuration. If an image name is not defined in the Cluster Operator configuration, a default value is used.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Pod liveness check.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("livenessProbe")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Pod liveness check.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.LivenessProbe livenessProbe;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.LivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.LivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    /**
     * Only log messages with the given severity or above. Valid levels: [`info`, `debug`, `trace`]. Default log level is `info`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logging")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Only log messages with the given severity or above. Valid levels: [`info`, `debug`, `trace`]. Default log level is `info`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String logging;

    public String getLogging() {
        return logging;
    }

    public void setLogging(String logging) {
        this.logging = logging;
    }

    /**
     * Pod readiness check.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readinessProbe")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Pod readiness check.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.ReadinessProbe readinessProbe;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.ReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.ReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    /**
     * CPU and memory resources to reserve.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CPU and memory resources to reserve.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.Resources resources;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.Resources getResources() {
        return resources;
    }

    public void setResources(io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.Resources resources) {
        this.resources = resources;
    }

    /**
     * Customization of deployment templates and pods.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("template")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Customization of deployment templates and pods.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.Template template;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.Template getTemplate() {
        return template;
    }

    public void setTemplate(io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.Template template) {
        this.template = template;
    }

    /**
     * Regular expression to specify which topics to exclude.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("topicExcludeRegex")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Regular expression to specify which topics to exclude.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String topicExcludeRegex;

    public String getTopicExcludeRegex() {
        return topicExcludeRegex;
    }

    public void setTopicExcludeRegex(String topicExcludeRegex) {
        this.topicExcludeRegex = topicExcludeRegex;
    }

    /**
     * Regular expression to specify which topics to collect. Default value is `.*`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("topicRegex")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Regular expression to specify which topics to collect. Default value is `.*`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String topicRegex;

    public String getTopicRegex() {
        return topicRegex;
    }

    public void setTopicRegex(String topicRegex) {
        this.topicRegex = topicRegex;
    }
}


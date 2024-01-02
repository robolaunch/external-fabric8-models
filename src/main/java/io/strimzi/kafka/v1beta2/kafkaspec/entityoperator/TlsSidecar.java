package io.strimzi.kafka.v1beta2.kafkaspec.entityoperator;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"image","livenessProbe","logLevel","readinessProbe","resources"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class TlsSidecar implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The docker image for the container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The docker image for the container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Pod liveness checking.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("livenessProbe")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Pod liveness checking.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.tlssidecar.LivenessProbe livenessProbe;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.tlssidecar.LivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.tlssidecar.LivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public enum LogLevel {

        @com.fasterxml.jackson.annotation.JsonProperty("emerg")
        EMERG("emerg"),
        @com.fasterxml.jackson.annotation.JsonProperty("alert")
        ALERT("alert"),
        @com.fasterxml.jackson.annotation.JsonProperty("crit")
        CRIT("crit"),
        @com.fasterxml.jackson.annotation.JsonProperty("err")
        ERR("err"),
        @com.fasterxml.jackson.annotation.JsonProperty("warning")
        WARNING("warning"),
        @com.fasterxml.jackson.annotation.JsonProperty("notice")
        NOTICE("notice"),
        @com.fasterxml.jackson.annotation.JsonProperty("info")
        INFO("info"),
        @com.fasterxml.jackson.annotation.JsonProperty("debug")
        DEBUG("debug");

        java.lang.String value;

        LogLevel(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * The log level for the TLS sidecar. Default value is `notice`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logLevel")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The log level for the TLS sidecar. Default value is `notice`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private LogLevel logLevel;

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * Pod readiness checking.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readinessProbe")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Pod readiness checking.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.tlssidecar.ReadinessProbe readinessProbe;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.tlssidecar.ReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.tlssidecar.ReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    /**
     * CPU and memory resources to reserve.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CPU and memory resources to reserve.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.tlssidecar.Resources resources;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.tlssidecar.Resources getResources() {
        return resources;
    }

    public void setResources(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.tlssidecar.Resources resources) {
        this.resources = resources;
    }
}


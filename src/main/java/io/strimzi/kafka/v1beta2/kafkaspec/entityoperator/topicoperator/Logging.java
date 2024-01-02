package io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.topicoperator;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"loggers","type","valueFrom"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Logging implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * A Map from logger name to logger level.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("loggers")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A Map from logger name to logger level.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.topicoperator.logging.Loggers loggers;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.topicoperator.logging.Loggers getLoggers() {
        return loggers;
    }

    public void setLoggers(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.topicoperator.logging.Loggers loggers) {
        this.loggers = loggers;
    }

    public enum Type {

        @com.fasterxml.jackson.annotation.JsonProperty("inline")
        INLINE("inline"), @com.fasterxml.jackson.annotation.JsonProperty("external")
        EXTERNAL("external");

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
     * Logging type, must be either 'inline' or 'external'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Logging type, must be either 'inline' or 'external'.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    /**
     * `ConfigMap` entry where the logging configuration is stored.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueFrom")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("`ConfigMap` entry where the logging configuration is stored. ")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.topicoperator.logging.ValueFrom valueFrom;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.topicoperator.logging.ValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.topicoperator.logging.ValueFrom valueFrom) {
        this.valueFrom = valueFrom;
    }
}


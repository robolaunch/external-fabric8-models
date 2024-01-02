package tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.logging;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"console","custom","file","loggers"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Containers implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Configuration for the console appender
     */
    @com.fasterxml.jackson.annotation.JsonProperty("console")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configuration for the console appender")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.logging.containers.Console console;

    public tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.logging.containers.Console getConsole() {
        return console;
    }

    public void setConsole(tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.logging.containers.Console console) {
        this.console = console;
    }

    /**
     * Custom log configuration provided in a ConfigMap
     */
    @com.fasterxml.jackson.annotation.JsonProperty("custom")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Custom log configuration provided in a ConfigMap")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.logging.containers.Custom custom;

    public tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.logging.containers.Custom getCustom() {
        return custom;
    }

    public void setCustom(tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.logging.containers.Custom custom) {
        this.custom = custom;
    }

    /**
     * Configuration for the file appender
     */
    @com.fasterxml.jackson.annotation.JsonProperty("file")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configuration for the file appender")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.logging.containers.File file;

    public tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.logging.containers.File getFile() {
        return file;
    }

    public void setFile(tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.logging.containers.File file) {
        this.file = file;
    }

    /**
     * Configuration per logger
     */
    @com.fasterxml.jackson.annotation.JsonProperty("loggers")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configuration per logger")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.logging.containers.Loggers> loggers = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{}", java.util.Map.class);

    public java.util.Map<java.lang.String, tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.logging.containers.Loggers> getLoggers() {
        return loggers;
    }

    public void setLoggers(java.util.Map<java.lang.String, tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.logging.containers.Loggers> loggers) {
        this.loggers = loggers;
    }
}


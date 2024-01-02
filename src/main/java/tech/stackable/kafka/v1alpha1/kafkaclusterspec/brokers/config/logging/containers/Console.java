package tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.logging.containers;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"level"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Console implements io.fabric8.kubernetes.api.model.KubernetesResource {

    public enum Level {

        @com.fasterxml.jackson.annotation.JsonProperty("TRACE")
        TRACE("TRACE"),
        @com.fasterxml.jackson.annotation.JsonProperty("DEBUG")
        DEBUG("DEBUG"),
        @com.fasterxml.jackson.annotation.JsonProperty("INFO")
        INFO("INFO"),
        @com.fasterxml.jackson.annotation.JsonProperty("WARN")
        WARN("WARN"),
        @com.fasterxml.jackson.annotation.JsonProperty("ERROR")
        ERROR("ERROR"),
        @com.fasterxml.jackson.annotation.JsonProperty("FATAL")
        FATAL("FATAL"),
        @com.fasterxml.jackson.annotation.JsonProperty("NONE")
        NONE("NONE");

        java.lang.String value;

        Level(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * The log level threshold. Log events with a lower log level are discarded.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("level")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The log level threshold. Log events with a lower log level are discarded.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private Level level;

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}


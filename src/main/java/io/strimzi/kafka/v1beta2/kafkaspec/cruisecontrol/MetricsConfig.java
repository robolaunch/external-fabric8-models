package io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"type","valueFrom"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class MetricsConfig implements io.fabric8.kubernetes.api.model.KubernetesResource {

    public enum Type {

        @com.fasterxml.jackson.annotation.JsonProperty("jmxPrometheusExporter")
        JMXPROMETHEUSEXPORTER("jmxPrometheusExporter");

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
     * Metrics type. Only 'jmxPrometheusExporter' supported currently.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Metrics type. Only 'jmxPrometheusExporter' supported currently.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    /**
     * ConfigMap entry where the Prometheus JMX Exporter configuration is stored.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueFrom")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ConfigMap entry where the Prometheus JMX Exporter configuration is stored. ")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.metricsconfig.ValueFrom valueFrom;

    public io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.metricsconfig.ValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.metricsconfig.ValueFrom valueFrom) {
        this.valueFrom = valueFrom;
    }
}


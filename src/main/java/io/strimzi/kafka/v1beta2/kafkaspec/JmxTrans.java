package io.strimzi.kafka.v1beta2.kafkaspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"image","kafkaQueries","logLevel","outputDefinitions","resources","template"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class JmxTrans implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The image to use for the JmxTrans.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The image to use for the JmxTrans.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Queries to send to the Kafka brokers to define what data should be read from each broker. For more information on these properties see, xref:type-JmxTransQueryTemplate-reference[`JmxTransQueryTemplate` schema reference].
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kafkaQueries")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Queries to send to the Kafka brokers to define what data should be read from each broker. For more information on these properties see, xref:type-JmxTransQueryTemplate-reference[`JmxTransQueryTemplate` schema reference].")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.jmxtrans.KafkaQueries> kafkaQueries;

    public java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.jmxtrans.KafkaQueries> getKafkaQueries() {
        return kafkaQueries;
    }

    public void setKafkaQueries(java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.jmxtrans.KafkaQueries> kafkaQueries) {
        this.kafkaQueries = kafkaQueries;
    }

    /**
     * Sets the logging level of the JmxTrans deployment.For more information see, https://github.com/jmxtrans/jmxtrans-agent/wiki/Troubleshooting[JmxTrans Logging Level].
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logLevel")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Sets the logging level of the JmxTrans deployment.For more information see, https://github.com/jmxtrans/jmxtrans-agent/wiki/Troubleshooting[JmxTrans Logging Level].")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String logLevel;

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * Defines the output hosts that will be referenced later on. For more information on these properties see, xref:type-JmxTransOutputDefinitionTemplate-reference[`JmxTransOutputDefinitionTemplate` schema reference].
     */
    @com.fasterxml.jackson.annotation.JsonProperty("outputDefinitions")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Defines the output hosts that will be referenced later on. For more information on these properties see, xref:type-JmxTransOutputDefinitionTemplate-reference[`JmxTransOutputDefinitionTemplate` schema reference].")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.jmxtrans.OutputDefinitions> outputDefinitions;

    public java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.jmxtrans.OutputDefinitions> getOutputDefinitions() {
        return outputDefinitions;
    }

    public void setOutputDefinitions(java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.jmxtrans.OutputDefinitions> outputDefinitions) {
        this.outputDefinitions = outputDefinitions;
    }

    /**
     * CPU and memory resources to reserve.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CPU and memory resources to reserve.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.jmxtrans.Resources resources;

    public io.strimzi.kafka.v1beta2.kafkaspec.jmxtrans.Resources getResources() {
        return resources;
    }

    public void setResources(io.strimzi.kafka.v1beta2.kafkaspec.jmxtrans.Resources resources) {
        this.resources = resources;
    }

    /**
     * Template for JmxTrans resources.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("template")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for JmxTrans resources.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.jmxtrans.Template template;

    public io.strimzi.kafka.v1beta2.kafkaspec.jmxtrans.Template getTemplate() {
        return template;
    }

    public void setTemplate(io.strimzi.kafka.v1beta2.kafkaspec.jmxtrans.Template template) {
        this.template = template;
    }
}


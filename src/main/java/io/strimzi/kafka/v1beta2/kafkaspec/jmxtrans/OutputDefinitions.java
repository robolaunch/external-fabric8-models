package io.strimzi.kafka.v1beta2.kafkaspec.jmxtrans;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"flushDelayInSeconds","host","name","outputType","port","typeNames"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class OutputDefinitions implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * How many seconds the JmxTrans waits before pushing a new set of data out.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("flushDelayInSeconds")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("How many seconds the JmxTrans waits before pushing a new set of data out.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long flushDelayInSeconds;

    public Long getFlushDelayInSeconds() {
        return flushDelayInSeconds;
    }

    public void setFlushDelayInSeconds(Long flushDelayInSeconds) {
        this.flushDelayInSeconds = flushDelayInSeconds;
    }

    /**
     * The DNS/hostname of the remote host that the data is pushed to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The DNS/hostname of the remote host that the data is pushed to.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String host;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * Template for setting the name of the output definition. This is used to identify where to send the results of queries should be sent.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for setting the name of the output definition. This is used to identify where to send the results of queries should be sent.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Template for setting the format of the data that will be pushed.For more information see https://github.com/jmxtrans/jmxtrans/wiki/OutputWriters[JmxTrans OutputWriters].
     */
    @com.fasterxml.jackson.annotation.JsonProperty("outputType")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for setting the format of the data that will be pushed.For more information see https://github.com/jmxtrans/jmxtrans/wiki/OutputWriters[JmxTrans OutputWriters].")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String outputType;

    public String getOutputType() {
        return outputType;
    }

    public void setOutputType(String outputType) {
        this.outputType = outputType;
    }

    /**
     * The port of the remote host that the data is pushed to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The port of the remote host that the data is pushed to.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long port;

    public Long getPort() {
        return port;
    }

    public void setPort(Long port) {
        this.port = port;
    }

    /**
     * Template for filtering data to be included in response to a wildcard query. For more information see https://github.com/jmxtrans/jmxtrans/wiki/Queries[JmxTrans queries].
     */
    @com.fasterxml.jackson.annotation.JsonProperty("typeNames")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for filtering data to be included in response to a wildcard query. For more information see https://github.com/jmxtrans/jmxtrans/wiki/Queries[JmxTrans queries].")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> typeNames;

    public java.util.List<String> getTypeNames() {
        return typeNames;
    }

    public void setTypeNames(java.util.List<String> typeNames) {
        this.typeNames = typeNames;
    }
}


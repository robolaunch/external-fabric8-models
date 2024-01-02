package io.strimzi.kafka.v1beta2.kafkaspec.jmxtrans;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"attributes","outputs","targetMBean"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class KafkaQueries implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Determine which attributes of the targeted MBean should be included.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attributes")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Determine which attributes of the targeted MBean should be included.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> attributes;

    public java.util.List<String> getAttributes() {
        return attributes;
    }

    public void setAttributes(java.util.List<String> attributes) {
        this.attributes = attributes;
    }

    /**
     * List of the names of output definitions specified in the spec.kafka.jmxTrans.outputDefinitions that have defined where JMX metrics are pushed to, and in which data format.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("outputs")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of the names of output definitions specified in the spec.kafka.jmxTrans.outputDefinitions that have defined where JMX metrics are pushed to, and in which data format.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> outputs;

    public java.util.List<String> getOutputs() {
        return outputs;
    }

    public void setOutputs(java.util.List<String> outputs) {
        this.outputs = outputs;
    }

    /**
     * If using wildcards instead of a specific MBean then the data is gathered from multiple MBeans. Otherwise if specifying an MBean then data is gathered from that specified MBean.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetMBean")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If using wildcards instead of a specific MBean then the data is gathered from multiple MBeans. Otherwise if specifying an MBean then data is gathered from that specified MBean.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String targetMBean;

    public String getTargetMBean() {
        return targetMBean;
    }

    public void setTargetMBean(String targetMBean) {
        this.targetMBean = targetMBean;
    }
}


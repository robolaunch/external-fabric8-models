package io.strimzi.kafka.v1beta2.kafkaspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"template","tlsSidecar","topicOperator","userOperator"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class EntityOperator implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Template for Entity Operator resources. The template allows users to specify how a `Deployment` and `Pod` is generated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("template")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Entity Operator resources. The template allows users to specify how a `Deployment` and `Pod` is generated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.Template template;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.Template getTemplate() {
        return template;
    }

    public void setTemplate(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.Template template) {
        this.template = template;
    }

    /**
     * TLS sidecar configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsSidecar")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TLS sidecar configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.TlsSidecar tlsSidecar;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.TlsSidecar getTlsSidecar() {
        return tlsSidecar;
    }

    public void setTlsSidecar(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.TlsSidecar tlsSidecar) {
        this.tlsSidecar = tlsSidecar;
    }

    /**
     * Configuration of the Topic Operator.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("topicOperator")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configuration of the Topic Operator.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.TopicOperator topicOperator;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.TopicOperator getTopicOperator() {
        return topicOperator;
    }

    public void setTopicOperator(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.TopicOperator topicOperator) {
        this.topicOperator = topicOperator;
    }

    /**
     * Configuration of the User Operator.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userOperator")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configuration of the User Operator.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.UserOperator userOperator;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.UserOperator getUserOperator() {
        return userOperator;
    }

    public void setUserOperator(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.UserOperator userOperator) {
        this.userOperator = userOperator;
    }
}


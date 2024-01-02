package io.strimzi.kafka.v1beta2.kafkaspec.jmxtrans;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"container","deployment","pod","serviceAccount"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Template implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Template for JmxTrans container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("container")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for JmxTrans container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.jmxtrans.template.Container container;

    public io.strimzi.kafka.v1beta2.kafkaspec.jmxtrans.template.Container getContainer() {
        return container;
    }

    public void setContainer(io.strimzi.kafka.v1beta2.kafkaspec.jmxtrans.template.Container container) {
        this.container = container;
    }

    /**
     * Template for JmxTrans `Deployment`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deployment")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for JmxTrans `Deployment`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.jmxtrans.template.Deployment deployment;

    public io.strimzi.kafka.v1beta2.kafkaspec.jmxtrans.template.Deployment getDeployment() {
        return deployment;
    }

    public void setDeployment(io.strimzi.kafka.v1beta2.kafkaspec.jmxtrans.template.Deployment deployment) {
        this.deployment = deployment;
    }

    /**
     * Template for JmxTrans `Pods`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pod")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for JmxTrans `Pods`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.jmxtrans.template.Pod pod;

    public io.strimzi.kafka.v1beta2.kafkaspec.jmxtrans.template.Pod getPod() {
        return pod;
    }

    public void setPod(io.strimzi.kafka.v1beta2.kafkaspec.jmxtrans.template.Pod pod) {
        this.pod = pod;
    }

    /**
     * Template for the JmxTrans service account.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceAccount")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the JmxTrans service account.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.jmxtrans.template.ServiceAccount serviceAccount;

    public io.strimzi.kafka.v1beta2.kafkaspec.jmxtrans.template.ServiceAccount getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(io.strimzi.kafka.v1beta2.kafkaspec.jmxtrans.template.ServiceAccount serviceAccount) {
        this.serviceAccount = serviceAccount;
    }
}


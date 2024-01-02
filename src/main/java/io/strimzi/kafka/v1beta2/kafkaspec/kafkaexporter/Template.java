package io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"container","deployment","pod","service","serviceAccount"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Template implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Template for the Kafka Exporter container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("container")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Kafka Exporter container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.template.Container container;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.template.Container getContainer() {
        return container;
    }

    public void setContainer(io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.template.Container container) {
        this.container = container;
    }

    /**
     * Template for Kafka Exporter `Deployment`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deployment")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka Exporter `Deployment`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.template.Deployment deployment;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.template.Deployment getDeployment() {
        return deployment;
    }

    public void setDeployment(io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.template.Deployment deployment) {
        this.deployment = deployment;
    }

    /**
     * Template for Kafka Exporter `Pods`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pod")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka Exporter `Pods`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.template.Pod pod;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.template.Pod getPod() {
        return pod;
    }

    public void setPod(io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.template.Pod pod) {
        this.pod = pod;
    }

    /**
     * Template for Kafka Exporter `Service`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka Exporter `Service`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.template.Service service;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.template.Service getService() {
        return service;
    }

    public void setService(io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.template.Service service) {
        this.service = service;
    }

    /**
     * Template for the Kafka Exporter service account.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceAccount")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Kafka Exporter service account.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.template.ServiceAccount serviceAccount;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.template.ServiceAccount getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.template.ServiceAccount serviceAccount) {
        this.serviceAccount = serviceAccount;
    }
}


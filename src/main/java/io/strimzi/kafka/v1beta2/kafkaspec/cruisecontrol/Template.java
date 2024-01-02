package io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"apiService","cruiseControlContainer","deployment","pod","podDisruptionBudget","serviceAccount","tlsSidecarContainer"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Template implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Template for Cruise Control API `Service`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("apiService")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Cruise Control API `Service`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.ApiService apiService;

    public io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.ApiService getApiService() {
        return apiService;
    }

    public void setApiService(io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.ApiService apiService) {
        this.apiService = apiService;
    }

    /**
     * Template for the Cruise Control container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cruiseControlContainer")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Cruise Control container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.CruiseControlContainer cruiseControlContainer;

    public io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.CruiseControlContainer getCruiseControlContainer() {
        return cruiseControlContainer;
    }

    public void setCruiseControlContainer(io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.CruiseControlContainer cruiseControlContainer) {
        this.cruiseControlContainer = cruiseControlContainer;
    }

    /**
     * Template for Cruise Control `Deployment`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deployment")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Cruise Control `Deployment`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.Deployment deployment;

    public io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.Deployment getDeployment() {
        return deployment;
    }

    public void setDeployment(io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.Deployment deployment) {
        this.deployment = deployment;
    }

    /**
     * Template for Cruise Control `Pods`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pod")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Cruise Control `Pods`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.Pod pod;

    public io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.Pod getPod() {
        return pod;
    }

    public void setPod(io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.Pod pod) {
        this.pod = pod;
    }

    /**
     * Template for Cruise Control `PodDisruptionBudget`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podDisruptionBudget")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Cruise Control `PodDisruptionBudget`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.PodDisruptionBudget podDisruptionBudget;

    public io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.PodDisruptionBudget getPodDisruptionBudget() {
        return podDisruptionBudget;
    }

    public void setPodDisruptionBudget(io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.PodDisruptionBudget podDisruptionBudget) {
        this.podDisruptionBudget = podDisruptionBudget;
    }

    /**
     * Template for the Cruise Control service account.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceAccount")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Cruise Control service account.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.ServiceAccount serviceAccount;

    public io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.ServiceAccount getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.ServiceAccount serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    /**
     * Template for the Cruise Control TLS sidecar container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsSidecarContainer")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Cruise Control TLS sidecar container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.TlsSidecarContainer tlsSidecarContainer;

    public io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.TlsSidecarContainer getTlsSidecarContainer() {
        return tlsSidecarContainer;
    }

    public void setTlsSidecarContainer(io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.TlsSidecarContainer tlsSidecarContainer) {
        this.tlsSidecarContainer = tlsSidecarContainer;
    }
}


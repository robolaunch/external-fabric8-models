package io.strimzi.kafka.v1beta2.kafkaspec.entityoperator;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"deployment","entityOperatorRole","pod","serviceAccount","tlsSidecarContainer","topicOperatorContainer","topicOperatorRoleBinding","userOperatorContainer","userOperatorRoleBinding"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Template implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Template for Entity Operator `Deployment`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deployment")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Entity Operator `Deployment`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.Deployment deployment;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.Deployment getDeployment() {
        return deployment;
    }

    public void setDeployment(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.Deployment deployment) {
        this.deployment = deployment;
    }

    /**
     * Template for the Entity Operator Role.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("entityOperatorRole")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Entity Operator Role.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.EntityOperatorRole entityOperatorRole;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.EntityOperatorRole getEntityOperatorRole() {
        return entityOperatorRole;
    }

    public void setEntityOperatorRole(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.EntityOperatorRole entityOperatorRole) {
        this.entityOperatorRole = entityOperatorRole;
    }

    /**
     * Template for Entity Operator `Pods`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pod")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Entity Operator `Pods`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.Pod pod;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.Pod getPod() {
        return pod;
    }

    public void setPod(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.Pod pod) {
        this.pod = pod;
    }

    /**
     * Template for the Entity Operator service account.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceAccount")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Entity Operator service account.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.ServiceAccount serviceAccount;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.ServiceAccount getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.ServiceAccount serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    /**
     * Template for the Entity Operator TLS sidecar container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsSidecarContainer")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Entity Operator TLS sidecar container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.TlsSidecarContainer tlsSidecarContainer;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.TlsSidecarContainer getTlsSidecarContainer() {
        return tlsSidecarContainer;
    }

    public void setTlsSidecarContainer(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.TlsSidecarContainer tlsSidecarContainer) {
        this.tlsSidecarContainer = tlsSidecarContainer;
    }

    /**
     * Template for the Entity Topic Operator container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("topicOperatorContainer")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Entity Topic Operator container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.TopicOperatorContainer topicOperatorContainer;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.TopicOperatorContainer getTopicOperatorContainer() {
        return topicOperatorContainer;
    }

    public void setTopicOperatorContainer(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.TopicOperatorContainer topicOperatorContainer) {
        this.topicOperatorContainer = topicOperatorContainer;
    }

    /**
     * Template for the Entity Topic Operator RoleBinding.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("topicOperatorRoleBinding")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Entity Topic Operator RoleBinding.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.TopicOperatorRoleBinding topicOperatorRoleBinding;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.TopicOperatorRoleBinding getTopicOperatorRoleBinding() {
        return topicOperatorRoleBinding;
    }

    public void setTopicOperatorRoleBinding(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.TopicOperatorRoleBinding topicOperatorRoleBinding) {
        this.topicOperatorRoleBinding = topicOperatorRoleBinding;
    }

    /**
     * Template for the Entity User Operator container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userOperatorContainer")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Entity User Operator container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.UserOperatorContainer userOperatorContainer;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.UserOperatorContainer getUserOperatorContainer() {
        return userOperatorContainer;
    }

    public void setUserOperatorContainer(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.UserOperatorContainer userOperatorContainer) {
        this.userOperatorContainer = userOperatorContainer;
    }

    /**
     * Template for the Entity Topic Operator RoleBinding.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userOperatorRoleBinding")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Entity Topic Operator RoleBinding.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.UserOperatorRoleBinding userOperatorRoleBinding;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.UserOperatorRoleBinding getUserOperatorRoleBinding() {
        return userOperatorRoleBinding;
    }

    public void setUserOperatorRoleBinding(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.UserOperatorRoleBinding userOperatorRoleBinding) {
        this.userOperatorRoleBinding = userOperatorRoleBinding;
    }
}


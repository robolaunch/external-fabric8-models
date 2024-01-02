package io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"deploymentStrategy","metadata"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Deployment implements io.fabric8.kubernetes.api.model.KubernetesResource {

    public enum DeploymentStrategy {

        @com.fasterxml.jackson.annotation.JsonProperty("RollingUpdate")
        ROLLINGUPDATE("RollingUpdate"), @com.fasterxml.jackson.annotation.JsonProperty("Recreate")
        RECREATE("Recreate");

        java.lang.String value;

        DeploymentStrategy(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Pod replacement strategy for deployment configuration changes. Valid values are `RollingUpdate` and `Recreate`. Defaults to `RollingUpdate`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentStrategy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Pod replacement strategy for deployment configuration changes. Valid values are `RollingUpdate` and `Recreate`. Defaults to `RollingUpdate`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private DeploymentStrategy deploymentStrategy;

    public DeploymentStrategy getDeploymentStrategy() {
        return deploymentStrategy;
    }

    public void setDeploymentStrategy(DeploymentStrategy deploymentStrategy) {
        this.deploymentStrategy = deploymentStrategy;
    }

    /**
     * Metadata applied to the resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Metadata applied to the resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.deployment.Metadata metadata;

    public io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.deployment.Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.deployment.Metadata metadata) {
        this.metadata = metadata;
    }
}


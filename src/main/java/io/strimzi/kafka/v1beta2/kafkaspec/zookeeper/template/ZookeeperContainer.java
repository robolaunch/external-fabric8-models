package io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"env","securityContext"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ZookeeperContainer implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Environment variables which should be applied to the container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("env")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Environment variables which should be applied to the container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.zookeepercontainer.Env> env;

    public java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.zookeepercontainer.Env> getEnv() {
        return env;
    }

    public void setEnv(java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.zookeepercontainer.Env> env) {
        this.env = env;
    }

    /**
     * Security context for the container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityContext")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Security context for the container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.zookeepercontainer.SecurityContext securityContext;

    public io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.zookeepercontainer.SecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.zookeepercontainer.SecurityContext securityContext) {
        this.securityContext = securityContext;
    }
}


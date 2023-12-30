package tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.podoverrides.spec.initcontainers.env;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"configMapKeyRef","fieldRef","resourceFieldRef","secretKeyRef"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ValueFrom implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("configMapKeyRef")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.podoverrides.spec.initcontainers.env.valuefrom.ConfigMapKeyRef configMapKeyRef;

    public tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.podoverrides.spec.initcontainers.env.valuefrom.ConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.podoverrides.spec.initcontainers.env.valuefrom.ConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("fieldRef")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.podoverrides.spec.initcontainers.env.valuefrom.FieldRef fieldRef;

    public tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.podoverrides.spec.initcontainers.env.valuefrom.FieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.podoverrides.spec.initcontainers.env.valuefrom.FieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resourceFieldRef")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.podoverrides.spec.initcontainers.env.valuefrom.ResourceFieldRef resourceFieldRef;

    public tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.podoverrides.spec.initcontainers.env.valuefrom.ResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.podoverrides.spec.initcontainers.env.valuefrom.ResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("secretKeyRef")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.podoverrides.spec.initcontainers.env.valuefrom.SecretKeyRef secretKeyRef;

    public tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.podoverrides.spec.initcontainers.env.valuefrom.SecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.podoverrides.spec.initcontainers.env.valuefrom.SecretKeyRef secretKeyRef) {
        this.secretKeyRef = secretKeyRef;
    }
}


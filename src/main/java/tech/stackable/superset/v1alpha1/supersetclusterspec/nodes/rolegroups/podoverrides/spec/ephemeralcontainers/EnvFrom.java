package tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.ephemeralcontainers;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"configMapRef","prefix","secretRef"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class EnvFrom implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("configMapRef")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.ephemeralcontainers.envfrom.ConfigMapRef configMapRef;

    public tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.ephemeralcontainers.envfrom.ConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.ephemeralcontainers.envfrom.ConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String prefix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("secretRef")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.ephemeralcontainers.envfrom.SecretRef secretRef;

    public tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.ephemeralcontainers.envfrom.SecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.ephemeralcontainers.envfrom.SecretRef secretRef) {
        this.secretRef = secretRef;
    }
}


package tech.stackable.opa.v1alpha1.opaclusterspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"cliOverrides","config","configOverrides","envOverrides","podOverrides","roleConfig","roleGroups"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Servers implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("cliOverrides")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> cliOverrides = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{}", java.util.Map.class);

    public java.util.Map<java.lang.String, String> getCliOverrides() {
        return cliOverrides;
    }

    public void setCliOverrides(java.util.Map<java.lang.String, String> cliOverrides) {
        this.cliOverrides = cliOverrides;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("config")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.opa.v1alpha1.opaclusterspec.servers.Config config = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{}", tech.stackable.opa.v1alpha1.opaclusterspec.servers.Config.class);

    public tech.stackable.opa.v1alpha1.opaclusterspec.servers.Config getConfig() {
        return config;
    }

    public void setConfig(tech.stackable.opa.v1alpha1.opaclusterspec.servers.Config config) {
        this.config = config;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configOverrides")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, java.util.Map<java.lang.String, String>> configOverrides = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{}", java.util.Map.class);

    public java.util.Map<java.lang.String, java.util.Map<java.lang.String, String>> getConfigOverrides() {
        return configOverrides;
    }

    public void setConfigOverrides(java.util.Map<java.lang.String, java.util.Map<java.lang.String, String>> configOverrides) {
        this.configOverrides = configOverrides;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("envOverrides")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> envOverrides = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{}", java.util.Map.class);

    public java.util.Map<java.lang.String, String> getEnvOverrides() {
        return envOverrides;
    }

    public void setEnvOverrides(java.util.Map<java.lang.String, String> envOverrides) {
        this.envOverrides = envOverrides;
    }

    /**
     * See PodTemplateSpec (https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.27/#podtemplatespec-v1-core) for more details
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podOverrides")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("See PodTemplateSpec (https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.27/#podtemplatespec-v1-core) for more details")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.opa.v1alpha1.opaclusterspec.servers.PodOverrides podOverrides = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{}", tech.stackable.opa.v1alpha1.opaclusterspec.servers.PodOverrides.class);

    public tech.stackable.opa.v1alpha1.opaclusterspec.servers.PodOverrides getPodOverrides() {
        return podOverrides;
    }

    public void setPodOverrides(tech.stackable.opa.v1alpha1.opaclusterspec.servers.PodOverrides podOverrides) {
        this.podOverrides = podOverrides;
    }

    /**
     * This is a product-agnostic RoleConfig, with nothing in it. It is used e.g. by products that have nothing configurable at role level.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("roleConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("This is a product-agnostic RoleConfig, with nothing in it. It is used e.g. by products that have nothing configurable at role level.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.opa.v1alpha1.opaclusterspec.servers.RoleConfig roleConfig = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{}", tech.stackable.opa.v1alpha1.opaclusterspec.servers.RoleConfig.class);

    public tech.stackable.opa.v1alpha1.opaclusterspec.servers.RoleConfig getRoleConfig() {
        return roleConfig;
    }

    public void setRoleConfig(tech.stackable.opa.v1alpha1.opaclusterspec.servers.RoleConfig roleConfig) {
        this.roleConfig = roleConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("roleGroups")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, tech.stackable.opa.v1alpha1.opaclusterspec.servers.RoleGroups> roleGroups;

    public java.util.Map<java.lang.String, tech.stackable.opa.v1alpha1.opaclusterspec.servers.RoleGroups> getRoleGroups() {
        return roleGroups;
    }

    public void setRoleGroups(java.util.Map<java.lang.String, tech.stackable.opa.v1alpha1.opaclusterspec.servers.RoleGroups> roleGroups) {
        this.roleGroups = roleGroups;
    }
}


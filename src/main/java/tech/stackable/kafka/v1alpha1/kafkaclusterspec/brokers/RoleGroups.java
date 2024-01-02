package tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"cliOverrides","config","configOverrides","envOverrides","podOverrides","replicas","selector"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class RoleGroups implements io.fabric8.kubernetes.api.model.KubernetesResource {

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
    private tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.rolegroups.Config config = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{}", tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.rolegroups.Config.class);

    public tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.rolegroups.Config getConfig() {
        return config;
    }

    public void setConfig(tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.rolegroups.Config config) {
        this.config = config;
    }

    /**
     * The `configOverrides` can be used to configure properties in product config files that are not exposed in the CRD. Read the [config overrides documentation](https://docs.stackable.tech/home/nightly/concepts/overrides#config-overrides) and consult the operator specific usage guide documentation for details on the available config files and settings for the specific product.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configOverrides")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The `configOverrides` can be used to configure properties in product config files that are not exposed in the CRD. Read the [config overrides documentation](https://docs.stackable.tech/home/nightly/concepts/overrides#config-overrides) and consult the operator specific usage guide documentation for details on the available config files and settings for the specific product.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, java.util.Map<java.lang.String, String>> configOverrides = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{}", java.util.Map.class);

    public java.util.Map<java.lang.String, java.util.Map<java.lang.String, String>> getConfigOverrides() {
        return configOverrides;
    }

    public void setConfigOverrides(java.util.Map<java.lang.String, java.util.Map<java.lang.String, String>> configOverrides) {
        this.configOverrides = configOverrides;
    }

    /**
     * `envOverrides` configure environment variables to be set in the Pods. It is a map from strings to strings - environment variables and the value to set. Read the [environment variable overrides documentation](https://docs.stackable.tech/home/nightly/concepts/overrides#env-overrides) for more information and consult the operator specific usage guide to find out about the product specific environment variables that are available.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("envOverrides")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("`envOverrides` configure environment variables to be set in the Pods. It is a map from strings to strings - environment variables and the value to set. Read the [environment variable overrides documentation](https://docs.stackable.tech/home/nightly/concepts/overrides#env-overrides) for more information and consult the operator specific usage guide to find out about the product specific environment variables that are available.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> envOverrides = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{}", java.util.Map.class);

    public java.util.Map<java.lang.String, String> getEnvOverrides() {
        return envOverrides;
    }

    public void setEnvOverrides(java.util.Map<java.lang.String, String> envOverrides) {
        this.envOverrides = envOverrides;
    }

    /**
     * In the `podOverrides` property you can define a [PodTemplateSpec](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.27/#podtemplatespec-v1-core) to override any property that can be set on a Kubernetes Pod. Read the [Pod overrides documentation](https://docs.stackable.tech/home/nightly/concepts/overrides#pod-overrides) for more information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podOverrides")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("In the `podOverrides` property you can define a [PodTemplateSpec](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.27/#podtemplatespec-v1-core) to override any property that can be set on a Kubernetes Pod. Read the [Pod overrides documentation](https://docs.stackable.tech/home/nightly/concepts/overrides#pod-overrides) for more information.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.rolegroups.PodOverrides podOverrides = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{}", tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.rolegroups.PodOverrides.class);

    public tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.rolegroups.PodOverrides getPodOverrides() {
        return podOverrides;
    }

    public void setPodOverrides(tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.rolegroups.PodOverrides podOverrides) {
        this.podOverrides = podOverrides;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("replicas")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private Long replicas;

    public Long getReplicas() {
        return replicas;
    }

    public void setReplicas(Long replicas) {
        this.replicas = replicas;
    }

    /**
     * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("selector")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.rolegroups.Selector selector;

    public tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.rolegroups.Selector getSelector() {
        return selector;
    }

    public void setSelector(tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.rolegroups.Selector selector) {
        this.selector = selector;
    }
}


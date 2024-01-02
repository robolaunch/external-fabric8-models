package tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.resources;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"limit","runtimeLimits"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Memory implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The maximum amount of memory that should be available to the Pod. Specified as a byte [Quantity](https://kubernetes.io/docs/reference/kubernetes-api/common-definitions/quantity/), which means these suffixes are supported: E, P, T, G, M, k. You can also use the power-of-two equivalents: Ei, Pi, Ti, Gi, Mi, Ki. For example, the following represent roughly the same value: `128974848, 129e6, 129M,  128974848000m, 123Mi`
     */
    @com.fasterxml.jackson.annotation.JsonProperty("limit")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum amount of memory that should be available to the Pod. Specified as a byte [Quantity](https://kubernetes.io/docs/reference/kubernetes-api/common-definitions/quantity/), which means these suffixes are supported: E, P, T, G, M, k. You can also use the power-of-two equivalents: Ei, Pi, Ti, Gi, Mi, Ki. For example, the following represent roughly the same value: `128974848, 129e6, 129M,  128974848000m, 123Mi`")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private String limit;

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    /**
     * Additional options that can be specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("runtimeLimits")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Additional options that can be specified.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.resources.memory.RuntimeLimits runtimeLimits;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.resources.memory.RuntimeLimits getRuntimeLimits() {
        return runtimeLimits;
    }

    public void setRuntimeLimits(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.resources.memory.RuntimeLimits runtimeLimits) {
        this.runtimeLimits = runtimeLimits;
    }
}


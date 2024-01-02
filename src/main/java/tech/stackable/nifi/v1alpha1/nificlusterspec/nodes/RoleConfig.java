package tech.stackable.nifi.v1alpha1.nificlusterspec.nodes;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"podDisruptionBudget"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class RoleConfig implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * This struct is used to configure:
     *
     * 1. If PodDisruptionBudgets are created by the operator 2. The allowed number of Pods to be unavailable (`maxUnavailable`)
     *
     * Learn more in the [allowed Pod disruptions documentation](https://docs.stackable.tech/home/nightly/concepts/operations/pod_disruptions).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podDisruptionBudget")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("This struct is used to configure:\n\n1. If PodDisruptionBudgets are created by the operator 2. The allowed number of Pods to be unavailable (`maxUnavailable`)\n\nLearn more in the [allowed Pod disruptions documentation](https://docs.stackable.tech/home/nightly/concepts/operations/pod_disruptions).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.roleconfig.PodDisruptionBudget podDisruptionBudget = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"enabled\":true,\"maxUnavailable\":null}", tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.roleconfig.PodDisruptionBudget.class);

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.roleconfig.PodDisruptionBudget getPodDisruptionBudget() {
        return podDisruptionBudget;
    }

    public void setPodDisruptionBudget(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.roleconfig.PodDisruptionBudget podDisruptionBudget) {
        this.podDisruptionBudget = podDisruptionBudget;
    }
}


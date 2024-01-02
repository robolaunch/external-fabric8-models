package tech.stackable.nifi.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"conditions","deployed_version"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class NifiClusterStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<tech.stackable.nifi.v1alpha1.nificlusterstatus.Conditions> conditions = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("[]", java.util.List.class);

    public java.util.List<tech.stackable.nifi.v1alpha1.nificlusterstatus.Conditions> getConditions() {
        return conditions;
    }

    public void setConditions(java.util.List<tech.stackable.nifi.v1alpha1.nificlusterstatus.Conditions> conditions) {
        this.conditions = conditions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("deployed_version")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private String deployed_version;

    public String getDeployed_version() {
        return deployed_version;
    }

    public void setDeployed_version(String deployed_version) {
        this.deployed_version = deployed_version;
    }
}


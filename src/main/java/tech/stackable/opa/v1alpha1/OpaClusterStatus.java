package tech.stackable.opa.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"conditions"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class OpaClusterStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<tech.stackable.opa.v1alpha1.opaclusterstatus.Conditions> conditions = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("[]", java.util.List.class);

    public java.util.List<tech.stackable.opa.v1alpha1.opaclusterstatus.Conditions> getConditions() {
        return conditions;
    }

    public void setConditions(java.util.List<tech.stackable.opa.v1alpha1.opaclusterstatus.Conditions> conditions) {
        this.conditions = conditions;
    }
}


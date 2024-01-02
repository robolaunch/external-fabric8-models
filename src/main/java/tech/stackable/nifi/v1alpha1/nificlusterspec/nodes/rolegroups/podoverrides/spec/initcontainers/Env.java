package tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.initcontainers;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"name","value","valueFrom"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Env implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("value")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("valueFrom")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.initcontainers.env.ValueFrom valueFrom;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.initcontainers.env.ValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.initcontainers.env.ValueFrom valueFrom) {
        this.valueFrom = valueFrom;
    }
}


package tech.stackable.superset.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"druid","superset"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class DruidConnectionSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The Druid to connect.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("druid")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The Druid to connect.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.superset.v1alpha1.druidconnectionspec.Druid druid;

    public tech.stackable.superset.v1alpha1.druidconnectionspec.Druid getDruid() {
        return druid;
    }

    public void setDruid(tech.stackable.superset.v1alpha1.druidconnectionspec.Druid druid) {
        this.druid = druid;
    }

    /**
     * The Superset to connect.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("superset")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The Superset to connect.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.superset.v1alpha1.druidconnectionspec.Superset superset;

    public tech.stackable.superset.v1alpha1.druidconnectionspec.Superset getSuperset() {
        return superset;
    }

    public void setSuperset(tech.stackable.superset.v1alpha1.druidconnectionspec.Superset superset) {
        this.superset = superset;
    }
}


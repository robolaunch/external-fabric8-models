package tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.config.resources;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"max","min"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Cpu implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The maximum amount of CPU cores that can be requested by Pods. Equivalent to the `limit` for Pod resource configuration. Cores are specified either as a decimal point number or as milli units. For example:`1.5` will be 1.5 cores, also written as `1500m`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum amount of CPU cores that can be requested by Pods. Equivalent to the `limit` for Pod resource configuration. Cores are specified either as a decimal point number or as milli units. For example:`1.5` will be 1.5 cores, also written as `1500m`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private String max;

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    /**
     * The minimal amount of CPU cores that Pods need to run. Equivalent to the `request` for Pod resource configuration. Cores are specified either as a decimal point number or as milli units. For example:`1.5` will be 1.5 cores, also written as `1500m`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("min")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The minimal amount of CPU cores that Pods need to run. Equivalent to the `request` for Pod resource configuration. Cores are specified either as a decimal point number or as milli units. For example:`1.5` will be 1.5 cores, also written as `1500m`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private String min;

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }
}


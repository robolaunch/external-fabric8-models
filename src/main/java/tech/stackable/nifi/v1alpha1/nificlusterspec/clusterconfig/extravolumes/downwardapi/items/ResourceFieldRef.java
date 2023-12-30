package tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.downwardapi.items;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"containerName","divisor","resource"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ResourceFieldRef implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Container name: required for volumes, optional for env vars
     */
    @com.fasterxml.jackson.annotation.JsonProperty("containerName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Container name: required for volumes, optional for env vars")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String containerName;

    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * Specifies the output format of the exposed resources, defaults to "1"
     */
    @com.fasterxml.jackson.annotation.JsonProperty("divisor")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies the output format of the exposed resources, defaults to \"1\"")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String divisor;

    public String getDivisor() {
        return divisor;
    }

    public void setDivisor(String divisor) {
        this.divisor = divisor;
    }

    /**
     * Required: resource to select
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Required: resource to select")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String resource;

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }
}


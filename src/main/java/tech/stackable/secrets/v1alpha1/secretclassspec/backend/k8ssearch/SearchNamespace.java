package tech.stackable.secrets.v1alpha1.secretclassspec.backend.k8ssearch;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"name","pod"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class SearchNamespace implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The Secret objects are located in a single global namespace. Should be used for secrets that are provisioned by the cluster administrator.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The Secret objects are located in a single global namespace. Should be used for secrets that are provisioned by the cluster administrator.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The Secret objects are located in the same namespace as the Pod object. Should be used for Secrets that are provisioned by the application administrator.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pod")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The Secret objects are located in the same namespace as the Pod object. Should be used for Secrets that are provisioned by the application administrator.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.secrets.v1alpha1.secretclassspec.backend.k8ssearch.searchnamespace.Pod pod;

    public tech.stackable.secrets.v1alpha1.secretclassspec.backend.k8ssearch.searchnamespace.Pod getPod() {
        return pod;
    }

    public void setPod(tech.stackable.secrets.v1alpha1.secretclassspec.backend.k8ssearch.searchnamespace.Pod pod) {
        this.pod = pod;
    }
}


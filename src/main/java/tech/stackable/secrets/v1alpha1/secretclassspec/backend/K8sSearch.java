package tech.stackable.secrets.v1alpha1.secretclassspec.backend;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"searchNamespace"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class K8sSearch implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Configures the namespace searched for Secret objects.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("searchNamespace")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configures the namespace searched for Secret objects.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.secrets.v1alpha1.secretclassspec.backend.k8ssearch.SearchNamespace searchNamespace;

    public tech.stackable.secrets.v1alpha1.secretclassspec.backend.k8ssearch.SearchNamespace getSearchNamespace() {
        return searchNamespace;
    }

    public void setSearchNamespace(tech.stackable.secrets.v1alpha1.secretclassspec.backend.k8ssearch.SearchNamespace searchNamespace) {
        this.searchNamespace = searchNamespace;
    }
}


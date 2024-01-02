package tech.stackable.secrets.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"backend"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class SecretClassSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Each SecretClass is associated with a single [backend](https://docs.stackable.tech/home/nightly/secret-operator/secretclass#backend), which dictates the mechanism for issuing that kind of Secret.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backend")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Each SecretClass is associated with a single [backend](https://docs.stackable.tech/home/nightly/secret-operator/secretclass#backend), which dictates the mechanism for issuing that kind of Secret.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.secrets.v1alpha1.secretclassspec.Backend backend;

    public tech.stackable.secrets.v1alpha1.secretclassspec.Backend getBackend() {
        return backend;
    }

    public void setBackend(tech.stackable.secrets.v1alpha1.secretclassspec.Backend backend) {
        this.backend = backend;
    }
}


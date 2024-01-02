package tech.stackable.secrets.v1alpha1.secretclassspec.backend.autotls;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"autoGenerate","secret"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Ca implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Whether a new certificate authority should be generated if it does not already exist.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoGenerate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Whether a new certificate authority should be generated if it does not already exist.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean autoGenerate = false;

    public Boolean getAutoGenerate() {
        return autoGenerate;
    }

    public void setAutoGenerate(Boolean autoGenerate) {
        this.autoGenerate = autoGenerate;
    }

    /**
     * Reference (name and namespace) to a Kubernetes Secret object where the CA certificate and key is stored in the keys `ca.crt` and `ca.key` respectively.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secret")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Reference (name and namespace) to a Kubernetes Secret object where the CA certificate and key is stored in the keys `ca.crt` and `ca.key` respectively.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.secrets.v1alpha1.secretclassspec.backend.autotls.ca.Secret secret;

    public tech.stackable.secrets.v1alpha1.secretclassspec.backend.autotls.ca.Secret getSecret() {
        return secret;
    }

    public void setSecret(tech.stackable.secrets.v1alpha1.secretclassspec.backend.autotls.ca.Secret secret) {
        this.secret = secret;
    }
}


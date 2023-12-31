package tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.ldap;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"verification"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Tls implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The verification method used to verify the certificates of the server and/or the client.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("verification")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The verification method used to verify the certificates of the server and/or the client.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.ldap.tls.Verification verification;

    public tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.ldap.tls.Verification getVerification() {
        return verification;
    }

    public void setVerification(tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.ldap.tls.Verification verification) {
        this.verification = verification;
    }
}


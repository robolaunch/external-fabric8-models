package tech.stackable.s3.v1alpha1.s3connectionspec.tls.verification;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"caCert"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Server implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * CA cert to verify the server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("caCert")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CA cert to verify the server.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.s3.v1alpha1.s3connectionspec.tls.verification.server.CaCert caCert;

    public tech.stackable.s3.v1alpha1.s3connectionspec.tls.verification.server.CaCert getCaCert() {
        return caCert;
    }

    public void setCaCert(tech.stackable.s3.v1alpha1.s3connectionspec.tls.verification.server.CaCert caCert) {
        this.caCert = caCert;
    }
}


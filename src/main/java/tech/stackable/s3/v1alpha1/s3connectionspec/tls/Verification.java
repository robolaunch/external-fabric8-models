package tech.stackable.s3.v1alpha1.s3connectionspec.tls;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"none","server"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Verification implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Use TLS but don't verify certificates.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("none")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Use TLS but don't verify certificates.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.s3.v1alpha1.s3connectionspec.tls.verification.None none;

    public tech.stackable.s3.v1alpha1.s3connectionspec.tls.verification.None getNone() {
        return none;
    }

    public void setNone(tech.stackable.s3.v1alpha1.s3connectionspec.tls.verification.None none) {
        this.none = none;
    }

    /**
     * Use TLS and a CA certificate to verify the server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("server")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Use TLS and a CA certificate to verify the server.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.s3.v1alpha1.s3connectionspec.tls.verification.Server server;

    public tech.stackable.s3.v1alpha1.s3connectionspec.tls.verification.Server getServer() {
        return server;
    }

    public void setServer(tech.stackable.s3.v1alpha1.s3connectionspec.tls.verification.Server server) {
        this.server = server;
    }
}


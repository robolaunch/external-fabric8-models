package tech.stackable.s3.v1alpha1.s3connectionspec.tls.verification.server;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"secretClass","webPki"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class CaCert implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Name of the [SecretClass](https://docs.stackable.tech/home/nightly/secret-operator/secretclass) which will provide the CA certificate. Note that a SecretClass does not need to have a key but can also work with just a CA certificate, so if you got provided with a CA cert but don't have access to the key you can still use this method.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretClass")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the [SecretClass](https://docs.stackable.tech/home/nightly/secret-operator/secretclass) which will provide the CA certificate. Note that a SecretClass does not need to have a key but can also work with just a CA certificate, so if you got provided with a CA cert but don't have access to the key you can still use this method.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String secretClass;

    public String getSecretClass() {
        return secretClass;
    }

    public void setSecretClass(String secretClass) {
        this.secretClass = secretClass;
    }

    /**
     * Use TLS and the CA certificates trusted by the common web browsers to verify the server. This can be useful when you e.g. use public AWS S3 or other public available services.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("webPki")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Use TLS and the CA certificates trusted by the common web browsers to verify the server. This can be useful when you e.g. use public AWS S3 or other public available services.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.s3.v1alpha1.s3connectionspec.tls.verification.server.cacert.WebPki webPki;

    public tech.stackable.s3.v1alpha1.s3connectionspec.tls.verification.server.cacert.WebPki getWebPki() {
        return webPki;
    }

    public void setWebPki(tech.stackable.s3.v1alpha1.s3connectionspec.tls.verification.server.cacert.WebPki webPki) {
        this.webPki = webPki;
    }
}


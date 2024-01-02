package io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.configuration;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"certificate","key","secretName"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class BrokerCertChainAndKey implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The name of the file certificate in the Secret.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certificate")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The name of the file certificate in the Secret.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String certificate;

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * The name of the private key in the Secret.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The name of the private key in the Secret.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * The name of the Secret containing the certificate.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretName")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The name of the Secret containing the certificate.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String secretName;

    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }
}


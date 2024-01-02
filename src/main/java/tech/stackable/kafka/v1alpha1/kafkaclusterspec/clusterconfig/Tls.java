package tech.stackable.kafka.v1alpha1.kafkaclusterspec.clusterconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"internalSecretClass","serverSecretClass"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Tls implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The [SecretClass](https://docs.stackable.tech/home/nightly/secret-operator/secretclass.html) to use for internal broker communication. Use mutual verification between brokers (mandatory). This setting controls: - Which cert the brokers should use to authenticate themselves against other brokers - Which ca.crt to use when validating the other brokers Defaults to `tls`
     */
    @com.fasterxml.jackson.annotation.JsonProperty("internalSecretClass")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The [SecretClass](https://docs.stackable.tech/home/nightly/secret-operator/secretclass.html) to use for internal broker communication. Use mutual verification between brokers (mandatory). This setting controls: - Which cert the brokers should use to authenticate themselves against other brokers - Which ca.crt to use when validating the other brokers Defaults to `tls`")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String internalSecretClass = "tls";

    public String getInternalSecretClass() {
        return internalSecretClass;
    }

    public void setInternalSecretClass(String internalSecretClass) {
        this.internalSecretClass = internalSecretClass;
    }

    /**
     * The [SecretClass](https://docs.stackable.tech/home/nightly/secret-operator/secretclass.html) to use for client connections. This setting controls: - If TLS encryption is used at all - Which cert the servers should use to authenticate themselves against the client Defaults to `tls`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serverSecretClass")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The [SecretClass](https://docs.stackable.tech/home/nightly/secret-operator/secretclass.html) to use for client connections. This setting controls: - If TLS encryption is used at all - Which cert the servers should use to authenticate themselves against the client Defaults to `tls`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private String serverSecretClass = "tls";

    public String getServerSecretClass() {
        return serverSecretClass;
    }

    public void setServerSecretClass(String serverSecretClass) {
        this.serverSecretClass = serverSecretClass;
    }
}


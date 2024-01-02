package tech.stackable.kafka.v1alpha1.kafkaclusterspec.clusterconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"authenticationClass"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Authentication implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The AuthenticationClass <https://docs.stackable.tech/home/nightly/concepts/authenticationclass.html> to use.
     *
     * ## TLS provider
     *
     * Only affects client connections. This setting controls: - If clients need to authenticate themselves against the broker via TLS - Which ca.crt to use when validating the provided client certs This will override the server TLS settings (if set) in `spec.clusterConfig.tls.serverSecretClass`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationClass")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The AuthenticationClass <https://docs.stackable.tech/home/nightly/concepts/authenticationclass.html> to use.\n\n## TLS provider\n\nOnly affects client connections. This setting controls: - If clients need to authenticate themselves against the broker via TLS - Which ca.crt to use when validating the provided client certs This will override the server TLS settings (if set) in `spec.clusterConfig.tls.serverSecretClass`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String authenticationClass;

    public String getAuthenticationClass() {
        return authenticationClass;
    }

    public void setAuthenticationClass(String authenticationClass) {
        this.authenticationClass = authenticationClass;
    }
}


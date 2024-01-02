package tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.clusterconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"quorumSecretClass","serverSecretClass"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Tls implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The [SecretClass](https://docs.stackable.tech/home/nightly/secret-operator/secretclass) to use for internal quorum communication. Use mutual verification between Zookeeper Nodes (mandatory). This setting controls: - Which cert the servers should use to authenticate themselves against other servers - Which ca.crt to use when validating the other server Defaults to `tls`
     */
    @com.fasterxml.jackson.annotation.JsonProperty("quorumSecretClass")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The [SecretClass](https://docs.stackable.tech/home/nightly/secret-operator/secretclass) to use for internal quorum communication. Use mutual verification between Zookeeper Nodes (mandatory). This setting controls: - Which cert the servers should use to authenticate themselves against other servers - Which ca.crt to use when validating the other server Defaults to `tls`")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String quorumSecretClass = "tls";

    public String getQuorumSecretClass() {
        return quorumSecretClass;
    }

    public void setQuorumSecretClass(String quorumSecretClass) {
        this.quorumSecretClass = quorumSecretClass;
    }

    /**
     * The [SecretClass](https://docs.stackable.tech/home/nightly/secret-operator/secretclass) to use for client connections. This setting controls: - If TLS encryption is used at all - Which cert the servers should use to authenticate themselves against the client Defaults to `tls`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serverSecretClass")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The [SecretClass](https://docs.stackable.tech/home/nightly/secret-operator/secretclass) to use for client connections. This setting controls: - If TLS encryption is used at all - Which cert the servers should use to authenticate themselves against the client Defaults to `tls`.")
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


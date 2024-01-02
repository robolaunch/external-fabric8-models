package tech.stackable.secrets.v1alpha1.secretclassspec.backend.kerberoskeytab.admin;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"kadminServer"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Mit implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The hostname of the Kerberos Admin Server. This should be provided by the Kerberos administrator.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kadminServer")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The hostname of the Kerberos Admin Server. This should be provided by the Kerberos administrator.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String kadminServer;

    public String getKadminServer() {
        return kadminServer;
    }

    public void setKadminServer(String kadminServer) {
        this.kadminServer = kadminServer;
    }
}


package tech.stackable.listeners.v1alpha1.listenerstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"address","addressType","ports"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class IngressAddresses implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The hostname or IP address to the Listener.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("address")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The hostname or IP address to the Listener.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public enum AddressType {

        @com.fasterxml.jackson.annotation.JsonProperty("Hostname")
        HOSTNAME("Hostname"), @com.fasterxml.jackson.annotation.JsonProperty("IP")
        IP("IP");

        java.lang.String value;

        AddressType(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * The type of address (`Hostname` or `IP`).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("addressType")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The type of address (`Hostname` or `IP`).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private AddressType addressType;

    public AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }

    /**
     * Port mapping table.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ports")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Port mapping table.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, Integer> ports;

    public java.util.Map<java.lang.String, Integer> getPorts() {
        return ports;
    }

    public void setPorts(java.util.Map<java.lang.String, Integer> ports) {
        this.ports = ports;
    }
}


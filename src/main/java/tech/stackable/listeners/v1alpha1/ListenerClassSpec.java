package tech.stackable.listeners.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"serviceAnnotations","serviceType"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ListenerClassSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Annotations that should be added to the Service object.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceAnnotations")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Annotations that should be added to the Service object.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> serviceAnnotations = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{}", java.util.Map.class);

    public java.util.Map<java.lang.String, String> getServiceAnnotations() {
        return serviceAnnotations;
    }

    public void setServiceAnnotations(java.util.Map<java.lang.String, String> serviceAnnotations) {
        this.serviceAnnotations = serviceAnnotations;
    }

    public enum ServiceType {

        @com.fasterxml.jackson.annotation.JsonProperty("NodePort")
        NODEPORT("NodePort"), @com.fasterxml.jackson.annotation.JsonProperty("LoadBalancer")
        LOADBALANCER("LoadBalancer"), @com.fasterxml.jackson.annotation.JsonProperty("ClusterIP")
        CLUSTERIP("ClusterIP");

        java.lang.String value;

        ServiceType(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * The method used to access the services.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The method used to access the services.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private ServiceType serviceType;

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }
}


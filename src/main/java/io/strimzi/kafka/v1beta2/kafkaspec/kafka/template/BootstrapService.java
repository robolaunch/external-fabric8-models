package io.strimzi.kafka.v1beta2.kafkaspec.kafka.template;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"ipFamilies","ipFamilyPolicy","metadata"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class BootstrapService implements io.fabric8.kubernetes.api.model.KubernetesResource {

    public enum IpFamilies {

        @com.fasterxml.jackson.annotation.JsonProperty("IPv4")
        IPV4("IPv4"), @com.fasterxml.jackson.annotation.JsonProperty("IPv6")
        IPV6("IPv6");

        java.lang.String value;

        IpFamilies(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Specifies the IP Families used by the service. Available options are `IPv4` and `IPv6`. If unspecified, Kubernetes will choose the default value based on the `ipFamilyPolicy` setting.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipFamilies")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies the IP Families used by the service. Available options are `IPv4` and `IPv6`. If unspecified, Kubernetes will choose the default value based on the `ipFamilyPolicy` setting.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<IpFamilies> ipFamilies;

    public java.util.List<IpFamilies> getIpFamilies() {
        return ipFamilies;
    }

    public void setIpFamilies(java.util.List<IpFamilies> ipFamilies) {
        this.ipFamilies = ipFamilies;
    }

    public enum IpFamilyPolicy {

        @com.fasterxml.jackson.annotation.JsonProperty("SingleStack")
        SINGLESTACK("SingleStack"), @com.fasterxml.jackson.annotation.JsonProperty("PreferDualStack")
        PREFERDUALSTACK("PreferDualStack"), @com.fasterxml.jackson.annotation.JsonProperty("RequireDualStack")
        REQUIREDUALSTACK("RequireDualStack");

        java.lang.String value;

        IpFamilyPolicy(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Specifies the IP Family Policy used by the service. Available options are `SingleStack`, `PreferDualStack` and `RequireDualStack`. `SingleStack` is for a single IP family. `PreferDualStack` is for two IP families on dual-stack configured clusters or a single IP family on single-stack clusters. `RequireDualStack` fails unless there are two IP families on dual-stack configured clusters. If unspecified, Kubernetes will choose the default value based on the service type.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipFamilyPolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies the IP Family Policy used by the service. Available options are `SingleStack`, `PreferDualStack` and `RequireDualStack`. `SingleStack` is for a single IP family. `PreferDualStack` is for two IP families on dual-stack configured clusters or a single IP family on single-stack clusters. `RequireDualStack` fails unless there are two IP families on dual-stack configured clusters. If unspecified, Kubernetes will choose the default value based on the service type.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private IpFamilyPolicy ipFamilyPolicy;

    public IpFamilyPolicy getIpFamilyPolicy() {
        return ipFamilyPolicy;
    }

    public void setIpFamilyPolicy(IpFamilyPolicy ipFamilyPolicy) {
        this.ipFamilyPolicy = ipFamilyPolicy;
    }

    /**
     * Metadata applied to the resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Metadata applied to the resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.bootstrapservice.Metadata metadata;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.bootstrapservice.Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.bootstrapservice.Metadata metadata) {
        this.metadata = metadata;
    }
}


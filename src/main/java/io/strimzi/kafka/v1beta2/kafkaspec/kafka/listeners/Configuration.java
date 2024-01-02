package io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"bootstrap","brokerCertChainAndKey","brokers","class","createBootstrapService","externalTrafficPolicy","finalizers","ipFamilies","ipFamilyPolicy","loadBalancerSourceRanges","maxConnectionCreationRate","maxConnections","preferredNodePortAddressType","useServiceDnsDomain"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Configuration implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Bootstrap configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bootstrap")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Bootstrap configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.configuration.Bootstrap bootstrap;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.configuration.Bootstrap getBootstrap() {
        return bootstrap;
    }

    public void setBootstrap(io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.configuration.Bootstrap bootstrap) {
        this.bootstrap = bootstrap;
    }

    /**
     * Reference to the `Secret` which holds the certificate and private key pair which will be used for this listener. The certificate can optionally contain the whole chain. This field can be used only with listeners with enabled TLS encryption.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("brokerCertChainAndKey")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Reference to the `Secret` which holds the certificate and private key pair which will be used for this listener. The certificate can optionally contain the whole chain. This field can be used only with listeners with enabled TLS encryption.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.configuration.BrokerCertChainAndKey brokerCertChainAndKey;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.configuration.BrokerCertChainAndKey getBrokerCertChainAndKey() {
        return brokerCertChainAndKey;
    }

    public void setBrokerCertChainAndKey(io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.configuration.BrokerCertChainAndKey brokerCertChainAndKey) {
        this.brokerCertChainAndKey = brokerCertChainAndKey;
    }

    /**
     * Per-broker configurations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("brokers")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Per-broker configurations.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.configuration.Brokers> brokers;

    public java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.configuration.Brokers> getBrokers() {
        return brokers;
    }

    public void setBrokers(java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.configuration.Brokers> brokers) {
        this.brokers = brokers;
    }

    /**
     * Configures a specific class for `Ingress` and `LoadBalancer` that defines which controller will be used. This field can only be used with `ingress` and `loadbalancer` type listeners. If not specified, the default controller is used. For an `ingress` listener, set the `ingressClassName` property in the `Ingress` resources. For a `loadbalancer` listener, set the `loadBalancerClass` property  in the `Service` resources.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("class")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configures a specific class for `Ingress` and `LoadBalancer` that defines which controller will be used. This field can only be used with `ingress` and `loadbalancer` type listeners. If not specified, the default controller is used. For an `ingress` listener, set the `ingressClassName` property in the `Ingress` resources. For a `loadbalancer` listener, set the `loadBalancerClass` property  in the `Service` resources.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String _class;

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    /**
     * Whether to create the bootstrap service or not. The bootstrap service is created by default (if not specified differently). This field can be used with the `loadBalancer` type listener.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("createBootstrapService")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Whether to create the bootstrap service or not. The bootstrap service is created by default (if not specified differently). This field can be used with the `loadBalancer` type listener.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean createBootstrapService;

    public Boolean getCreateBootstrapService() {
        return createBootstrapService;
    }

    public void setCreateBootstrapService(Boolean createBootstrapService) {
        this.createBootstrapService = createBootstrapService;
    }

    public enum ExternalTrafficPolicy {

        @com.fasterxml.jackson.annotation.JsonProperty("Local")
        LOCAL("Local"), @com.fasterxml.jackson.annotation.JsonProperty("Cluster")
        CLUSTER("Cluster");

        java.lang.String value;

        ExternalTrafficPolicy(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Specifies whether the service routes external traffic to node-local or cluster-wide endpoints. `Cluster` may cause a second hop to another node and obscures the client source IP. `Local` avoids a second hop for LoadBalancer and Nodeport type services and preserves the client source IP (when supported by the infrastructure). If unspecified, Kubernetes will use `Cluster` as the default.This field can be used only with `loadbalancer` or `nodeport` type listener.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalTrafficPolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies whether the service routes external traffic to node-local or cluster-wide endpoints. `Cluster` may cause a second hop to another node and obscures the client source IP. `Local` avoids a second hop for LoadBalancer and Nodeport type services and preserves the client source IP (when supported by the infrastructure). If unspecified, Kubernetes will use `Cluster` as the default.This field can be used only with `loadbalancer` or `nodeport` type listener.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private ExternalTrafficPolicy externalTrafficPolicy;

    public ExternalTrafficPolicy getExternalTrafficPolicy() {
        return externalTrafficPolicy;
    }

    public void setExternalTrafficPolicy(ExternalTrafficPolicy externalTrafficPolicy) {
        this.externalTrafficPolicy = externalTrafficPolicy;
    }

    /**
     * A list of finalizers which will be configured for the `LoadBalancer` type Services created for this listener. If supported by the platform, the finalizer `service.kubernetes.io/load-balancer-cleanup` to make sure that the external load balancer is deleted together with the service.For more information, see https://kubernetes.io/docs/tasks/access-application-cluster/create-external-load-balancer/#garbage-collecting-load-balancers. This field can be used only with `loadbalancer` type listeners.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("finalizers")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A list of finalizers which will be configured for the `LoadBalancer` type Services created for this listener. If supported by the platform, the finalizer `service.kubernetes.io/load-balancer-cleanup` to make sure that the external load balancer is deleted together with the service.For more information, see https://kubernetes.io/docs/tasks/access-application-cluster/create-external-load-balancer/#garbage-collecting-load-balancers. This field can be used only with `loadbalancer` type listeners.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> finalizers;

    public java.util.List<String> getFinalizers() {
        return finalizers;
    }

    public void setFinalizers(java.util.List<String> finalizers) {
        this.finalizers = finalizers;
    }

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
     * A list of CIDR ranges (for example `10.0.0.0/8` or `130.211.204.1/32`) from which clients can connect to load balancer type listeners. If supported by the platform, traffic through the loadbalancer is restricted to the specified CIDR ranges. This field is applicable only for loadbalancer type services and is ignored if the cloud provider does not support the feature. This field can be used only with `loadbalancer` type listener.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerSourceRanges")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A list of CIDR ranges (for example `10.0.0.0/8` or `130.211.204.1/32`) from which clients can connect to load balancer type listeners. If supported by the platform, traffic through the loadbalancer is restricted to the specified CIDR ranges. This field is applicable only for loadbalancer type services and is ignored if the cloud provider does not support the feature. This field can be used only with `loadbalancer` type listener.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> loadBalancerSourceRanges;

    public java.util.List<String> getLoadBalancerSourceRanges() {
        return loadBalancerSourceRanges;
    }

    public void setLoadBalancerSourceRanges(java.util.List<String> loadBalancerSourceRanges) {
        this.loadBalancerSourceRanges = loadBalancerSourceRanges;
    }

    /**
     * The maximum connection creation rate we allow in this listener at any time. New connections will be throttled if the limit is reached.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxConnectionCreationRate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum connection creation rate we allow in this listener at any time. New connections will be throttled if the limit is reached.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long maxConnectionCreationRate;

    public Long getMaxConnectionCreationRate() {
        return maxConnectionCreationRate;
    }

    public void setMaxConnectionCreationRate(Long maxConnectionCreationRate) {
        this.maxConnectionCreationRate = maxConnectionCreationRate;
    }

    /**
     * The maximum number of connections we allow for this listener in the broker at any time. New connections are blocked if the limit is reached.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxConnections")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum number of connections we allow for this listener in the broker at any time. New connections are blocked if the limit is reached.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long maxConnections;

    public Long getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(Long maxConnections) {
        this.maxConnections = maxConnections;
    }

    public enum PreferredNodePortAddressType {

        @com.fasterxml.jackson.annotation.JsonProperty("ExternalIP")
        EXTERNALIP("ExternalIP"), @com.fasterxml.jackson.annotation.JsonProperty("ExternalDNS")
        EXTERNALDNS("ExternalDNS"), @com.fasterxml.jackson.annotation.JsonProperty("InternalIP")
        INTERNALIP("InternalIP"), @com.fasterxml.jackson.annotation.JsonProperty("InternalDNS")
        INTERNALDNS("InternalDNS"), @com.fasterxml.jackson.annotation.JsonProperty("Hostname")
        HOSTNAME("Hostname");

        java.lang.String value;

        PreferredNodePortAddressType(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Defines which address type should be used as the node address. Available types are: `ExternalDNS`, `ExternalIP`, `InternalDNS`, `InternalIP` and `Hostname`. By default, the addresses will be used in the following order (the first one found will be used):
     *
     *  `ExternalDNS`
     *  `ExternalIP`
     *  `InternalDNS`
     *  `InternalIP`
     *  `Hostname`
     *
     * This field is used to select the preferred address type, which is checked first. If no address is found for this address type, the other types are checked in the default order. This field can only be used with `nodeport` type listener.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preferredNodePortAddressType")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Defines which address type should be used as the node address. Available types are: `ExternalDNS`, `ExternalIP`, `InternalDNS`, `InternalIP` and `Hostname`. By default, the addresses will be used in the following order (the first one found will be used):\n\n* `ExternalDNS`\n* `ExternalIP`\n* `InternalDNS`\n* `InternalIP`\n* `Hostname`\n\nThis field is used to select the preferred address type, which is checked first. If no address is found for this address type, the other types are checked in the default order. This field can only be used with `nodeport` type listener.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private PreferredNodePortAddressType preferredNodePortAddressType;

    public PreferredNodePortAddressType getPreferredNodePortAddressType() {
        return preferredNodePortAddressType;
    }

    public void setPreferredNodePortAddressType(PreferredNodePortAddressType preferredNodePortAddressType) {
        this.preferredNodePortAddressType = preferredNodePortAddressType;
    }

    /**
     * Configures whether the Kubernetes service DNS domain should be used or not. If set to `true`, the generated addresses will contain the service DNS domain suffix (by default `.cluster.local`, can be configured using environment variable `KUBERNETES_SERVICE_DNS_DOMAIN`). Defaults to `false`.This field can be used only with `internal` and `cluster-ip` type listeners.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("useServiceDnsDomain")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configures whether the Kubernetes service DNS domain should be used or not. If set to `true`, the generated addresses will contain the service DNS domain suffix (by default `.cluster.local`, can be configured using environment variable `KUBERNETES_SERVICE_DNS_DOMAIN`). Defaults to `false`.This field can be used only with `internal` and `cluster-ip` type listeners.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean useServiceDnsDomain;

    public Boolean getUseServiceDnsDomain() {
        return useServiceDnsDomain;
    }

    public void setUseServiceDnsDomain(Boolean useServiceDnsDomain) {
        this.useServiceDnsDomain = useServiceDnsDomain;
    }
}


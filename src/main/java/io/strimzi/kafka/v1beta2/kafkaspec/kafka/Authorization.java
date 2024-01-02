package io.strimzi.kafka.v1beta2.kafkaspec.kafka;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"allowOnError","authorizerClass","clientId","connectTimeoutSeconds","delegateToKafkaAcls","disableTlsHostnameVerification","enableMetrics","expireAfterMs","grantsAlwaysLatest","grantsGcPeriodSeconds","grantsMaxIdleTimeSeconds","grantsRefreshPeriodSeconds","grantsRefreshPoolSize","httpRetries","includeAcceptHeader","initialCacheCapacity","maximumCacheSize","readTimeoutSeconds","superUsers","supportsAdminApi","tlsTrustedCertificates","tokenEndpointUri","type","url"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Authorization implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Defines whether a Kafka client should be allowed or denied by default when the authorizer fails to query the Open Policy Agent, for example, when it is temporarily unavailable). Defaults to `false` - all actions will be denied.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowOnError")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Defines whether a Kafka client should be allowed or denied by default when the authorizer fails to query the Open Policy Agent, for example, when it is temporarily unavailable). Defaults to `false` - all actions will be denied.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean allowOnError;

    public Boolean getAllowOnError() {
        return allowOnError;
    }

    public void setAllowOnError(Boolean allowOnError) {
        this.allowOnError = allowOnError;
    }

    /**
     * Authorization implementation class, which must be available in classpath.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authorizerClass")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Authorization implementation class, which must be available in classpath.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String authorizerClass;

    public String getAuthorizerClass() {
        return authorizerClass;
    }

    public void setAuthorizerClass(String authorizerClass) {
        this.authorizerClass = authorizerClass;
    }

    /**
     * OAuth Client ID which the Kafka client can use to authenticate against the OAuth server and use the token endpoint URI.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientId")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("OAuth Client ID which the Kafka client can use to authenticate against the OAuth server and use the token endpoint URI.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String clientId;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * The connect timeout in seconds when connecting to authorization server. If not set, the effective connect timeout is 60 seconds.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectTimeoutSeconds")
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The connect timeout in seconds when connecting to authorization server. If not set, the effective connect timeout is 60 seconds.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long connectTimeoutSeconds;

    public Long getConnectTimeoutSeconds() {
        return connectTimeoutSeconds;
    }

    public void setConnectTimeoutSeconds(Long connectTimeoutSeconds) {
        this.connectTimeoutSeconds = connectTimeoutSeconds;
    }

    /**
     * Whether authorization decision should be delegated to the 'Simple' authorizer if DENIED by Keycloak Authorization Services policies. Default value is `false`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("delegateToKafkaAcls")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Whether authorization decision should be delegated to the 'Simple' authorizer if DENIED by Keycloak Authorization Services policies. Default value is `false`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean delegateToKafkaAcls;

    public Boolean getDelegateToKafkaAcls() {
        return delegateToKafkaAcls;
    }

    public void setDelegateToKafkaAcls(Boolean delegateToKafkaAcls) {
        this.delegateToKafkaAcls = delegateToKafkaAcls;
    }

    /**
     * Enable or disable TLS hostname verification. Default value is `false`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disableTlsHostnameVerification")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable or disable TLS hostname verification. Default value is `false`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean disableTlsHostnameVerification;

    public Boolean getDisableTlsHostnameVerification() {
        return disableTlsHostnameVerification;
    }

    public void setDisableTlsHostnameVerification(Boolean disableTlsHostnameVerification) {
        this.disableTlsHostnameVerification = disableTlsHostnameVerification;
    }

    /**
     * Enable or disable OAuth metrics. The default value is `false`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enableMetrics")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable or disable OAuth metrics. The default value is `false`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enableMetrics;

    public Boolean getEnableMetrics() {
        return enableMetrics;
    }

    public void setEnableMetrics(Boolean enableMetrics) {
        this.enableMetrics = enableMetrics;
    }

    /**
     * The expiration of the records kept in the local cache to avoid querying the Open Policy Agent for every request. Defines how often the cached authorization decisions are reloaded from the Open Policy Agent server. In milliseconds. Defaults to `3600000`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expireAfterMs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The expiration of the records kept in the local cache to avoid querying the Open Policy Agent for every request. Defines how often the cached authorization decisions are reloaded from the Open Policy Agent server. In milliseconds. Defaults to `3600000`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long expireAfterMs;

    public Long getExpireAfterMs() {
        return expireAfterMs;
    }

    public void setExpireAfterMs(Long expireAfterMs) {
        this.expireAfterMs = expireAfterMs;
    }

    /**
     * Controls whether the latest grants are fetched for a new session. When enabled, grants are retrieved from Keycloak and cached for the user. The default value is `false`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("grantsAlwaysLatest")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Controls whether the latest grants are fetched for a new session. When enabled, grants are retrieved from Keycloak and cached for the user. The default value is `false`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean grantsAlwaysLatest;

    public Boolean getGrantsAlwaysLatest() {
        return grantsAlwaysLatest;
    }

    public void setGrantsAlwaysLatest(Boolean grantsAlwaysLatest) {
        this.grantsAlwaysLatest = grantsAlwaysLatest;
    }

    /**
     * The time, in seconds, between consecutive runs of a job that cleans stale grants from the cache. The default value is 300.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("grantsGcPeriodSeconds")
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The time, in seconds, between consecutive runs of a job that cleans stale grants from the cache. The default value is 300.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long grantsGcPeriodSeconds;

    public Long getGrantsGcPeriodSeconds() {
        return grantsGcPeriodSeconds;
    }

    public void setGrantsGcPeriodSeconds(Long grantsGcPeriodSeconds) {
        this.grantsGcPeriodSeconds = grantsGcPeriodSeconds;
    }

    /**
     * The time, in seconds, after which an idle grant can be evicted from the cache. The default value is 300.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("grantsMaxIdleTimeSeconds")
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The time, in seconds, after which an idle grant can be evicted from the cache. The default value is 300.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long grantsMaxIdleTimeSeconds;

    public Long getGrantsMaxIdleTimeSeconds() {
        return grantsMaxIdleTimeSeconds;
    }

    public void setGrantsMaxIdleTimeSeconds(Long grantsMaxIdleTimeSeconds) {
        this.grantsMaxIdleTimeSeconds = grantsMaxIdleTimeSeconds;
    }

    /**
     * The time between two consecutive grants refresh runs in seconds. The default value is 60.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("grantsRefreshPeriodSeconds")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The time between two consecutive grants refresh runs in seconds. The default value is 60.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long grantsRefreshPeriodSeconds;

    public Long getGrantsRefreshPeriodSeconds() {
        return grantsRefreshPeriodSeconds;
    }

    public void setGrantsRefreshPeriodSeconds(Long grantsRefreshPeriodSeconds) {
        this.grantsRefreshPeriodSeconds = grantsRefreshPeriodSeconds;
    }

    /**
     * The number of threads to use to refresh grants for active sessions. The more threads, the more parallelism, so the sooner the job completes. However, using more threads places a heavier load on the authorization server. The default value is 5.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("grantsRefreshPoolSize")
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The number of threads to use to refresh grants for active sessions. The more threads, the more parallelism, so the sooner the job completes. However, using more threads places a heavier load on the authorization server. The default value is 5.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long grantsRefreshPoolSize;

    public Long getGrantsRefreshPoolSize() {
        return grantsRefreshPoolSize;
    }

    public void setGrantsRefreshPoolSize(Long grantsRefreshPoolSize) {
        this.grantsRefreshPoolSize = grantsRefreshPoolSize;
    }

    /**
     * The maximum number of retries to attempt if an initial HTTP request fails. If not set, the default is to not attempt any retries.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("httpRetries")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum number of retries to attempt if an initial HTTP request fails. If not set, the default is to not attempt any retries.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long httpRetries;

    public Long getHttpRetries() {
        return httpRetries;
    }

    public void setHttpRetries(Long httpRetries) {
        this.httpRetries = httpRetries;
    }

    /**
     * Whether the Accept header should be set in requests to the authorization servers. The default value is `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("includeAcceptHeader")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Whether the Accept header should be set in requests to the authorization servers. The default value is `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean includeAcceptHeader;

    public Boolean getIncludeAcceptHeader() {
        return includeAcceptHeader;
    }

    public void setIncludeAcceptHeader(Boolean includeAcceptHeader) {
        this.includeAcceptHeader = includeAcceptHeader;
    }

    /**
     * Initial capacity of the local cache used by the authorizer to avoid querying the Open Policy Agent for every request Defaults to `5000`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initialCacheCapacity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Initial capacity of the local cache used by the authorizer to avoid querying the Open Policy Agent for every request Defaults to `5000`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long initialCacheCapacity;

    public Long getInitialCacheCapacity() {
        return initialCacheCapacity;
    }

    public void setInitialCacheCapacity(Long initialCacheCapacity) {
        this.initialCacheCapacity = initialCacheCapacity;
    }

    /**
     * Maximum capacity of the local cache used by the authorizer to avoid querying the Open Policy Agent for every request. Defaults to `50000`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maximumCacheSize")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Maximum capacity of the local cache used by the authorizer to avoid querying the Open Policy Agent for every request. Defaults to `50000`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long maximumCacheSize;

    public Long getMaximumCacheSize() {
        return maximumCacheSize;
    }

    public void setMaximumCacheSize(Long maximumCacheSize) {
        this.maximumCacheSize = maximumCacheSize;
    }

    /**
     * The read timeout in seconds when connecting to authorization server. If not set, the effective read timeout is 60 seconds.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readTimeoutSeconds")
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The read timeout in seconds when connecting to authorization server. If not set, the effective read timeout is 60 seconds.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long readTimeoutSeconds;

    public Long getReadTimeoutSeconds() {
        return readTimeoutSeconds;
    }

    public void setReadTimeoutSeconds(Long readTimeoutSeconds) {
        this.readTimeoutSeconds = readTimeoutSeconds;
    }

    /**
     * List of super users, which are user principals with unlimited access rights.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("superUsers")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of super users, which are user principals with unlimited access rights.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> superUsers;

    public java.util.List<String> getSuperUsers() {
        return superUsers;
    }

    public void setSuperUsers(java.util.List<String> superUsers) {
        this.superUsers = superUsers;
    }

    /**
     * Indicates whether the custom authorizer supports the APIs for managing ACLs using the Kafka Admin API. Defaults to `false`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("supportsAdminApi")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Indicates whether the custom authorizer supports the APIs for managing ACLs using the Kafka Admin API. Defaults to `false`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean supportsAdminApi;

    public Boolean getSupportsAdminApi() {
        return supportsAdminApi;
    }

    public void setSupportsAdminApi(Boolean supportsAdminApi) {
        this.supportsAdminApi = supportsAdminApi;
    }

    /**
     * Trusted certificates for TLS connection to the OAuth server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsTrustedCertificates")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Trusted certificates for TLS connection to the OAuth server.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.kafka.authorization.TlsTrustedCertificates> tlsTrustedCertificates;

    public java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.kafka.authorization.TlsTrustedCertificates> getTlsTrustedCertificates() {
        return tlsTrustedCertificates;
    }

    public void setTlsTrustedCertificates(java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.kafka.authorization.TlsTrustedCertificates> tlsTrustedCertificates) {
        this.tlsTrustedCertificates = tlsTrustedCertificates;
    }

    /**
     * Authorization server token endpoint URI.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tokenEndpointUri")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Authorization server token endpoint URI.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String tokenEndpointUri;

    public String getTokenEndpointUri() {
        return tokenEndpointUri;
    }

    public void setTokenEndpointUri(String tokenEndpointUri) {
        this.tokenEndpointUri = tokenEndpointUri;
    }

    public enum Type {

        @com.fasterxml.jackson.annotation.JsonProperty("simple")
        SIMPLE("simple"), @com.fasterxml.jackson.annotation.JsonProperty("opa")
        OPA("opa"), @com.fasterxml.jackson.annotation.JsonProperty("keycloak")
        KEYCLOAK("keycloak"), @com.fasterxml.jackson.annotation.JsonProperty("custom")
        CUSTOM("custom");

        java.lang.String value;

        Type(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Authorization type. Currently, the supported types are `simple`, `keycloak`, `opa` and `custom`. `simple` authorization type uses Kafka's built-in authorizer for authorization. `keycloak` authorization type uses Keycloak Authorization Services for authorization. `opa` authorization type uses Open Policy Agent based authorization.`custom` authorization type uses user-provided implementation for authorization.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Authorization type. Currently, the supported types are `simple`, `keycloak`, `opa` and `custom`. `simple` authorization type uses Kafka's built-in authorizer for authorization. `keycloak` authorization type uses Keycloak Authorization Services for authorization. `opa` authorization type uses Open Policy Agent based authorization.`custom` authorization type uses user-provided implementation for authorization.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    /**
     * The URL used to connect to the Open Policy Agent server. The URL has to include the policy which will be queried by the authorizer. This option is required.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The URL used to connect to the Open Policy Agent server. The URL has to include the policy which will be queried by the authorizer. This option is required.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}


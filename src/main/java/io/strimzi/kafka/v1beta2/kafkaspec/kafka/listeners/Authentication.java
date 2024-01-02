package io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"accessTokenIsJwt","checkAccessTokenType","checkAudience","checkIssuer","clientAudience","clientId","clientScope","clientSecret","connectTimeoutSeconds","customClaimCheck","disableTlsHostnameVerification","enableECDSA","enableMetrics","enableOauthBearer","enablePlain","failFast","fallbackUserNameClaim","fallbackUserNamePrefix","groupsClaim","groupsClaimDelimiter","httpRetries","httpRetryPauseMs","includeAcceptHeader","introspectionEndpointUri","jwksEndpointUri","jwksExpirySeconds","jwksIgnoreKeyUse","jwksMinRefreshPauseSeconds","jwksRefreshSeconds","listenerConfig","maxSecondsWithoutReauthentication","readTimeoutSeconds","sasl","secrets","tlsTrustedCertificates","tokenEndpointUri","type","userInfoEndpointUri","userNameClaim","validIssuerUri","validTokenType"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Authentication implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Configure whether the access token is treated as JWT. This must be set to `false` if the authorization server returns opaque tokens. Defaults to `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accessTokenIsJwt")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configure whether the access token is treated as JWT. This must be set to `false` if the authorization server returns opaque tokens. Defaults to `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean accessTokenIsJwt;

    public Boolean getAccessTokenIsJwt() {
        return accessTokenIsJwt;
    }

    public void setAccessTokenIsJwt(Boolean accessTokenIsJwt) {
        this.accessTokenIsJwt = accessTokenIsJwt;
    }

    /**
     * Configure whether the access token type check is performed or not. This should be set to `false` if the authorization server does not include 'typ' claim in JWT token. Defaults to `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("checkAccessTokenType")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configure whether the access token type check is performed or not. This should be set to `false` if the authorization server does not include 'typ' claim in JWT token. Defaults to `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean checkAccessTokenType;

    public Boolean getCheckAccessTokenType() {
        return checkAccessTokenType;
    }

    public void setCheckAccessTokenType(Boolean checkAccessTokenType) {
        this.checkAccessTokenType = checkAccessTokenType;
    }

    /**
     * Enable or disable audience checking. Audience checks identify the recipients of tokens. If audience checking is enabled, the OAuth Client ID also has to be configured using the `clientId` property. The Kafka broker will reject tokens that do not have its `clientId` in their `aud` (audience) claim.Default value is `false`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("checkAudience")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable or disable audience checking. Audience checks identify the recipients of tokens. If audience checking is enabled, the OAuth Client ID also has to be configured using the `clientId` property. The Kafka broker will reject tokens that do not have its `clientId` in their `aud` (audience) claim.Default value is `false`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean checkAudience;

    public Boolean getCheckAudience() {
        return checkAudience;
    }

    public void setCheckAudience(Boolean checkAudience) {
        this.checkAudience = checkAudience;
    }

    /**
     * Enable or disable issuer checking. By default issuer is checked using the value configured by `validIssuerUri`. Default value is `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("checkIssuer")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable or disable issuer checking. By default issuer is checked using the value configured by `validIssuerUri`. Default value is `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean checkIssuer;

    public Boolean getCheckIssuer() {
        return checkIssuer;
    }

    public void setCheckIssuer(Boolean checkIssuer) {
        this.checkIssuer = checkIssuer;
    }

    /**
     * The audience to use when making requests to the authorization server's token endpoint. Used for inter-broker authentication and for configuring OAuth 2.0 over PLAIN using the `clientId` and `secret` method.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientAudience")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The audience to use when making requests to the authorization server's token endpoint. Used for inter-broker authentication and for configuring OAuth 2.0 over PLAIN using the `clientId` and `secret` method.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String clientAudience;

    public String getClientAudience() {
        return clientAudience;
    }

    public void setClientAudience(String clientAudience) {
        this.clientAudience = clientAudience;
    }

    /**
     * OAuth Client ID which the Kafka broker can use to authenticate against the authorization server and use the introspect endpoint URI.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientId")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("OAuth Client ID which the Kafka broker can use to authenticate against the authorization server and use the introspect endpoint URI.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String clientId;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * The scope to use when making requests to the authorization server's token endpoint. Used for inter-broker authentication and for configuring OAuth 2.0 over PLAIN using the `clientId` and `secret` method.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientScope")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The scope to use when making requests to the authorization server's token endpoint. Used for inter-broker authentication and for configuring OAuth 2.0 over PLAIN using the `clientId` and `secret` method.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String clientScope;

    public String getClientScope() {
        return clientScope;
    }

    public void setClientScope(String clientScope) {
        this.clientScope = clientScope;
    }

    /**
     * Link to Kubernetes Secret containing the OAuth client secret which the Kafka broker can use to authenticate against the authorization server and use the introspect endpoint URI.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientSecret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Link to Kubernetes Secret containing the OAuth client secret which the Kafka broker can use to authenticate against the authorization server and use the introspect endpoint URI.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.authentication.ClientSecret clientSecret;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.authentication.ClientSecret getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.authentication.ClientSecret clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * The connect timeout in seconds when connecting to authorization server. If not set, the effective connect timeout is 60 seconds.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectTimeoutSeconds")
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
     * JsonPath filter query to be applied to the JWT token or to the response of the introspection endpoint for additional token validation. Not set by default.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("customClaimCheck")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("JsonPath filter query to be applied to the JWT token or to the response of the introspection endpoint for additional token validation. Not set by default.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String customClaimCheck;

    public String getCustomClaimCheck() {
        return customClaimCheck;
    }

    public void setCustomClaimCheck(String customClaimCheck) {
        this.customClaimCheck = customClaimCheck;
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
     * Enable or disable ECDSA support by installing BouncyCastle crypto provider. ECDSA support is always enabled. The BouncyCastle libraries are no longer packaged with Strimzi. Value is ignored.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enableECDSA")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable or disable ECDSA support by installing BouncyCastle crypto provider. ECDSA support is always enabled. The BouncyCastle libraries are no longer packaged with Strimzi. Value is ignored.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enableECDSA;

    public Boolean getEnableECDSA() {
        return enableECDSA;
    }

    public void setEnableECDSA(Boolean enableECDSA) {
        this.enableECDSA = enableECDSA;
    }

    /**
     * Enable or disable OAuth metrics. Default value is `false`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enableMetrics")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable or disable OAuth metrics. Default value is `false`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enableMetrics;

    public Boolean getEnableMetrics() {
        return enableMetrics;
    }

    public void setEnableMetrics(Boolean enableMetrics) {
        this.enableMetrics = enableMetrics;
    }

    /**
     * Enable or disable OAuth authentication over SASL_OAUTHBEARER. Default value is `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enableOauthBearer")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable or disable OAuth authentication over SASL_OAUTHBEARER. Default value is `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enableOauthBearer;

    public Boolean getEnableOauthBearer() {
        return enableOauthBearer;
    }

    public void setEnableOauthBearer(Boolean enableOauthBearer) {
        this.enableOauthBearer = enableOauthBearer;
    }

    /**
     * Enable or disable OAuth authentication over SASL_PLAIN. There is no re-authentication support when this mechanism is used. Default value is `false`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enablePlain")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable or disable OAuth authentication over SASL_PLAIN. There is no re-authentication support when this mechanism is used. Default value is `false`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enablePlain;

    public Boolean getEnablePlain() {
        return enablePlain;
    }

    public void setEnablePlain(Boolean enablePlain) {
        this.enablePlain = enablePlain;
    }

    /**
     * Enable or disable termination of Kafka broker processes due to potentially recoverable runtime errors during startup. Default value is `true`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("failFast")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable or disable termination of Kafka broker processes due to potentially recoverable runtime errors during startup. Default value is `true`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean failFast;

    public Boolean getFailFast() {
        return failFast;
    }

    public void setFailFast(Boolean failFast) {
        this.failFast = failFast;
    }

    /**
     * The fallback username claim to be used for the user id if the claim specified by `userNameClaim` is not present. This is useful when `client_credentials` authentication only results in the client id being provided in another claim. It only takes effect if `userNameClaim` is set.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fallbackUserNameClaim")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The fallback username claim to be used for the user id if the claim specified by `userNameClaim` is not present. This is useful when `client_credentials` authentication only results in the client id being provided in another claim. It only takes effect if `userNameClaim` is set.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String fallbackUserNameClaim;

    public String getFallbackUserNameClaim() {
        return fallbackUserNameClaim;
    }

    public void setFallbackUserNameClaim(String fallbackUserNameClaim) {
        this.fallbackUserNameClaim = fallbackUserNameClaim;
    }

    /**
     * The prefix to use with the value of `fallbackUserNameClaim` to construct the user id. This only takes effect if `fallbackUserNameClaim` is true, and the value is present for the claim. Mapping usernames and client ids into the same user id space is useful in preventing name collisions.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fallbackUserNamePrefix")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The prefix to use with the value of `fallbackUserNameClaim` to construct the user id. This only takes effect if `fallbackUserNameClaim` is true, and the value is present for the claim. Mapping usernames and client ids into the same user id space is useful in preventing name collisions.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String fallbackUserNamePrefix;

    public String getFallbackUserNamePrefix() {
        return fallbackUserNamePrefix;
    }

    public void setFallbackUserNamePrefix(String fallbackUserNamePrefix) {
        this.fallbackUserNamePrefix = fallbackUserNamePrefix;
    }

    /**
     * JsonPath query used to extract groups for the user during authentication. Extracted groups can be used by a custom authorizer. By default no groups are extracted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupsClaim")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("JsonPath query used to extract groups for the user during authentication. Extracted groups can be used by a custom authorizer. By default no groups are extracted.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String groupsClaim;

    public String getGroupsClaim() {
        return groupsClaim;
    }

    public void setGroupsClaim(String groupsClaim) {
        this.groupsClaim = groupsClaim;
    }

    /**
     * A delimiter used to parse groups when they are extracted as a single String value rather than a JSON array. Default value is ',' (comma).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupsClaimDelimiter")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A delimiter used to parse groups when they are extracted as a single String value rather than a JSON array. Default value is ',' (comma).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String groupsClaimDelimiter;

    public String getGroupsClaimDelimiter() {
        return groupsClaimDelimiter;
    }

    public void setGroupsClaimDelimiter(String groupsClaimDelimiter) {
        this.groupsClaimDelimiter = groupsClaimDelimiter;
    }

    /**
     * The maximum number of retries to attempt if an initial HTTP request fails. If not set, the default is to not attempt any retries.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("httpRetries")
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
     * The pause to take before retrying a failed HTTP request. If not set, the default is to not pause at all but to immediately repeat a request.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("httpRetryPauseMs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The pause to take before retrying a failed HTTP request. If not set, the default is to not pause at all but to immediately repeat a request.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long httpRetryPauseMs;

    public Long getHttpRetryPauseMs() {
        return httpRetryPauseMs;
    }

    public void setHttpRetryPauseMs(Long httpRetryPauseMs) {
        this.httpRetryPauseMs = httpRetryPauseMs;
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
     * URI of the token introspection endpoint which can be used to validate opaque non-JWT tokens.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("introspectionEndpointUri")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("URI of the token introspection endpoint which can be used to validate opaque non-JWT tokens.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String introspectionEndpointUri;

    public String getIntrospectionEndpointUri() {
        return introspectionEndpointUri;
    }

    public void setIntrospectionEndpointUri(String introspectionEndpointUri) {
        this.introspectionEndpointUri = introspectionEndpointUri;
    }

    /**
     * URI of the JWKS certificate endpoint, which can be used for local JWT validation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jwksEndpointUri")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("URI of the JWKS certificate endpoint, which can be used for local JWT validation.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String jwksEndpointUri;

    public String getJwksEndpointUri() {
        return jwksEndpointUri;
    }

    public void setJwksEndpointUri(String jwksEndpointUri) {
        this.jwksEndpointUri = jwksEndpointUri;
    }

    /**
     * Configures how often are the JWKS certificates considered valid. The expiry interval has to be at least 60 seconds longer then the refresh interval specified in `jwksRefreshSeconds`. Defaults to 360 seconds.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jwksExpirySeconds")
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configures how often are the JWKS certificates considered valid. The expiry interval has to be at least 60 seconds longer then the refresh interval specified in `jwksRefreshSeconds`. Defaults to 360 seconds.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long jwksExpirySeconds;

    public Long getJwksExpirySeconds() {
        return jwksExpirySeconds;
    }

    public void setJwksExpirySeconds(Long jwksExpirySeconds) {
        this.jwksExpirySeconds = jwksExpirySeconds;
    }

    /**
     * Flag to ignore the 'use' attribute of `key` declarations in a JWKS endpoint response. Default value is `false`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jwksIgnoreKeyUse")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Flag to ignore the 'use' attribute of `key` declarations in a JWKS endpoint response. Default value is `false`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean jwksIgnoreKeyUse;

    public Boolean getJwksIgnoreKeyUse() {
        return jwksIgnoreKeyUse;
    }

    public void setJwksIgnoreKeyUse(Boolean jwksIgnoreKeyUse) {
        this.jwksIgnoreKeyUse = jwksIgnoreKeyUse;
    }

    /**
     * The minimum pause between two consecutive refreshes. When an unknown signing key is encountered the refresh is scheduled immediately, but will always wait for this minimum pause. Defaults to 1 second.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jwksMinRefreshPauseSeconds")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The minimum pause between two consecutive refreshes. When an unknown signing key is encountered the refresh is scheduled immediately, but will always wait for this minimum pause. Defaults to 1 second.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long jwksMinRefreshPauseSeconds;

    public Long getJwksMinRefreshPauseSeconds() {
        return jwksMinRefreshPauseSeconds;
    }

    public void setJwksMinRefreshPauseSeconds(Long jwksMinRefreshPauseSeconds) {
        this.jwksMinRefreshPauseSeconds = jwksMinRefreshPauseSeconds;
    }

    /**
     * Configures how often are the JWKS certificates refreshed. The refresh interval has to be at least 60 seconds shorter then the expiry interval specified in `jwksExpirySeconds`. Defaults to 300 seconds.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jwksRefreshSeconds")
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configures how often are the JWKS certificates refreshed. The refresh interval has to be at least 60 seconds shorter then the expiry interval specified in `jwksExpirySeconds`. Defaults to 300 seconds.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long jwksRefreshSeconds;

    public Long getJwksRefreshSeconds() {
        return jwksRefreshSeconds;
    }

    public void setJwksRefreshSeconds(Long jwksRefreshSeconds) {
        this.jwksRefreshSeconds = jwksRefreshSeconds;
    }

    /**
     * Configuration to be used for a specific listener. All values are prefixed with listener.name._<listener_name>_.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("listenerConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configuration to be used for a specific listener. All values are prefixed with listener.name._<listener_name>_.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.authentication.ListenerConfig listenerConfig;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.authentication.ListenerConfig getListenerConfig() {
        return listenerConfig;
    }

    public void setListenerConfig(io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.authentication.ListenerConfig listenerConfig) {
        this.listenerConfig = listenerConfig;
    }

    /**
     * Maximum number of seconds the authenticated session remains valid without re-authentication. This enables Apache Kafka re-authentication feature, and causes sessions to expire when the access token expires. If the access token expires before max time or if max time is reached, the client has to re-authenticate, otherwise the server will drop the connection. Not set by default - the authenticated session does not expire when the access token expires. This option only applies to SASL_OAUTHBEARER authentication mechanism (when `enableOauthBearer` is `true`).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxSecondsWithoutReauthentication")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Maximum number of seconds the authenticated session remains valid without re-authentication. This enables Apache Kafka re-authentication feature, and causes sessions to expire when the access token expires. If the access token expires before max time or if max time is reached, the client has to re-authenticate, otherwise the server will drop the connection. Not set by default - the authenticated session does not expire when the access token expires. This option only applies to SASL_OAUTHBEARER authentication mechanism (when `enableOauthBearer` is `true`).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long maxSecondsWithoutReauthentication;

    public Long getMaxSecondsWithoutReauthentication() {
        return maxSecondsWithoutReauthentication;
    }

    public void setMaxSecondsWithoutReauthentication(Long maxSecondsWithoutReauthentication) {
        this.maxSecondsWithoutReauthentication = maxSecondsWithoutReauthentication;
    }

    /**
     * The read timeout in seconds when connecting to authorization server. If not set, the effective read timeout is 60 seconds.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readTimeoutSeconds")
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
     * Enable or disable SASL on this listener.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sasl")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable or disable SASL on this listener.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean sasl;

    public Boolean getSasl() {
        return sasl;
    }

    public void setSasl(Boolean sasl) {
        this.sasl = sasl;
    }

    /**
     * Secrets to be mounted to /opt/kafka/custom-authn-secrets/custom-listener-_<listener_name>-<port>_/_<secret_name>_.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secrets")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Secrets to be mounted to /opt/kafka/custom-authn-secrets/custom-listener-_<listener_name>-<port>_/_<secret_name>_.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.authentication.Secrets> secrets;

    public java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.authentication.Secrets> getSecrets() {
        return secrets;
    }

    public void setSecrets(java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.authentication.Secrets> secrets) {
        this.secrets = secrets;
    }

    /**
     * Trusted certificates for TLS connection to the OAuth server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsTrustedCertificates")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Trusted certificates for TLS connection to the OAuth server.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.authentication.TlsTrustedCertificates> tlsTrustedCertificates;

    public java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.authentication.TlsTrustedCertificates> getTlsTrustedCertificates() {
        return tlsTrustedCertificates;
    }

    public void setTlsTrustedCertificates(java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.authentication.TlsTrustedCertificates> tlsTrustedCertificates) {
        this.tlsTrustedCertificates = tlsTrustedCertificates;
    }

    /**
     * URI of the Token Endpoint to use with SASL_PLAIN mechanism when the client authenticates with `clientId` and a `secret`. If set, the client can authenticate over SASL_PLAIN by either setting `username` to `clientId`, and setting `password` to client `secret`, or by setting `username` to account username, and `password` to access token prefixed with `$accessToken:`. If this option is not set, the `password` is always interpreted as an access token (without a prefix), and `username` as the account username (a so called 'no-client-credentials' mode).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tokenEndpointUri")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("URI of the Token Endpoint to use with SASL_PLAIN mechanism when the client authenticates with `clientId` and a `secret`. If set, the client can authenticate over SASL_PLAIN by either setting `username` to `clientId`, and setting `password` to client `secret`, or by setting `username` to account username, and `password` to access token prefixed with `$accessToken:`. If this option is not set, the `password` is always interpreted as an access token (without a prefix), and `username` as the account username (a so called 'no-client-credentials' mode).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String tokenEndpointUri;

    public String getTokenEndpointUri() {
        return tokenEndpointUri;
    }

    public void setTokenEndpointUri(String tokenEndpointUri) {
        this.tokenEndpointUri = tokenEndpointUri;
    }

    public enum Type {

        @com.fasterxml.jackson.annotation.JsonProperty("tls")
        TLS("tls"), @com.fasterxml.jackson.annotation.JsonProperty("scram-sha-512")
        SCRAMSHA512("scram-sha-512"), @com.fasterxml.jackson.annotation.JsonProperty("oauth")
        OAUTH("oauth"), @com.fasterxml.jackson.annotation.JsonProperty("custom")
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
     * Authentication type. `oauth` type uses SASL OAUTHBEARER Authentication. `scram-sha-512` type uses SASL SCRAM-SHA-512 Authentication. `tls` type uses TLS Client Authentication. `tls` type is supported only on TLS listeners.`custom` type allows for any authentication type to be used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Authentication type. `oauth` type uses SASL OAUTHBEARER Authentication. `scram-sha-512` type uses SASL SCRAM-SHA-512 Authentication. `tls` type uses TLS Client Authentication. `tls` type is supported only on TLS listeners.`custom` type allows for any authentication type to be used.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    /**
     * URI of the User Info Endpoint to use as a fallback to obtaining the user id when the Introspection Endpoint does not return information that can be used for the user id.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userInfoEndpointUri")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("URI of the User Info Endpoint to use as a fallback to obtaining the user id when the Introspection Endpoint does not return information that can be used for the user id. ")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String userInfoEndpointUri;

    public String getUserInfoEndpointUri() {
        return userInfoEndpointUri;
    }

    public void setUserInfoEndpointUri(String userInfoEndpointUri) {
        this.userInfoEndpointUri = userInfoEndpointUri;
    }

    /**
     * Name of the claim from the JWT authentication token, Introspection Endpoint response or User Info Endpoint response which will be used to extract the user id. Defaults to `sub`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userNameClaim")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the claim from the JWT authentication token, Introspection Endpoint response or User Info Endpoint response which will be used to extract the user id. Defaults to `sub`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String userNameClaim;

    public String getUserNameClaim() {
        return userNameClaim;
    }

    public void setUserNameClaim(String userNameClaim) {
        this.userNameClaim = userNameClaim;
    }

    /**
     * URI of the token issuer used for authentication.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("validIssuerUri")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("URI of the token issuer used for authentication.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String validIssuerUri;

    public String getValidIssuerUri() {
        return validIssuerUri;
    }

    public void setValidIssuerUri(String validIssuerUri) {
        this.validIssuerUri = validIssuerUri;
    }

    /**
     * Valid value for the `token_type` attribute returned by the Introspection Endpoint. No default value, and not checked by default.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("validTokenType")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Valid value for the `token_type` attribute returned by the Introspection Endpoint. No default value, and not checked by default.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String validTokenType;

    public String getValidTokenType() {
        return validTokenType;
    }

    public void setValidTokenType(String validTokenType) {
        this.validTokenType = validTokenType;
    }
}


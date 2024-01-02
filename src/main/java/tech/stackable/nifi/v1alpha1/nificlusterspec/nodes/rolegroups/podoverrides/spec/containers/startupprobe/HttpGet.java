package tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.containers.startupprobe;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"host","httpHeaders","path","port","scheme"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class HttpGet implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("host")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String host;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("httpHeaders")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.containers.startupprobe.httpget.HttpHeaders> httpHeaders;

    public java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.containers.startupprobe.httpget.HttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.containers.startupprobe.httpget.HttpHeaders> httpHeaders) {
        this.httpHeaders = httpHeaders;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("path")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("port")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String port;

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scheme")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String scheme;

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }
}


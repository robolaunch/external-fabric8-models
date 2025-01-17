package tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.containers;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"exec","failureThreshold","grpc","httpGet","initialDelaySeconds","periodSeconds","successThreshold","tcpSocket","terminationGracePeriodSeconds","timeoutSeconds"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ReadinessProbe implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("exec")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.containers.readinessprobe.Exec exec;

    public tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.containers.readinessprobe.Exec getExec() {
        return exec;
    }

    public void setExec(tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.containers.readinessprobe.Exec exec) {
        this.exec = exec;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("failureThreshold")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer failureThreshold;

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("grpc")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.containers.readinessprobe.Grpc grpc;

    public tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.containers.readinessprobe.Grpc getGrpc() {
        return grpc;
    }

    public void setGrpc(tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.containers.readinessprobe.Grpc grpc) {
        this.grpc = grpc;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("httpGet")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.containers.readinessprobe.HttpGet httpGet;

    public tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.containers.readinessprobe.HttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.containers.readinessprobe.HttpGet httpGet) {
        this.httpGet = httpGet;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("initialDelaySeconds")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer initialDelaySeconds;

    public Integer getInitialDelaySeconds() {
        return initialDelaySeconds;
    }

    public void setInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("periodSeconds")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer periodSeconds;

    public Integer getPeriodSeconds() {
        return periodSeconds;
    }

    public void setPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("successThreshold")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer successThreshold;

    public Integer getSuccessThreshold() {
        return successThreshold;
    }

    public void setSuccessThreshold(Integer successThreshold) {
        this.successThreshold = successThreshold;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("tcpSocket")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.containers.readinessprobe.TcpSocket tcpSocket;

    public tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.containers.readinessprobe.TcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.containers.readinessprobe.TcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("terminationGracePeriodSeconds")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long terminationGracePeriodSeconds;

    public Long getTerminationGracePeriodSeconds() {
        return terminationGracePeriodSeconds;
    }

    public void setTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("timeoutSeconds")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer timeoutSeconds;

    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }
}


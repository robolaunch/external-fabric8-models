package tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"args","command","env","envFrom","image","imagePullPolicy","lifecycle","livenessProbe","name","ports","readinessProbe","resizePolicy","resources","restartPolicy","securityContext","startupProbe","stdin","stdinOnce","terminationMessagePath","terminationMessagePolicy","tty","volumeDevices","volumeMounts","workingDir"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class InitContainers implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("args")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> args;

    public java.util.List<String> getArgs() {
        return args;
    }

    public void setArgs(java.util.List<String> args) {
        this.args = args;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("command")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> command;

    public java.util.List<String> getCommand() {
        return command;
    }

    public void setCommand(java.util.List<String> command) {
        this.command = command;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("env")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.Env> env;

    public java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.Env> getEnv() {
        return env;
    }

    public void setEnv(java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.Env> env) {
        this.env = env;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("envFrom")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.EnvFrom> envFrom;

    public java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.EnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.EnvFrom> envFrom) {
        this.envFrom = envFrom;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("imagePullPolicy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String imagePullPolicy;

    public String getImagePullPolicy() {
        return imagePullPolicy;
    }

    public void setImagePullPolicy(String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("lifecycle")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.Lifecycle lifecycle;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.Lifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("livenessProbe")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.LivenessProbe livenessProbe;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.LivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.LivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ports")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.Ports> ports;

    public java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.Ports> getPorts() {
        return ports;
    }

    public void setPorts(java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.Ports> ports) {
        this.ports = ports;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("readinessProbe")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.ReadinessProbe readinessProbe;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.ReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.ReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resizePolicy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.ResizePolicy> resizePolicy;

    public java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.ResizePolicy> getResizePolicy() {
        return resizePolicy;
    }

    public void setResizePolicy(java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.ResizePolicy> resizePolicy) {
        this.resizePolicy = resizePolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.Resources resources;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.Resources getResources() {
        return resources;
    }

    public void setResources(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.Resources resources) {
        this.resources = resources;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("restartPolicy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String restartPolicy;

    public String getRestartPolicy() {
        return restartPolicy;
    }

    public void setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("securityContext")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.SecurityContext securityContext;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.SecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.SecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("startupProbe")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.StartupProbe startupProbe;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.StartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.StartupProbe startupProbe) {
        this.startupProbe = startupProbe;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stdin")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean stdin;

    public Boolean getStdin() {
        return stdin;
    }

    public void setStdin(Boolean stdin) {
        this.stdin = stdin;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stdinOnce")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean stdinOnce;

    public Boolean getStdinOnce() {
        return stdinOnce;
    }

    public void setStdinOnce(Boolean stdinOnce) {
        this.stdinOnce = stdinOnce;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("terminationMessagePath")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String terminationMessagePath;

    public String getTerminationMessagePath() {
        return terminationMessagePath;
    }

    public void setTerminationMessagePath(String terminationMessagePath) {
        this.terminationMessagePath = terminationMessagePath;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("terminationMessagePolicy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String terminationMessagePolicy;

    public String getTerminationMessagePolicy() {
        return terminationMessagePolicy;
    }

    public void setTerminationMessagePolicy(String terminationMessagePolicy) {
        this.terminationMessagePolicy = terminationMessagePolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("tty")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean tty;

    public Boolean getTty() {
        return tty;
    }

    public void setTty(Boolean tty) {
        this.tty = tty;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("volumeDevices")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.VolumeDevices> volumeDevices;

    public java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.VolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.VolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("volumeMounts")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.VolumeMounts> volumeMounts;

    public java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.VolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.initcontainers.VolumeMounts> volumeMounts) {
        this.volumeMounts = volumeMounts;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("workingDir")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String workingDir;

    public String getWorkingDir() {
        return workingDir;
    }

    public void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
    }
}


package tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.podoverrides.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"fsGroup","fsGroupChangePolicy","runAsGroup","runAsNonRoot","runAsUser","seLinuxOptions","seccompProfile","supplementalGroups","sysctls","windowsOptions"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class SecurityContext implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("fsGroup")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long fsGroup;

    public Long getFsGroup() {
        return fsGroup;
    }

    public void setFsGroup(Long fsGroup) {
        this.fsGroup = fsGroup;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("fsGroupChangePolicy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String fsGroupChangePolicy;

    public String getFsGroupChangePolicy() {
        return fsGroupChangePolicy;
    }

    public void setFsGroupChangePolicy(String fsGroupChangePolicy) {
        this.fsGroupChangePolicy = fsGroupChangePolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("runAsGroup")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long runAsGroup;

    public Long getRunAsGroup() {
        return runAsGroup;
    }

    public void setRunAsGroup(Long runAsGroup) {
        this.runAsGroup = runAsGroup;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("runAsNonRoot")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean runAsNonRoot;

    public Boolean getRunAsNonRoot() {
        return runAsNonRoot;
    }

    public void setRunAsNonRoot(Boolean runAsNonRoot) {
        this.runAsNonRoot = runAsNonRoot;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("runAsUser")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long runAsUser;

    public Long getRunAsUser() {
        return runAsUser;
    }

    public void setRunAsUser(Long runAsUser) {
        this.runAsUser = runAsUser;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("seLinuxOptions")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.podoverrides.spec.securitycontext.SeLinuxOptions seLinuxOptions;

    public tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.podoverrides.spec.securitycontext.SeLinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    public void setSeLinuxOptions(tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.podoverrides.spec.securitycontext.SeLinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("seccompProfile")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.podoverrides.spec.securitycontext.SeccompProfile seccompProfile;

    public tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.podoverrides.spec.securitycontext.SeccompProfile getSeccompProfile() {
        return seccompProfile;
    }

    public void setSeccompProfile(tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.podoverrides.spec.securitycontext.SeccompProfile seccompProfile) {
        this.seccompProfile = seccompProfile;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("supplementalGroups")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<Long> supplementalGroups;

    public java.util.List<Long> getSupplementalGroups() {
        return supplementalGroups;
    }

    public void setSupplementalGroups(java.util.List<Long> supplementalGroups) {
        this.supplementalGroups = supplementalGroups;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sysctls")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.podoverrides.spec.securitycontext.Sysctls> sysctls;

    public java.util.List<tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.podoverrides.spec.securitycontext.Sysctls> getSysctls() {
        return sysctls;
    }

    public void setSysctls(java.util.List<tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.podoverrides.spec.securitycontext.Sysctls> sysctls) {
        this.sysctls = sysctls;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("windowsOptions")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.podoverrides.spec.securitycontext.WindowsOptions windowsOptions;

    public tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.podoverrides.spec.securitycontext.WindowsOptions getWindowsOptions() {
        return windowsOptions;
    }

    public void setWindowsOptions(tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.podoverrides.spec.securitycontext.WindowsOptions windowsOptions) {
        this.windowsOptions = windowsOptions;
    }
}


package tech.stackable.secrets.v1alpha1.secretclassspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"autoTls","k8sSearch","kerberosKeytab"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Backend implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The [`autoTls` backend](https://docs.stackable.tech/home/nightly/secret-operator/secretclass#backend-autotls) issues a TLS certificate signed by the Secret Operator. The certificate authority can be provided by the administrator, or managed automatically by the Secret Operator.
     *
     * A new certificate and keypair will be generated and signed for each Pod, keys or certificates are never reused.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoTls")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The [`autoTls` backend](https://docs.stackable.tech/home/nightly/secret-operator/secretclass#backend-autotls) issues a TLS certificate signed by the Secret Operator. The certificate authority can be provided by the administrator, or managed automatically by the Secret Operator.\n\nA new certificate and keypair will be generated and signed for each Pod, keys or certificates are never reused.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.secrets.v1alpha1.secretclassspec.backend.AutoTls autoTls;

    public tech.stackable.secrets.v1alpha1.secretclassspec.backend.AutoTls getAutoTls() {
        return autoTls;
    }

    public void setAutoTls(tech.stackable.secrets.v1alpha1.secretclassspec.backend.AutoTls autoTls) {
        this.autoTls = autoTls;
    }

    /**
     * The [`k8sSearch` backend](https://docs.stackable.tech/home/nightly/secret-operator/secretclass#backend-k8ssearch) can be used to mount Secrets across namespaces into Pods.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("k8sSearch")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The [`k8sSearch` backend](https://docs.stackable.tech/home/nightly/secret-operator/secretclass#backend-k8ssearch) can be used to mount Secrets across namespaces into Pods.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.secrets.v1alpha1.secretclassspec.backend.K8sSearch k8sSearch;

    public tech.stackable.secrets.v1alpha1.secretclassspec.backend.K8sSearch getK8sSearch() {
        return k8sSearch;
    }

    public void setK8sSearch(tech.stackable.secrets.v1alpha1.secretclassspec.backend.K8sSearch k8sSearch) {
        this.k8sSearch = k8sSearch;
    }

    /**
     * The [`kerberosKeytab` backend](https://docs.stackable.tech/home/nightly/secret-operator/secretclass#backend-kerberoskeytab) creates a Kerberos keytab file for a selected realm. The Kerberos KDC and administrator credentials must be provided by the administrator.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kerberosKeytab")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The [`kerberosKeytab` backend](https://docs.stackable.tech/home/nightly/secret-operator/secretclass#backend-kerberoskeytab) creates a Kerberos keytab file for a selected realm. The Kerberos KDC and administrator credentials must be provided by the administrator.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.secrets.v1alpha1.secretclassspec.backend.KerberosKeytab kerberosKeytab;

    public tech.stackable.secrets.v1alpha1.secretclassspec.backend.KerberosKeytab getKerberosKeytab() {
        return kerberosKeytab;
    }

    public void setKerberosKeytab(tech.stackable.secrets.v1alpha1.secretclassspec.backend.KerberosKeytab kerberosKeytab) {
        this.kerberosKeytab = kerberosKeytab;
    }
}


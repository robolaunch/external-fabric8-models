package tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.rolegroups.podoverrides.spec.containers.lifecycle;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"exec","httpGet","tcpSocket"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class PostStart implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("exec")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.rolegroups.podoverrides.spec.containers.lifecycle.poststart.Exec exec;

    public tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.rolegroups.podoverrides.spec.containers.lifecycle.poststart.Exec getExec() {
        return exec;
    }

    public void setExec(tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.rolegroups.podoverrides.spec.containers.lifecycle.poststart.Exec exec) {
        this.exec = exec;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("httpGet")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.rolegroups.podoverrides.spec.containers.lifecycle.poststart.HttpGet httpGet;

    public tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.rolegroups.podoverrides.spec.containers.lifecycle.poststart.HttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.rolegroups.podoverrides.spec.containers.lifecycle.poststart.HttpGet httpGet) {
        this.httpGet = httpGet;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("tcpSocket")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.rolegroups.podoverrides.spec.containers.lifecycle.poststart.TcpSocket tcpSocket;

    public tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.rolegroups.podoverrides.spec.containers.lifecycle.poststart.TcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.rolegroups.podoverrides.spec.containers.lifecycle.poststart.TcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }
}


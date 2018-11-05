package com.mix.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.util.List;

/**
 * @author: mix
 * @Date: 2018/8/26
 */
@Mojo(name = "mix", defaultPhase = LifecyclePhase.TEST)
public class MixMojo extends AbstractMojo {
    @Parameter(defaultValue = "test")
    private String msg;
    @Parameter
    private List<String> options;
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("插件测试");
        System.out.println(msg);
        System.out.println(options.toString());
    }
}

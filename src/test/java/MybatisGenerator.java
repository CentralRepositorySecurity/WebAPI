import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * 项目创建时，执行，之后不再执行，否则会覆盖现有数据
 */
public class MybatisGenerator {

    public void generator() throws Exception {

        List<String> warnings = new ArrayList<>();
        //指定 逆向工程配置文件
        File configFile = new File("src/test/resources/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(false);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                callback, warnings);
        myBatisGenerator.generate(null);
    }

    public static void main(String[] args) throws Exception {
        try {
            MybatisGenerator mybatisGenerator = new MybatisGenerator();
            mybatisGenerator.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

package demo.octopus.cn.core.service;

import cn.octopus.core.service.Api;
import retrofit2.Retrofit;

/**
 * Singleton
 * Created by JieGuo on 2017/8/2.
 */
public class DemoApi extends Api<ApiService> {

    private static DemoApi api;

    public static DemoApi getInstance() {
        if (api == null) {
            api = new DemoApi();
        }
        return api;
    }
}

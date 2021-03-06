package org.odk.getin.android.http;

import org.junit.runner.RunWith;
import org.odk.getin.android.http.okhttp.OkHttpConnection;
import org.odk.getin.android.http.okhttp.OkHttpOpenRosaServerClientFactory;
import org.odk.getin.android.http.openrosa.OpenRosaHttpInterface;
import org.robolectric.RobolectricTestRunner;

import java.util.Date;

import okhttp3.OkHttpClient;

@RunWith(RobolectricTestRunner.class)
public class OkHttpConnectionPostRequest extends OpenRosaPostRequestTest {

    @Override
    protected OpenRosaHttpInterface buildSubject(OpenRosaHttpInterface.FileToContentTypeMapper mapper) {
        return new OkHttpConnection(
                new OkHttpOpenRosaServerClientFactory(new OkHttpClient.Builder(), Date::new),
                mapper
        );
    }
}

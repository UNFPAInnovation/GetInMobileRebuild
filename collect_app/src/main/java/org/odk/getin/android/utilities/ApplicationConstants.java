/*
 * Copyright 2017 Nafundi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.odk.getin.android.utilities;

import org.odk.getin.android.R;

import java.util.HashMap;

public class ApplicationConstants {

    // based on http://www.sqlite.org/limits.html
    public static final int SQLITE_MAX_VARIABLE_NUMBER = 999;

    static final String[] TRANSLATIONS_AVAILABLE = {"af", "am", "ar", "bn", "ca", "cs", "de", "en",
            "es", "et", "fa", "fi", "fr", "hi", "in", "it", "ja", "ka", "km", "ln", "lo_LA", "lt",
            "mg", "ml", "mr", "ms", "my", "ne_NP", "nl", "no", "pl", "ps", "pt", "ro", "ru", "si",
            "sl", "so", "sq", "sr", "sv_SE", "sw", "sw_KE", "te", "th_TH", "ti", "tl", "tr", "uk",
            "ur", "ur_PK", "vi", "zh", "zu"};

    private ApplicationConstants() {

    }

    public static HashMap<Integer, Integer> getSortLabelToIconMap() {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(R.string.sort_by_name_asc, R.drawable.ic_sort_by_alpha);
        hashMap.put(R.string.sort_by_name_desc, R.drawable.ic_sort_by_alpha);
        hashMap.put(R.string.sort_by_date_asc, R.drawable.ic_access_time);
        hashMap.put(R.string.sort_by_date_desc, R.drawable.ic_access_time);
        hashMap.put(R.string.sort_by_status_asc, R.drawable.ic_assignment_turned_in);
        hashMap.put(R.string.sort_by_status_desc, R.drawable.ic_assignment_late);
        return hashMap;
    }

    public abstract static class BundleKeys {
        public static final String FORM_MODE = "formMode";
        public static final String SUCCESS_KEY = "SUCCESSFUL";
        public static final String ERROR_REASON = "ERROR_MSG";
        public static final String FORM_IDS = "FORM_IDS";
        public static final String MESSAGE = "MESSAGE";
        public static final String USERNAME = "USERNAME";
        public static final String PASSWORD = "PASSWORD";
        public static final String URL = "URL";
        public static final String DELETE_INSTANCE_AFTER_SUBMISSION = "DELETE_INSTANCE_AFTER_SUBMISSION";
    }

    public abstract static class FormModes {
        public static final String EDIT_SAVED = "editSaved";
        public static final String VIEW_SENT = "viewSent";
    }

    public abstract static class SortingOrder {
        public static final int BY_NAME_ASC = 0;
        public static final int BY_NAME_DESC = 1;
        public static final int BY_DATE_DESC = 2;
        public static final int BY_DATE_ASC = 3;
        public static final int BY_STATUS_ASC = 4;
        public static final int BY_STATUS_DESC = 5;
    }

    public abstract static class RequestCodes {
        public static final int IMAGE_CAPTURE = 1;
        // public static final int BARCODE_CAPTURE = 2;
        public static final int AUDIO_CAPTURE = 3;
        public static final int VIDEO_CAPTURE = 4;
        public static final int LOCATION_CAPTURE = 5;
        public static final int HIERARCHY_ACTIVITY = 6;
        public static final int IMAGE_CHOOSER = 7;
        public static final int AUDIO_CHOOSER = 8;
        public static final int VIDEO_CHOOSER = 9;
        public static final int EX_STRING_CAPTURE = 10;
        public static final int EX_INT_CAPTURE = 11;
        public static final int EX_DECIMAL_CAPTURE = 12;
        public static final int DRAW_IMAGE = 13;
        public static final int SIGNATURE_CAPTURE = 14;
        public static final int ANNOTATE_IMAGE = 15;
        public static final int ALIGNED_IMAGE = 16;
        public static final int BEARING_CAPTURE = 17;
        public static final int EX_GROUP_CAPTURE = 18;
        public static final int OSM_CAPTURE = 19;
        public static final int GEOSHAPE_CAPTURE = 20;
        public static final int GEOTRACE_CAPTURE = 21;
        public static final int ARBITRARY_FILE_CHOOSER = 22;

        public static final int FORMS_UPLOADED_NOTIFICATION = 97;
        public static final int FORMS_DOWNLOADED_NOTIFICATION = 98;
        public static final int FORM_UPDATES_AVAILABLE_NOTIFICATION = 99;
    }

    public abstract static class Namespaces {
        static final String XML_OPENROSA_NAMESPACE = "http://openrosa.org/xforms";
        public static final String XML_OPENDATAKIT_NAMESPACE = "http://www.opendatakit.org/xforms";
    }

    public static final String SERVER_TOKEN = "server_token";
    public static final String USER_FIRST_NAME = "user_first_name";
    public static final String USER_LAST_NAME = "user_last_name";
    public static final String USER_DISTRICT = "user_district";
    public static final String USER_NAME = "user_name";
    public static final String VHT_MIDWIFE_ID = "vht_midwife_Id";
    public static final String VHT_MIDWIFE_NAME = "vht_midwife_name";
    public static final String VHT_MIDWIFE_PHONE = "vht_midwife_phone";
    public static final String USER_ROLE = "user_role";
    public static final String USER_LOGGED_IN = "user_logged_in";
    public static final String CHEW_ROLE = "chew";
    public static final String MIDWIFE_ROLE = "midwife";
    public static final String APPOINTMENT_FORM_ID = "GetINAppointment6_chew";
    public static final String APPOINTMENT_FORM_MIDWIFE_ID = "GetINAppointment10_midwife";
    public static final String FOLLOW_UP_FORM_ID = "GetInFollowup20_chew";
    public static final String FOLLOW_UP_FORM_MIDWIFE_ID = "GetInFollowup19_midwife";
    public static final String MAP_GIRL_BUNDIBUGYO_FORM_ID = "GetInMapGirlBundibugyo17_chew";
    public static final String MAP_GIRL_BUNDIBUGYO_FORM_MIDWIFE_ID = "GetInMapGirlBundibugyo16_midwife";
    public static final String MAP_GIRL_ARUA_FORM_CHEW_ID = "GetInMapGirlArua3_chew";
    public static final String MAP_GIRL_ARUA_FORM_MIDWIFE_ID = "GetInMapGirlArua3_midwife";
    public static final String MAP_GIRL_KAMPALA_FORM_CHEW_ID = "GetInMapGirlKampala1_chew";
    public static final String MAP_GIRL_KAMPALA_FORM_MIDWIFE_ID = "GetInMapGirlKampala1_midwife";
    public static final String MAP_GIRL_MOYO_FORM_CHEW_ID = "GetInMapGirlMoyo1_chew";
    public static final String MAP_GIRL_ADJUMANI_FORM_CHEW_ID = "GetInMapGirlAdjumani1_chew";
    public static final String MAP_GIRL_YUMBE_FORM_CHEW_ID = "GetInMapGirlYumbe1_chew";
    public static final String MAP_GIRL_MOYO_FORM_MIDWIFE_ID = "GetInMapGirlMoyo1_midwife";
    public static final String MAP_GIRL_ADJUMANI_FORM_MIDWIFE_ID = "GetInMapGirlAdjumani1_midwife";
    public static final String MAP_GIRL_YUMBE_FORM_MIDWIFE_ID = "GetInMapGirlYumbe1_midwife";
    public static final String POSTNATAL_FORM_ID = "GetINPostnatalForm6_chew";
    public static final String POSTNATAL_FORM_MIDWIFE_ID = "GetINPostnatalForm6_midwife";
    public static final String GIRL_ID = "GIRL_ID";
    public static final String GIRL_NAME = "GIRL_NAME";
    public static final String GIRL_VOUCHER_NUMBER = "GIRL_VOUCHER_NUMBER";
    public static final String GIRL_REDEEMED_SERVICES = "GIRL_REDEEMED_SERVICES";
    public static final String GIRL_REDEEM_SERVICE_SELECTED = "GIRL_REDEEMED_SERVICE_SELECTED";
    public static final String GIRL_FIRST_NAME = "GIRL_FIRST_NAME";
    public static final String GIRL_LAST_NAME = "GIRL_LAST_NAME";
    public static final String EDIT_GIRL = "EDIT_GIRL";
    public static final String USER_ID = "USER_ID";
    public static final String LAST_NOTIFICATION_TIME = "last_notification";
    public static final String SHOW_NETWORK_STATUS = "show_network_status";

}

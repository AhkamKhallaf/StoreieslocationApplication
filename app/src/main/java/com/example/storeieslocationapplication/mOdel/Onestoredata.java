package com.example.storeieslocationapplication.mOdel;

import java.util.ArrayList;

public class Onestoredata {
    private ArrayList<Htmldata>html_attributions;
    private String next_page_token;
    private ArrayList<Oneresult>results;
    private   String status;

    public ArrayList<Htmldata> getHtml_attributions() {
        return html_attributions;
    }

    public void setHtml_attributions(ArrayList<Htmldata> html_attributions) {
        this.html_attributions = html_attributions;
    }

    public String getNext_page_token() {
        return next_page_token;
    }

    public void setNext_page_token(String next_page_token) {
        this.next_page_token = next_page_token;
    }

    public ArrayList<Oneresult> getArrayList() {
        return results;
    }

    public void setArrayList(ArrayList<Oneresult> results) {
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public class Oneresult
    {
       private Gemotery geometry;
        private String icon;
        private  String id;
        private  String name;
        private String place_id;
        private Pluscode plus_code;
        private String reference;
        private String scope;

        private ArrayList<String>types;
        private  String vicinity;

        public Gemotery getGeometry() {
            return geometry;
        }

        public void setGeometry(Gemotery geometry) {
            this.geometry = geometry;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPlace_id() {
            return place_id;
        }

        public void setPlace_id(String place_id) {
            this.place_id = place_id;
        }

        public Pluscode getPlus_code() {
            return plus_code;
        }

        public void setPlus_code(Pluscode plus_code) {
            this.plus_code = plus_code;
        }

        public String getReference() {
            return reference;
        }

        public void setReference(String reference) {
            this.reference = reference;
        }

        public String getScope() {
            return scope;
        }

        public void setScope(String scope) {
            this.scope = scope;
        }

        public ArrayList<String> getTypes() {
            return types;
        }

        public void setTypes(ArrayList<String> types) {
            this.types = types;
        }

        public String getVicinity() {
            return vicinity;
        }

        public void setVicinity(String vicinity) {
            this.vicinity = vicinity;
        }

        class Pluscode
        {
            String Compound_code;
            String global_code;
        }
      public   class Gemotery
        {
           private Locaatation location;
           private Viewport viewport;

            public Locaatation getLocation() {
                return location;
            }

            public void setLocation(Locaatation location) {
                this.location = location;
            }

            public Viewport getViewport() {
                return viewport;
            }

            public void setViewport(Viewport viewport) {
                this.viewport = viewport;
            }
        }

      public   class Locaatation
        {
            private String lat;
            private String lng;

            public String getLat() {
                return lat;
            }

            public void setLat(String lat) {
                this.lat = lat;
            }

            public String getLng() {
                return lng;
            }

            public void setLng(String lng) {
                this.lng = lng;
            }
        }

        class Viewport
        {
        Northeast northeast;
        Southwest southwest;
        }

        class Northeast
        {
            private String lat;
            private String lng;

            public String getLat() {
                return lat;
            }

            public void setLat(String lat) {
                this.lat = lat;
            }

            public String getLng() {
                return lng;
            }

            public void setLng(String lng) {
                this.lng = lng;
            }
        }

        class Southwest
        {
            private String lat;
            private  String lng;

            public String getLat() {
                return lat;
            }

            public void setLat(String lat) {
                this.lat = lat;
            }

            public String getLng() {
                return lng;
            }

            public void setLng(String lng) {
                this.lng = lng;
            }
        }
    }

    class  Htmldata
    {

    }
}

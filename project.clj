(defproject org.clojars.afrey/lein-google-cloud-artifact-registry "1.0.0-rc.1"
  :description "A leiningen plugin that enables fetching dependencies from Google
  Cloud Artifact Registry maven repositories."
  :url "https://github.com/AdamFrey/lein-google-cloud-artifact-registry"
  :license {:name "The MIT License"
            :url  "http://opensource.org/licenses/MIT"}
  :eval-in-leiningen true
  :dependencies
  [[com.google.cloud.artifactregistry/artifactregistry-maven-wagon "2.1.5"]]
  )

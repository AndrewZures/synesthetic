(defproject synesthetic "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [korma "0.3.2"]
                 [ragtime "0.3.6"]
                 [org.clojure/java.jdbc "0.3.3"]
                 [mysql/mysql-connector-java "5.1.6"]
                 [log4j "1.2.15" :exclusions [javax.mail/mail
                                              javax.jms/jms
                                              com.sun.jdmk/jmxtools
                                              com.sun.jmx/jmxri]]]

  :profiles {:dev {:dependencies [[speclj "3.0.1"]]}}

  :plugins [[speclj "3.0.1"]
            [ragtime/ragtime.lein "0.3.6"]]

  :test-paths ["spec"]

  :ragtime {:migrations ragtime.sql.files/migrations
            :database "jdbc:mysql://localhost:3306/synesthetic-test?user=root"})

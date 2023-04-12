def call(String Stage){
  if("${Stage}" == "package"){
  sh "${mavenHome}/bin/mvn package"
  } 
}

def call(String Stage){
  if("${Stage}" == "package"){
  sh "mvn package"
  } 
}

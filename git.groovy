def call(map stageparams){
     checkout([
       $class: 'gitscm'
      branches:[(name:stageparams.branch)]
      url:[(url:stageparams.url)]
     ])
}

/**
 * Setup Module with `highlight` filter
 */
/*

/**
 * Inject required $objects into our Controller
 */

// not conflict with jekyll bindings.
angular
  .module('jekyllApp', [])
  .controller('ctrl', ctrl)
  .config(function($interpolateProvider){
    $interpolateProvider.startSymbol('{[{').endSymbol('}]}');
    })
;

function ctrl($scope, $http) {
  $scope.posts = [];

  $http
    .get('/site.json')
    .then(onSuccess)
  ;

  function onSuccess(result) {
    $scope.posts = result.data;
  }
}

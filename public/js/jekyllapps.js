/**
 * Setup Module with `highlight` filter
 */
/*

/**
 * Inject required $objects into our Controller
 */

angular
    .module('jekyllApp', ['ngRoute'])
    .controller('ctrl', ctrl)

    // not conflict with jekyll bindings.
    .config(function($interpolateProvider){
        $interpolateProvider.startSymbol('{[{').endSymbol('}]}');
        })

    .config(['$routeProvider',
        function($routeProvider) {
            $routeProvider.
            when('/p:postId', {
                controller: 'ctrl',
                template: ' {[{  content }]} '
            }).
            otherwise({
                redirectTo: '/'
            });
        }])
;

function ctrl($scope, $http, $routeParams) {
  $scope.postId = $routeParams.postId;
  $scope.posts = [];
  $scope.content = [];

  $http
    .get($scope.posts[postId].url)
    .then(setContent);

  function setContent(result) {
    $scope.content=result;
  }

  $http
    .get('/site.json')
    .then(onSuccess);

  function onSuccess(result) {
    $scope.posts = result.data;
  }
}

// two controllers, one for index, one for content,
// the second will make http request for cnotent based on routeParam array from link.



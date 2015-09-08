/**
 * Setup Module with `highlight` filter
 */
/*

/**
 * Inject required $objects into our Controller
 */

angular
    .module('jekyllApp', ['ngRoute'])
    .controller('PostListingCtrl', PostListingCtrl)
    .controller('PostContentCtrl', PostContentCtrl)

    // not conflict with jekyll bindings.
    .config(function($interpolateProvider){
        $interpolateProvider.startSymbol('{[{').endSymbol('}]}');
        })

    .config(['$routeProvider',
        function($routeProvider) {
            $routeProvider.
            when('/', {
                controller: 'PostListingCtrl',
                templateUrl: ' /template/index.html '
            }).
            when('/p:postId', {
                controller: 'PostContentCtrl',
                template: ' content '
            }).
            otherwise({
                redirectTo: '/'
            });
        }])
;

function PostListingCtrl($scope, $http) {
    $scope.posts=[];

    $http
        .get('/site.json')
        .then(fillPosts);

    function fillPosts(result) {
        $scope.posts = result.data;
    }
}

function PostContentCtrl($scope, $http, $routeParams) {
    $scope.ContentUrl = $routeParams.ContentUrl;

    $http
        .get($scope.ContentUrl)
        .then(setContent);

    function setContent(result) {
        $scope.content=result;
    }
}

// two controllers, one for index, one for content,
// the second will make http request for cnotent based on routeParam array from link.



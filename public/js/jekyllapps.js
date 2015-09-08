/**
 * Setup Module with `highlight` filter
 */
/*

/**
 * Inject required $objects into our Controller
 */

angular
    .module('jekyllApp', ['ngRoute', 'ngSanitize'])
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
                template: ' <span ng-bind-html="content"></span> '
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
    $scope.postId= $routeParams.postId;

    $http
        .get('/site.json')
        .then(parsePosts);

    function parsePosts(result) {
        $scope.posts = result.data;
        //get the url associated with postId.
        $http
            .get($scope.posts[$scope.postId].url)
            .then(getContent);
    }

    function getContent(result)
    {
        $scope.content=result.data;
    }
}

// two controllers, one for index, one for content,
// the second will make http request for cnotent based on routeParam array from link.




// Make a jekyll app to interact with posts n such.
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

function PostContentCtrl($scope, $http, $routeParams, $sce) {
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
        $scope.content=$sce.trustAsHtml(result.data);
    }
}


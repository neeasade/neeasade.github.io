
// Make a jekyll app to interact with posts n such.
angular
    .module('jekyllApp', ['ngRoute'])
    .controller('PostListingCtrl', PostListingCtrl)
    .controller('PostContentCtrl', PostContentCtrl)
    .controller('PostSearchCtrl', PostSearchCtrl)

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
                templateUrl: '/template/post.html'
            }).
            when('/search', {
                controller: 'PostSearchCtrl',
                templateUrl: '/template/search.html'
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
        // reverse so that posts are in ascending order, oldest to newest.
        $scope.posts = result.data.reverse();
        // get the url associated with postId.
        $http
            .get($scope.posts[$scope.postId].url)
            .then(getContent);
    }

    function getContent(result)
    {
        $scope.content=$sce.trustAsHtml(result.data);
    }

    $scope.scrollTo = function(id) {
        var old = $location.hash();
        $location.hash(id);
        $anchorScroll();
        // reset to old to keep any additional routing logic from kicking in
        $location.hash(old);
    };
}

function PostSearchCtrl($scope, $http) {
    //populate the search:
    $scope.posts=[];
    $scope.matches=[];
    $scope.search="";

    $http
        .get('/site_full.json')
        .then(parsePosts);

    function parsePosts(result) {
        // reverse so that posts are in ascending order, oldest to newest.
        $scope.posts = result.data.reverse();
    }

    $scope.$watch("search", function(newValue, oldValue) {
        $scope.matches=[];
        if ($scope.search.length > 0) {
            //search post content
            for (i = $scope.posts.length -1; i > -1; i--) {
                if ($scope.posts[i].content.indexOf(newValue) > -1 ) {
                    $scope.newMatch=[];
                    $scope.newMatch.title=$scope.posts[i].title;
                    $scope.newMatch.postId=i;
                    $scope.matchIndex=$scope.posts[i].content.indexOf(newValue);
                    $scope.matchIndex=($scope.matchIndex - 50 < 0 ? 0 : $scope.matchIndex - 50);
                    $scope.newMatch.content=$scope.posts[i].content.substr($scope.matchIndex,100).replace(newValue,"___"+newValue+"___");
                    $scope.matches.push($scope.newMatch);
                }
            }
        }
    });
}


package com.example.githubcompose.utils

import com.example.githubcompose.data.models.SearchResponse
import com.example.githubcompose.data.models.UserDetailsResponse
import com.example.githubcompose.data.models.UserListResponse
import com.example.githubcompose.data.models.UserReposResponse

fun createUserListResponseUser(username: String): UserListResponse.User {
    return UserListResponse.User(
        avatarUrl = "https://example.com/avatar",
        eventsUrl = "https://example.com/events",
        followersUrl = "https://example.com/followers",
        followingUrl = "https://example.com/following",
        gistsUrl = "https://example.com/gists",
        gravatarId = "gravatarId",
        htmlUrl = "https://example.com/html",
        id = 1,
        login = username,
        nodeId = "nodeId",
        organizationsUrl = "https://example.com/organizations",
        receivedEventsUrl = "https://example.com/received_events",
        reposUrl = "https://example.com/repos",
        siteAdmin = false,
        starredUrl = "https://example.com/starred",
        subscriptionsUrl = "https://example.com/subscriptions",
        type = "User",
        url = "https://example.com/url"
    )
}

fun createSearchUserResponse(): SearchResponse.User {
    return SearchResponse.User(
        avatarUrl = "https://example.com/avatar",
        eventsUrl = "https://example.com/events",
        followersUrl = "https://example.com/followers",
        followingUrl = "https://example.com/following",
        gistsUrl = "https://example.com/gists",
        gravatarId = "",
        htmlUrl = "https://example.com/html",
        id = 1,
        login = "username",
        nodeId = "node1",
        organizationsUrl = "https://example.com/orgs",
        receivedEventsUrl = "https://example.com/received_events",
        reposUrl = "https://example.com/repos",
        siteAdmin = false,
        starredUrl = "https://example.com/starred",
        subscriptionsUrl = "https://example.com/subscriptions",
        type = "User",
        score = 0.0,
        url = "",
    )
}

fun createUserDetailsResponse(): UserDetailsResponse {
    return UserDetailsResponse(
        avatarUrl = "https://example.com/avatar",
        bio = null,
        blog = "https://example.com/blog",
        company = "Example Company",
        createdAt = "2022-01-01T00:00:00Z",
        email = "user@example.com",
        eventsUrl = "https://example.com/events",
        followers = 0,
        followersUrl = "https://example.com/followers",
        following = 0,
        followingUrl = "https://example.com/following",
        gistsUrl = "https://example.com/gists",
        gravatarId = "",
        hireable = null,
        htmlUrl = "https://example.com/html",
        id = 1,
        location = "Location",
        login = "username",
        name = "full Name",
        nodeId = "node1",
        organizationsUrl = "https://example.com/orgs",
        publicGists = 0,
        publicRepos = 0,
        receivedEventsUrl = "https://example.com/received_events",
        reposUrl = "https://example.com/repos",
        siteAdmin = false,
        starredUrl = "https://example.com/starred",
        subscriptionsUrl = "https://example.com/subscriptions",
        twitterUsername = "username",
        type = "User",
        updatedAt = "2022-01-01T00:00:00Z",
        url = "https://example.com/url"
    )
}

fun createUserReposResponse(): UserReposResponse.Repository {
    return UserReposResponse.Repository(
        allowForking = true,
        archiveUrl = "https://example.com/archive",
        archived = false,
        assigneesUrl = "https://example.com/assignees",
        blobsUrl = "https://example.com/blobs",
        branchesUrl = "https://example.com/branches",
        cloneUrl = "https://example.com/clone",
        collaboratorsUrl = "https://example.com/collaborators",
        commentsUrl = "https://example.com/comments",
        commitsUrl = "https://example.com/commits",
        compareUrl = "https://example.com/compare",
        contentsUrl = "https://example.com/contents",
        contributorsUrl = "https://example.com/contributors",
        createdAt = "2022-01-01T00:00:00Z",
        defaultBranch = "main",
        deploymentsUrl = "https://example.com/deployments",
        description = "Example description",
        disabled = false,
        downloadsUrl = "https://example.com/downloads",
        eventsUrl = "https://example.com/events",
        fork = false,
        forks = 0,
        forksCount = 0,
        forksUrl = "https://example.com/forks",
        fullName = "example/repo",
        gitCommitsUrl = "https://example.com/git_commits",
        gitRefsUrl = "https://example.com/git_refs",
        gitTagsUrl = "https://example.com/git_tags",
        gitUrl = "https://example.com/git",
        hasDiscussions = false,
        hasDownloads = true,
        hasIssues = true,
        hasPages = false,
        hasProjects = true,
        hasWiki = true,
        homepage = "https://example.com",
        hooksUrl = "https://example.com/hooks",
        htmlUrl = "https://example.com/html",
        id = 1,
        isTemplate = false,
        issueCommentUrl = "https://example.com/issue_comment",
        issueEventsUrl = "https://example.com/issue_events",
        issuesUrl = "https://example.com/issues",
        keysUrl = "https://example.com/keys",
        labelsUrl = "https://example.com/labels",
        language = "Kotlin",
        languagesUrl = "https://example.com/languages",
        license = UserReposResponse.Repository.License(
            key = "mit",
            name = "MIT License",
            nodeId = "node1",
            spdxId = "MIT",
            url = "https://example.com/license"
        ),
        mergesUrl = "https://example.com/merges",
        milestonesUrl = "https://example.com/milestones",
        mirrorUrl = null,
        name = "Example Repo",
        nodeId = "node1",
        notificationsUrl = "https://example.com/notifications",
        openIssues = 0,
        openIssuesCount = 0,
        owner = UserReposResponse.Repository.Owner(
            avatarUrl = "https://example.com/avatar",
            eventsUrl = "https://example.com/events",
            followersUrl = "https://example.com/followers",
            followingUrl = "https://example.com/following",
            gistsUrl = "https://example.com/gists",
            gravatarId = "",
            htmlUrl = "https://example.com/html",
            id = 1,
            login = "username",
            nodeId = "node1",
            organizationsUrl = "https://example.com/orgs",
            receivedEventsUrl = "https://example.com/received_events",
            reposUrl = "https://example.com/repos",
            siteAdmin = false,
            starredUrl = "https://example.com/starred",
            subscriptionsUrl = "https://example.com/subscriptions",
            type = "User",
            url = "https://example.com/url"
        ),
        `private` = false,
        pullsUrl = "https://example.com/pulls",
        pushedAt = "2022-01-01T00:00:00Z",
        releasesUrl = "https://example.com/releases",
        size = 0,
        sshUrl = "git@example.com:example/repo.git",
        stargazersCount = 0,
        stargazersUrl = "https://example.com/stargazers",
        statusesUrl = "https://example.com/statuses",
        subscribersUrl = "https://example.com/subscribers",
        subscriptionUrl = "https://example.com/subscription",
        svnUrl = "https://example.com/svn",
        tagsUrl = "https://example.com/tags",
        teamsUrl = "https://example.com/teams",
        topics = listOf("topic1", "topic2"),
        treesUrl = "https://example.com/trees",
        updatedAt = "2022-01-01T00:00:00Z",
        url = "https://example.com/url",
        visibility = "public",
        watchers = 0,
        watchersCount = 0,
        webCommitSignoffRequired = false
    )
}
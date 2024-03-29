package com.example.myapplication.di

import com.example.myapplication.data.GitHubRepository
import com.example.myapplication.data.remote.RetrofitManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Singleton
@Module
class RepositoryModule {
    @Singleton
    @Provides
    fun provideGitHubRepository(gitHubService: RetrofitManager.GitHubService): GitHubRepository {
        return GitHubRepository(gitHubService)
    }
}

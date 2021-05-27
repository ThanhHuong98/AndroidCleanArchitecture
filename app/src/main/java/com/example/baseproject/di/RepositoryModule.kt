package com.example.baseproject.di

import com.example.baseproject.data.repository.ABCRepositoryImpl
import com.example.baseproject.domain.repository.ABCRepository
import com.example.baseproject.presentation.character.CharactersFragment
import com.example.baseproject.presentation.detail.DetailFragment
import com.example.baseproject.presentation.home.MainActivity
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import javax.inject.Singleton

@Module
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun provideABCRepository(abcRepositoryImpl: ABCRepositoryImpl) : ABCRepository

    @ContributesAndroidInjector
    abstract fun contributesMainActivity() : MainActivity

    @ContributesAndroidInjector
    abstract fun contributesCharactersFragment() : CharactersFragment

    @ContributesAndroidInjector
    abstract fun contributesDetailFragment() : DetailFragment
}
package com.example.baseproject.di

import com.example.baseproject.data.repository.CharacterRepositoryImpl
import com.example.baseproject.domain.repository.CharacterRepository
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
    abstract fun provideABCRepository(characterRepositoryImpl: CharacterRepositoryImpl) : CharacterRepository

    @ContributesAndroidInjector
    abstract fun contributesMainActivity() : MainActivity

    @ContributesAndroidInjector
    abstract fun contributesCharactersFragment() : CharactersFragment

    @ContributesAndroidInjector
    abstract fun contributesDetailFragment() : DetailFragment
}
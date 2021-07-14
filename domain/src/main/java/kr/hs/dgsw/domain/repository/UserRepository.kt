package kr.hs.dgsw.domain.repository

import io.reactivex.rxjava3.core.Single
import kr.hs.dgsw.domain.entity.request.LoginRequest
import kr.hs.dgsw.domain.entity.request.SignUpRequest
import kr.hs.dgsw.domain.entity.response.Token
import kr.hs.dgsw.domain.entity.response.User

interface UserRepository {
    fun postSignUp(signUpRequest: SignUpRequest): Single<Token>

    fun postLogin(loginRequest: LoginRequest): Single<Token>

    fun postAutoLogin(): Single<Token>

    fun getUser(): Single<User>
}
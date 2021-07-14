package kr.hs.dgsw.data.network.service

import android.content.res.Resources
import io.reactivex.rxjava3.core.Single
import kr.hs.dgsw.data.entity.LectureData
import kr.hs.dgsw.data.util.Response
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface LectureService {
    @GET("/lecture")
    fun getAllClass(): Single<retrofit2.Response<Response<List<LectureData>>>>

    @GET("/lecture/{lectureId}")
    fun getLectureDetail(@Path("lectureId") lectureId: Int): Single<retrofit2.Response<Response<LectureData>>>

    @POST("/lecture/{lectureId}")
    fun postLecture(
        title: RequestBody,
        content: RequestBody,
        attachment: ArrayList<MultipartBody.Part>,
        field: RequestBody,
        start_date: Long,
        end_date: Long,
        proposal: Long
    ): Single<retrofit2.Response<Response<Any?>>>

    @POST("/lecture/proposal")
    fun postLectureProposal(@Query("lectureId") lectureId: Int): Single<retrofit2.Response<Response<Any?>>>
}
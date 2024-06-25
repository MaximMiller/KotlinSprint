package org.example.lesson_22

data class MainScreenState(
    var data: String? = null,
    var isLoading: Boolean = false,
)

class MainScreenViewModel {
    private var mainScreenState = MainScreenState()
    fun loadData() {
        //отсутствие данных
        println("Загруженные данные: \"${mainScreenState.data}\" Состояние загрузки: ${mainScreenState.isLoading}")
        //загрузка данных
        mainScreenState = mainScreenState.copy(isLoading = true)
        println("Загруженные данные: \"${mainScreenState.data}\" Состояние загрузки: ${mainScreenState.isLoading}")
        //наличие загруженных данных
        mainScreenState = mainScreenState.copy(data = "Данные", isLoading = false)
        println("Загруженные данные: \"${mainScreenState.data}\" Состояние загрузки: ${mainScreenState.isLoading}")
    }
}

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData()
}
/*
В разработке Android приложений часто используется паттерн MVVM (Model-View-ViewModel)
для разделения бизнес-логики и пользовательского интерфейса. ViewModel отвечает за управление состоянием
приложения и хранит данные, которые необходимы для отображения на экране.

Предположим, что у нас есть MainScreenViewModel первого экрана приложения, для инициализации которого
подгружаются данные с сервера. VM хранит единственное свойство mainScreenState.

ViewModel будет содержать внутренний data class MainScreenState для хранения стейта (состояния).
Состояние экрана включает два свойства: data (загружаемые данные - String) и isLoading
(индикатор процесса загрузки, обычно имеет значение по умолчанию false).

Создай data class для хранения состояния. При изменении состояния загрузки создается новый
объект стейта, копируя текущее состояние с изменением значения поля isLoading.

Сымитируй процесс загрузки данных с сервера в методе вью модели loadData(), в частности состояния:
- отсутствие данных;
- загрузка данных;
- наличие загруженных данных.
 */
package com.example.vkcourseapp

data class SimilarAppDto(
    val id: String,
    val name: String,
    val iconUrl: String,
    val description: String,
    val category: String
)

class SimilarAppsApi {

    suspend fun getSimilarApps(): List<SimilarAppDto> = listOf(
        SimilarAppDto(
            id = "fa2e31b8-1234-4cf7-9914-108a170a1b01",
            name = "QuickNote",
            iconUrl = "https://fastly.picsum.photos/id/237/200/200.jpg?hmac=zHUGikXUDyLCCmvyww1izLK3R3k8oRYBRiTizZEdyfI",
            description = "Быстрые заметки и идеи на каждый день.",
            category = "Продуктивность"
        ),
        SimilarAppDto(
            id = "82ea6f63-2b2a-43e1-b54c-ec62e6e27229",
            name = "Calmalist",
            iconUrl = "https://fastly.picsum.photos/id/238/200/200.jpg?hmac=O4Jc6lqHVfaKVzLf8bWssNTbWzQoaRUC0TDXod9xDdM",
            description = "Планируйте дела и сохраняйте спокойствие.",
            category = "Планирование"
        ),
        SimilarAppDto(
            id = "c6f64035-c432-4aad-a550-a1dac2d3b047",
            name = "FitRiver",
            iconUrl = "https://fastly.picsum.photos/id/239/200/200.jpg?hmac=8JqlXUpZ9Xy0H6tMK8sCPQAYU9vUn9Qa8Kg-U9h3sCY",
            description = "Тренировки и активный образ жизни.",
            category = "Здоровье"
        ),
        SimilarAppDto(
            id = "d22b7cda-2d36-4ebd-bfa3-be58770fa455",
            name = "TaskLoop",
            iconUrl = "https://fastly.picsum.photos/id/240/200/200.jpg?hmac=PZiJibMUuv5Zpv9MAcqLaCYJOPt-XNuDh3RPBZiGcoY",
            description = "Управляйте задачами и отслеживайте прогресс.",
            category = "Продуктивность"
        ),
        SimilarAppDto(
            id = "f830e414-42a9-4fe6-af16-555a85f6f6c2",
            name = "Pixtrix",
            iconUrl = "https://fastly.picsum.photos/id/241/200/200.jpg?hmac=F-mDYyK1xUiXjlLd5PvE8EQpTwGfFndV7mMaANDtl28",
            description = "Редактируйте фотографии и создавайте коллажи.",
            category = "Фотография"
        ),
        SimilarAppDto(
            id = "ba31ce5d-b214-46e9-bf7c-35e99e70af14",
            name = "TinyChef",
            iconUrl = "https://fastly.picsum.photos/id/242/200/200.jpg?hmac=Z3aa8zbEQkEMFgnVh0Pn96vmCZHhJ17qzCrePYksrcY",
            description = "Рецепты и идеи для домашних блюд.",
            category = "Кулинария"
        ),
        SimilarAppDto(
            id = "204a939c-39fb-4c9d-bed9-daeeba8a465e",
            name = "GymMate",
            iconUrl = "https://fastly.picsum.photos/id/243/200/200.jpg?hmac=fW5ZwzzyTBy2t2MROp988oq12mZnKwN0coFLhZEE87s",
            description = "План тренировок и спортивные достижения.",
            category = "Фитнес"
        ),
        SimilarAppDto(
            id = "1ec98719-1d86-4cdc-b99d-11c6c23d981e",
            name = "FlowCard",
            iconUrl = "https://fastly.picsum.photos/id/244/200/200.jpg?hmac=Q1gdvE6ZPZUX3nXkxvmzuc12eKVZ9XVEmSH3nCJ2OOo",
            description = "Организуйте информацию с помощью карточек.",
            category = "Организация"
        ),
        SimilarAppDto(
            id = "d8180b87-56de-4737-b5ca-953d8c15ec80",
            name = "DreamSafe",
            iconUrl = "https://fastly.picsum.photos/id/2/200/200.jpg?hmac=isSWZUpv7D1D156XcADPOCZlfCG9mmvb8OlXFdvLdK0",
            description = "Инструменты для расслабления и отдыха.",
            category = "Образ жизни"
        ),
        SimilarAppDto(
            id = "572a8cc3-662e-47b8-9f69-b8f5454415c4",
            name = "MoodPin",
            iconUrl = "https://fastly.picsum.photos/id/3/200/200.jpg?hmac=N5yYUNYl5gOUcaMmTtnNNtx839TN2qaNM4SaXhQl65U",
            description = "Отслеживайте настроение и эмоции.",
            category = "Саморазвитие"
        ),
        SimilarAppDto(
            id = "152b90b4-4632-4acd-b8fd-7ae71bee95e7",
            name = "Shoply",
            iconUrl = "https://fastly.picsum.photos/id/247/200/200.jpg?hmac=oKt3N5MCdI8hCrzIbokjpVNzUuywbK64CJn1bfRAxbA",
            description = "Покупки, списки желаний и выгодные находки.",
            category = "Покупки"
        ),
        SimilarAppDto(
            id = "86e9355c-1ff0-4920-8cba-7bb2ea177625",
            name = "FeedJoy",
            iconUrl = "https://fastly.picsum.photos/id/248/200/200.jpg?hmac=36BllTJxy_tU762d2RYKfYaSQ3-RmP74hVxabGP_u3o",
            description = "Читайте интересные материалы в одной ленте.",
            category = "Новости"
        ),
        SimilarAppDto(
            id = "e571be45-3b91-4193-8fcd-ae7237ca3e97",
            name = "Scanwise",
            iconUrl = "https://fastly.picsum.photos/id/249/200/200.jpg?hmac=75zqoHvrxGGVnJnS8h0gUzZ3zniIk6PggG38GjmyOto",
            description = "Сканируйте документы прямо на телефоне.",
            category = "Инструменты"
        ),
        SimilarAppDto(
            id = "2b8e56f6-47e5-4a7c-94dc-5c282faf976d",
            name = "MemoSpark",
            iconUrl = "https://fastly.picsum.photos/id/250/200/200.jpg?hmac=23TaEG1txY5qYZ70amm2sUf0GYKo4v7yIbN9ooyqWzs",
            description = "Сохраняйте важные мысли и напоминания.",
            category = "Заметки"
        ),
        SimilarAppDto(
            id = "e9b2387e-79c2-4bdb-b6fc-5cb34421bc99",
            name = "ZenRadio",
            iconUrl = "https://fastly.picsum.photos/id/251/200/200.jpg?hmac=_yKttpPQLBisFkKPMRolKUyfZ89QQpENncPdrg8a1J0",
            description = "Музыка и звуки для отдыха и концентрации.",
            category = "Музыка"
        )
    )
}
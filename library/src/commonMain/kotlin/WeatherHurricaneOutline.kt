package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WeatherHurricaneOutline: ImageVector
    get() {
        if (_WeatherHurricaneOutline != null) {
            return _WeatherHurricaneOutline!!
        }
        _WeatherHurricaneOutline = ImageVector.Builder(
            name = "WeatherHurricaneOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 14f)
                curveTo(13.11f, 14f, 14f, 13.11f, 14f, 12f)
                curveTo(14f, 10.9f, 13.11f, 10f, 12f, 10f)
                curveTo(10.9f, 10f, 10f, 10.9f, 10f, 12f)
                curveTo(10f, 13.11f, 10.9f, 14f, 12f, 14f)
                moveTo(18f, 2f)
                curveTo(17.1f, 2.68f, 16.26f, 3.45f, 15.5f, 4.29f)
                curveTo(15.21f, 4.61f, 14.93f, 4.95f, 14.66f, 5.29f)
                curveTo(14.62f, 5.34f, 14.59f, 5.39f, 14.56f, 5.45f)
                curveTo(14.31f, 5.94f, 14.5f, 6.54f, 15f, 6.79f)
                curveTo(16.86f, 7.86f, 18f, 9.85f, 18f, 12f)
                curveTo(18f, 18.41f, 13.08f, 20.71f, 9.54f, 21.54f)
                curveTo(7.55f, 22f, 6f, 22f, 6f, 22f)
                curveTo(6.9f, 21.32f, 7.74f, 20.55f, 8.5f, 19.71f)
                curveTo(8.79f, 19.39f, 9.07f, 19.05f, 9.34f, 18.71f)
                curveTo(9.38f, 18.66f, 9.41f, 18.61f, 9.44f, 18.55f)
                curveTo(9.69f, 18.06f, 9.5f, 17.46f, 9f, 17.21f)
                curveTo(7.14f, 16.14f, 6f, 14.15f, 6f, 12f)
                curveTo(6f, 5.59f, 10.93f, 3.29f, 14.47f, 2.46f)
                curveTo(16.45f, 2f, 18f, 2f, 18f, 2f)
                moveTo(9.44f, 7.47f)
                curveTo(8.61f, 8.5f, 8f, 9.93f, 8f, 12f)
                curveTo(8f, 13.43f, 8.75f, 14.74f, 9.96f, 15.46f)
                curveTo(11.2f, 16.12f, 11.78f, 17.5f, 11.47f, 18.8f)
                curveTo(12.67f, 18.27f, 13.76f, 17.54f, 14.56f, 16.53f)
                curveTo(15.39f, 15.5f, 16f, 14.07f, 16f, 12f)
                curveTo(16f, 10.57f, 15.25f, 9.26f, 14.04f, 8.54f)
                curveTo(12.8f, 7.88f, 12.22f, 6.5f, 12.54f, 5.2f)
                curveTo(11.33f, 5.73f, 10.24f, 6.47f, 9.44f, 7.47f)
                close()
            }
        }.build()

        return _WeatherHurricaneOutline!!
    }

@Suppress("ObjectPropertyName")
private var _WeatherHurricaneOutline: ImageVector? = null

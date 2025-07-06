package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WeatherHurricane: ImageVector
    get() {
        if (_WeatherHurricane != null) {
            return _WeatherHurricane!!
        }
        _WeatherHurricane = ImageVector.Builder(
            name = "WeatherHurricane",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 6.79f)
                curveTo(16.86f, 7.86f, 18f, 9.85f, 18f, 12f)
                curveTo(18f, 22f, 6f, 22f, 6f, 22f)
                curveTo(7.25f, 21.06f, 8.38f, 19.95f, 9.34f, 18.71f)
                curveTo(9.38f, 18.66f, 9.41f, 18.61f, 9.44f, 18.55f)
                curveTo(9.69f, 18.06f, 9.5f, 17.46f, 9f, 17.21f)
                curveTo(7.14f, 16.14f, 6f, 14.15f, 6f, 12f)
                curveTo(6f, 2f, 18f, 2f, 18f, 2f)
                curveTo(16.75f, 2.94f, 15.62f, 4.05f, 14.66f, 5.29f)
                curveTo(14.62f, 5.34f, 14.59f, 5.39f, 14.56f, 5.45f)
                curveTo(14.31f, 5.94f, 14.5f, 6.54f, 15f, 6.79f)
                moveTo(12f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14f)
                close()
            }
        }.build()

        return _WeatherHurricane!!
    }

@Suppress("ObjectPropertyName")
private var _WeatherHurricane: ImageVector? = null

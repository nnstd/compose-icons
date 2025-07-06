package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WeatherPartlyCloudy: ImageVector
    get() {
        if (_WeatherPartlyCloudy != null) {
            return _WeatherPartlyCloudy!!
        }
        _WeatherPartlyCloudy = ImageVector.Builder(
            name = "WeatherPartlyCloudy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.74f, 5.47f)
                curveTo(15.1f, 6.5f, 16.35f, 9.03f, 15.92f, 11.46f)
                curveTo(17.19f, 12.56f, 18f, 14.19f, 18f, 16f)
                verticalLineTo(16.17f)
                curveTo(18.31f, 16.06f, 18.65f, 16f, 19f, 16f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 19f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 22f)
                horizontalLineTo(6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 14f)
                horizontalLineTo(6.27f)
                curveTo(5f, 12.45f, 4.6f, 10.24f, 5.5f, 8.26f)
                curveTo(6.72f, 5.5f, 9.97f, 4.24f, 12.74f, 5.47f)
                moveTo(11.93f, 7.3f)
                curveTo(10.16f, 6.5f, 8.09f, 7.31f, 7.31f, 9.07f)
                curveTo(6.85f, 10.09f, 6.93f, 11.22f, 7.41f, 12.13f)
                curveTo(8.5f, 10.83f, 10.16f, 10f, 12f, 10f)
                curveTo(12.7f, 10f, 13.38f, 10.12f, 14f, 10.34f)
                curveTo(13.94f, 9.06f, 13.18f, 7.86f, 11.93f, 7.3f)
                moveTo(13.55f, 3.64f)
                curveTo(13f, 3.4f, 12.45f, 3.23f, 11.88f, 3.12f)
                lineTo(14.37f, 1.82f)
                lineTo(15.27f, 4.71f)
                curveTo(14.76f, 4.29f, 14.19f, 3.93f, 13.55f, 3.64f)
                moveTo(6.09f, 4.44f)
                curveTo(5.6f, 4.79f, 5.17f, 5.19f, 4.8f, 5.63f)
                lineTo(4.91f, 2.82f)
                lineTo(7.87f, 3.5f)
                curveTo(7.25f, 3.71f, 6.65f, 4.03f, 6.09f, 4.44f)
                moveTo(18f, 9.71f)
                curveTo(17.91f, 9.12f, 17.78f, 8.55f, 17.59f, 8f)
                lineTo(19.97f, 9.5f)
                lineTo(17.92f, 11.73f)
                curveTo(18.03f, 11.08f, 18.05f, 10.4f, 18f, 9.71f)
                moveTo(3.04f, 11.3f)
                curveTo(3.11f, 11.9f, 3.24f, 12.47f, 3.43f, 13f)
                lineTo(1.06f, 11.5f)
                lineTo(3.1f, 9.28f)
                curveTo(3f, 9.93f, 2.97f, 10.61f, 3.04f, 11.3f)
                moveTo(19f, 18f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 16f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 20f)
                horizontalLineTo(19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 18f)
                close()
            }
        }.build()

        return _WeatherPartlyCloudy!!
    }

@Suppress("ObjectPropertyName")
private var _WeatherPartlyCloudy: ImageVector? = null

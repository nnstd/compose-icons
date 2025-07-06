package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WeatherPartlyLightning: ImageVector
    get() {
        if (_WeatherPartlyLightning != null) {
            return _WeatherPartlyLightning!!
        }
        _WeatherPartlyLightning = ImageVector.Builder(
            name = "WeatherPartlyLightning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 15f)
                curveTo(18.65f, 15f, 18.31f, 15.06f, 18f, 15.17f)
                verticalLineTo(15f)
                curveTo(18f, 13.19f, 17.19f, 11.56f, 15.92f, 10.46f)
                curveTo(16.35f, 8.03f, 15.1f, 5.5f, 12.75f, 4.47f)
                curveTo(9.97f, 3.24f, 6.72f, 4.5f, 5.5f, 7.25f)
                curveTo(4.6f, 9.24f, 5f, 11.45f, 6.27f, 13f)
                horizontalLineTo(6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 17f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 21f)
                horizontalLineTo(7f)
                curveTo(7f, 21f, 8f, 21f, 8f, 20f)
                curveTo(8f, 19f, 7f, 19f, 7f, 19f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 15f)
                horizontalLineTo(8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 11f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 19f)
                horizontalLineTo(17f)
                curveTo(17f, 19f, 16f, 19f, 16f, 20f)
                curveTo(16f, 21f, 17f, 21f, 17f, 21f)
                horizontalLineTo(19f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 15f)
                moveTo(12f, 9f)
                curveTo(10.16f, 9f, 8.5f, 9.83f, 7.41f, 11.13f)
                curveTo(6.93f, 10.22f, 6.85f, 9.09f, 7.31f, 8.07f)
                curveTo(8.09f, 6.31f, 10.16f, 5.5f, 11.93f, 6.3f)
                curveTo(13.18f, 6.86f, 13.94f, 8.06f, 14f, 9.34f)
                curveTo(13.38f, 9.12f, 12.7f, 9f, 12f, 9f)
                moveTo(13.55f, 2.63f)
                curveTo(13f, 2.4f, 12.45f, 2.23f, 11.88f, 2.12f)
                lineTo(14.37f, 0.82f)
                lineTo(15.27f, 3.71f)
                curveTo(14.76f, 3.29f, 14.19f, 2.93f, 13.55f, 2.63f)
                moveTo(6.09f, 3.44f)
                curveTo(5.6f, 3.79f, 5.17f, 4.19f, 4.8f, 4.63f)
                lineTo(4.91f, 1.82f)
                lineTo(7.87f, 2.5f)
                curveTo(7.25f, 2.71f, 6.65f, 3.03f, 6.09f, 3.44f)
                moveTo(18f, 8.71f)
                curveTo(17.91f, 8.12f, 17.78f, 7.55f, 17.59f, 7f)
                lineTo(19.97f, 8.5f)
                lineTo(17.92f, 10.73f)
                curveTo(18.03f, 10.08f, 18.05f, 9.4f, 18f, 8.71f)
                moveTo(3.04f, 10.3f)
                curveTo(3.11f, 10.9f, 3.25f, 11.47f, 3.43f, 12f)
                lineTo(1.06f, 10.5f)
                lineTo(3.1f, 8.28f)
                curveTo(3f, 8.93f, 2.97f, 9.61f, 3.04f, 10.3f)
                moveTo(11.8f, 15f)
                horizontalLineTo(14.25f)
                lineTo(12.61f, 18.27f)
                horizontalLineTo(14.25f)
                lineTo(11.18f, 24f)
                lineTo(11.8f, 19.91f)
                horizontalLineTo(9.75f)
            }
        }.build()

        return _WeatherPartlyLightning!!
    }

@Suppress("ObjectPropertyName")
private var _WeatherPartlyLightning: ImageVector? = null

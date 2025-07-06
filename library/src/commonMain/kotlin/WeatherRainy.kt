package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WeatherRainy: ImageVector
    get() {
        if (_WeatherRainy != null) {
            return _WeatherRainy!!
        }
        _WeatherRainy = ImageVector.Builder(
            name = "WeatherRainy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 14.03f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 15.03f)
                curveTo(7f, 15.58f, 6.55f, 16.03f, 6f, 16.03f)
                curveTo(3.24f, 16.03f, 1f, 13.79f, 1f, 11.03f)
                curveTo(1f, 8.27f, 3.24f, 6.03f, 6f, 6.03f)
                curveTo(7f, 3.68f, 9.3f, 2.03f, 12f, 2.03f)
                curveTo(15.43f, 2.03f, 18.24f, 4.69f, 18.5f, 8.06f)
                lineTo(19f, 8.03f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 12.03f)
                curveTo(23f, 14.23f, 21.21f, 16.03f, 19f, 16.03f)
                horizontalLineTo(18f)
                curveTo(17.45f, 16.03f, 17f, 15.58f, 17f, 15.03f)
                curveTo(17f, 14.47f, 17.45f, 14.03f, 18f, 14.03f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 12.03f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 10.03f)
                horizontalLineTo(17f)
                verticalLineTo(9.03f)
                curveTo(17f, 6.27f, 14.76f, 4.03f, 12f, 4.03f)
                curveTo(9.5f, 4.03f, 7.45f, 5.84f, 7.06f, 8.21f)
                curveTo(6.73f, 8.09f, 6.37f, 8.03f, 6f, 8.03f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 11.03f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 14.03f)
                moveTo(12f, 14.15f)
                curveTo(12.18f, 14.39f, 12.37f, 14.66f, 12.56f, 14.94f)
                curveTo(13f, 15.56f, 14f, 17.03f, 14f, 18f)
                curveTo(14f, 19.11f, 13.1f, 20f, 12f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 18f)
                curveTo(10f, 17.03f, 11f, 15.56f, 11.44f, 14.94f)
                curveTo(11.63f, 14.66f, 11.82f, 14.4f, 12f, 14.15f)
                moveTo(12f, 11.03f)
                lineTo(11.5f, 11.59f)
                curveTo(11.5f, 11.59f, 10.65f, 12.55f, 9.79f, 13.81f)
                curveTo(8.93f, 15.06f, 8f, 16.56f, 8f, 18f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 18f)
                curveTo(16f, 16.56f, 15.07f, 15.06f, 14.21f, 13.81f)
                curveTo(13.35f, 12.55f, 12.5f, 11.59f, 12.5f, 11.59f)
            }
        }.build()

        return _WeatherRainy!!
    }

@Suppress("ObjectPropertyName")
private var _WeatherRainy: ImageVector? = null

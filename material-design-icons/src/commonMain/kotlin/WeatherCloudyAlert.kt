package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WeatherCloudyAlert: ImageVector
    get() {
        if (_WeatherCloudyAlert != null) {
            return _WeatherCloudyAlert!!
        }
        _WeatherCloudyAlert = ImageVector.Builder(
            name = "WeatherCloudyAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 19f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 14f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 9f)
                curveTo(7f, 6.65f, 9.3f, 5f, 12f, 5f)
                curveTo(15.43f, 5f, 18.24f, 7.66f, 18.5f, 11.03f)
                lineTo(19f, 11f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 15f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 19f)
                horizontalLineTo(6f)
                moveTo(19f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7f)
                curveTo(9.5f, 7f, 7.45f, 8.82f, 7.06f, 11.19f)
                curveTo(6.73f, 11.07f, 6.37f, 11f, 6f, 11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 14f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 17f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 13f)
                moveTo(13f, 12f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                moveTo(13f, 16f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
            }
        }.build()

        return _WeatherCloudyAlert!!
    }

@Suppress("ObjectPropertyName")
private var _WeatherCloudyAlert: ImageVector? = null

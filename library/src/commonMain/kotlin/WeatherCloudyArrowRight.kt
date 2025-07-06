package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WeatherCloudyArrowRight: ImageVector
    get() {
        if (_WeatherCloudyArrowRight != null) {
            return _WeatherCloudyArrowRight!!
        }
        _WeatherCloudyArrowRight = ImageVector.Builder(
            name = "WeatherCloudyArrowRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 7f)
                lineTo(6.69f, 7.06f)
                curveTo(7.32f, 4.72f, 9.46f, 3f, 12f, 3f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 8.5f)
                lineTo(17.42f, 9.45f)
                curveTo(17.88f, 9.16f, 18.42f, 9f, 19f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 15f)
                horizontalLineTo(6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 11f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 7f)
                moveTo(6f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 13f)
                horizontalLineTo(19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 11f)
                horizontalLineTo(15.5f)
                verticalLineTo(8.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 8.5f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                moveTo(22f, 19f)
                lineTo(19f, 22f)
                verticalLineTo(20f)
                horizontalLineTo(2f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                lineTo(22f, 19f)
            }
        }.build()

        return _WeatherCloudyArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _WeatherCloudyArrowRight: ImageVector? = null

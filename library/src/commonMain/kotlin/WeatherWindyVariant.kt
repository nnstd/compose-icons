package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WeatherWindyVariant: ImageVector
    get() {
        if (_WeatherWindyVariant != null) {
            return _WeatherWindyVariant!!
        }
        _WeatherWindyVariant = ImageVector.Builder(
            name = "WeatherWindyVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 6f)
                lineTo(6.69f, 6.06f)
                curveTo(7.32f, 3.72f, 9.46f, 2f, 12f, 2f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 7.5f)
                lineTo(17.42f, 8.45f)
                curveTo(17.88f, 8.16f, 18.42f, 8f, 19f, 8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 14f)
                horizontalLineTo(6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 10f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 6f)
                moveTo(6f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 12f)
                horizontalLineTo(19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 10f)
                horizontalLineTo(15.5f)
                verticalLineTo(7.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 7.5f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                moveTo(18f, 18f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 16f)
                horizontalLineTo(18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 19f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 22f)
                curveTo(17.17f, 22f, 16.42f, 21.66f, 15.88f, 21.12f)
                curveTo(15.5f, 20.73f, 15.5f, 20.1f, 15.88f, 19.71f)
                curveTo(16.27f, 19.32f, 16.9f, 19.32f, 17.29f, 19.71f)
                curveTo(17.47f, 19.89f, 17.72f, 20f, 18f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 18f)
                close()
            }
        }.build()

        return _WeatherWindyVariant!!
    }

@Suppress("ObjectPropertyName")
private var _WeatherWindyVariant: ImageVector? = null

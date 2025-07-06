package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarSearch: ImageVector
    get() {
        if (_CarSearch != null) {
            return _CarSearch!!
        }
        _CarSearch = ImageVector.Builder(
            name = "CarSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.61f, 16.11f)
                curveTo(9.61f, 14.03f, 10.59f, 12.19f, 12.1f, 11f)
                horizontalLineTo(5f)
                lineTo(6.5f, 6.5f)
                horizontalLineTo(17.5f)
                lineTo(18.72f, 10.16f)
                curveTo(19.56f, 10.53f, 20.3f, 11.07f, 20.91f, 11.74f)
                lineTo(18.92f, 6f)
                curveTo(18.72f, 5.42f, 18.16f, 5f, 17.5f, 5f)
                horizontalLineTo(6.5f)
                curveTo(5.84f, 5f, 5.28f, 5.42f, 5.08f, 6f)
                lineTo(3f, 12f)
                verticalLineTo(20f)
                curveTo(3f, 20.55f, 3.45f, 21f, 4f, 21f)
                horizontalLineTo(5f)
                curveTo(5.55f, 21f, 6f, 20.55f, 6f, 20f)
                verticalLineTo(19f)
                horizontalLineTo(10.29f)
                curveTo(9.86f, 18.13f, 9.61f, 17.15f, 9.61f, 16.11f)
                moveTo(6.5f, 16f)
                curveTo(5.67f, 16f, 5f, 15.33f, 5f, 14.5f)
                reflectiveCurveTo(5.67f, 13f, 6.5f, 13f)
                reflectiveCurveTo(8f, 13.67f, 8f, 14.5f)
                reflectiveCurveTo(7.33f, 16f, 6.5f, 16f)
                moveTo(20.71f, 20.7f)
                lineTo(20.7f, 20.71f)
                lineTo(20.71f, 20.7f)
                moveTo(16.11f, 11.61f)
                curveTo(18.61f, 11.61f, 20.61f, 13.61f, 20.61f, 16.11f)
                curveTo(20.61f, 17f, 20.36f, 17.82f, 19.92f, 18.5f)
                lineTo(23f, 21.61f)
                lineTo(21.61f, 23f)
                lineTo(18.5f, 19.93f)
                curveTo(17.8f, 20.36f, 17f, 20.61f, 16.11f, 20.61f)
                curveTo(13.61f, 20.61f, 11.61f, 18.61f, 11.61f, 16.11f)
                reflectiveCurveTo(13.61f, 11.61f, 16.11f, 11.61f)
                moveTo(16.11f, 13.61f)
                curveTo(14.73f, 13.61f, 13.61f, 14.73f, 13.61f, 16.11f)
                reflectiveCurveTo(14.73f, 18.61f, 16.11f, 18.61f)
                reflectiveCurveTo(18.61f, 17.5f, 18.61f, 16.11f)
                reflectiveCurveTo(17.5f, 13.61f, 16.11f, 13.61f)
            }
        }.build()

        return _CarSearch!!
    }

@Suppress("ObjectPropertyName")
private var _CarSearch: ImageVector? = null

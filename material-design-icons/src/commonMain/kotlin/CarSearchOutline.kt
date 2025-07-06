package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarSearchOutline: ImageVector
    get() {
        if (_CarSearchOutline != null) {
            return _CarSearchOutline!!
        }
        _CarSearchOutline = ImageVector.Builder(
            name = "CarSearchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.29f, 19f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                curveTo(6f, 20.5f, 5.6f, 21f, 5f, 21f)
                horizontalLineTo(4f)
                curveTo(3.5f, 21f, 3f, 20.5f, 3f, 20f)
                verticalLineTo(12f)
                lineTo(5.1f, 6f)
                curveTo(5.3f, 5.4f, 5.8f, 5f, 6.5f, 5f)
                horizontalLineTo(17.5f)
                curveTo(18.1f, 5f, 18.7f, 5.4f, 18.9f, 6f)
                lineTo(20.91f, 11.74f)
                curveTo(20.17f, 10.93f, 19.24f, 10.31f, 18.18f, 9.95f)
                lineTo(17.1f, 7f)
                horizontalLineTo(6.8f)
                lineTo(5.8f, 10f)
                horizontalLineTo(13.91f)
                curveTo(12.79f, 10.4f, 11.81f, 11.1f, 11.08f, 12f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                horizontalLineTo(9.68f)
                curveTo(9.78f, 17.71f, 10f, 18.38f, 10.29f, 19f)
                moveTo(6f, 14.5f)
                curveTo(6f, 15.3f, 6.7f, 16f, 7.5f, 16f)
                reflectiveCurveTo(9f, 15.3f, 9f, 14.5f)
                reflectiveCurveTo(8.3f, 13f, 7.5f, 13f)
                reflectiveCurveTo(6f, 13.7f, 6f, 14.5f)
                moveTo(16.11f, 11.61f)
                curveTo(13.61f, 11.61f, 11.61f, 13.61f, 11.61f, 16.11f)
                reflectiveCurveTo(13.61f, 20.61f, 16.11f, 20.61f)
                curveTo(17f, 20.61f, 17.8f, 20.36f, 18.5f, 19.93f)
                lineTo(21.61f, 23f)
                lineTo(23f, 21.61f)
                lineTo(19.92f, 18.5f)
                curveTo(20.36f, 17.82f, 20.61f, 17f, 20.61f, 16.11f)
                curveTo(20.61f, 13.61f, 18.61f, 11.61f, 16.11f, 11.61f)
                moveTo(16.11f, 13.61f)
                curveTo(17.5f, 13.61f, 18.61f, 14.73f, 18.61f, 16.11f)
                reflectiveCurveTo(17.5f, 18.61f, 16.11f, 18.61f)
                reflectiveCurveTo(13.61f, 17.5f, 13.61f, 16.11f)
                reflectiveCurveTo(14.73f, 13.61f, 16.11f, 13.61f)
            }
        }.build()

        return _CarSearchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CarSearchOutline: ImageVector? = null

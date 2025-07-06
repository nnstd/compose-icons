package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Devices: ImageVector
    get() {
        if (_Devices != null) {
            return _Devices!!
        }
        _Devices = ImageVector.Builder(
            name = "Devices",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 6f)
                horizontalLineTo(21f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                curveTo(1.9f, 4f, 1f, 4.9f, 1f, 6f)
                verticalLineTo(18f)
                curveTo(1f, 19.1f, 1.9f, 20f, 3f, 20f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                moveTo(13f, 12f)
                horizontalLineTo(9f)
                verticalLineTo(13.78f)
                curveTo(8.39f, 14.33f, 8f, 15.11f, 8f, 16f)
                curveTo(8f, 16.89f, 8.39f, 17.67f, 9f, 18.22f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                verticalLineTo(18.22f)
                curveTo(13.61f, 17.67f, 14f, 16.88f, 14f, 16f)
                reflectiveCurveTo(13.61f, 14.33f, 13f, 13.78f)
                verticalLineTo(12f)
                moveTo(11f, 17.5f)
                curveTo(10.17f, 17.5f, 9.5f, 16.83f, 9.5f, 16f)
                reflectiveCurveTo(10.17f, 14.5f, 11f, 14.5f)
                reflectiveCurveTo(12.5f, 15.17f, 12.5f, 16f)
                reflectiveCurveTo(11.83f, 17.5f, 11f, 17.5f)
                moveTo(22f, 8f)
                horizontalLineTo(16f)
                curveTo(15.5f, 8f, 15f, 8.5f, 15f, 9f)
                verticalLineTo(19f)
                curveTo(15f, 19.5f, 15.5f, 20f, 16f, 20f)
                horizontalLineTo(22f)
                curveTo(22.5f, 20f, 23f, 19.5f, 23f, 19f)
                verticalLineTo(9f)
                curveTo(23f, 8.5f, 22.5f, 8f, 22f, 8f)
                moveTo(21f, 18f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                horizontalLineTo(21f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _Devices!!
    }

@Suppress("ObjectPropertyName")
private var _Devices: ImageVector? = null

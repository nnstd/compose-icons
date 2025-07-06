package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Synagogue: ImageVector
    get() {
        if (_Synagogue != null) {
            return _Synagogue!!
        }
        _Synagogue = ImageVector.Builder(
            name = "Synagogue",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 8f)
                verticalLineTo(21f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                curveTo(10f, 14.9f, 10.9f, 14f, 12f, 14f)
                reflectiveCurveTo(14f, 14.9f, 14f, 16f)
                verticalLineTo(21f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                lineTo(12f, 3f)
                lineTo(6f, 8f)
                moveTo(13.5f, 10f)
                curveTo(13.5f, 10.8f, 12.8f, 11.5f, 12f, 11.5f)
                reflectiveCurveTo(10.5f, 10.8f, 10.5f, 10f)
                reflectiveCurveTo(11.2f, 8.5f, 12f, 8.5f)
                reflectiveCurveTo(13.5f, 9.2f, 13.5f, 10f)
                moveTo(3f, 5f)
                curveTo(1.9f, 5f, 1f, 5.9f, 1f, 7f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                curveTo(5f, 5.9f, 4.1f, 5f, 3f, 5f)
                moveTo(1f, 9f)
                horizontalLineTo(5f)
                verticalLineTo(21f)
                horizontalLineTo(1f)
                verticalLineTo(9f)
                moveTo(21f, 5f)
                curveTo(19.9f, 5f, 19f, 5.9f, 19f, 7f)
                verticalLineTo(8f)
                horizontalLineTo(23f)
                verticalLineTo(7f)
                curveTo(23f, 5.9f, 22.1f, 5f, 21f, 5f)
                moveTo(19f, 9f)
                horizontalLineTo(23f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _Synagogue!!
    }

@Suppress("ObjectPropertyName")
private var _Synagogue: ImageVector? = null

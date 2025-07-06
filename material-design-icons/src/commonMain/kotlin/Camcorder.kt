package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Camcorder: ImageVector
    get() {
        if (_Camcorder != null) {
            return _Camcorder!!
        }
        _Camcorder = ImageVector.Builder(
            name = "Camcorder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 2f)
                curveTo(4.24f, 2f, 2f, 4.24f, 2f, 7f)
                verticalLineTo(20f)
                curveTo(2f, 21.1f, 2.9f, 22f, 4f, 22f)
                horizontalLineTo(10f)
                curveTo(11.1f, 22f, 12f, 21.1f, 12f, 20f)
                verticalLineTo(7f)
                curveTo(12f, 4.24f, 9.76f, 2f, 7f, 2f)
                moveTo(5f, 20f)
                curveTo(4.45f, 20f, 4f, 19.55f, 4f, 19f)
                reflectiveCurveTo(4.45f, 18f, 5f, 18f)
                reflectiveCurveTo(6f, 18.45f, 6f, 19f)
                reflectiveCurveTo(5.55f, 20f, 5f, 20f)
                moveTo(7f, 10f)
                curveTo(5.34f, 10f, 4f, 8.66f, 4f, 7f)
                reflectiveCurveTo(5.34f, 4f, 7f, 4f)
                reflectiveCurveTo(10f, 5.34f, 10f, 7f)
                reflectiveCurveTo(8.66f, 10f, 7f, 10f)
                moveTo(22f, 9f)
                verticalLineTo(14f)
                curveTo(22f, 15.1f, 21.1f, 16f, 20f, 16f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                curveTo(21.1f, 7f, 22f, 7.9f, 22f, 9f)
                close()
            }
        }.build()

        return _Camcorder!!
    }

@Suppress("ObjectPropertyName")
private var _Camcorder: ImageVector? = null

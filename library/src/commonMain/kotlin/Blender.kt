package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Blender: ImageVector
    get() {
        if (_Blender != null) {
            return _Blender!!
        }
        _Blender = ImageVector.Builder(
            name = "Blender",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.13f, 15.13f)
                lineTo(18f, 3f)
                horizontalLineTo(14f)
                verticalLineTo(2f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(9f)
                curveTo(3f, 10.1f, 3.9f, 11f, 5f, 11f)
                horizontalLineTo(7.23f)
                lineTo(7.87f, 15.13f)
                curveTo(6.74f, 16.05f, 6f, 17.43f, 6f, 19f)
                verticalLineTo(20f)
                curveTo(6f, 21.1f, 6.9f, 22f, 8f, 22f)
                horizontalLineTo(16f)
                curveTo(17.1f, 22f, 18f, 21.1f, 18f, 20f)
                verticalLineTo(19f)
                curveTo(18f, 17.43f, 17.26f, 16.05f, 16.13f, 15.13f)
                moveTo(5f, 9f)
                verticalLineTo(5f)
                horizontalLineTo(6.31f)
                lineTo(6.93f, 9f)
                horizontalLineTo(5f)
                moveTo(12f, 19f)
                curveTo(11.45f, 19f, 11f, 18.55f, 11f, 18f)
                reflectiveCurveTo(11.45f, 17f, 12f, 17f)
                reflectiveCurveTo(13f, 17.45f, 13f, 18f)
                reflectiveCurveTo(12.55f, 19f, 12f, 19f)
                moveTo(14.29f, 14f)
                horizontalLineTo(9.72f)
                lineTo(8.33f, 5f)
                horizontalLineTo(15.67f)
                lineTo(14.29f, 14f)
                close()
            }
        }.build()

        return _Blender!!
    }

@Suppress("ObjectPropertyName")
private var _Blender: ImageVector? = null

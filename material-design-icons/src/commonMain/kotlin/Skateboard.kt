package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Skateboard: ImageVector
    get() {
        if (_Skateboard != null) {
            return _Skateboard!!
        }
        _Skateboard = ImageVector.Builder(
            name = "Skateboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 14.5f)
                curveTo(9f, 15.33f, 8.33f, 16f, 7.5f, 16f)
                reflectiveCurveTo(6f, 15.33f, 6f, 14.5f)
                reflectiveCurveTo(6.67f, 13f, 7.5f, 13f)
                reflectiveCurveTo(9f, 13.67f, 9f, 14.5f)
                moveTo(16.5f, 13f)
                curveTo(15.67f, 13f, 15f, 13.67f, 15f, 14.5f)
                reflectiveCurveTo(15.67f, 16f, 16.5f, 16f)
                curveTo(17.33f, 16f, 18f, 15.33f, 18f, 14.5f)
                reflectiveCurveTo(17.33f, 13f, 16.5f, 13f)
                moveTo(21.59f, 9.19f)
                curveTo(21.14f, 8.87f, 20.5f, 8.97f, 20.19f, 9.41f)
                lineTo(20.06f, 9.59f)
                curveTo(19.88f, 9.85f, 19.57f, 10f, 19.26f, 10f)
                lineTo(4.74f, 10f)
                curveTo(4.43f, 10f, 4.13f, 9.85f, 3.94f, 9.59f)
                lineTo(3.81f, 9.41f)
                curveTo(3.5f, 8.97f, 2.86f, 8.87f, 2.41f, 9.19f)
                curveTo(1.96f, 9.5f, 1.87f, 10.15f, 2.19f, 10.59f)
                lineTo(2.32f, 10.77f)
                curveTo(2.88f, 11.54f, 3.79f, 12f, 4.74f, 12f)
                horizontalLineTo(19.26f)
                curveTo(20.21f, 12f, 21.12f, 11.54f, 21.68f, 10.77f)
                lineTo(21.81f, 10.59f)
                curveTo(22.13f, 10.15f, 22.04f, 9.5f, 21.59f, 9.19f)
                close()
            }
        }.build()

        return _Skateboard!!
    }

@Suppress("ObjectPropertyName")
private var _Skateboard: ImageVector? = null

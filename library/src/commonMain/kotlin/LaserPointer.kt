package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LaserPointer: ImageVector
    get() {
        if (_LaserPointer != null) {
            return _LaserPointer!!
        }
        _LaserPointer = ImageVector.Builder(
            name = "LaserPointer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 13f)
                lineTo(5f, 16f)
                curveTo(4f, 16.88f, 3.86f, 18.12f, 4f, 19f)
                curveTo(4.13f, 20f, 4.91f, 21.22f, 6f, 21.68f)
                curveTo(7.57f, 22.35f, 9.09f, 21.9f, 10.04f, 20.92f)
                lineTo(19f, 13f)
                curveTo(20.86f, 11.62f, 20f, 9f, 18f, 9f)
                horizontalLineTo(12f)
                lineTo(19.46f, 4.61f)
                curveTo(19.9f, 4.29f, 20.08f, 3.82f, 20.06f, 3.37f)
                curveTo(20f, 2.67f, 19.46f, 2f, 18.6f, 2f)
                horizontalLineTo(18.54f)
                curveTo(18.19f, 2f, 17.86f, 2.11f, 17.56f, 2.29f)
                lineTo(5f, 9f)
                curveTo(4.19f, 9.46f, 3.94f, 10.24f, 4f, 11f)
                curveTo(4.05f, 12.03f, 4.74f, 13f, 6f, 13f)
                moveTo(5f, 18.5f)
                curveTo(5f, 17.12f, 6.12f, 16f, 7.5f, 16f)
                reflectiveCurveTo(10f, 17.12f, 10f, 18.5f)
                reflectiveCurveTo(8.88f, 21f, 7.5f, 21f)
                reflectiveCurveTo(5f, 19.88f, 5f, 18.5f)
                close()
            }
        }.build()

        return _LaserPointer!!
    }

@Suppress("ObjectPropertyName")
private var _LaserPointer: ImageVector? = null

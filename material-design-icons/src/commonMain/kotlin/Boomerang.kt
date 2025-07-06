package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Boomerang: ImageVector
    get() {
        if (_Boomerang != null) {
            return _Boomerang!!
        }
        _Boomerang = ImageVector.Builder(
            name = "Boomerang",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                reflectiveCurveTo(2.9f, 6f, 4f, 6f)
                horizontalLineTo(8f)
                lineTo(10f, 2f)
                moveTo(18f, 2f)
                curveTo(20.2f, 2f, 22f, 3.8f, 22f, 6f)
                verticalLineTo(12f)
                lineTo(18f, 14f)
                curveTo(18f, 9.6f, 14.4f, 6f, 10f, 6f)
                lineTo(12f, 2f)
                horizontalLineTo(18f)
                moveTo(18f, 20f)
                verticalLineTo(16f)
                lineTo(22f, 14f)
                verticalLineTo(20f)
                curveTo(22f, 21.1f, 21.1f, 22f, 20f, 22f)
                reflectiveCurveTo(18f, 21.1f, 18f, 20f)
                close()
            }
        }.build()

        return _Boomerang!!
    }

@Suppress("ObjectPropertyName")
private var _Boomerang: ImageVector? = null

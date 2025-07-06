package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Crown: ImageVector
    get() {
        if (_Crown != null) {
            return _Crown!!
        }
        _Crown = ImageVector.Builder(
            name = "Crown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 16f)
                lineTo(3f, 5f)
                lineTo(8.5f, 10f)
                lineTo(12f, 4f)
                lineTo(15.5f, 10f)
                lineTo(21f, 5f)
                lineTo(19f, 16f)
                horizontalLineTo(5f)
                moveTo(19f, 19f)
                curveTo(19f, 19.6f, 18.6f, 20f, 18f, 20f)
                horizontalLineTo(6f)
                curveTo(5.4f, 20f, 5f, 19.6f, 5f, 19f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _Crown!!
    }

@Suppress("ObjectPropertyName")
private var _Crown: ImageVector? = null

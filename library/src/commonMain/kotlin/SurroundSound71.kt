package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SurroundSound71: ImageVector
    get() {
        if (_SurroundSound71 != null) {
            return _SurroundSound71!!
        }
        _SurroundSound71 = ImageVector.Builder(
            name = "SurroundSound71",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 17f)
                horizontalLineTo(12f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                moveTo(20f, 7f)
                verticalLineTo(17f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                moveTo(4f, 17f)
                lineTo(8f, 9f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                lineTo(6f, 17f)
            }
        }.build()

        return _SurroundSound71!!
    }

@Suppress("ObjectPropertyName")
private var _SurroundSound71: ImageVector? = null

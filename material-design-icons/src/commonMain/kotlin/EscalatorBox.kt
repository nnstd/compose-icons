package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EscalatorBox: ImageVector
    get() {
        if (_EscalatorBox != null) {
            return _EscalatorBox!!
        }
        _EscalatorBox = ImageVector.Builder(
            name = "EscalatorBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.89f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.89f, 20.11f, 3f, 19f, 3f)
                horizontalLineTo(5f)
                moveTo(14.34f, 6f)
                horizontalLineTo(17.05f)
                curveTo(18.16f, 6f, 19.05f, 6.9f, 19.05f, 8f)
                curveTo(19.05f, 9.11f, 18.16f, 10f, 17.05f, 10f)
                horizontalLineTo(16f)
                lineTo(10f, 18f)
                horizontalLineTo(7.05f)
                curveTo(5.95f, 18f, 5.05f, 17.11f, 5.05f, 16f)
                curveTo(5.05f, 14.9f, 5.95f, 14f, 7.05f, 14f)
                horizontalLineTo(8.34f)
                lineTo(14.34f, 6f)
                close()
            }
        }.build()

        return _EscalatorBox!!
    }

@Suppress("ObjectPropertyName")
private var _EscalatorBox: ImageVector? = null

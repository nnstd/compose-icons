package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PowerPlug: ImageVector
    get() {
        if (_PowerPlug != null) {
            return _PowerPlug!!
        }
        _PowerPlug = ImageVector.Builder(
            name = "PowerPlug",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 7f)
                verticalLineTo(3f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(8f)
                curveTo(7f, 7f, 6f, 8f, 6f, 9f)
                verticalLineTo(14.5f)
                lineTo(9.5f, 18f)
                verticalLineTo(21f)
                horizontalLineTo(14.5f)
                verticalLineTo(18f)
                lineTo(18f, 14.5f)
                verticalLineTo(9f)
                curveTo(18f, 8f, 17f, 7f, 16f, 7f)
                close()
            }
        }.build()

        return _PowerPlug!!
    }

@Suppress("ObjectPropertyName")
private var _PowerPlug: ImageVector? = null

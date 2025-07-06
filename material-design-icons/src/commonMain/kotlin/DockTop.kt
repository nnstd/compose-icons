package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DockTop: ImageVector
    get() {
        if (_DockTop != null) {
            return _DockTop!!
        }
        _DockTop = ImageVector.Builder(
            name = "DockTop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 20f)
                horizontalLineTo(20f)
                curveTo(21.11f, 20f, 22f, 19.11f, 22f, 18f)
                verticalLineTo(6f)
                curveTo(22f, 4.89f, 21.11f, 4f, 20f, 4f)
                horizontalLineTo(4f)
                curveTo(2.9f, 4f, 2f, 4.89f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.11f, 2.9f, 20f, 4f, 20f)
                moveTo(4f, 11f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _DockTop!!
    }

@Suppress("ObjectPropertyName")
private var _DockTop: ImageVector? = null

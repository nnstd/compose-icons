package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DomeLight: ImageVector
    get() {
        if (_DomeLight != null) {
            return _DomeLight!!
        }
        _DomeLight = ImageVector.Builder(
            name = "DomeLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 10f)
                curveTo(21f, 14.97f, 16.97f, 19f, 12f, 19f)
                curveTo(7.03f, 19f, 3f, 14.97f, 3f, 10f)
                verticalLineTo(9.03f)
                curveTo(3f, 8.76f, 3.11f, 8.5f, 3.3f, 8.3f)
                curveTo(3.5f, 8.11f, 3.76f, 8f, 4.03f, 8f)
                horizontalLineTo(20f)
                curveTo(20.25f, 8f, 20.5f, 8.11f, 20.7f, 8.3f)
                curveTo(20.89f, 8.5f, 21f, 8.75f, 21f, 9f)
                verticalLineTo(10f)
                moveTo(5f, 10f)
                curveTo(5f, 13.86f, 8.14f, 17f, 12f, 17f)
                curveTo(15.86f, 17f, 19f, 13.86f, 19f, 10f)
                horizontalLineTo(5f)
                moveTo(20f, 6f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                curveTo(4f, 5.73f, 4.1f, 5.5f, 4.29f, 5.29f)
                curveTo(4.5f, 5.1f, 4.73f, 5f, 5f, 5f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                curveTo(19.25f, 5f, 19.5f, 5.11f, 19.7f, 5.3f)
                curveTo(19.89f, 5.5f, 20f, 5.75f, 20f, 6f)
                close()
            }
        }.build()

        return _DomeLight!!
    }

@Suppress("ObjectPropertyName")
private var _DomeLight: ImageVector? = null

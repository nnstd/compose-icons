package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WindowMinimize: ImageVector
    get() {
        if (_WindowMinimize != null) {
            return _WindowMinimize!!
        }
        _WindowMinimize = ImageVector.Builder(
            name = "WindowMinimize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 14f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
            }
        }.build()

        return _WindowMinimize!!
    }

@Suppress("ObjectPropertyName")
private var _WindowMinimize: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WindowRestore: ImageVector
    get() {
        if (_WindowRestore != null) {
            return _WindowRestore!!
        }
        _WindowRestore = ImageVector.Builder(
            name = "WindowRestore",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 8f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                moveTo(16f, 8f)
                verticalLineTo(14f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                moveTo(6f, 12f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _WindowRestore!!
    }

@Suppress("ObjectPropertyName")
private var _WindowRestore: ImageVector? = null

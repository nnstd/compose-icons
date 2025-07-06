package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Signal: ImageVector
    get() {
        if (_Signal != null) {
            return _Signal!!
        }
        _Signal = ImageVector.Builder(
            name = "Signal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 21f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                moveTo(8f, 21f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                moveTo(13f, 21f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                moveTo(18f, 21f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                horizontalLineTo(18f)
                verticalLineTo(21f)
                close()
            }
        }.build()

        return _Signal!!
    }

@Suppress("ObjectPropertyName")
private var _Signal: ImageVector? = null

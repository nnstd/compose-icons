package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NotEqual: ImageVector
    get() {
        if (_NotEqual != null) {
            return _NotEqual!!
        }
        _NotEqual = ImageVector.Builder(
            name = "NotEqual",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 10f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                horizontalLineTo(21f)
                verticalLineTo(10f)
                moveTo(21f, 16f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                horizontalLineTo(21f)
                verticalLineTo(16f)
                moveTo(4f, 5f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                moveTo(6f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _NotEqual!!
    }

@Suppress("ObjectPropertyName")
private var _NotEqual: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewStream: ImageVector
    get() {
        if (_ViewStream != null) {
            return _ViewStream!!
        }
        _ViewStream = ImageVector.Builder(
            name = "ViewStream",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 5f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                moveTo(4f, 18f)
                horizontalLineTo(21f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _ViewStream!!
    }

@Suppress("ObjectPropertyName")
private var _ViewStream: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RectangleOutline: ImageVector
    get() {
        if (_RectangleOutline != null) {
            return _RectangleOutline!!
        }
        _RectangleOutline = ImageVector.Builder(
            name = "RectangleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 6f)
                verticalLineTo(19f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                moveTo(18f, 17f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _RectangleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _RectangleOutline: ImageVector? = null

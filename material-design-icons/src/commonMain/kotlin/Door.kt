package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Door: ImageVector
    get() {
        if (_Door != null) {
            return _Door!!
        }
        _Door = ImageVector.Builder(
            name = "Door",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 3f)
                curveTo(6.89f, 3f, 6f, 3.89f, 6f, 5f)
                verticalLineTo(21f)
                horizontalLineTo(18f)
                verticalLineTo(5f)
                curveTo(18f, 3.89f, 17.11f, 3f, 16f, 3f)
                horizontalLineTo(8f)
                moveTo(8f, 5f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                moveTo(13f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _Door!!
    }

@Suppress("ObjectPropertyName")
private var _Door: ImageVector? = null

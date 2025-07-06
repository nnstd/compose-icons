package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowTopLeft: ImageVector
    get() {
        if (_ArrowTopLeft != null) {
            return _ArrowTopLeft!!
        }
        _ArrowTopLeft = ImageVector.Builder(
            name = "ArrowTopLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 17.59f)
                lineTo(17.59f, 19f)
                lineTo(7f, 8.41f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                horizontalLineTo(8.41f)
                lineTo(19f, 17.59f)
                close()
            }
        }.build()

        return _ArrowTopLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTopLeft: ImageVector? = null

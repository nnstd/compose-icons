package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Comma: ImageVector
    get() {
        if (_Comma != null) {
            return _Comma!!
        }
        _Comma = ImageVector.Builder(
            name = "Comma",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 3f)
                horizontalLineTo(16.95f)
                verticalLineTo(12.96f)
                lineTo(12.96f, 20.94f)
                horizontalLineTo(8f)
                lineTo(11.97f, 12.96f)
                horizontalLineTo(7f)
                verticalLineTo(3f)
                close()
            }
        }.build()

        return _Comma!!
    }

@Suppress("ObjectPropertyName")
private var _Comma: ImageVector? = null

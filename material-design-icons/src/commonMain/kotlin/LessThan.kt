package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LessThan: ImageVector
    get() {
        if (_LessThan != null) {
            return _LessThan!!
        }
        _LessThan = ImageVector.Builder(
            name = "LessThan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 4.14f)
                lineTo(19.5f, 5.86f)
                lineTo(8.97f, 12f)
                lineTo(19.5f, 18.14f)
                lineTo(18.5f, 19.86f)
                lineTo(5f, 12f)
                lineTo(18.5f, 4.14f)
                close()
            }
        }.build()

        return _LessThan!!
    }

@Suppress("ObjectPropertyName")
private var _LessThan: ImageVector? = null

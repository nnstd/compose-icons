package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GreaterThan: ImageVector
    get() {
        if (_GreaterThan != null) {
            return _GreaterThan!!
        }
        _GreaterThan = ImageVector.Builder(
            name = "GreaterThan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.5f, 4.14f)
                lineTo(4.5f, 5.86f)
                lineTo(15f, 12f)
                lineTo(4.5f, 18.14f)
                lineTo(5.5f, 19.86f)
                lineTo(19f, 12f)
                lineTo(5.5f, 4.14f)
                close()
            }
        }.build()

        return _GreaterThan!!
    }

@Suppress("ObjectPropertyName")
private var _GreaterThan: ImageVector? = null

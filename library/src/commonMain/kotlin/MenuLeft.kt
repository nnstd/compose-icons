package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MenuLeft: ImageVector
    get() {
        if (_MenuLeft != null) {
            return _MenuLeft!!
        }
        _MenuLeft = ImageVector.Builder(
            name = "MenuLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 7f)
                lineTo(9f, 12f)
                lineTo(14f, 17f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _MenuLeft!!
    }

@Suppress("ObjectPropertyName")
private var _MenuLeft: ImageVector? = null

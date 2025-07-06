package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MenuRight: ImageVector
    get() {
        if (_MenuRight != null) {
            return _MenuRight!!
        }
        _MenuRight = ImageVector.Builder(
            name = "MenuRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 17f)
                lineTo(15f, 12f)
                lineTo(10f, 7f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _MenuRight!!
    }

@Suppress("ObjectPropertyName")
private var _MenuRight: ImageVector? = null

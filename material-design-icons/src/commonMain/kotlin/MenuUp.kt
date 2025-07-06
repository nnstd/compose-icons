package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MenuUp: ImageVector
    get() {
        if (_MenuUp != null) {
            return _MenuUp!!
        }
        _MenuUp = ImageVector.Builder(
            name = "MenuUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 15f)
                lineTo(12f, 10f)
                lineTo(17f, 15f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _MenuUp!!
    }

@Suppress("ObjectPropertyName")
private var _MenuUp: ImageVector? = null

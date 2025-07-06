package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MenuDown: ImageVector
    get() {
        if (_MenuDown != null) {
            return _MenuDown!!
        }
        _MenuDown = ImageVector.Builder(
            name = "MenuDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 10f)
                lineTo(12f, 15f)
                lineTo(17f, 10f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _MenuDown!!
    }

@Suppress("ObjectPropertyName")
private var _MenuDown: ImageVector? = null

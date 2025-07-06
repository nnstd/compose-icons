package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ColorHelper: ImageVector
    get() {
        if (_ColorHelper != null) {
            return _ColorHelper!!
        }
        _ColorHelper = ImageVector.Builder(
            name = "ColorHelper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 24f)
                horizontalLineTo(24f)
                verticalLineTo(20f)
                horizontalLineTo(0f)
                verticalLineTo(24f)
                close()
            }
        }.build()

        return _ColorHelper!!
    }

@Suppress("ObjectPropertyName")
private var _ColorHelper: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Alert: ImageVector
    get() {
        if (_Alert != null) {
            return _Alert!!
        }
        _Alert = ImageVector.Builder(
            name = "Alert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 14f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                moveTo(13f, 18f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                moveTo(1f, 21f)
                horizontalLineTo(23f)
                lineTo(12f, 2f)
                lineTo(1f, 21f)
                close()
            }
        }.build()

        return _Alert!!
    }

@Suppress("ObjectPropertyName")
private var _Alert: ImageVector? = null

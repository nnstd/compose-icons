package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PowerOn: ImageVector
    get() {
        if (_PowerOn != null) {
            return _PowerOn!!
        }
        _PowerOn = ImageVector.Builder(
            name = "PowerOn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 3f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                close()
            }
        }.build()

        return _PowerOn!!
    }

@Suppress("ObjectPropertyName")
private var _PowerOn: ImageVector? = null

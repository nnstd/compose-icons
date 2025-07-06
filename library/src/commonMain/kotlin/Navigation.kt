package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Navigation: ImageVector
    get() {
        if (_Navigation != null) {
            return _Navigation!!
        }
        _Navigation = ImageVector.Builder(
            name = "Navigation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                lineTo(4.5f, 20.29f)
                lineTo(5.21f, 21f)
                lineTo(12f, 18f)
                lineTo(18.79f, 21f)
                lineTo(19.5f, 20.29f)
                lineTo(12f, 2f)
                close()
            }
        }.build()

        return _Navigation!!
    }

@Suppress("ObjectPropertyName")
private var _Navigation: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloseThick: ImageVector
    get() {
        if (_CloseThick != null) {
            return _CloseThick!!
        }
        _CloseThick = ImageVector.Builder(
            name = "CloseThick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 6.91f)
                lineTo(17.09f, 4f)
                lineTo(12f, 9.09f)
                lineTo(6.91f, 4f)
                lineTo(4f, 6.91f)
                lineTo(9.09f, 12f)
                lineTo(4f, 17.09f)
                lineTo(6.91f, 20f)
                lineTo(12f, 14.91f)
                lineTo(17.09f, 20f)
                lineTo(20f, 17.09f)
                lineTo(14.91f, 12f)
                lineTo(20f, 6.91f)
                close()
            }
        }.build()

        return _CloseThick!!
    }

@Suppress("ObjectPropertyName")
private var _CloseThick: ImageVector? = null

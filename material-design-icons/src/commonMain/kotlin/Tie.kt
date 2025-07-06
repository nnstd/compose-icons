package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Tie: ImageVector
    get() {
        if (_Tie != null) {
            return _Tie!!
        }
        _Tie = ImageVector.Builder(
            name = "Tie",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 2f)
                lineTo(10f, 6f)
                lineTo(7f, 17f)
                lineTo(12f, 22f)
                lineTo(17f, 17f)
                lineTo(14f, 6f)
                lineTo(18f, 2f)
                close()
            }
        }.build()

        return _Tie!!
    }

@Suppress("ObjectPropertyName")
private var _Tie: ImageVector? = null

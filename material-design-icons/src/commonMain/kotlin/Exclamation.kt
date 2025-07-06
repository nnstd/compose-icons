package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Exclamation: ImageVector
    get() {
        if (_Exclamation != null) {
            return _Exclamation!!
        }
        _Exclamation = ImageVector.Builder(
            name = "Exclamation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 4f)
                lineTo(13f, 4f)
                lineTo(13f, 15f)
                lineTo(11f, 15f)
                lineTo(11f, 4f)
                close()
                moveTo(13f, 18f)
                lineTo(13f, 20f)
                lineTo(11f, 20f)
                lineTo(11f, 18f)
                lineTo(13f, 18f)
                close()
            }
        }.build()

        return _Exclamation!!
    }

@Suppress("ObjectPropertyName")
private var _Exclamation: ImageVector? = null

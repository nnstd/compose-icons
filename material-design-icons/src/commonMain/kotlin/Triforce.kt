package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Triforce: ImageVector
    get() {
        if (_Triforce != null) {
            return _Triforce!!
        }
        _Triforce = ImageVector.Builder(
            name = "Triforce",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.5f, 21f)
                lineTo(12f, 3.5f)
                lineTo(22.5f, 21f)
                horizontalLineTo(1.5f)
                moveTo(12f, 21f)
                lineTo(17f, 12f)
                horizontalLineTo(7f)
                lineTo(12f, 21f)
                close()
            }
        }.build()

        return _Triforce!!
    }

@Suppress("ObjectPropertyName")
private var _Triforce: ImageVector? = null

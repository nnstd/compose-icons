package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MortarPestle: ImageVector
    get() {
        if (_MortarPestle != null) {
            return _MortarPestle!!
        }
        _MortarPestle = ImageVector.Builder(
            name = "MortarPestle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 7f)
                lineTo(19f, 13f)
                lineTo(21f, 19f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                lineTo(5f, 13f)
                lineTo(3f, 7f)
                verticalLineTo(5f)
                horizontalLineTo(15.7f)
                lineTo(17.2f, 1f)
                lineTo(19.5f, 1.8f)
                lineTo(18.3f, 5f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _MortarPestle!!
    }

@Suppress("ObjectPropertyName")
private var _MortarPestle: ImageVector? = null

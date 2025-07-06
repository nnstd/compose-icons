package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Invoice: ImageVector
    get() {
        if (_Invoice != null) {
            return _Invoice!!
        }
        _Invoice = ImageVector.Builder(
            name = "Invoice",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 22f)
                lineTo(18f, 20f)
                lineTo(15f, 22f)
                lineTo(12f, 20f)
                lineTo(9f, 22f)
                lineTo(6f, 20f)
                lineTo(3f, 22f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                verticalLineTo(22f)
                close()
            }
        }.build()

        return _Invoice!!
    }

@Suppress("ObjectPropertyName")
private var _Invoice: ImageVector? = null

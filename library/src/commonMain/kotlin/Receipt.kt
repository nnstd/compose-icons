package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Receipt: ImageVector
    get() {
        if (_Receipt != null) {
            return _Receipt!!
        }
        _Receipt = ImageVector.Builder(
            name = "Receipt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 22f)
                lineTo(4.5f, 20.5f)
                lineTo(6f, 22f)
                lineTo(7.5f, 20.5f)
                lineTo(9f, 22f)
                lineTo(10.5f, 20.5f)
                lineTo(12f, 22f)
                lineTo(13.5f, 20.5f)
                lineTo(15f, 22f)
                lineTo(16.5f, 20.5f)
                lineTo(18f, 22f)
                lineTo(19.5f, 20.5f)
                lineTo(21f, 22f)
                verticalLineTo(2f)
                lineTo(19.5f, 3.5f)
                lineTo(18f, 2f)
                lineTo(16.5f, 3.5f)
                lineTo(15f, 2f)
                lineTo(13.5f, 3.5f)
                lineTo(12f, 2f)
                lineTo(10.5f, 3.5f)
                lineTo(9f, 2f)
                lineTo(7.5f, 3.5f)
                lineTo(6f, 2f)
                lineTo(4.5f, 3.5f)
                lineTo(3f, 2f)
            }
        }.build()

        return _Receipt!!
    }

@Suppress("ObjectPropertyName")
private var _Receipt: ImageVector? = null

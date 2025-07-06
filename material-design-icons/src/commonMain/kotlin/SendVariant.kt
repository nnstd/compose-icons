package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SendVariant: ImageVector
    get() {
        if (_SendVariant != null) {
            return _SendVariant!!
        }
        _SendVariant = ImageVector.Builder(
            name = "SendVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 20f)
                verticalLineTo(14f)
                lineTo(11f, 12f)
                lineTo(3f, 10f)
                verticalLineTo(4f)
                lineTo(22f, 12f)
                close()
            }
        }.build()

        return _SendVariant!!
    }

@Suppress("ObjectPropertyName")
private var _SendVariant: ImageVector? = null

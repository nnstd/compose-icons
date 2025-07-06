package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SendOutline: ImageVector
    get() {
        if (_SendOutline != null) {
            return _SendOutline!!
        }
        _SendOutline = ImageVector.Builder(
            name = "SendOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 6.03f)
                lineTo(11.5f, 9.25f)
                lineTo(4f, 8.25f)
                lineTo(4f, 6.03f)
                moveTo(11.5f, 14.75f)
                lineTo(4f, 17.97f)
                verticalLineTo(15.75f)
                lineTo(11.5f, 14.75f)
                moveTo(2f, 3f)
                lineTo(2f, 10f)
                lineTo(17f, 12f)
                lineTo(2f, 14f)
                lineTo(2f, 21f)
                lineTo(23f, 12f)
                lineTo(2f, 3f)
                close()
            }
        }.build()

        return _SendOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SendOutline: ImageVector? = null

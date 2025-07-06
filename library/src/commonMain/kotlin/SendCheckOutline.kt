package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SendCheckOutline: ImageVector
    get() {
        if (_SendCheckOutline != null) {
            return _SendCheckOutline!!
        }
        _SendCheckOutline = ImageVector.Builder(
            name = "SendCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 3f)
                verticalLineTo(10f)
                lineTo(17f, 12f)
                lineTo(2f, 14f)
                verticalLineTo(21f)
                lineTo(23f, 12f)
                moveTo(4f, 6.03f)
                lineTo(11.53f, 9.25f)
                lineTo(4f, 8.25f)
                moveTo(11.53f, 14.75f)
                lineTo(4f, 17.97f)
                verticalLineTo(15.75f)
                moveTo(22f, 15.5f)
                lineTo(18.5f, 19f)
                lineTo(16.5f, 17f)
                lineTo(15f, 18.5f)
                lineTo(18.5f, 22f)
                lineTo(23.5f, 17f)
                close()
            }
        }.build()

        return _SendCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SendCheckOutline: ImageVector? = null

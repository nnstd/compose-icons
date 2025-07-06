package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SendVariantOutline: ImageVector
    get() {
        if (_SendVariantOutline != null) {
            return _SendVariantOutline!!
        }
        _SendVariantOutline = ImageVector.Builder(
            name = "SendVariantOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 20f)
                verticalLineTo(4f)
                lineTo(22f, 12f)
                moveTo(5f, 17f)
                lineTo(16.85f, 12f)
                lineTo(5f, 7f)
                verticalLineTo(10.5f)
                lineTo(11f, 12f)
                lineTo(5f, 13.5f)
                moveTo(5f, 17f)
                verticalLineTo(7f)
                verticalLineTo(13.5f)
                close()
            }
        }.build()

        return _SendVariantOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SendVariantOutline: ImageVector? = null

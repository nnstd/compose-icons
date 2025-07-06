package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageFilterHdrOutline: ImageVector
    get() {
        if (_ImageFilterHdrOutline != null) {
            return _ImageFilterHdrOutline!!
        }
        _ImageFilterHdrOutline = ImageVector.Builder(
            name = "ImageFilterHdrOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 18f)
                horizontalLineTo(1f)
                lineTo(8.25f, 8.33f)
                lineTo(10.25f, 11f)
                lineTo(14f, 6f)
                lineTo(23f, 18f)
                moveTo(11.5f, 12.67f)
                lineTo(14f, 16f)
                lineTo(19f, 16f)
                lineTo(14f, 9.33f)
                lineTo(11.5f, 12.67f)
                moveTo(5f, 16f)
                lineTo(11.5f, 16f)
                lineTo(8.25f, 11.67f)
                lineTo(5f, 16f)
                close()
            }
        }.build()

        return _ImageFilterHdrOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ImageFilterHdrOutline: ImageVector? = null

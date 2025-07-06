package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageFilterHdr: ImageVector
    get() {
        if (_ImageFilterHdr != null) {
            return _ImageFilterHdr!!
        }
        _ImageFilterHdr = ImageVector.Builder(
            name = "ImageFilterHdr",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 6f)
                lineTo(10.25f, 11f)
                lineTo(13.1f, 14.8f)
                lineTo(11.5f, 16f)
                curveTo(9.81f, 13.75f, 7f, 10f, 7f, 10f)
                lineTo(1f, 18f)
                horizontalLineTo(23f)
                lineTo(14f, 6f)
                close()
            }
        }.build()

        return _ImageFilterHdr!!
    }

@Suppress("ObjectPropertyName")
private var _ImageFilterHdr: ImageVector? = null

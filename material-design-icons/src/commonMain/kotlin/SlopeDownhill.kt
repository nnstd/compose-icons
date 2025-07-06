package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SlopeDownhill: ImageVector
    get() {
        if (_SlopeDownhill != null) {
            return _SlopeDownhill!!
        }
        _SlopeDownhill = ImageVector.Builder(
            name = "SlopeDownhill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 19f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                lineTo(22f, 19f)
                moveTo(19.09f, 7.5f)
                lineTo(18.25f, 10.26f)
                lineTo(8.13f, 7.26f)
                curveTo(8.06f, 5.66f, 6.7f, 4.42f, 5.1f, 4.5f)
                curveTo(3.5f, 4.57f, 2.26f, 5.93f, 2.34f, 7.53f)
                curveTo(2.41f, 9.13f, 3.77f, 10.36f, 5.37f, 10.29f)
                curveTo(6.24f, 10.25f, 7.05f, 9.82f, 7.57f, 9.11f)
                lineTo(17.69f, 12.11f)
                lineTo(16.85f, 14.89f)
                lineTo(21.67f, 12.29f)
                lineTo(19.09f, 7.5f)
                close()
            }
        }.build()

        return _SlopeDownhill!!
    }

@Suppress("ObjectPropertyName")
private var _SlopeDownhill: ImageVector? = null

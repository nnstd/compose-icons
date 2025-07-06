package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SlopeUphill: ImageVector
    get() {
        if (_SlopeUphill != null) {
            return _SlopeUphill!!
        }
        _SlopeUphill = ImageVector.Builder(
            name = "SlopeUphill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 13f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(19f)
                lineTo(22f, 13f)
                moveTo(21.68f, 7.06f)
                lineTo(16.86f, 4.46f)
                lineTo(17.7f, 7.24f)
                lineTo(7.58f, 10.24f)
                curveTo(6.63f, 8.95f, 4.82f, 8.67f, 3.53f, 9.62f)
                curveTo(2.24f, 10.57f, 1.96f, 12.38f, 2.91f, 13.67f)
                curveTo(3.85f, 14.97f, 5.67f, 15.24f, 6.96f, 14.29f)
                curveTo(7.67f, 13.78f, 8.1f, 12.97f, 8.14f, 12.09f)
                lineTo(18.26f, 9.09f)
                lineTo(19.1f, 11.87f)
                lineTo(21.68f, 7.06f)
                close()
            }
        }.build()

        return _SlopeUphill!!
    }

@Suppress("ObjectPropertyName")
private var _SlopeUphill: ImageVector? = null

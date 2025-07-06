package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PercentBox: ImageVector
    get() {
        if (_PercentBox != null) {
            return _PercentBox!!
        }
        _PercentBox = ImageVector.Builder(
            name = "PercentBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.89f, 20.1f, 3f, 19f, 3f)
                moveTo(8.83f, 7.05f)
                curveTo(9.81f, 7.05f, 10.6f, 7.84f, 10.6f, 8.83f)
                curveTo(10.6f, 9.81f, 9.81f, 10.6f, 8.83f, 10.6f)
                curveTo(7.84f, 10.6f, 7.05f, 9.81f, 7.05f, 8.83f)
                curveTo(7.05f, 7.84f, 7.84f, 7.05f, 8.83f, 7.05f)
                moveTo(15.22f, 17f)
                curveTo(14.24f, 17f, 13.45f, 16.2f, 13.45f, 15.22f)
                curveTo(13.45f, 14.24f, 14.24f, 13.45f, 15.22f, 13.45f)
                curveTo(16.2f, 13.45f, 17f, 14.24f, 17f, 15.22f)
                curveTo(17f, 16.2f, 16.2f, 17f, 15.22f, 17f)
                moveTo(8.5f, 17.03f)
                lineTo(7f, 15.53f)
                lineTo(15.53f, 7f)
                lineTo(17.03f, 8.5f)
                lineTo(8.5f, 17.03f)
                close()
            }
        }.build()

        return _PercentBox!!
    }

@Suppress("ObjectPropertyName")
private var _PercentBox: ImageVector? = null

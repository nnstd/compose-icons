package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NetworkStrength1Alert: ImageVector
    get() {
        if (_NetworkStrength1Alert != null) {
            return _NetworkStrength1Alert!!
        }
        _NetworkStrength1Alert = ImageVector.Builder(
            name = "NetworkStrength1Alert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 1f)
                lineTo(1f, 21f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(11f)
                verticalLineTo(13.8f)
                lineTo(19f, 5.8f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                moveTo(19f, 11f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                moveTo(19f, 19f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
            }
        }.build()

        return _NetworkStrength1Alert!!
    }

@Suppress("ObjectPropertyName")
private var _NetworkStrength1Alert: ImageVector? = null

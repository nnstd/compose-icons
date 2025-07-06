package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NetworkStrength3Alert: ImageVector
    get() {
        if (_NetworkStrength3Alert != null) {
            return _NetworkStrength3Alert!!
        }
        _NetworkStrength3Alert = ImageVector.Builder(
            name = "NetworkStrength3Alert",
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
                horizontalLineTo(16f)
                verticalLineTo(8.8f)
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

        return _NetworkStrength3Alert!!
    }

@Suppress("ObjectPropertyName")
private var _NetworkStrength3Alert: ImageVector? = null

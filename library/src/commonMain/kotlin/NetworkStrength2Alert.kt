package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NetworkStrength2Alert: ImageVector
    get() {
        if (_NetworkStrength2Alert != null) {
            return _NetworkStrength2Alert!!
        }
        _NetworkStrength2Alert = ImageVector.Builder(
            name = "NetworkStrength2Alert",
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
                horizontalLineTo(13f)
                verticalLineTo(11.8f)
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

        return _NetworkStrength2Alert!!
    }

@Suppress("ObjectPropertyName")
private var _NetworkStrength2Alert: ImageVector? = null

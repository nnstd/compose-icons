package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NetworkStrength4Alert: ImageVector
    get() {
        if (_NetworkStrength4Alert != null) {
            return _NetworkStrength4Alert!!
        }
        _NetworkStrength4Alert = ImageVector.Builder(
            name = "NetworkStrength4Alert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 17f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                moveTo(19f, 21f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                moveTo(1f, 21f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(1f)
            }
        }.build()

        return _NetworkStrength4Alert!!
    }

@Suppress("ObjectPropertyName")
private var _NetworkStrength4Alert: ImageVector? = null

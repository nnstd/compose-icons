package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NetworkStrength1: ImageVector
    get() {
        if (_NetworkStrength1 != null) {
            return _NetworkStrength1!!
        }
        _NetworkStrength1 = ImageVector.Builder(
            name = "NetworkStrength1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 21f)
                horizontalLineTo(21f)
                verticalLineTo(1f)
                moveTo(19f, 5.83f)
                verticalLineTo(19f)
                horizontalLineTo(11f)
                verticalLineTo(13.83f)
            }
        }.build()

        return _NetworkStrength1!!
    }

@Suppress("ObjectPropertyName")
private var _NetworkStrength1: ImageVector? = null

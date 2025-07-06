package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NetworkStrengthOutline: ImageVector
    get() {
        if (_NetworkStrengthOutline != null) {
            return _NetworkStrengthOutline!!
        }
        _NetworkStrengthOutline = ImageVector.Builder(
            name = "NetworkStrengthOutline",
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
                horizontalLineTo(6f)
            }
        }.build()

        return _NetworkStrengthOutline!!
    }

@Suppress("ObjectPropertyName")
private var _NetworkStrengthOutline: ImageVector? = null

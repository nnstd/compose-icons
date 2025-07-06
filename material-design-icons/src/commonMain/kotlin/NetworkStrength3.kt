package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NetworkStrength3: ImageVector
    get() {
        if (_NetworkStrength3 != null) {
            return _NetworkStrength3!!
        }
        _NetworkStrength3 = ImageVector.Builder(
            name = "NetworkStrength3",
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
                horizontalLineTo(16f)
                verticalLineTo(8.83f)
            }
        }.build()

        return _NetworkStrength3!!
    }

@Suppress("ObjectPropertyName")
private var _NetworkStrength3: ImageVector? = null

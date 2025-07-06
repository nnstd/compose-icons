package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NetworkStrength2: ImageVector
    get() {
        if (_NetworkStrength2 != null) {
            return _NetworkStrength2!!
        }
        _NetworkStrength2 = ImageVector.Builder(
            name = "NetworkStrength2",
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
                horizontalLineTo(13f)
                verticalLineTo(11.83f)
            }
        }.build()

        return _NetworkStrength2!!
    }

@Suppress("ObjectPropertyName")
private var _NetworkStrength2: ImageVector? = null

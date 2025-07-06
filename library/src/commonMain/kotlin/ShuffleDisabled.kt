package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShuffleDisabled: ImageVector
    get() {
        if (_ShuffleDisabled != null) {
            return _ShuffleDisabled!!
        }
        _ShuffleDisabled = ImageVector.Builder(
            name = "ShuffleDisabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 4.5f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(11.5f)
                lineTo(19.5f, 8f)
                moveTo(16f, 12.5f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                verticalLineTo(19.5f)
                lineTo(19.5f, 16f)
            }
        }.build()

        return _ShuffleDisabled!!
    }

@Suppress("ObjectPropertyName")
private var _ShuffleDisabled: ImageVector? = null

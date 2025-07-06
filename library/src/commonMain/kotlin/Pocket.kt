package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Pocket: ImageVector
    get() {
        if (_Pocket != null) {
            return _Pocket!!
        }
        _Pocket = ImageVector.Builder(
            name = "Pocket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 3f)
                horizontalLineTo(20f)
                verticalLineTo(17.63f)
                lineTo(12f, 22.25f)
                lineTo(4f, 17.63f)
                verticalLineTo(3f)
                moveTo(18f, 9f)
                horizontalLineTo(6f)
                verticalLineTo(16.5f)
                lineTo(12f, 19.94f)
                lineTo(18f, 16.5f)
                verticalLineTo(9f)
                moveTo(18f, 5f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _Pocket!!
    }

@Suppress("ObjectPropertyName")
private var _Pocket: ImageVector? = null

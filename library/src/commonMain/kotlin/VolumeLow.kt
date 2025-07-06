package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VolumeLow: ImageVector
    get() {
        if (_VolumeLow != null) {
            return _VolumeLow!!
        }
        _VolumeLow = ImageVector.Builder(
            name = "VolumeLow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                lineTo(16f, 20f)
                verticalLineTo(4f)
                lineTo(11f, 9f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _VolumeLow!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeLow: ImageVector? = null

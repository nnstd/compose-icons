package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VolumePlus: ImageVector
    get() {
        if (_VolumePlus != null) {
            return _VolumePlus!!
        }
        _VolumePlus = ImageVector.Builder(
            name = "VolumePlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 9f)
                horizontalLineTo(7f)
                lineTo(12f, 4f)
                verticalLineTo(20f)
                lineTo(7f, 15f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                moveTo(14f, 11f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _VolumePlus!!
    }

@Suppress("ObjectPropertyName")
private var _VolumePlus: ImageVector? = null

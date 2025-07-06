package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VolumeMinus: ImageVector
    get() {
        if (_VolumeMinus != null) {
            return _VolumeMinus!!
        }
        _VolumeMinus = ImageVector.Builder(
            name = "VolumeMinus",
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
                horizontalLineTo(22f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _VolumeMinus!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeMinus: ImageVector? = null

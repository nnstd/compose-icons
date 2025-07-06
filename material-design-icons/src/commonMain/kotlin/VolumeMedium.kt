package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VolumeMedium: ImageVector
    get() {
        if (_VolumeMedium != null) {
            return _VolumeMedium!!
        }
        _VolumeMedium = ImageVector.Builder(
            name = "VolumeMedium",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                lineTo(14f, 20f)
                verticalLineTo(4f)
                lineTo(9f, 9f)
                moveTo(18.5f, 12f)
                curveTo(18.5f, 10.23f, 17.5f, 8.71f, 16f, 7.97f)
                verticalLineTo(16f)
                curveTo(17.5f, 15.29f, 18.5f, 13.76f, 18.5f, 12f)
                close()
            }
        }.build()

        return _VolumeMedium!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeMedium: ImageVector? = null

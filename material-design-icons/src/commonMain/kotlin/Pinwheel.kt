package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Pinwheel: ImageVector
    get() {
        if (_Pinwheel != null) {
            return _Pinwheel!!
        }
        _Pinwheel = ImageVector.Builder(
            name = "Pinwheel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12f)
                curveTo(12f, 9f, 14.5f, 6.5f, 17.5f, 6.5f)
                curveTo(20.5f, 6.5f, 23f, 9f, 23f, 12f)
                horizontalLineTo(12f)
                moveTo(12f, 12f)
                curveTo(12f, 15f, 9.5f, 17.5f, 6.5f, 17.5f)
                curveTo(3.5f, 17.5f, 1f, 15f, 1f, 12f)
                horizontalLineTo(12f)
                moveTo(12f, 12f)
                curveTo(9f, 12f, 6.5f, 9.5f, 6.5f, 6.5f)
                curveTo(6.5f, 3.5f, 9f, 1f, 12f, 1f)
                verticalLineTo(12f)
                moveTo(12f, 12f)
                curveTo(15f, 12f, 17.5f, 14.5f, 17.5f, 17.5f)
                curveTo(17.5f, 20.5f, 15f, 23f, 12f, 23f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _Pinwheel!!
    }

@Suppress("ObjectPropertyName")
private var _Pinwheel: ImageVector? = null

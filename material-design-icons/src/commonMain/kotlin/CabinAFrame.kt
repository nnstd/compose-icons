package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CabinAFrame: ImageVector
    get() {
        if (_CabinAFrame != null) {
            return _CabinAFrame!!
        }
        _CabinAFrame = ImageVector.Builder(
            name = "CabinAFrame",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                lineTo(4f, 21f)
                horizontalLineTo(20f)
                lineTo(12f, 3f)
                moveTo(9f, 19f)
                horizontalLineTo(7.08f)
                lineTo(9f, 14.67f)
                verticalLineTo(19f)
                moveTo(13f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                moveTo(10.19f, 12f)
                lineTo(12f, 7.92f)
                lineTo(13.81f, 12f)
                horizontalLineTo(10.19f)
                moveTo(15f, 14.67f)
                lineTo(16.92f, 19f)
                horizontalLineTo(15f)
                verticalLineTo(14.67f)
                close()
            }
        }.build()

        return _CabinAFrame!!
    }

@Suppress("ObjectPropertyName")
private var _CabinAFrame: ImageVector? = null

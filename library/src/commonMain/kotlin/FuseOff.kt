package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FuseOff: ImageVector
    get() {
        if (_FuseOff != null) {
            return _FuseOff!!
        }
        _FuseOff = ImageVector.Builder(
            name = "FuseOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 11.8f)
                lineTo(10.2f, 7f)
                horizontalLineTo(15f)
                verticalLineTo(11.8f)
                moveTo(16f, 6f)
                verticalLineTo(2f)
                curveTo(16f, 1.45f, 15.55f, 1f, 15f, 1f)
                horizontalLineTo(8f)
                curveTo(7.45f, 1f, 7f, 1.45f, 7f, 2f)
                verticalLineTo(3.8f)
                lineTo(9.2f, 6f)
                horizontalLineTo(16f)
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(8f, 9.89f)
                verticalLineTo(17f)
                horizontalLineTo(15.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(7f, 22f)
                curveTo(7f, 22.55f, 7.45f, 23f, 8f, 23f)
                horizontalLineTo(15f)
                curveTo(15.55f, 23f, 16f, 22.55f, 16f, 22f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                close()
            }
        }.build()

        return _FuseOff!!
    }

@Suppress("ObjectPropertyName")
private var _FuseOff: ImageVector? = null

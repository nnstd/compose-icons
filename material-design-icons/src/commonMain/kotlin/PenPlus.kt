package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PenPlus: ImageVector
    get() {
        if (_PenPlus != null) {
            return _PenPlus!!
        }
        _PenPlus = ImageVector.Builder(
            name = "PenPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.7f, 7f)
                curveTo(20.4f, 7.4f, 20f, 7.7f, 20f, 8f)
                curveTo(20f, 8.3f, 20.3f, 8.6f, 20.6f, 9f)
                curveTo(21.1f, 9.5f, 21.6f, 9.9f, 21.5f, 10.4f)
                curveTo(21.5f, 10.9f, 21f, 11.4f, 20.5f, 11.9f)
                lineTo(16.4f, 16f)
                lineTo(15f, 14.7f)
                lineTo(19.2f, 10.5f)
                lineTo(18.2f, 9.5f)
                lineTo(16.8f, 10.9f)
                lineTo(13f, 7.1f)
                lineTo(17f, 3.3f)
                curveTo(17.4f, 2.9f, 18f, 2.9f, 18.4f, 3.3f)
                lineTo(20.7f, 5.6f)
                curveTo(21.1f, 6f, 21.1f, 6.7f, 20.7f, 7f)
                moveTo(3f, 17.2f)
                lineTo(12.6f, 7.6f)
                lineTo(16.3f, 11.4f)
                lineTo(6.8f, 21f)
                horizontalLineTo(3f)
                verticalLineTo(17.2f)
                moveTo(7f, 2f)
                verticalLineTo(5f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(2f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _PenPlus!!
    }

@Suppress("ObjectPropertyName")
private var _PenPlus: ImageVector? = null

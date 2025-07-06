package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClipboardTextOff: ImageVector
    get() {
        if (_ClipboardTextOff != null) {
            return _ClipboardTextOff!!
        }
        _ClipboardTextOff = ImageVector.Builder(
            name = "ClipboardTextOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(3f, 4.9f)
                curveTo(3f, 4.93f, 3f, 4.97f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(19.03f, 21f, 19.07f, 21f, 19.1f, 21f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(7f, 11f)
                horizontalLineTo(9.11f)
                lineTo(11.11f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                moveTo(14f, 17f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                horizontalLineTo(13.11f)
                lineTo(14f, 15.89f)
                verticalLineTo(17f)
                moveTo(17f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(12.2f)
                lineTo(14.2f, 11f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(16.2f)
                lineTo(21f, 17.8f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.11f, 3f, 19f, 3f)
                horizontalLineTo(14.82f)
                curveTo(14.4f, 1.84f, 13.3f, 1f, 12f, 1f)
                reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3f)
                horizontalLineTo(6.2f)
                lineTo(10.2f, 7f)
                horizontalLineTo(17f)
                moveTo(12f, 3f)
                curveTo(12.55f, 3f, 13f, 3.45f, 13f, 4f)
                reflectiveCurveTo(12.55f, 5f, 12f, 5f)
                reflectiveCurveTo(11f, 4.55f, 11f, 4f)
                reflectiveCurveTo(11.45f, 3f, 12f, 3f)
                close()
            }
        }.build()

        return _ClipboardTextOff!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardTextOff: ImageVector? = null

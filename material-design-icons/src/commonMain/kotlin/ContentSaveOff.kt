package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ContentSaveOff: ImageVector
    get() {
        if (_ContentSaveOff != null) {
            return _ContentSaveOff!!
        }
        _ContentSaveOff = ImageVector.Builder(
            name = "ContentSaveOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.2f, 5f)
                lineTo(6.2f, 3f)
                horizontalLineTo(17f)
                lineTo(21f, 7f)
                verticalLineTo(17.8f)
                lineTo(12.2f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                horizontalLineTo(8.2f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(19.1f, 21f)
                curveTo(19.07f, 21f, 19.03f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.11f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 4.97f, 3f, 4.93f, 3f, 4.9f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(7.11f, 9f)
                lineTo(5f, 6.89f)
                verticalLineTo(9f)
                horizontalLineTo(7.11f)
                moveTo(14.89f, 16.78f)
                lineTo(11.22f, 13.11f)
                curveTo(9.95f, 13.46f, 9f, 14.61f, 9f, 16f)
                curveTo(9f, 17.66f, 10.34f, 19f, 12f, 19f)
                curveTo(13.39f, 19f, 14.54f, 18.05f, 14.89f, 16.78f)
                close()
            }
        }.build()

        return _ContentSaveOff!!
    }

@Suppress("ObjectPropertyName")
private var _ContentSaveOff: ImageVector? = null

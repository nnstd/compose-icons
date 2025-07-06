package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeOff: ImageVector
    get() {
        if (_HomeOff != null) {
            return _HomeOff!!
        }
        _HomeOff = ImageVector.Builder(
            name = "HomeOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.84f, 22.73f)
                lineTo(18.11f, 20f)
                horizontalLineTo(14f)
                verticalLineTo(15.89f)
                lineTo(12.11f, 14f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(2f)
                lineTo(6.27f, 8.16f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(19f, 12f)
                horizontalLineTo(22f)
                lineTo(12f, 3f)
                lineTo(8.95f, 5.75f)
                lineTo(19f, 15.8f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _HomeOff!!
    }

@Suppress("ObjectPropertyName")
private var _HomeOff: ImageVector? = null
